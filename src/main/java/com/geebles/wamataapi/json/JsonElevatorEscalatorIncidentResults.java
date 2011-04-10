package com.geebles.wamataapi.json;

import java.util.List;

import com.geebles.wamataapi.wmata.WmataElevatorEscalatorIncident;
import com.google.gson.annotations.SerializedName;

public class JsonElevatorEscalatorIncidentResults {
	@SerializedName("ElevatorIncidents")
	public List<WmataElevatorEscalatorIncident> incidents;
}
