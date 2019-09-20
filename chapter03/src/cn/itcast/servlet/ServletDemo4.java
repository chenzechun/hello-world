package cn.itcast.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDemo4
 */
@WebServlet("/ServletDemo4")
public class ServletDemo4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ServletDemo4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void init() throws ServletException {
		// 给次数设置一个初始值 0 
		int count = 0;
		// 将 0 存入到 ServletContext中
		getServletContext().setAttribute("count", count);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 将原来的次数取出来
		int count = (Integer) getServletContext().getAttribute("count");
		count += 1;
		// 存入到SErvletContext中
		getServletContext().setAttribute("count", count);
		// 向页面输出欢迎光临!
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().println("<h1>欢迎光临本网站! 这是您第"+count+"次访问</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
