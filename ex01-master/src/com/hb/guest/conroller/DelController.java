package com.hb.guest.conroller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hb.guest.model.GuestDao;
import com.hb.guest.model.GuestDto;


@WebServlet("/guest/del.do")
public class DelController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getParameter("sabun");
		System.out.println(request.getParameter("sabun"));
		request.getRequestDispatcher("/WEB-INF/guest/del.jsp").forward(request,response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GuestDao dao= null;
		GuestDto dto = new GuestDto();
		int sabun= Integer.parseInt(request.getParameter("sabun"));
		System.out.println("dd"+sabun);
		dto.setSabun(sabun);
		String view="./list.do";
		try {
			dao=new GuestDao();
			dao.del(dto);
		}catch (Exception e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect(view);
	
	}
		
	}


