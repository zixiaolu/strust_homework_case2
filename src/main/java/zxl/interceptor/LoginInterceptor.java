package zxl.interceptor;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import org.apache.struts2.StrutsStatics;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements Interceptor {

    @Override
    public void destroy() {

    }

    @Override
    public void init() {

    }

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {

        ActionContext actionContext = actionInvocation.getInvocationContext();
        HttpServletRequest request = (HttpServletRequest) actionContext.get(StrutsStatics.HTTP_REQUEST);
        HttpServletResponse response = (HttpServletResponse) actionContext.get(StrutsStatics.HTTP_RESPONSE);
        HttpSession session = request.getSession();

        String actionName = actionInvocation.getAction().toString();

        if(actionName.contains("LoginAction")){
            if(session.getAttribute("times")==null){
                return actionInvocation.invoke();
            }
            int times=(int)session.getAttribute("times");
            if(times<=1){
                response.sendRedirect(request.getContextPath()+"/banner.jsp");
                return null;
            }
        }
        return actionInvocation.invoke();
    }
}
