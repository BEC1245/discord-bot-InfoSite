package data.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.dto.wisperDTO;
import data.service.wisperListService;


@WebServlet("/data/wisperList")
public class wisperListController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		wisperListService wisper = new wisperListService();
		List<wisperDTO> dto = wisper.listWisper();
		
		request.setAttribute("input", dto);
		
		String url = "/WEB-INF/views/data/wisperChacking.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}

}
