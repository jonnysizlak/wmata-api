package com.geebles.wamataapi.wmata;

import com.google.gson.annotations.SerializedName;

public class WmataLine {

	@SerializedName("DisplayName")
	public String displayName;

	@SerializedName("LineCode")
	public String lineCode;

	@SerializedName("InternalDestination1")
	public String internalDestination1;

	@SerializedName("InternalDestination2")
	public String internalDestination2;

	@SerializedName("StartStationCode")
	public String startStationCode;

	@SerializedName("EndStationCode")
	public String endStationCode;

}
