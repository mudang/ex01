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
	
	public void del(GuestDto dto) throws SQLException{
	String sql= "DELETE FROM GUEST WHERE SABUN=?";
		pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, dto.getSabun());
		System.out.println(dto.getSabun());
		int result = pstmt.executeUpdate();
		if(pstmt!=null)pstmt.close();
		if(conn!=null)conn.close();
	}
	
	
	public void update(GuestDto dto) throws SQLException,IllegalArgumentException{
		 
		String sql="UPDATE GUEST SET NAME=?,PAY=? WHERE SABUN=?";	
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, dto.getName());
		pstmt.setInt(2, dto.getPay());
		pstmt.setInt(3, dto.getSabun());
		int result = pstmt.executeUpdate();
		if(pstmt!=null)pstmt.close();
		if(conn!=null)conn.close();
		if(result<1){
			throw new IllegalArgumentException();
		}
	}
	
	public void insertOne(GuestDto dto) throws SQLException,IllegalArgumentException{
		String sql="INSERT INTO GUEST VALUES(?,?,SYSDATE,?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, dto.getSabun());
		pstmt.setString(2, dto.getName());
		pstmt.setInt(3, dto.getPay());
		int result= pstmt.executeUpdate();
		if(pstmt!=null)pstmt.close();
		if(conn!=null)conn.close();
		if(result<1){
			throw new IllegalArgumentException();
		}
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
