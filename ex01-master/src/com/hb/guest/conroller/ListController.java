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
import com.hb.guest.model.GuestDto;



@WebServlet("/guest/list.do")
public class ListController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		GuestDao dao;
		ArrayList<GuestDto> list =  null;
		try {
			dao = new GuestDao();
			list =  dao.selectAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			request.setAttribute("alist", list);
//			request.getRequestDispatcher("list.jsp").forward(request, response);
		 	request.getRequestDispatcher("/WEB-INF/guest/list.jsp").forward(request, response);
		}
	}


