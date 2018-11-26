package com.amazonaws.model;

import java.util.Date;

public class Meeting {
	public String participant = null;
	public final String secretID;
	public final String meetingID;
	public final int startTime;
	public final Date date;
	
	public Meeting(String secretID, String meetingID, int startTime, Date date) {
		this.secretID = secretID;
		this.meetingID = meetingID;
		this.startTime = startTime;
		this.date = date;
	}
}
