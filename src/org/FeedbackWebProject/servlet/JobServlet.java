package org.FeedbackWebProject.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.FeedbackWebProject.bean.JOB;
import org.FeedbackWebProject.bean.JobDAO;

@WebServlet("/JobServlet")
public class JobServlet extends HttpServlet {
	private JobDAO jobDAO;

	public void init() {
		jobDAO = new JobDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		showNewForm(request, response);
	}
/*protected void InsertJOB(HttpServletRequest request, HttpServletResponse response)
		throws SQLException, IOException {
	String CompanyName=request.getParameter("CompanyName");
	String Appointmentday=request.getParameter("Appointmentday");
	String ConsultPerson=request.getParameter("ConsultPerson");
	String Requirments=request.getParameter("Requirments");
	String Comments=request.getParameter("Comments");
	JOB newJOB=new JOB(CompanyName,Appointmentday,ConsultPerson,Requirments,Comments);
	jobDAO.insertJob(newJOB);
	response.sendRedirect("list");
}*/
	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("form.jsp");
		dispatcher.forward(request, response);
	}

}
