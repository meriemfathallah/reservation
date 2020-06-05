package projet;
import java.awt.HeadlessException;
import java.sql.*;

import javax.swing.*;

public class Connection {
Connection conn=null;
public static Connection dbConnector()
{
	try {
                Class.forname("com.mysql.jdbc.Driver").newInstance();
		Connection conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:8080/resercofee","root","0000");
		JOptionPane.showMessageDialog(null, "connection succsess");
		return conn;
	} catch (HeadlessException | SQLException e) {
		JOptionPane.showMessageDialog(null, e);
		return null;
	}
}
}
