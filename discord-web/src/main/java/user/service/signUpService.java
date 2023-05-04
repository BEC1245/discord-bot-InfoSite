package user.service;

import java.sql.Connection;
import java.sql.SQLException;

import user.dao.userDAO;
import user.dto.signUpDTO;
import utility.closeStatement;
import utility.connectionProvider;

public class signUpService {
	userDAO dao;
	
	public signUpService() {
		dao = new userDAO();
	}
	
	public boolean signUp(signUpDTO dto){
		Connection conn = null;
		boolean bool = false;
		
		try {
			conn = connectionProvider.get();
			bool = dao.signUp(conn, dto);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeStatement.close(conn);
		}
		
		return bool;
	}
}
