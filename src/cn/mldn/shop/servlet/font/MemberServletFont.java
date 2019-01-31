package cn.mldn.shop.servlet.font;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MemberServletFont" ,urlPatterns = "/pages/MemberServletFont/*")
public class MemberServletFont extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path="/pages/error.jsp";
        String status=request.getRequestURI().substring(request.getRequestURI().lastIndexOf("/")+1);
        if(status!=null){
            if("regist".equals(status)){
                path=this.regist(request);

            }
        }
        request.getRequestDispatcher(path).forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      this.doGet(request,response);
    }
    public String regist(HttpServletRequest request){
        return  "/pages/forward.jsp"
    }

}
