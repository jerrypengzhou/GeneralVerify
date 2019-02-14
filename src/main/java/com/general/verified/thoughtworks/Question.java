package com.general.verified.thoughtworks;

/**
 * Class Question include ten questions for solutions.
 * 
 * @author xujiali
 * @since jdk1.8
 */
public class Question {
	private Graph graph;
	private final String NO_SUCH_ROUTE = "NO SUCH ROUTE";
	private QuestionService computeService = new QuestionService();

	/**
	 * 
	 * @param graph
	 *            parameter Graph
	 */
	public Question(Graph graph) {
		this.graph = graph;
	}

	/**
	 * Method for question one
	 */
	public void questionOne() {
		if (graph.getAllRoutes().containsKey("AB") && graph.getAllRoutes().containsKey("BC")) {
			int distanceAb = graph.getAllRoutes().get("AB").getWeighting();
			int distanceBc = graph.getAllRoutes().get("BC").getWeighting();
			System.out.println("Output #1: " + (distanceAb + distanceBc));
		} else {
			System.out.println("Output #1: " + NO_SUCH_ROUTE);
		}
	}

	/**
	 * Method for question two
	 */
	public void questionTwo() {
		if (graph.getAllRoutes().containsKey("AD")) {
			int distanceAd = graph.getAllRoutes().get("AD").getWeighting();
			System.out.println("Output #2: " + (distanceAd));
		} else {
			System.out.println("Output #2: " + NO_SUCH_ROUTE);
		}

	}

	/**
	 * Method for question three
	 */
	public void questionThree() {
		if (graph.getAllRoutes().containsKey("AD") && graph.getAllRoutes().containsKey("DC")) {
			int distanceAd = graph.getAllRoutes().get("AD").getWeighting();
			int distanceDc = graph.getAllRoutes().get("DC").getWeighting();
			System.out.println("Output #3: " + (distanceAd + distanceDc));
		} else {
			System.out.println("Output #3: " + NO_SUCH_ROUTE);
		}

	}

	/**
	 * Method for question four
	 */
	public void questionFour() {
		if (graph.getAllRoutes().containsKey("AE") && graph.getAllRoutes().containsKey("EB")
				&& graph.getAllRoutes().containsKey("BC") && graph.getAllRoutes().containsKey("CD")) {
			int distanceAe = graph.getAllRoutes().get("AE").getWeighting();
			int distanceEb = graph.getAllRoutes().get("EB").getWeighting();
			int distanceBc = graph.getAllRoutes().get("BC").getWeighting();
			int distanceCd = graph.getAllRoutes().get("CD").getWeighting();
			System.out.println("Output #4: " + (distanceAe + distanceEb + distanceBc + distanceCd));
		} else {
			System.out.println("Output #4: " + NO_SUCH_ROUTE);
		}
	}

	/**
	 * Method for question five
	 */
	public void questionFive() {
		if (graph.getAllRoutes().containsKey("AE") && graph.getAllRoutes().containsKey("ED")) {
			int distanceAe = graph.getAllRoutes().get("AE").getWeighting();
			int distanceEd = graph.getAllRoutes().get("ED").getWeighting();
			System.out.println("Output #5: " + (distanceAe + distanceEd));
		} else {
			System.out.println("Output #5: " + NO_SUCH_ROUTE);
		}

	}

	/**
	 * Method for question six 
	 */
	public void questionSix() {
		QuestionService.count = 0;
		int count = computeService.getQestionSix(graph.getGraphInfinity(), 3, 2, 2, 0);
		if (count == 0) {
			System.out.println("Output #6: " + NO_SUCH_ROUTE);
		} else {
			System.out.println("Output #6: " + count);
		}
	}

	/**
	 * Method for question seven
	 */
	public void questionSeven() {
		QuestionService.count = 0;
		int count = computeService.getQeationSeven(graph.getGraphInfinity(), 4, 0, 2, 0);
		if (count == 0) {
			System.out.println("Output #7: " + NO_SUCH_ROUTE);
		} else {
			System.out.println("Output #7: " + count);
		}
	}

	/**
	 * Method for question eight
	 */
	public void questionEight() {
		int[][] graphEight = graph.getGraphZero();
		int shortDistance = computeService.getQestionEightAndNine("A", "C", graphEight);
		if (shortDistance == Graph.inf) {
			System.out.println("Output #8: " + NO_SUCH_ROUTE);
		} else {
			System.out.println("Output #8: " + shortDistance);
		}
	}

	/**
	 * Method for question nine
	 */
	public void questionNine() {
		int[][] graphNine = graph.getGraphInfinity();
		int shortDistance = computeService.getQestionEightAndNine("B", "B", graphNine);
		if (shortDistance == Graph.inf) {
			System.out.println("Output #9: " + NO_SUCH_ROUTE);
		} else {
			System.out.println("Output #9: " + shortDistance);
		}
	}

	/**
	 * Method for question ten
	 */
	public void questionTen() {
		QuestionService.count = 0;
		int count = computeService.getQestionTen(graph.getGraphInfinity(), 0, 2, 2, 30);
		if (count == 0) {
			System.out.println("Output #10: " + NO_SUCH_ROUTE);
		} else {
			System.out.println("Output #10: " + count);
		}
	}
}
