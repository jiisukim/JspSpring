package util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class Cookies {
	//��Ű�� <��Ű�̸�, Cookie��ü> �� ���·� �����ϴ� ���� ����
	private Map<String, Cookie> cookieMap = 
			new HashMap<String,Cookie>();
	
	// ������
	// request �ȿ��� �Ķ���ͷ� ���޵ǰ� �ִ� Cookie���� ����
	public Cookies(HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		//������ Cookie��ü�� cookieMap�� ����
		if(cookies != null) {
			for(int i =0; i<cookies.length; i++) {
										//Ű(String)		,value(��ü)
				cookieMap.put(cookies[i].getName(), cookies[i]);
			}
		}
	}
	// cookieMap ���� ������ �̸��� cookie ��ü�� ����
	// ����, ������ �̸��� Cookie�� ������ null ������
	public Cookie getCookie(String name) {
		return cookieMap.get(name);
	}
	public String getValue(String name) throws IOException {
		Cookie cookie = cookieMap.get(name);
		if(cookie == null) {
			return null;
		}
		return URLDecoder.decode(cookie.getValue(),"UTF-8");
	}
	// ������ ��Ű �̸��� Cookie�� ������� true , ���� ��� false�� ����
	public boolean exists(String name) {
		return cookieMap.get(name)!= null;
	}
	
	// �̸��� name�̰�, ���� value�� Cookie ��ü�� �����Ͽ� ����
	public static Cookie createCookie(String name, String value) throws IOException {
		return new Cookie(name, URLEncoder.encode(value,"UTF-8"));
	}
	// �̸��� name�̰�, ���� value, ��ΰ� path, ��ȿ�ð��� maxAge�� Cookie ��ü�� �����Ͽ� ����
		public static Cookie createCookie(String name, String value,
				String path,int maxAge) throws IOException {
			Cookie cookie = new Cookie(name, URLEncoder.encode(value,"UTF-8"));
			cookie.setPath(path);
			cookie.setMaxAge(maxAge);
			return cookie;
		}
	
		// �̸��� name�̰�, ���� value, ��ΰ� path, ��ȿ�ð��� maxAge�� Cookie ��ü�� �����Ͽ� ����
		public static Cookie createCookie(String name, String value,
				String domain,String path,int maxAge) throws IOException {
			Cookie cookie = new Cookie(name, URLEncoder.encode(value,"UTF-8"));
			cookie.setDomain(domain);
			cookie.setPath(path);
			cookie.setMaxAge(maxAge);
			return cookie;
		}		
	
}
