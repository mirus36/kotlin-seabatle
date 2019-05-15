package me.yakunin.kseabatle

import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@WebServlet("/api/*")
class MainServlet : HttpServlet()  {

    override fun doGet(request : HttpServletRequest, response : HttpServletResponse) : Unit {
        
    }
    
}