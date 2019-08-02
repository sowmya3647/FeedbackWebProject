package org.FeedbackWebProject.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.FeedbackWebProject.bean.JOB;

public class JobDAO {
	private String jdbcURL = "jdbc:mysql://localhost:3306/FeedbackDetails";
	private String jdbcUsername = "root";
	private String jdbcPassword = "root";

	private static final String INSERT_USERS_SQL = "INSERT INTO statusofjobs"
			+ "(CompanyName,Appointmentday,ConsultPerson,Requirments,Comments) VALUES " + " (?,?,?,?,?);";

	private static final String SELECT_ALL_USERS = "SELECT * from statusofjobs";
	private static final String DELETE_USERS_SQL = "DELETE from statusofjobs where id=?";

	public JobDAO() {
	}

	protected Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public void insertJob(JOB Job) throws SQLException {
		System.out.println(INSERT_USERS_SQL);
		Connection connection = getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);
		preparedStatement.setString(1, Job.getCompanyName());
		preparedStatement.setString(2, Job.getAppointmentday());
		preparedStatement.setString(3, Job.getConsultPerson());
		preparedStatement.setString(4, Job.getRequirments());
		preparedStatement.setString(5, Job.getComments());
		System.out.println(preparedStatement);
		preparedStatement.executeUpdate();
	}
	public List<JOB>selectAllJobs(){
		List<JOB> Jobs=new ArrayList<JOB>();
		Connection conn=getConnection();
		PreparedStatement preparedStatement;
		try {
			preparedStatement = conn.prepareStatement(SELECT_ALL_USERS);
			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				 int id =rs.getInt("id");
				 String CompanyName=rs.getString("companyName");
			     String Appointmentday=rs.getString("appointmentday");
				 String ConsultPerson=rs.getString("consultPerson");
				 String Requirments=rs.getString("requirments");
				 String Comments=rs.getString("comments");
				 Jobs.add(new JOB(id,CompanyName,Appointmentday,ConsultPerson,Requirments,Comments));}
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return Jobs;
	}
			public void deleteJob(int id) throws SQLException {
				System.out.println(DELETE_USERS_SQL);
				Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USERS_SQL);
				preparedStatement.setInt(1,id);
				preparedStatement.executeUpdate();
			}
		}
	

