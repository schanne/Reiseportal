/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reiseportal.web.evaluation_booking;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Marwa Alqataa
 */
@WebServlet(name = "AfterEvaluatioServlet", urlPatterns = {"/afterevaluation"})
public class AfterEvaluationServlet extends HttpServlet{
    public static final String URL = "/afterevaluation";

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
      //Dankeschön für die abgesendeten Evaluation   
    request.getRequestDispatcher("/WEB-INF/afterevaluation.jsp").forward(request, response);
    }
}