package com.geebles.wamataapi;

import com.google.gson.annotations.SerializedName;

public class WmataStation {
	@SerializedName("Code")
	String code;

	@SerializedName("Lat")
	String latitude;

	@SerializedName("LineCode1")
	String lineCode1;

	@SerializedName("LineCode2")
	String lineCode2;

	@SerializedName("LineCode3")
	String lineCode3;

	@SerializedName("LineCode4")
	String lineCode4;

	@SerializedName("Lon")
	String longitude;

	@SerializedName("Name")
	String name;

	@SerializedName("StationTogether1")
	String stationTogether1;

	@SerializedName("StationTogether2")
	String stationTogether2;
}