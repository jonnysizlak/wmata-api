package com.geebles.wamataapi;

import com.google.gson.annotations.SerializedName;

public class WmataElevatorEscalatorIncident {

	@SerializedName("DisplayOrder")
	int displayOrder;

	@SerializedName("DateOutOfServ")
	String dateOutOfService;

	@SerializedName("DateUpdated")
	String dateUpdated;

	@SerializedName("LocationDescription")
	String locationDescription;

	@SerializedName("StationCode")
	String stationCode;

	@SerializedName("StationName")
	String stationName;

	@SerializedName("SymptomCode")
	int symptomCode;

	@SerializedName("SymptomDescription")
	String symptomDescription;

	@SerializedName("TimeOutOfService")
	int timeOutOfService;

	@SerializedName("UnitName")
	String unitName;

	@SerializedName("UnitStatus")
	char unitStatus;

	@SerializedName("UnitType")
	String unitType;

}
