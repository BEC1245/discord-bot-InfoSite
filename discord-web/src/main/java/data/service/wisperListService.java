package data.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import data.dao.dataDAO;
import data.dto.wisperDTO;
import utility.closeStatement;
import utility.connectionProvider;

public class wisperListService {
	dataDAO dao; 

	public wisperListService(){
		dao = new dataDAO();
	}
	
	public List<wisperDTO> listWisper(){
		Connection conn = null;
		List<wisperDTO> dto = null;
		
		try {
			conn = connectionProvider.get();
			dto = dao.listOfWisper(conn);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeStatement.close(conn);
		}
		
		return dto;
	}
}
