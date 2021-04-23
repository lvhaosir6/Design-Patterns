package cn.lvhaosir.design.patterns.strategy.mvc;

import cn.lvhaosir.design.patterns.strategy.mvc.controllers.LogoutController;
import cn.lvhaosir.design.patterns.strategy.mvc.controllers.MemberController;
import cn.lvhaosir.design.patterns.strategy.mvc.controllers.OrderController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * <p>DispatcherServlet</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/15
 */
public class DispatcherServlet extends HttpServlet {

    private void doDispatch(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String uri = request.getRequestURI();
        String mid = request.getParameter("mid");

        if ("getMemberById".equals(uri)) {
            new MemberController().getMemberById(mid);
        } else if ("getOrderById".equals(uri)) {
            new OrderController().getOrderById(mid);
        } else if ("logout".equals(uri)){
            new LogoutController().logout();
        } else {
            response.getWriter().write("404 Not Found!");
        }

    }


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doDispatch(req, resp);
    }
}
