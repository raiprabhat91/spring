package beans;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Required;

public class Test {
	private String driver;
	private String url;
	private String user;
	private String password;
	
	
	public String getDriver() {
		return driver;
	}

	@Required
	public void setDriver(String driver) {
		this.driver = driver;
	}


	public String getUrl() {
		return url;
	}

	@Required
	public void setUrl(String url) {
		this.url = url;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public void printConn() throws Exception{
		Class.forName(driver);
		Connection con =DriverManager.getConnection(url,user,password);
		System.out.println(con);
	}
}
