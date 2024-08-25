package numo.common.utilities;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

public class CookieUtil {
	
	HttpServletRequest request;
	HttpServletResponse response;
	Cookie[] cookie;
	
	public CookieUtil(HttpServletRequest request) {
		this.request = request;
		this.cookie = request.getCookies();
	}
	
	public CookieUtil(HttpServletResponse response) {
		this.response = response;
	}
	
	public CookieUtil(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
		this.cookie = request.getCookies();
	}
	
	public Map<String, String> getCookies(){
		Map<String, String> cookies = new HashMap<>();
		if(cookie == null) return null;
		for(Cookie c : cookie) {
			cookies.put(c.getName(), c.getValue());
		}
		return cookies;
	}
	
	public String getCookie(String name){
		Map<String, String> cookies = getCookies();
		if(cookies == null) return null;
		return cookies.get(name);
	}
	
	public void addCookie(String key, String value){
		Cookie c = new Cookie(key, value); 
		c.setPath("/");
		c.setMaxAge(-1);	// 세션 만기와 같음
		response.addCookie(c);
	}
	
	public void deleteCookie(String key){
	    Cookie c = new Cookie(key, null); 
	    c.setPath("/");
	    c.setMaxAge(0);
	    response.addCookie(c);
	}

}