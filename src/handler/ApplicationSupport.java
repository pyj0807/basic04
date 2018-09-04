package handler;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
/*
 * ServletContextAttributeListener
 * 
 * 	application 에 C/U/D 작업이 일어날때 처리할 일들을 설정 가능하다.
 * 
 */
public class ApplicationSupport implements ServletContextAttributeListener {

	@Override
	public void attributeAdded(ServletContextAttributeEvent scae) {
		System.out.println("[SERVER] ServletContext.attributeAdded.. ");
		String name = scae.getName();	// attribute에 사용된 이름.
		Object value = scae.getValue();	// 등록된 밸류
		
		ServletContext ctx = scae.getServletContext();
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent scae) {
		System.out.println("[SERVER] ServletContext.attributeReplaced.. ");
		String name = scae.getName();	//
		Object value = scae.getValue();	// 기존 밸류
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
		String name = scae.getName();	// 삭제된 밸류
	}

}