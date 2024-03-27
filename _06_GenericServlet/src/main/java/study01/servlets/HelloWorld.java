package study01.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*서블릿 인터페이스 (서블릿 생태 주기 최상위)
 *제너릭서블릿 추상 클래스 임플리먼트 서블릿*
 *httpServel 추상 크랠스느 익스텐즈 제네ㄺ서블릿
 */

@SuppressWarnings("serial")
public class HelloWorld extends HttpServlet {
	
	@Override
		public void init() throws ServletException {
			System.out.println("init()호출");
		}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet()호출");
	}
}
	