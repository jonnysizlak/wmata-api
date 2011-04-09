package com.geebles.wamataapi.json;

import java.util.List;

import com.geebles.wamataapi.wmata.WmataStationPrediction;
import com.google.gson.annotations.SerializedName;

public class JsonStationPredictionResults {
	@SerializedName("Trains")
	public List<WmataStationPrediction> predictions;
}
