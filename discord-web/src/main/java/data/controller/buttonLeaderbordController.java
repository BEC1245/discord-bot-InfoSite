package data.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.dto.buttonDTO;
import data.service.ButtonLeaderbordService;

@WebServlet("/data/buttonLeaderBord")
public class buttonLeaderbordController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("execute buttonLeaderbordController");
		
		ButtonLeaderbordService service = new ButtonLeaderbordService();
		List<buttonDTO> button =  service.buttonList();
		
		request.setAttribute("leaderBordInfo", button);
		
		String url = "/WEB-INF/views/data/buttonLeaderBord.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}

}
