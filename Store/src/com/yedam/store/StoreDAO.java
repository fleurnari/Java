package com.yedam.store;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class StoreDAO extends DAO {
	
	private static StoreDAO storeDao = null;
	
	public StoreDAO() {
		
	}
	
	public static StoreDAO getInstance() {
		if (storeDao == null) {
			storeDao = new StoreDAO();
		}
		return storeDao;
	}
	
	// 모든 가게 정보 조회
	public List<Store> getStoreList() {
		List<Store> list = new ArrayList<>();
		Store store = null;
		try {
			conn();
			String sql = "SELECT * FROM store ORDER BY 1";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				store = new Store();
				store.setStoreId(rs.getInt("store_id"));
				store.setStoreName(rs.getString("store_name"));
				store.setStoreTel(rs.getString("store_tel"));
				store.setStoreAddr(rs.getString("store_addr"));
				store.setStoreSales(rs.getInt("store_sales"));
				list.add(store);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return list;
	}
	
	// 지역구별 매출 합계
	public List<Store> getSumSales() {
		List<Store> list = new ArrayList<>();
		Store store = null;
		try {
			conn();
			String sql = "SELECT SUBSTR(store_addr, 4, 3) as location, SUM(store_sales) as totalSum FROM store GROUP BY SUBSTR(store_addr, 4, 3)";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				store = new Store();
				store.setStoreLocation(rs.getString("location"));
				store.setSumSales(rs.getInt("totalSum"));
				list.add(store);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return list;
	}
	
	// 가게 정보 입력
	public int insertStore(Store store) {
		int result = 0;
		try {
			conn();
//			String sql = "INSERT INTO store VALUES (?,?,?,?,?)";
			// 서브쿼리 활용 번호 자동 부여
			 String sql = "INSERT INTO store VALUES ((SELECT COUNT(*) + 1 FROM store), ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, store.getStoreId()); // 서브쿼리 사용 시 삭제해준다
			pstmt.setString(1, store.getStoreName());
			pstmt.setString(2, store.getStoreTel());
			pstmt.setString(3, store.getStoreAddr());
			pstmt.setInt(4, store.getStoreSales());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}

	
	// 매출 수정
	public int updateSales(Store store) {
		int result = 0;
		try {
			conn();
			String sql = "UPDATE store SET store_sales = ? WHERE store_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, store.getStoreSales());
			pstmt.setInt(2, store.getStoreId());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}
	

}
