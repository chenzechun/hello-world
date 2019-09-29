package cn.itcase.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ReqServlet4")
public class ReqServlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ReqServlet4() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 设置响应时使用的字符编码
					response.setContentType("text/html;charset=utf-8");
					String userId = (String) request.getAttribute("userId");
					//获取用户对应的信息
					String username="张三";
					int age=20;
					PrintWriter printWriter = response.getWriter();
					printWriter.write("查询编号为"+userId+ "的用户信息如下：<br>");
					printWriter.write("用户名为："+username+ "<br>");
					printWriter.write("用户年龄："+age+ "<br>");

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
