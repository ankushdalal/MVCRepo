package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCConnectivity {

	public static void main(String[] args) throws SQLException {
		// String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String url = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
		String user = "springhbdab";
		String pass = "springhbdab";
		ResultSet rs = null;
		PreparedStatement st = null;
		Connection con = null;
		try {

			con = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection sccs");
			String qr = "select * from customer";
			st = con.prepareStatement(qr);
			rs = st.executeQuery();

			while (rs.next()) {
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\t");
				System.out.println();
			}

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
			st.close();
			rs.close();
		}

	}

}
