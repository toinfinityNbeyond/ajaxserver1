package org.zerock.ajaxserver1;

import com.google.gson.Gson;
import org.zerock.ajaxserver1.dto.StoreDTO;
import org.zerock.ajaxserver1.service.StoreService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AllStoreServlet", value = "/stores/all")
public class AllStoreServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<StoreDTO> storeDTOList = StoreService.INSTANCE.getAll();

        System.out.println(storeDTOList);

        Gson gson = new Gson();

        String jsonStr = gson.toJson(storeDTOList);

        System.out.println(jsonStr);

        response.setContentType("application/json; charset=UTF-8");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        response.getWriter().write(jsonStr);

    }


}
