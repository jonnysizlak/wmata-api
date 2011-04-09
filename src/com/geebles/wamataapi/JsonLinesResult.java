package com.geebles.wamataapi;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class JsonLinesResult {

	@SerializedName("Lines")
	public List<WmataLine> lines;

}
