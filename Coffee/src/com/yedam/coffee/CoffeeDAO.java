package com.yedam.coffee;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class CoffeeDAO extends DAO {
	
	private static CoffeeDAO coffeeDao = null;
	
	private CoffeeDAO() {
		
	}
	
	public static CoffeeDAO getInstance() {
		if (coffeeDao == null) {
			coffeeDao = new CoffeeDAO();
		}
		return coffeeDao;
	}
	
	// 메뉴 조회
	public List<Coffee> getMenuList() {
		List<Coffee> list = new ArrayList<>();
		Coffee coffee = null;
		try {
			conn();
			String sql = "SELECT coffee_menu, coffee_price FROM coffee";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				coffee = new Coffee();
				coffee.setCoffeeMenu(rs.getString("coffee_menu"));
				coffee.setCoffeePrice(rs.getInt("coffee_price"));
				list.add(coffee);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return list;
		
	}
	
	// 메뉴 상세 조회
	public Coffee getMenu(String coffeeMenu) {
		Coffee coffee = null;
		try {
			conn();
			String sql = "SELECT coffee_menu, coffee_price, coffee_explain FROM coffee WHERE coffee_menu = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, coffeeMenu);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				coffee = new Coffee();
				coffee.setCoffeeMenu(rs.getString("coffee_menu"));
				coffee.setCoffeePrice(rs.getInt("coffee_price"));
				coffee.setCoffeeExplain(rs.getString("coffee_explain"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return coffee;
	}
	
	// 메뉴 등록
	public int insertMenu(Coffee coffee) {
		int result = 0;
		try {
			conn();
			String sql = "INSERT INTO coffee(coffee_menu, coffee_price, coffee_explain) VALUES (?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, coffee.getCoffeeMenu());
			pstmt.setInt(2, coffee.getCoffeePrice());
			pstmt.setString(3, coffee.getCoffeeExplain());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}

		return result;
	}
	
	// 판매
	public int sellMenu(Coffee coffee) {
		int result = 0;
		try {
			conn();
			
			String sql2 = "SELECT coffee_sales FROM coffee WHERE coffee_menu = ?";
			pstmt = conn.prepareStatement(sql2);
			pstmt.setString(1, coffee.getCoffeeMenu());
			
			rs = pstmt.executeQuery();
			
			int sales = 0;
			if (rs.next()) {
				sales = rs.getInt("coffee_sales");
			}
	
			String sql = "";
			if (sales == 0) {
				sql = "UPDATE coffee SET coffee_sales = 1 WHERE coffee_menu = ?";
			} else {
			    sql = "UPDATE coffee SET coffee_sales = coffee_sales + 1 WHERE coffee_menu = ?";
			}
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, coffee.getCoffeeMenu());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		
		return result;
	}
	
	
	
	// 메뉴 삭제
	public int deleteMenu(String coffeeMenu) {
		int result = 0;
		try {
			conn();
			String sql = "DELETE FROM coffee WHERE coffee_menu = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, coffeeMenu);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}

		return result;
	}
	
	// 매출
	public List<Coffee> getSales(){
		List<Coffee> list = new ArrayList<>();
		Coffee coffee = null;
		try {
			conn();
			String sql = "SELECT coffee_menu, SUM(coffee_sales) as coffee_sales, SUM(coffee_price * coffee_sales) as total\r\n"
					+ "FROM coffee\r\n"
					+ "GROUP BY coffee_menu";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				coffee = new Coffee();
				coffee.setCoffeeMenu(rs.getString("coffee_menu"));
				coffee.setCoffeeSales(rs.getInt("coffee_sales"));
				coffee.setTotalSales(rs.getInt("total"));
				list.add(coffee);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		
		return list;
	}
	

}
