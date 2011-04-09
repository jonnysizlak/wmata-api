package com.geebles.wamataapi;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class JsonStationPredictionResults {
	@SerializedName("Trains")
	List<WmataStationPrediction> predictions;
}
