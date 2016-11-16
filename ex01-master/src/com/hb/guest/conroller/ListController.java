package com.hb.guest.conroller;

import java.io.IOException;


import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hb.guest.model.GuestDao;



@WebServlet("/guest/list.do")
public class ListController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		ArrayList list =  null;
		GuestDao dao;
		try {
			dao = new GuestDao();
			list =  dao.selectAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("alist", list);
		request.getRequestDispatcher("list.jsp").forward(request,response);
		}
	}


