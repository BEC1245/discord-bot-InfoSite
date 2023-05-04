package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class mySqlListener implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println("listener");
    }

    public void contextInitialized(ServletContextEvent sce)  { 
    	
    	System.out.println("listener");
 		try {
 			Class.forName("com.mysql.cj.jdbc.Driver");
 			System.out.println("드라이버 로드 성공");
 		} catch (ClassNotFoundException e) {
 			System.out.println("드라이버 로드 실패");
 			e.printStackTrace();
 		}
    }
	
}
