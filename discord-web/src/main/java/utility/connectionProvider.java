package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionProvider {
	
	static  String url = "jdbc:mysql://localhost:3306/discorduser";
	
	public static Connection get() throws SQLException {
		return DriverManager.getConnection(url, "discord-bot", "1234");
	}
}
