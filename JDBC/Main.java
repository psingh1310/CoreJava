package com.prashant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/studentDb";
        String uname = "root";
        String pass = "root";
        Class.forName("com.mysql.cj.jdbc.Driver");

        String query = "select * from  Student";

        Connection con = DriverManager.getConnection(url,uname,pass);

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        String userData = "";

        while(rs.next())
			{
		     userData = rs.getInt(1) + " : " + rs.getString(2);
			System.out.println(userData);
			}

        st.close();
        con.close();

    }
}
