package zxl.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LoginAction extends ActionSupport {


    private HttpServletRequest request;

    @Override
    public String execute() throws Exception {

        request= ServletActionContext.getRequest();
        HttpSession session = request.getSession();
        if(!request.getParameter("username").equals("zxl")||!request.getParameter("password").equals("123")){
            if(session.getAttribute("times")==null){
                session.setAttribute("times",9);
            }
            else{
                int now=(int)session.getAttribute("times");
                session.setAttribute("times",now-1);
            }
            return "failed";
        }
        return "success";
    }


}
