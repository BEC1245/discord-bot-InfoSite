package user.service;

import java.sql.Connection;
import java.sql.SQLException;


import user.dao.userDAO;
import user.dto.userDTO;
import utility.closeStatement;
import utility.connectionProvider;

public class loginService {
	
	userDAO dao;
	
	// 싱글톤은 그냥 생략한다
	public loginService(){
		dao = new userDAO();
	}
	
	public userDTO selectByUid(String uid) {
		Connection conn = null;
		userDTO dto = null;
		
		try {
			conn = connectionProvider.get();
			
			dto = dao.selectByUid(conn, uid);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeStatement.close(conn);
		}
		
		return dto;
	}
}
