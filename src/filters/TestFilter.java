package filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * - javax.servlet.http.HttpFilter(C) �� extends �ɾ
 * - javax.servelt.Filter(I) �� implements �ɾ
 * 
 * ���͵� ������ٰ� �ٷ� �۵��ϴ°� �ƴϰ�, web.xml ��� ������ �ʿ���.
 * 
 */
public class TestFilter extends HttpFilter {
	// ���Ͱ� was�� ���ؼ� �����ɶ� 
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("TestFilter.init");
		String ex = filterConfig.getInitParameter("exclude");
		System.out.println("exclude = " + ex);
	}

	// ���Ͱ� ����� ��û�� ���ؼ� �۵��ǰ� �ɶ�
	protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String uri = request.getRequestURI();
		System.out.println("TestFilter.doFilter at " + uri);
		
		String key = request.getParameter("key");
		if(key != null && key.equals("mock")) {
			chain.doFilter(request, response);	// ���� ���ͷ� �ѱ�ڴ�
					// ���̻��۵���ų ���Ͱ� ��� ������ �Ȱɸ���.. �ش� Ÿ�� �������� �۵�
		}else {
			//response.sendRedirect(request.getContextPath()+"/index.jsp");
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("access denied");
		}
	}

	// ���Ͱ� was����� �Բ� �Ҹ�ɶ�
	public void destroy() {
		System.out.println("TestFilter.destroy");
	}

}
