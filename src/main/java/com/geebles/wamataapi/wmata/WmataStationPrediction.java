package com.geebles.wamataapi.wmata;

import com.google.gson.annotations.SerializedName;


public class WmataStationPrediction {
	
	@SerializedName("Car")
	public String numberOfCars;
	
	@SerializedName("Destination")
	public String destination;
	
	@SerializedName("DestinationCode")
	public String destinationCode;
	
	@SerializedName("DestinationName")
	public String destinationName;
	
	@SerializedName("Group")
	public String group;
	
	@SerializedName("Line")
	public String line;
	
	@SerializedName("LocationCode")
	public String locationCode;
	
	@SerializedName("LocationName")
	public String locationName;
	
	@SerializedName("Min")
	public String timeToArrival;

}
