package com.geebles.wamataapi;

import com.google.gson.annotations.SerializedName;

public class WmataStationEntrance {

	@SerializedName("StationCode1")
	String stationCode1;

	@SerializedName("StationCode2")
	String stationCode2;

	@SerializedName("ID")
	String id;

	@SerializedName("Name")
	String name;

	@SerializedName("Description")
	String description;

	@SerializedName("Lat")
	String lat;

	@SerializedName("Lon")
	String lon;

}
