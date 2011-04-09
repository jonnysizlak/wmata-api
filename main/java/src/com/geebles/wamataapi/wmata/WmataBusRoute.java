package com.geebles.wamataapi.wmata;

import com.google.gson.annotations.SerializedName;

public class WmataBusRoute {
	@SerializedName("RouteID")
	public String routeId;

	@SerializedName("Name")
	public String routeName;
}
