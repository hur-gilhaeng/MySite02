package com.douzone.mysite.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.douzone.mysite.action.guestbook.GuestbookActionFactory;
import com.douzone.web.action.Action;

public class GuestbookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String actionName = request.getParameter("a");
		
		if(request.getParameter("a")==null) {actionName = " ";}// 해당 줄 없으면 오류... 도대체 뭐가 문제일까?
		
		Action action = new GuestbookActionFactory().getAction(actionName);
		action.execute(request,response);

		/*
		if("deleteform".equals(action)) {

			WebUtil.forward("/WEB-INF/views/guestbook/deleteform.jsp", request, response);

		} else if("delete".equals(action)) {

			String no = request.getParameter("no");
			String password = request.getParameter("password");

			Long noLong = Long.parseLong(no);

			GuestbookDao dao = new GuestbookDao();

			if(dao.ckPassword(noLong, password)){
				dao.delete(noLong);
			}
			else{

			}

			WebUtil.redirect(request.getContextPath()+"/guestbook", request, response);
			// response.sendRedirect(request.getContextPath()+"/guestbook");

		} else if("insert".equals(action)) {
			String name = request.getParameter("name");
			String pass = request.getParameter("pass");
			String content = request.getParameter("content");

			GuestbookVo vo = new GuestbookVo();

			vo.setName(name);
			vo.setPassword(pass);
			vo.setContents(content);

			if(!(name.isEmpty()||pass.isEmpty()||content.isEmpty())){
				new GuestbookDao().insert(vo);
			}
			WebUtil.redirect(request.getContextPath()+"/guestbook", request, response);
			// response.sendRedirect(request.getContextPath()+"/guestbook");

		} else {
			// default 요청처리
			List<GuestbookVo> list = new GuestbookDao().findAll();

			request.setAttribute("list", list);

			WebUtil.forward("/WEB-INF/views/guestbook/list.jsp", request, response);
		}
		 */
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
