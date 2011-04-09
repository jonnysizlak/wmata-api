package com.geebles.wamataapi.json;

import java.util.List;

import com.geebles.wamataapi.wmata.WmataBusRoute;
import com.google.gson.annotations.SerializedName;

public class JsonBusRoutes {
	@SerializedName("Routes")
	public List<WmataBusRoute> routes;
}
