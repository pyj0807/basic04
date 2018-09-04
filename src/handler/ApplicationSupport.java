package handler;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
/*
 * ServletContextAttributeListener
 * 
 * 	application �� C/U/D �۾��� �Ͼ�� ó���� �ϵ��� ���� �����ϴ�.
 * 
 */
public class ApplicationSupport implements ServletContextAttributeListener {

	@Override
	public void attributeAdded(ServletContextAttributeEvent scae) {
		System.out.println("[SERVER] ServletContext.attributeAdded.. ");
		String name = scae.getName();	// attribute�� ���� �̸�.
		Object value = scae.getValue();	// ��ϵ� ���
		
		ServletContext ctx = scae.getServletContext();
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent scae) {
		System.out.println("[SERVER] ServletContext.attributeReplaced.. ");
		String name = scae.getName();	//
		Object value = scae.getValue();	// ���� ���
		if(name.equals("latest")) {
			String old = (String)value;
			ServletContext ctx = scae.getServletContext();
			String neo = (String)ctx.getAttribute("latest");
			System.out.println("[SERVER] lastet replaced...."+ old +"->"+neo);
		}
		
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent scae) {
		System.out.println("[SERVER] ServletContext.attributeRemoved.. ");
		String name = scae.getName();	// ������ ���
	}

}