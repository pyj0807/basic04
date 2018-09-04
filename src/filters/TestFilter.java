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
 * - javax.servlet.http.HttpFilter(C) 를 extends 걸어서
 * - javax.servelt.Filter(I) 를 implements 걸어서
 * 
 * 필터도 만들었다고 바로 작동하는건 아니고, web.xml 등록 설정이 필요함.
 * 
 */
public class TestFilter extends HttpFilter {
	// 필터가 was에 의해서 생성될때 
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("TestFilter.init");
		String ex = filterConfig.getInitParameter("exclude");
		System.out.println("exclude = " + ex);
	}

	// 필터가 사용자 요청에 의해서 작동되게 될때
	protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String uri = request.getRequestURI();
		System.out.println("TestFilter.doFilter at " + uri);
		
		String key = request.getParameter("key");
		if(key != null && key.equals("mock")) {
			chain.doFilter(request, response);	// 다음 필터로 넘기겠다
					// 더이상작동시킬 필터가 없어서 차단이 안걸리면.. 해당 타겟 페이지가 작동
		}else {
			//response.sendRedirect(request.getContextPath()+"/index.jsp");
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("access denied");
		}
	}

	// 필터가 was종료와 함께 소멸될때
	public void destroy() {
		System.out.println("TestFilter.destroy");
	}

}
