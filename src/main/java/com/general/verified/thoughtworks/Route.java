package com.general.verified.thoughtworks;

/**
 * class Route included start stop,end stop,weighting,routeName.Class Route
 * able created object route,a certainly start and end stop indicate direction
 * start to end for this object route
 * 
 * @author xujiali
 *
 */
public class Route {
	private String startStop;
	private String endStop;
	private int weighting;
	private String routeName;

	public Route(String startStop, String endStop, int weighting) {
		this.startStop = startStop;
		this.endStop = endStop;
		this.weighting = weighting;
		this.routeName = startStop.concat(endStop);
	}

	public String getRouteName() {
		return routeName;
	}

	public int getWeighting() {
		return this.weighting;
	}

	public String getStartStop() {
		return startStop;
	}

	public String getEndStop() {
		return endStop;
	}

}
