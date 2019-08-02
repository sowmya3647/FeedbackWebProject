package org.FeedbackWebProject.bean;

public class JOB {

	protected int id;
	protected String companyName;
	protected String appointmentday;
	protected String consultPerson;
	protected String requirments;
	protected String comments;

	public JOB(int id, String companyName, String appointmentday, String consultPerson, String requirments,
			String comments) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.appointmentday = appointmentday;
		this.consultPerson = consultPerson;
		this.requirments = requirments;
		this.comments = comments;
	}

	public JOB(String companyName, String appointmentday, String consultPerson, String requirments, String comments) {
		this.companyName = companyName;
		this.appointmentday = appointmentday;
		this.consultPerson = consultPerson;
		this.requirments = requirments;
		this.comments = comments;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getAppointmentday() {
		return appointmentday;
	}

	public void setAppointmentday(String appointmentday) {
		this.appointmentday = appointmentday;
	}

	public String getConsultPerson() {
		return consultPerson;
	}

	public void setConsultPerson(String consultPerson) {
		this.consultPerson = consultPerson;
	}

	public String getRequirments() {
		return requirments;
	}

	public void setRequirments(String requirments) {
		this.requirments = requirments;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}


}
