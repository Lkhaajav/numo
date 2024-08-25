package numo.common.utilities;

import numo.common.constants.SessionAttrs;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@SuppressWarnings("deprecation")
public class AuthInterceptor extends HandlerInterceptorAdapter {

	@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        HttpSession session = request.getSession();
        String userId = (String) session.getAttribute(SessionAttrs.LOGGED_USER);
        if (userId == null) {
            response.setContentType("text/html; charset=UTF-8");
            PrintWriter out = null;
            try {
                out = response.getWriter();
            } catch (IOException e) {

            }
            new CookieUtil(response).deleteCookie(SessionAttrs.LOGGED_USER);
            if(out != null) {
                out.print("<script>alert('로그인이 필요한 페이지입니다.');</script>");
                out.print("<script>location.href='" + request.getContextPath() + "/login.do';</script>");    
            }            
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelandview) throws Exception {
        super.postHandle(request, response, handler, modelandview);
    }
}
