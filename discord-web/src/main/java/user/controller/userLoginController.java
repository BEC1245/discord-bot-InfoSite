package user.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import user.dto.userDTO;
import user.service.loginService;

@WebServlet("/login")
public class userLoginController extends HttpServlet {
	
	loginService service;
	
	// 서블릿의 생성자는 public 처리를 해줘야 한다
	public userLoginController() {
		this.service = new loginService();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url = "/WEB-INF/views/user/loginForm.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("do post");
		String uid = request.getParameter("uid");
		
		userDTO dto = service.selectByUid(uid);
		if(dto != null) {
			request.getSession().setAttribute("userInfo", dto);
			response.sendRedirect("data/mainPage");
		} else {
			response.sendRedirect("login");
		}
	}

}
