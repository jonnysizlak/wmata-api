package com.geebles.wamataapi;

import com.google.gson.annotations.SerializedName;

public class WmataStationPrediction {
	
	@SerializedName("Car")
	String numberOfCars;
	
	@SerializedName("Destination")
	String destination;
	
	@SerializedName("DestinationCode")
	String destinationCode;
	
	@SerializedName("DestinationName")
	String destinationName;
	
	@SerializedName("Group")
	String group;
	
	@SerializedName("Line")
	String line;
	
	@SerializedName("LocationCode")
	String locationCode;
	
	@SerializedName("LocationName")
	String locationName;
	
	@SerializedName("Min")
	String timeToArrival;

}
