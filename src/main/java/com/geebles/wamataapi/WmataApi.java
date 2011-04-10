package com.geebles.wamataapi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;


import com.geebles.wamataapi.json.JsonBusRoutes;
import com.geebles.wamataapi.json.JsonElevatorEscalatorIncidentResults;
import com.geebles.wamataapi.json.JsonLinesResult;
import com.geebles.wamataapi.json.JsonRailIncidentResults;
import com.geebles.wamataapi.json.JsonStationEntrances;
import com.geebles.wamataapi.json.JsonStationPredictionResults;
import com.geebles.wamataapi.json.JsonStationsResult;
import com.geebles.wamataapi.wmata.WmataBusRoute;
import com.geebles.wamataapi.wmata.WmataElevatorEscalatorIncident;
import com.geebles.wamataapi.wmata.WmataLine;
import com.geebles.wamataapi.wmata.WmataRailIncident;
import com.geebles.wamataapi.wmata.WmataStation;
import com.geebles.wamataapi.wmata.WmataStationEntrance;
import com.geebles.wamataapi.wmata.WmataStationPrediction;
import com.google.gson.Gson;

public class WmataApi {
	private Gson gson = new Gson();

	public static void main(String[] args) throws Exception {
		new WmataApi().main2(args);
	}

	public void main2(String[] args) throws Exception {

		String apiKey = "h9aht5yqtq2d7f6dugfrfwus";

		List<WmataLine> lines = getAllLines(apiKey);

		for (WmataLine line : lines) {
			System.out.println(line.displayName + " : " + line.lineCode + " : " + line.startStationCode);
		}

		System.out.println("============ get all station info for line ==================");

		String lineCode = "BL";

		List<WmataStation> stations = getAllStationsForLine(apiKey, lineCode);

		for (WmataStation station : stations) {
			System.out.println(station.name + ": " + station.code);
		}

		System.out.println("============= get specific station info =================");

		String stationCode = "A10";
		WmataStation station = getStationInfo(apiKey, stationCode);
		System.out.println(station.name + ": " + station.code);

		System.out.println("============= get all predictions =================");
		List<WmataStationPrediction> predictions = getAllStationPredictions(apiKey);
		for (WmataStationPrediction pred : predictions) {
			System.out.println(pred.locationName);
			System.out.println(pred.numberOfCars + " : " + pred.line + " : " + pred.destinationName + " : " + pred.timeToArrival);
			System.out.println("--------------------");
		}

		System.out.println("============== get specific station predictions ================");

		predictions = getStationPredictions(apiKey, "C13");
		for (WmataStationPrediction pred : predictions) {
			System.out.println(pred.numberOfCars + " : " + pred.line + " : " + pred.destinationName + " : " + pred.timeToArrival);
		}

		System.out.println("============== rail incidents ================");
		List<WmataRailIncident> incidents = getRailIncidents(apiKey);
		for (WmataRailIncident incident : incidents) {
			System.out.println(incident.incidentId + " : " + incident.incidentType + " : " + incident.delaySeverity + " : " + incident.description + " : " + incident.linesAffected);
		}

		System.out.println("============== elevator/escalator incidents ================");
		List<WmataElevatorEscalatorIncident> eeincidents = getElevatorEscalatorIncidents(apiKey);
		for (WmataElevatorEscalatorIncident eeincident : eeincidents) {
			System.out.println(eeincident.stationName + " : " + eeincident.unitType);
		}

		System.out.println("============== all station entrances ================");
		List<WmataStationEntrance> entrances = getAllStationEntrances(apiKey);
		for (WmataStationEntrance entrance : entrances) {
			System.out.println(entrance.name + " : " + entrance.description);
		}

		System.out.println("============== station entrances near lon/lat ================");
		entrances = getStationEntrances("38.80651739909121", "-77.06079840660095", 500, apiKey);
		for (WmataStationEntrance entrance : entrances) {
			System.out.println(entrance.name + " : " + entrance.description);
		}

		System.out.println("============== bus routes ================");
		List<WmataBusRoute> routes = getAllBusRoutes(apiKey);
		for (WmataBusRoute route : routes) {
			System.out.println(route.routeId + " : " + route.routeName);
		}

	}

	private List<WmataBusRoute> getAllBusRoutes(String apiKey) throws Exception {
		String json = getJsonFromUrl("http://api.wmata.com/Bus.svc/json/JRoutes?api_key=" + apiKey);
		JsonBusRoutes routes = gson.fromJson(json, JsonBusRoutes.class);
		return routes.routes;
	}

	private List<WmataStationEntrance> getAllStationEntrances(String apiKey) throws Exception {
		String json = getJsonFromUrl("http://api.wmata.com/Rail.svc/json/JStationEntrances?api_key=" + apiKey);
		JsonStationEntrances entrances = gson.fromJson(json, JsonStationEntrances.class);
		return entrances.entrances;
	}

	private List<WmataStationEntrance> getStationEntrances(String lat, String lon, int radius, String apiKey) throws Exception {
		String json = getJsonFromUrl("http://api.wmata.com/Rail.svc/json/JStationEntrances?lat=" + lat + "&lon=" + lon + "&radius=" + radius + "&api_key=" + apiKey);
		JsonStationEntrances entrances = gson.fromJson(json, JsonStationEntrances.class);
		return entrances.entrances;
	}

	private List<WmataElevatorEscalatorIncident> getElevatorEscalatorIncidents(String apiKey) throws Exception {
		String json = getJsonFromUrl("http://api.wmata.com/Incidents.svc/json/ElevatorIncidents?api_key=" + apiKey);
		JsonElevatorEscalatorIncidentResults incidents = gson.fromJson(json, JsonElevatorEscalatorIncidentResults.class);
		return incidents.incidents;
	}

	private List<WmataRailIncident> getRailIncidents(String apiKey) throws Exception {
		String json = getJsonFromUrl("http://api.wmata.com/Incidents.svc/json/Incidents?api_key=" + apiKey);
		JsonRailIncidentResults incidents = gson.fromJson(json, JsonRailIncidentResults.class);
		return incidents.incidents;
	}

	private List<WmataStationPrediction> getStationPredictions(String apiKey, String stationCode) throws Exception {
		String json = getJsonFromUrl("http://api.wmata.com/StationPrediction.svc/json/GetPrediction/" + stationCode + "?api_key=" + apiKey);
		JsonStationPredictionResults predicitions = gson.fromJson(json, JsonStationPredictionResults.class);
		return predicitions.predictions;
	}

	private List<WmataStationPrediction> getAllStationPredictions(String apiKey) throws Exception {
		String json = getJsonFromUrl("http://api.wmata.com/StationPrediction.svc/json/GetPrediction/All?api_key=" + apiKey);
		JsonStationPredictionResults predicitions = gson.fromJson(json, JsonStationPredictionResults.class);
		return predicitions.predictions;
	}

	private WmataStation getStationInfo(String apiKey, String stationCode) throws Exception {
		String json = getJsonFromUrl("http://api.wmata.com/Rail.svc/json/JStationInfo?StationCode=" + stationCode + "&api_key=" + apiKey);
		WmataStation station = gson.fromJson(json, WmataStation.class);
		return station;
	}

	private List<WmataStation> getAllStationsForLine(String apiKey, String lineCode) throws Exception {
		String json = getJsonFromUrl("http://api.wmata.com/Rail.svc/json/JStations?LineCode=" + lineCode + "&api_key=" + apiKey);
		JsonStationsResult stations = gson.fromJson(json, JsonStationsResult.class);
		return stations.stations;
	}

	private List<WmataLine> getAllLines(String apiKey) throws Exception {
		String json = getJsonFromUrl("http://api.wmata.com/Rail.svc/json/JLines?api_key=" + apiKey);
		JsonLinesResult lines = gson.fromJson(json, JsonLinesResult.class);
		return lines.lines;
	}

	private String getJsonFromUrl(String urlString) throws Exception {
		URL url = new URL(urlString);
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		String json = null;
		try {
			json = br.readLine();
		} finally {
			br.close();
		}
		return json;
	}
}
