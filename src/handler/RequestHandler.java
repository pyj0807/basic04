package handler;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

/*
 * ServletRequest �� ���õ� Event Listener...
 *  - ServletRequestListener
 * 
 */
public class RequestHandler implements ServletRequestListener, ServletRequestAttributeListener{
	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		// ��û�� ���ͼ� JSP or Servlet�� �۵� ��
		ServletRequest req = sre.getServletRequest();
		System.out.println("[REQUEST] request occured .. by "+ req.getRemoteAddr() );
		//requestURI , queryString�� �̾Ƽ� ����� ���ѵѲ���. (DB insert)
		//������ Ÿ���� ���� ���� Ÿ������ ������ �űԱ���� �ȶ�.
		HttpServletRequest request = (HttpServletRequest)req;
		String uri = request.getRequestURI();
		String query = request.getQueryString();
		System.out.println("[REQUEST] at" + uri + (query!=null ? "?" + query : ""));
	}
	
	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		// JSP or Servlet�� �۵� �ؼ� ������ ���� ��
		System.out.println("[REQUEST] response sended..");
	}
	
	
	//ServletRequestAttributeListener's
	// ������ �غ��� �ʾ�����, request ���� attribute �۾��� �� �� �ִ�
	// ���亸������������ ������ ��, ���亸���� �����. �� �̷� 1ȸ�� attribute�� �ϴ°�?
	// MVC ���踦 �ϰԵǸ� ������ �˰� ��. - ������ request�� attribyute �����ϴٴ� �� ���� ��
	@Override
	public void attributeAdded(ServletRequestAttributeEvent srae) {
		// TODO Auto-generated method stub
		ServletRequestAttributeListener.super.attributeAdded(srae);
	}
	
	@Override
	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		// TODO Auto-generated method stub
		ServletRequestAttributeListener.super.attributeReplaced(srae);
	}

	
	@Override
	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		// TODO Auto-generated method stub
		ServletRequestAttributeListener.super.attributeRemoved(srae);
	}
	
}
