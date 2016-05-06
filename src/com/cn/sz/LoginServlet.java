package com.cn.sz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		requestMethod(req, resp);
		System.out.println("do get method...............");
		super.doGet(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		requestMethod(req, resp);
		System.out.println("do post method...............");
		super.doPost(req, resp);
	}

	private void requestMethod(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		String userName=req.getParameter("name");
		String psd=req.getParameter("psd");
		
		resp.setContentType("text/html");
		PrintWriter mWriter=resp.getWriter();
		mWriter.println("<html>");
		mWriter.println("<head><title>Submit Result</title></head>");
	    mWriter.println("<body> username:"+userName+"<br>"+"psd:"+psd+"</body>");
	    mWriter.println("</html>");
	    mWriter.flush();
	}
	//get请求和post请求的区别：
	//1:浏览器地址栏呈现的结果不同(表象)
	//2.真正的原因在于向服务器发送请求时的形式是不同的
	//3.get的请求格式:Get /test/loginServlet?username=hello&password=word HTTP/1.1
	//4.post的请求格式:POST /test/loginServlet HTTP/1.1 
	// Connection:Keep-Alive
	//username=hello&password=name
	//5.通过浏览器进行文件上传时,一定要使用post方式而绝不能使用get方式
	//6.通过浏览器地址栏输入网址的方式来访问服务器端资源,全部使用的是get方式请求的。
	

}
