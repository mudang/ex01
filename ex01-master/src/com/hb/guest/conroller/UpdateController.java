package com.hb.guest.conroller;

import java.io.IOException;





import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hb.guest.model.GuestDao;
import com.hb.guest.model.GuestDto;




@WebServlet("/guest/update.do")
public class UpdateController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		request.getParameter("sabun");
		System.out.println(request.getParameter("sabun"));
		request.getRequestDispatcher("/WEB-INF/guest/update.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		GuestDao dao= null;
		GuestDto dto = new GuestDto();
		int sabun= Integer.parseInt(request.getParameter("sabun"));
		String name= request.getParameter("name");
		int pay= Integer.parseInt(request.getParameter("pay"));
		dto.setSabun(sabun);
		dto.setName(name);
		dto.setPay(pay);
		String view="./list.do";
		try {
			dao=new GuestDao();
			dao.update(dto);
		}catch(IllegalArgumentException e){
			view="./add.do";
		}catch (Exception e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect(view);
	
	}

}
