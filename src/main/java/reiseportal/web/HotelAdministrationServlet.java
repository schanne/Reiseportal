/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reiseportal.web;

import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import reiseportal.ejb.HotelBean;
import reiseportal.jpa.Hotel;


/**
 *
 * @author belizbalim
 */
@WebServlet(name = "HotelAdministrationServlet", urlPatterns = {"/hoteladministration"})
public class HotelAdministrationServlet extends HttpServlet {

   public static final String URL = "/hoteladministration";
     
    @EJB
    HotelBean hotelbean;
    
    HttpSession session;
    
  
    List<Hotel> hotelist;
    String hotelname;
    String ort;
    String error;
    
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        session = request.getSession();
        
        /*try{
            session.getAttribute("usr");           
        }catch(NullPointerException e){
            //Kann ignoriert werden das dies nur als Bestätigung verwendet wird, das man nicht eingeloggt ist.
            request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
        }*/
        
         if(hotelname!=null){
            request.setAttribute("hotelname",hotelname);
        }
        if(ort!=null){
            request.setAttribute("ort",ort);
        }
        if(error!=null){
            request.setAttribute("error",error);
        }
        request.getRequestDispatcher("/WEB-INF/hoteladministration.jsp").forward(request, response);
   }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        
        
        switch(request.getParameter("button")){
            case "new":
               response.sendRedirect(request.getContextPath() + CreateHotelServlet.URL);
               break;
            case "suche":
               hotelname = request.getParameter("hotelname");
               ort = request.getParameter("ort");
                break;
            
        
        
        //userlist = userbean.findUserByEmailOrUsername(email, username);

       /*if (userlist.isEmpty()) {
            error = "Kein Benutzer gefunden";
            request.setAttribute("error",error);
            request.setAttribute("username", username);
            request.setAttribute("email", email);
            response.sendRedirect(request.getContextPath() + this.URL);
        }
        else {
           session.setAttribute ("founduser", userlist.get(0));
           response.sendRedirect(request.getContextPath() + UserAdministrationServlet.URL);
        request.getRequestDispatcher("/WEB-INF/edithotel.jsp").forward(request, response);*/
        
        
       
    }

    
    }
    
    }

