package com.geebles.wamataapi.json;

import java.util.List;

import com.geebles.wamataapi.wmata.WmataStation;
import com.google.gson.annotations.SerializedName;

public class JsonStationsResult {
	@SerializedName("Stations")
	public List<WmataStation> stations;
}
