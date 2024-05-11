import java.util.*;

class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = quality.length;
        double[][] ratioAndQuality = new double[n][2]; // ratio, quality
        for (int i = 0; i < n; i++) {
            ratioAndQuality[i] = new double[]{(double) wage[i] / quality[i], quality[i]};
        }
        
        Arrays.sort(ratioAndQuality, Comparator.comparingDouble(a -> a[0]));
        
        PriorityQueue<Double> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        double totalQuality = 0;
        double minCost = Double.MAX_VALUE;
        
        for (double[] rq : ratioAndQuality) {
            double ratio = rq[0];
            double quality1 = rq[1];
            totalQuality += quality1;
            maxHeap.offer(quality1);
            if (maxHeap.size() > k) {
                totalQuality -= maxHeap.poll();
            }
            if (maxHeap.size() == k) {
                minCost = Math.min(minCost, totalQuality * ratio);
            }
        }
        
        return minCost;
    }
}
