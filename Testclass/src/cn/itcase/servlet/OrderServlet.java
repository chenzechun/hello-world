package cn.itcase.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/OrderServlet")
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public OrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		// ������Ӧʱʹ�õ��ַ�����
				response.setContentType("text/html;charset=utf-8");
				//��ȡ�û���Ӧ�Ķ�����Ϣ
				String orderId="001";
				String orderContent="ƻ���ֻ�";
				PrintWriter printWriter = response.getWriter();
				printWriter.write("������ţ�"+orderId+ "<br>");
				printWriter.write("�������ݣ�"+orderContent+ "<br>");
				

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
