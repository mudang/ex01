package com.hb.guest.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class GuestDao {
private Connection conn;
private PreparedStatement pstmt;
private ResultSet rs;


	public GuestDao() throws Exception {
		Class.forName("org.h2.Driver");
		conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test"
				,"sa","");
	}
	
 public	ArrayList selectAll() throws SQLException{
	 ArrayList list = new ArrayList();

	 String sql = "SELECT * FROM GUEST";
	 pstmt = conn.prepareStatement(sql);
	 rs=pstmt.executeQuery();
	 
	 while(rs.next()){
		 GuestDto map= new GuestDto();
		 map.setSabun(rs.getInt("sabun"));
		 map.setName(rs.getString("name"));
		 map.setNalja(rs.getDate("nalja"));
		 map.setPay(rs.getInt("pay"));
		 list.add(map);
	 }
	 	if(rs!=null)rs.close();
	 	if(pstmt!=null)pstmt.close();
	 	if(conn!=null)conn.close();
	 	
	 	return list;
 }
}
