package user.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import user.dto.signUpDTO;
import user.dto.userDTO;
import user.service.signUpService;

@WebServlet("/sign-in")
public class userSignInController extends HttpServlet {
	
	signUpService Service;
	
	public userSignInController() {
		Service = new signUpService();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/WEB-INF/views/user/signInForm.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("do post");
		boolean result = false;
		String uid = request.getParameter("uid");
		String uname = request.getParameter("uname");
		signUpDTO dto = new signUpDTO(uid, uname); 
		result = Service.signUp(dto);
		
		System.out.println(result);
		if(uid.length() != 18 || result != true) {
			request.setAttribute("reason", "로그인 형식이 잘못 되였습니다 (uid 길이는 무조건 18 / uid 중복 금지)");
			String url = "/WEB-INF/views/user/signInForm.jsp";
			request.getRequestDispatcher(url).forward(request, response);
		} else {
			request.getSession().setAttribute("userInfo", dto);
			response.sendRedirect("login");
		}
		

	}
}
