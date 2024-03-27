package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.mysql.cj.xdevapi.Statement;


@WebServlet("/member/list")
@SuppressWarnings("serial")
public class MemberListServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		Connection conn = null; //db서버와의 연결 객치
		Statement stmt = null; // sql문
		ResultSet re = null; // Select문의 결과
		
		
		try {
			DriverManager.registerDriver(new com.mysql.cj.jbdc.Driver());
			conn = DriverManager.getConnection(getServletInfo());
					"jdbc:mysql://localhost:4306/studydb", //jdbc url
					"study", // id
					"study"); //password
					stmt = conn.createStatement();
					rs = stmt.executeQuery("SELECT mmno, mmame, email, cre_date" +
							 " FROM members" +
							 " ORDER BY mno ASC"); 
					
					
			res.setContentType(("text/html;charset=UTF-8");
			PrintWriter out = res.getWriter();
			out.println("<html><head><title>회원 목록</title></head>");
			out.println("<body><h1>회원 목록</h1>");
			while(rs.next()) {
				out.println(
						rs.getInt("mno")+ ","+
					    rs.getString("mname") + ","+
					    rs.getString("email") + ","+
					    rs.getDate("cre_date") + "<br>"
						);
				
			}
			out.println("</body></html>");
		}catch(Exception e) {
			
		}finally {
			
		}

	}

}
