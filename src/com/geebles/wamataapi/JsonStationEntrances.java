package com.geebles.wamataapi;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class JsonStationEntrances {
	@SerializedName("Entrances")
	List<WmataStationEntrance> entrances;
}
