package com.general.verified.thoughtworks;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xujiali
 */
public class QuestionService {

    public static int count = 0;

    public int getQestionSix(int[][] graphSix, int maxStops, int startStop, int endStop, int currentStops) {
        if (currentStops > maxStops) {
            return count;
        }
        if (startStop == endStop && currentStops != 0) {
            count++;
            return count;
        }
        for (int i = 0; i < graphSix.length; i++) {
            if (graphSix[startStop][i] == Graph.inf) {
                continue;
            }
            // find the route update the route as startStop set currentStops add 1
            // recursion the getStopsIsFour() find new route
            getQestionSix(graphSix, maxStops, i, endStop, currentStops + 1);
        }
        return count;
    }

    public int getQestionEightAndNine(String origin, String target, int[][] graphParam) {
        int[] shortDistance = new int[graphParam.length];// shortest distance with A stop
        Boolean[] mark = new Boolean[graphParam.length];
        int currentStop = getStopMapNum(origin);
        // Initialize the mark[] and shortDistance[]
        for (int i = 0; i < graphParam.length; i++) {
            shortDistance[i] = graphParam[currentStop][i];
            mark[i] = false;
        }
        // If graphParam[0][0] != Graph.inf this method calling by questionNine()
        // else this method calling by questionEight() and set mark[currentStop] = true
        if (graphParam[0][0] != Graph.inf) {
            mark[currentStop] = true;
        }
        for (int i = 0; i < graphParam.length; i++) {
            // Each loop get the shortest distance min and currentStop
            int min = Graph.inf;
            for (int j = 0; j < graphParam.length; j++) {
                if (!mark[j] && shortDistance[j] < min) {
                    min = shortDistance[j];
                    currentStop = j;
                }
            }
            mark[currentStop] = true;
            //compare distance (min + graphParam[currentStop][j]) and shortDistance[j]
            //get the small distance storage in shortDistance[j]
            for (int j = 0; j < graphParam.length; j++) {
                if (!mark[j] && min + graphParam[currentStop][j] < shortDistance[j]) {
                    shortDistance[j] = min + graphParam[currentStop][j];
                }
            }
        }
        return shortDistance[getStopMapNum(target)];
    }

    public int getQeationSeven(int[][] graphSeven, int maxStops, int startStop, int endStop, int currentStops) {
        if (currentStops > maxStops) {
            return count;
        }
        if (currentStops == maxStops) {
            if (startStop == endStop) {
                count++;
            }
            return count;
        }
        for (int i = 0; i < graphSeven.length; i++) {
            if (graphSeven[startStop][i] == Graph.inf) {
                continue;
            }
            // find the stop updated as startStop set currentStops add 1
            // recursion the getStopsIsFour() find new route
            getQeationSeven(graphSeven, maxStops, i, endStop, currentStops + 1);
        }
        return count;
    }

    public int getQestionTen(int[][] graphTen, int allWeighting, int startStop, int endStop, int maxWighting) {
        if (!(allWeighting < maxWighting)) {
            return count;
        }
        // this if condition not return countTen made program could run to
        // allWighting > maxWighting
        if (startStop == endStop && allWeighting != 0) {
            count++;
        }
        for (int i = 0; i < graphTen.length; i++) {
            if (graphTen[startStop][i] == Graph.inf) {
                continue;
            }
            // find the stop updated as startStop set allWeighting add
            // graphNine[startStop][i]
            // recursion the getStopsLessThirty() find new stops
            getQestionTen(graphTen, allWeighting + graphTen[startStop][i], i, endStop, maxWighting);
        }
        return count;
    }

    public static int getStopMapNum(String stop) {
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        for (int i = 0; i < 26; i++) {
            mapping.put(String.valueOf((char) (65 + i)), i);
        }
        return mapping.get(stop);
    }

}
