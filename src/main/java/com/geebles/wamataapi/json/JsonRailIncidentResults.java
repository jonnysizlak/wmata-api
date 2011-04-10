package com.geebles.wamataapi.json;

import java.util.List;

import com.geebles.wamataapi.wmata.WmataRailIncident;
import com.google.gson.annotations.SerializedName;

public class JsonRailIncidentResults {
	@SerializedName("Incidents")
	public List<WmataRailIncident> incidents;
}
