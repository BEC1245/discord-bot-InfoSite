package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;

// 모든 패이지에 필터를 작동 시키는 메서드
@WebFilter("/*")
public class UTF8SET extends HttpFilter implements Filter {
	public void destroy() {
		// TODO Auto-generated method stub
	}

	// 필터가 작동할 때 사용되는 메서드
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		((HttpServletRequest)request).setCharacterEncoding("UTF-8");
		
		System.out.println("character Set complite");
		
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
