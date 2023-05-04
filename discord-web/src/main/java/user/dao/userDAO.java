package user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import user.dto.signUpDTO;
import user.dto.userDTO;
import utility.closeStatement;
import utility.connectionProvider;

public class userDAO {
	
	public userDTO selectByUid(Connection conn, String uid) {
		PreparedStatement pstmt = null;
		userDTO dto = null;
		ResultSet rs = null;
		
		
		try {
			String sql = "select * from user where uid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uid);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dto = new userDTO(rs.getString("uid"), rs.getString("uname"), rs.getInt("click_count"), rs.getInt("chat_count"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeStatement.close(pstmt, rs);
		}
		
		
		return dto;
	}
	
	public boolean signUp(Connection conn, signUpDTO dto) {
		PreparedStatement pstmt = null;
		boolean result = false;
		
		try {
			String sql = "insert into user (uid, uname) values (?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getUid());
			pstmt.setString(2, dto.getUname());
			
			result = (pstmt.executeUpdate() > 0) ? true : false;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeStatement.close(pstmt);
		}
		
		return result;
	}
}
