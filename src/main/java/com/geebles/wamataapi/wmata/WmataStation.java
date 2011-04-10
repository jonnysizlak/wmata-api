package com.geebles.wamataapi.wmata;

import com.google.gson.annotations.SerializedName;

public class WmataStation {
	@SerializedName("Code")
	public String code;

	@SerializedName("Lat")
	public String latitude;

	@SerializedName("LineCode1")
	public String lineCode1;

	@SerializedName("LineCode2")
	public String lineCode2;

	@SerializedName("LineCode3")
	public String lineCode3;

	@SerializedName("LineCode4")
	public String lineCode4;

	@SerializedName("Lon")
	public String longitude;

	@SerializedName("Name")
	public String name;

	@SerializedName("StationTogether1")
	public String stationTogether1;

	@SerializedName("StationTogether2")
	public String stationTogether2;
}