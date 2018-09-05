package filters;

import java.io.IOException;
import java.util.Locale;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondFilter extends HttpFilter{	
	protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		Locale loc = request.getLocale();
		String lang = loc.getLanguage();
		System.out.println("[SecondFilter] : "+lang);
		if(lang.equalsIgnoreCase("ko")) {
			chain.doFilter(request, response);
		}else {
				
		}
	}
}
