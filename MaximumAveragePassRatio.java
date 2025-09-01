import java.util.PriorityQueue;

public class MaximumAveragePassRatio {
    public static void main(String[] args) {

        /*
        *
        * There is a school that has classes of students and each class will be having a final exam. You are given a 2D integer array classes, where classes[i] = [passi, totali]. You know beforehand that in the ith class, there are totali total students, but only passi number of students will pass the exam.

You are also given an integer extraStudents. There are another extraStudents brilliant students that are guaranteed to pass the exam of any class they are assigned to. You want to assign each of the extraStudents students to a class in a way that maximizes the average pass ratio across all the classes.

The pass ratio of a class is equal to the number of students of the class that will pass the exam divided by the total number of students of the class. The average pass ratio is the sum of pass ratios of all the classes divided by the number of the classes.

Return the maximum possible average pass ratio after assigning the extraStudents students. Answers within 10-5 of the actual answer will be accepted.
* */
        int classes[][] = new int[][]{
                {1, 2},
                {3, 5},
                {2, 2}
        };
        int extraStudents = 2;
        double ans = maxAverageRatio(classes, extraStudents);
        System.out.println(ans);
    }
    private static double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> maxHeap = new PriorityQueue<>((a,b) -> Double.compare(b[0], a[0]));

        for (int[] singleClass : classes) {
            int pass = singleClass[0];
            int total = singleClass[1];
            double gain = calculateGain(pass, total);
            maxHeap.offer(new double[]{gain, pass, total});
        }

        while(extraStudents-- > 0) {
            double[] curr = maxHeap.poll();
            assert curr != null;
            int passes = (int)  curr[1];
            int total = (int)  curr[2];
            maxHeap.offer(new double[]{calculateGain(passes + 1, total + 1), passes + 1, total + 1});
        }

        double ans = 0;
        while(!maxHeap.isEmpty()) {
            double[] current = maxHeap.poll();
            int passes = (int) current[1];
            int total = (int) current[2];
            ans += (double) passes/total;
        }
        return ans / classes.length;
    }

    private static double calculateGain(int pass, int total) {
        return (double) (pass+ 1) / (total + 1) - (double) pass/total;
    }
}
