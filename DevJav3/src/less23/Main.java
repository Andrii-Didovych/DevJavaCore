package less23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {
	
	public static final String CONNECTION_URL="jdbc:mysql://localhost:3306/less02";

	public static final String USER = "root";
	
	public static final String PASSWORD = "didovAnd10";
	
	public static final String CREATE_TABLE_PERSON_QUERY=
			"CREATE TABLE person(id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(255), age INT)";

	public static final String CREATE_TABLE_BOOK_QUERY=
			"CREATE TABLE book(id INT PRIMARY KEY AUTO_INCREMENT, title VARCHAR(255))";
	
	public static final String ADD_CONSTRAINT_QUERY=
			"ALTER TABLE book ADD CONSTRAINT book_person FOREIGN KEY (age,name)";
	
	
	public static void main(String[] args) {

		try(Connection connection = DriverManager.getConnection(
				CONNECTION_URL,USER,PASSWORD)){
//			Statement statement = connection.createStatement();
//			statement.execute(CREATE_TABLE_PERSON_QUERY);
//			statement.close();
			
			Statement statement = connection.createStatement();
			statement.execute(CREATE_TABLE_BOOK_QUERY);
			statement.close();
			
			
			
			
			
			
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
