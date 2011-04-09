package com.geebles.wamataapi;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class JsonBusRoutes {
	@SerializedName("Routes")
	List<WmataBusRoute> routes;
}
