package com.geebles.wamataapi.wmata;

import com.google.gson.annotations.SerializedName;

public class WmataRailIncident {
	@SerializedName("IncidentID")
	public int incidentId;

	@SerializedName("IncidentType")
	public String incidentType;

	@SerializedName("DateUpdated")
	public String dateUpdated;

	@SerializedName("DelaySeverity")
	public String delaySeverity;

	@SerializedName("Description")
	public String description;

	@SerializedName("EmergencyText")
	public String emergencyText;

	@SerializedName("StartLocationFullName")
	public String startLocationFullName;

	@SerializedName("EndLocationFullName")
	public String endLocationFullName;

	@SerializedName("LinesAffected")
	public String linesAffected;

	@SerializedName("PassengerDelay")
	public int passengerDelay;

}
