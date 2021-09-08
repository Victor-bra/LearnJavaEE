import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import logic.Cart;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet2", value = "/Servlet2")
public class Servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();

        String user = (String) session.getAttribute("currentUser");
        

        /*Cart cart = (Cart) session.getAttribute("cart");

        String name = request.getParameter("name");
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        if(cart==null){
            cart = new Cart();
            cart.setName(name);
            cart.setQuentity(quantity);
        }
        session.setAttribute("cart",cart);*/

//        PrintWriter printWriter = response.getWriter();
//
//        printWriter.println("<html>");
//        printWriter.println("<h1>You count: " + count + "</h1>");
//        printWriter.println("</html>");
        getServletContext().getRequestDispatcher("/showCart.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
