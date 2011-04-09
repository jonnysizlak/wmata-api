package com.geebles.wamataapi.json;

import java.util.List;

import com.geebles.wamataapi.wmata.WmataStationEntrance;
import com.google.gson.annotations.SerializedName;

public class JsonStationEntrances {
	@SerializedName("Entrances")
	public List<WmataStationEntrance> entrances;
}
