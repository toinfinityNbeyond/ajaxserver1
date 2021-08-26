package org.zerock.ajaxserver1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TimeServlet", value = "/time")
public class TimeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // {"time":"2021-08-26"}
        response.setContentType("application/json; charset=UTF-8");

        String str = "{\"time\":\"2021-08-26\"}";

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        response.getWriter().write(str);


    }
}
