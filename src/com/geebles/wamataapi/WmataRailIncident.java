package com.geebles.wamataapi;

import com.google.gson.annotations.SerializedName;

public class WmataRailIncident {
	@SerializedName("IncidentID")
	int incidentId;

	@SerializedName("IncidentType")
	String incidentType;

	@SerializedName("DateUpdated")
	String dateUpdated;

	@SerializedName("DelaySeverity")
	String delaySeverity;

	@SerializedName("Description")
	String description;

	@SerializedName("EmergencyText")
	String emergencyText;

	@SerializedName("StartLocationFullName")
	String startLocationFullName;

	@SerializedName("EndLocationFullName")
	String endLocationFullName;

	@SerializedName("LinesAffected")
	String linesAffected;

	@SerializedName("PassengerDelay")
	int passengerDelay;

}
