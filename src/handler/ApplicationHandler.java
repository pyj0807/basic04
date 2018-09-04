package handler;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/*
 * aplication Event용 Listener 2개
 * - ServletContextListener : init, destroy
 * 
 * - ServletContextAttributeListener : setAttribute
 * 
 * ※ EventListener는 등록이 필요함. (알아서 감지되지 않는다)
 */
public class ApplicationHandler implements ServletContextListener { // ServletContextListener의 기능이 contextDestroyed,
																	// contextInitialized 이 2개를 감지
	long begin;

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.print("[SERVER] contextInitialized..");
		begin = System.currentTimeMillis();
		/*
		 * 매개변수로 잡혀있는 ServletContextEvent 를 통해서 application을 접근할수 있다.
		 */
		ServletContext ctx = sce.getServletContext();
		// JSP에서 사용되는 application 이라는 이름의 객체.
		int r = (int) (Math.random() * 10);
		ctx.setAttribute("r", r);
		ctx.setRequestCharacterEncoding("UTF-8"); // Listener 에서만 가능
											// servlet 하위버전에는 없는 메서드
		ctx.setSessionTimeout(1);
		System.out.println("done!");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("contextDestroyed..");
		long end = System.currentTimeMillis();
		System.out.println("running time.." + (end - begin) + " ms");
	}
}
