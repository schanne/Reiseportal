/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reiseportal.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Fabian Hupe
 */
@WebServlet(name = "IndexServlet", urlPatterns = {"/index.html"})
public class IndexServlet extends HttpServlet {

    public static final String URL = "/index.html";
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        // TODO: Anfrage an die /WEB-INF/index.jsp weiterleiten
        request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
    }

}
