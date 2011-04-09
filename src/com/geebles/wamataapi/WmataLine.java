package com.geebles.wamataapi;

import com.google.gson.annotations.SerializedName;

public class WmataLine {

	@SerializedName("DisplayName")
	String displayName;

	@SerializedName("LineCode")
	String lineCode;

	@SerializedName("InternalDestination1")
	String internalDestination1;

	@SerializedName("InternalDestination2")
	String internalDestination2;

	@SerializedName("StartStationCode")
	String startStationCode;

	@SerializedName("EndStationCode")
	String endStationCode;

}
