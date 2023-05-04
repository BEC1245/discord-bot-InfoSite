package data.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import data.dao.dataDAO;
import data.dto.buttonDTO;
import utility.closeStatement;
import utility.connectionProvider;

public class ButtonLeaderbordService {
	
	dataDAO dao;
	
	public ButtonLeaderbordService(){
		this.dao = new dataDAO();
	}
	
	public List<buttonDTO> buttonList() {
		List<buttonDTO> dto = null;
		Connection conn = null;
		
		try {
			conn = connectionProvider.get();
			dto = dao.buttonList(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeStatement.close(conn);
		}
		
		return dto;
	}	
}
