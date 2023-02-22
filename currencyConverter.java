
package com.exchange;

import java.io.*;
import java.net.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.InputStream;
import java.net.*;
import com.google.gson.*;

class Recv {

    private String lhs;
    private String rhs;
    private String error;
    private String icc;
    
    public Recv({}) {}

    public String getLhs() {
        reurn lhs;
    }

    public String getRhs() {
        return rhs;
    }

}

public class Convert extends HttpServlet {
    /**
    * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
    * @param request servlet request
    * @param response servlet response
    * @throws ServletException if a servlet-specific error occurs
    * @throws IOException if an I/O error occurs
    */
    protected void processRequest(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
            String query = "";
            String amount = "";
            String curTo = "";
            String curFrom = "";
            String submit = "";
            String res  = "";
            HttpSession session;
            resp.setContentType("text/html;charset=UTF-8");
            PrintWriter out = resp.getWriter();
            /*Read request parameters*/
            amount = req.getParameter("amount");
            curTo = req.getParameter("to");
            curFrom = req.getParameter("from");
            /*Open a connection to google and read the result*/
        }
}