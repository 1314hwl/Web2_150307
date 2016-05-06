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
	//get�����post���������
	//1:�������ַ�����ֵĽ����ͬ(����)
	//2.������ԭ���������������������ʱ����ʽ�ǲ�ͬ��
	//3.get�������ʽ:Get /test/loginServlet?username=hello&password=word HTTP/1.1
	//4.post�������ʽ:POST /test/loginServlet HTTP/1.1 
	// Connection:Keep-Alive
	//username=hello&password=name
	//5.ͨ������������ļ��ϴ�ʱ,һ��Ҫʹ��post��ʽ��������ʹ��get��ʽ
	//6.ͨ���������ַ��������ַ�ķ�ʽ�����ʷ���������Դ,ȫ��ʹ�õ���get��ʽ����ġ�
	

}
