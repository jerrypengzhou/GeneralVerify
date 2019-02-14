package com.general.verified.thoughtworks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * class Graph create graph object,before used input all the Routes to
 * initializing the Graph 
 * @attention sum all the Route's weighting could not more than 10000
 * 
 * @author xujiali
 * @since jdk1.8
 */
public class Graph {
	/**
	 * Graph.inf represent infinity as 10000
	 */
	public final static int inf = 10000;
	private Map<String, Route> allRoutes = new HashMap<String, Route>();

	/**
	 * Initialize the Graph that need to set all route before used.
	 */
	public Graph() {
		Route routeAB = new Route("A", "B", 5);
		Route routeBC = new Route("B", "C", 4);
		Route routeCD = new Route("C", "D", 8);
		Route routeDC = new Route("D", "C", 8);
		Route routeDE = new Route("D", "E", 6);
		Route routeAD = new Route("A", "D", 5);
		Route routeCE = new Route("C", "E", 2);
		Route routeEB = new Route("E", "B", 3);
		Route routeAE = new Route("A", "E", 7);
		this.allRoutes.put(routeAB.getRouteName(), routeAB);
		this.allRoutes.put(routeBC.getRouteName(), routeBC);
		this.allRoutes.put(routeCD.getRouteName(), routeCD);
		this.allRoutes.put(routeDC.getRouteName(), routeDC);
		this.allRoutes.put(routeDE.getRouteName(), routeDE);
		this.allRoutes.put(routeAD.getRouteName(), routeAD);
		this.allRoutes.put(routeCE.getRouteName(), routeCE);
		this.allRoutes.put(routeEB.getRouteName(), routeEB);
		this.allRoutes.put(routeAE.getRouteName(), routeAE);
	}

	/**
	 * getAllStopsArray() return a String[] include all stop in this graph
	 * 
	 * @return String[]
	 */
	public String[] getAllStopsArray() {
		HashSet<String> stopSet = new HashSet<String>();
		allRoutes.entrySet().forEach(e -> {
			stopSet.add(e.getValue().getStartStop());
		});
		String[] strArray = new String[stopSet.size()];
		String[] stopArray = (String[]) stopSet.toArray(strArray);
		return stopArray;
	}

	/**
	 * getGraphZero() return below int[][] for compute.qestionEight()
	 * 
	 * @since JDK1.8
	 * @return [0, 5, 10000, 5, 7], 
	 * 		   [10000, 0, 4, 10000, 10000], 
	 * 		   [10000, 10000, 0,8, 2],
	 * 		   [10000, 10000, 8, 0, 6], 
	 * 		   [10000, 3, 10000, 10000, 0]]
	 */
	public int[][] getGraphZero() {
		String[] stopArray = getAllStopsArray();
		int[][] graph = new int[stopArray.length][stopArray.length];
		for (int i = 0; i < stopArray.length; i++) {
			for (int j = 0; j < stopArray.length; j++) {
				if (i == j) {
					graph[i][j] = 0;
				}
				if (i != j) {
					graph[i][j] = inf;
				}
			}

		}
		allRoutes.entrySet().forEach(e -> {
			int row = QuestionService.getStopMapNum(e.getValue().getStartStop());
			int com = QuestionService.getStopMapNum(e.getValue().getEndStop());
			graph[row][com] = e.getValue().getWeighting();
		});
		return graph;
	}

	/**
	 * getGraphInfinity() return below int[][] for compute.qestionNine()
	 * 
	 * @since JDK1.8
	 * @return [10000, 5, 10000, 5, 7], 
	 * 		   [10000, 10000, 4, 10000, 10000], 
	 * 		   [10000,10000, 10000, 8, 2], 
	 * 		   [10000, 10000, 8, 10000, 6], 
	 *         [10000, 3, 10000,10000, 10000]
	 */
	public int[][] getGraphInfinity() {
		String[] stopArray = getAllStopsArray();
		int[][] graph = new int[stopArray.length][stopArray.length];
		for (int i = 0; i < stopArray.length; i++) {
			for (int j = 0; j < stopArray.length; j++) {
				graph[i][j] = inf;
			}
		}
		allRoutes.entrySet().forEach(e -> {
			int row = QuestionService.getStopMapNum(e.getValue().getStartStop());
			int column = QuestionService.getStopMapNum(e.getValue().getEndStop());
			graph[row][column] = e.getValue().getWeighting();
		});
		return graph;
	}

	/**
	 * getAllRoutes() will return all routes
	 * 
	 * @return graph
	 */
	public Map<String, Route> getAllRoutes() {
		return this.allRoutes;
	}
}
