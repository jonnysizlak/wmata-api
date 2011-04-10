package com.geebles.wamataapi.wmata;

import com.google.gson.annotations.SerializedName;

public class WmataStationEntrance {

	@SerializedName("StationCode1")
	public String stationCode1;

	@SerializedName("StationCode2")
	public String stationCode2;

	@SerializedName("ID")
	public String id;

	@SerializedName("Name")
	public String name;

	@SerializedName("Description")
	public String description;

	@SerializedName("Lat")
	public String lat;

	@SerializedName("Lon")
	public String lon;

}
