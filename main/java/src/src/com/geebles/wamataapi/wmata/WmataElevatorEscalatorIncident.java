package com.geebles.wamataapi.wmata;

import com.google.gson.annotations.SerializedName;

public class WmataElevatorEscalatorIncident {

	@SerializedName("DisplayOrder")
	public int displayOrder;

	@SerializedName("DateOutOfServ")
	public String dateOutOfService;

	@SerializedName("DateUpdated")
	public String dateUpdated;

	@SerializedName("LocationDescription")
	public String locationDescription;

	@SerializedName("StationCode")
	public String stationCode;

	@SerializedName("StationName")
	public String stationName;

	@SerializedName("SymptomCode")
	public int symptomCode;

	@SerializedName("SymptomDescription")
	public String symptomDescription;

	@SerializedName("TimeOutOfService")
	public int timeOutOfService;

	@SerializedName("UnitName")
	public String unitName;

	@SerializedName("UnitStatus")
	public char unitStatus;

	@SerializedName("UnitType")
	public String unitType;

}
