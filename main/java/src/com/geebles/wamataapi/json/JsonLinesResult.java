package com.geebles.wamataapi.json;

import java.util.List;

import com.geebles.wamataapi.wmata.WmataLine;
import com.google.gson.annotations.SerializedName;

public class JsonLinesResult {

	@SerializedName("Lines")
	public List<WmataLine> lines;

}
