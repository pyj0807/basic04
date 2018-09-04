package handler;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/*
 * aplication Event�� Listener 2��
 * - ServletContextListener : init, destroy
 * 
 * - ServletContextAttributeListener : setAttribute
 * 
 * �� EventListener�� ����� �ʿ���. (�˾Ƽ� �������� �ʴ´�)
 */
public class ApplicationHandler implements ServletContextListener { // ServletContextListener�� ����� contextDestroyed,
																	// contextInitialized �� 2���� ����
	long begin;

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.print("[SERVER] contextInitialized..");
		begin = System.currentTimeMillis();
		/*
		 * �Ű������� �����ִ� ServletContextEvent �� ���ؼ� application�� �����Ҽ� �ִ�.
		 */
		ServletContext ctx = sce.getServletContext();
		// JSP���� ���Ǵ� application �̶�� �̸��� ��ü.
		int r = (int) (Math.random() * 10);
		ctx.setAttribute("r", r);
		ctx.setRequestCharacterEncoding("UTF-8"); // Listener ������ ����
											// servlet ������������ ���� �޼���
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
