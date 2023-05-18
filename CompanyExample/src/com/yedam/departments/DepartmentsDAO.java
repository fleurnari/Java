package com.yedam.departments;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class DepartmentsDAO extends DAO {

	// DB 접속 싱글톤
	private static DepartmentsDAO depDao = null;
	
	private DepartmentsDAO() {
		
	}
	
	public static DepartmentsDAO getInstance() {
		if (depDao == null) {
			depDao = new DepartmentsDAO();
		}
		return depDao;
	}

	// 부서 전체 조회
	public List<Departments> getDepartmentsList() {
		List<Departments> list = new ArrayList<>();
		Departments dep = null;
		try {
			conn();
			String sql = "SELECT * FROM departments";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();	
			
			while (rs.next()) {
				dep = new Departments();
				dep.setDepartmentId(rs.getInt("department_id"));
				dep.setDepartmentName(rs.getString("department_name"));
				dep.setManagerId(rs.getInt("manager_id"));
				dep.setLocationId(rs.getInt("location_id"));
				list.add(dep);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return list;	
	}
	
	// 부서 단건 조회
	public Departments getDepartments(int depId) {
		Departments dep = null;
		try {
			conn();
			String sql = "SELECT * FROM departments WHERE department_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, depId);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				dep = new Departments();
				dep.setDepartmentId(rs.getInt("department_id"));
				dep.setDepartmentName(rs.getString("department_name"));
				dep.setManagerId(rs.getInt("manager_id"));
				dep.setLocationId(rs.getInt("location_id"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		} return dep;
	}
	
	// 등록 (Insert)
	public int insertDep(Departments dep) {
		int result = 0;
		try {
			conn();
			String sql = "INSERT INTO departments VALUES (?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dep.getDepartmentId());
			pstmt.setString(2, dep.getDepartmentName());
			pstmt.setInt(3, dep.getManagerId());
			pstmt.setInt(4, dep.getLocationId());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}
	
	
}
