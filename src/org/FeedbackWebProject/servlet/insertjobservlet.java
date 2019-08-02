package org.FeedbackWebProject.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.FeedbackWebProject.bean.JOB;
import org.FeedbackWebProject.bean.JobDAO;
import org.apache.catalina.util.Introspection;

@WebServlet("/InsertJobServlet")
public class insertjobservlet extends HttpServlet {
	private JobDAO jobDAO;

	public void init() {
		jobDAO = new JobDAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try{
			insertjobs(request, response);
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
}
	private void insertjobs(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		String CompanyName = request.getParameter("companyName");
		String Appointmentday = request.getParameter("appointmentday");
		String ConsultPerson = request.getParameter("consultPerson");
		String Requirements = request.getParameter("requirements");
		String Comments = request.getParameter("comments");
		System.out.println("CompanyName----"+CompanyName+"AppointmentDay---"+Appointmentday);
		JOB newJOB = new JOB(CompanyName, Appointmentday, ConsultPerson, Requirements, Comments);
			jobDAO.insertJob(newJOB);
		response.sendRedirect("SuccessServlet");
		
	}

}
