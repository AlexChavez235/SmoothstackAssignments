package com.ss.login.servlet;

import java.io.IOException;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.ss.login.entity.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet({"/login", "/login/"})
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getRequestURI().substring(request.getContextPath().length());
		
		if("/login".equals(path) || "/login/".equals(path)) {
			// Read from request
			String json = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
			Gson gson = new Gson();
			
			User user = gson.fromJson(json, User.class);
			if (user.getUsername() == null || user.getPassword() == null) {
				response.sendError(HttpServletResponse.SC_BAD_REQUEST);
			} else {
				response.setStatus(200);
			}
			  
		} else {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST);
		}
		
	}

}
