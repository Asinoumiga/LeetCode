package com.tello.leetcode.q1001to2000.q1701to1800.q1791to1800;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Leetcode1792 {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
//        PriorityQueue<int[]> queue = new PriorityQueue(new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                int[] a = (int[])o1;
//                int[] b = (int[])o2;
//                double resultA =  (double) (a[0]+1)/(a[1]+1)-(double)a[0]/a[1];
//                double resultB =  (double) (b[0]+1)/(b[1]+1)-(double)b[0]/b[1];
//                return resultB>=resultA?1:-1;
//            }
//        });
        Queue<double[]> queue = new PriorityQueue<>(Comparator.comparingDouble(a -> (a[0] - a[1]) / (a[1] * (a[1] + 1))));
        for (int i = 0; i < classes.length; i++) {
            queue.offer(new double[]{classes[i][0],classes[i][1]});
        }
        double[] temp;
        while (extraStudents>0){
            temp = queue.poll();
            System.out.println("old: "+temp[0]+" "+temp[1]);
            temp[0]++;
            temp[1]++;
            System.out.println("new: "+temp[0]+" "+temp[1]);
            queue.offer(temp);
            extraStudents--;
        }
        double total = 0;
        while (!queue.isEmpty()){
            temp = queue.poll();
            total += temp[0]/temp[1];
        }
        return total/classes.length;
    }

    public static void main(String[] args) {
        int[][] a = {{2,4},{3,9},{4,5},{2,10}};
        double result = new Leetcode1792().maxAverageRatio(a,4);
        System.out.println(result);
//        PriorityQueue<int[]> queue = new PriorityQueue(new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                int[] a = (int[])o1;
//                int[] b = (int[])o2;
//                double resultA =  (double) (a[0]+1)/(a[1]+1)-a[0]/a[1];
//                double resultB =  (double) (b[0]+1)/(b[1]+1)-b[0]/b[1];
//                return resultB>=resultA?1:-1;
//            }
//        });
//        for (int i = 0; i < a.length; i++) {
//            queue.offer(a[i]);
//        }
//        int[] b = {1,2};
//        int[] c = {3,5};
//        int[] d = {2,2};
//        queue.offer(b);
//        queue.offer(c);
//        queue.offer(d);
//        while (!queue.isEmpty()){
//            int[] temp = queue.poll();
//            System.out.println(temp[0]+" "+temp[1]);
//        }
    }
}
