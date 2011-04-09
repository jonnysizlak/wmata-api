package com.geebles.wamataapi;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class JsonStationsResult {
	@SerializedName("Stations")
	List<WmataStation> stations;
}
