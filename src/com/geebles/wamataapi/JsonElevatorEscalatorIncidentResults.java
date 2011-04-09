package com.geebles.wamataapi;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class JsonElevatorEscalatorIncidentResults {
	@SerializedName("ElevatorIncidents")
	List<WmataElevatorEscalatorIncident> incidents;
}
