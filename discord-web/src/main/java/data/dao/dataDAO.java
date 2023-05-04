package data.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import data.dto.buttonDTO;
import data.dto.wisperDTO;
import utility.closeStatement;
import utility.connectionProvider;

public class dataDAO {
	
	public List<buttonDTO> buttonList(Connection conn) {
		PreparedStatement pstmt = null;
		List<buttonDTO> dto = null;
		ResultSet rs = null;
		
		try {
			String sql = "select * from user order by click_count desc";
			pstmt = conn.prepareStatement(sql);
			dto = new ArrayList<>();
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				dto.add(new buttonDTO(rs.getString("uname"), rs.getInt("click_count")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeStatement.close(pstmt, rs);
		}
		
		return dto;
	}
	
	public List<wisperDTO> listOfWisper(Connection conn){
		PreparedStatement pstmt = null;
		List<wisperDTO> dto = null;
		ResultSet rs = null;
		
		try {
			String sql = "select a.uname, b.resiver, b.wisper from user a join wisper b on a.uid = b.uid where a.uname != b.resiver";
			pstmt = conn.prepareStatement(sql);
			dto = new ArrayList<>();
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				dto.add(new wisperDTO(rs.getString("uname"), rs.getString("resiver"), rs.getString("wisper")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeStatement.close(pstmt, rs);
		}
		
		return dto;
	}
}
