package com.geebles.wamataapi;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class JsonRailIncidentResults {
	@SerializedName("Incidents")
	List<WmataRailIncident> incidents;
}
