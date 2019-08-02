package org.FeedbackWebProject.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.FeedbackWebProject.bean.JOB;
import org.FeedbackWebProject.bean.JobDAO;

@WebServlet("/RetriveJobServlet")
public class RetriveJobServlet extends HttpServlet {

	private JobDAO jobDAO;

	private String Static_username="sowmya";
	private String Static_password="sowmya";
	
	public void init() {
		jobDAO = new JobDAO();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			listjob(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void listjob(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		String username= (request.getParameter("username"));
		String password=(request.getParameter("password"));
		if(Static_username.equals(username)&&  Static_password.equals(password)) {
		List<JOB> listjob = jobDAO.selectAllJobs();
		request.setAttribute("listjob", listjob);
		RequestDispatcher dispatcher = request.getRequestDispatcher("joblist.jsp");
		dispatcher.forward(request, response);
		}
		else
		response.sendRedirect("Invalidtype.jsp");
		
	}
}
