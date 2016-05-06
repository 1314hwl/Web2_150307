package com.cn.sz;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter mWriter=resp.getWriter();
		mWriter.println("<html><head></head><body>HelloWorld2   currrentTime:"+new Date().toLocaleString()+"</body></html>");
		mWriter.flush();
		super.doGet(req, resp);
	}
	
	

}
