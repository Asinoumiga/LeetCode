package com.tello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;

public class LeeCode743 {
	public static int networkDelayTime(int[][] times, int n, int k) {
		HashMap<Integer,HashMap<Integer,Integer>> a = getPoints(times);

		
		int[] distToPoint = new int[n];
		Arrays.fill(distToPoint, Integer.MAX_VALUE);
		distToPoint[k-1] = 0;
		int[] curDistToPoint = new int[n];
		Arrays.fill(curDistToPoint, -1);
		curDistToPoint[k-1] = 0;
		Queue<Integer> queue = new PriorityQueue<>();
		queue.offer(k);
		while (!queue.isEmpty()) {
			Integer point = queue.poll();
			if(curDistToPoint[point-1]>distToPoint[point-1]) {
				continue;
			}
			HashMap<Integer, Integer> inA = a.get(point);
			for(Entry<Integer, Integer> entry : inA.entrySet()) {
				System.out.println(entry.getKey()+"------"+entry.getValue());
				int distToNextNode = distToPoint[point-1]+entry.getValue();
				System.out.println(distToPoint[point-1]+"============"+distToNextNode);
				if(distToPoint[entry.getKey()-1] > distToNextNode) {
					distToPoint[entry.getKey()-1] = distToNextNode;
					curDistToPoint[entry.getKey()-1] = distToNextNode;
					queue.offer(entry.getKey());
				}
			}
		}
		int max = 0;
		for (int i = 0; i < distToPoint.length; i++) {
			System.out.println(distToPoint[i]);
			if(distToPoint[i]==Integer.MAX_VALUE) {
				return -1;
			}
			if(max<distToPoint[i]) {
				max = distToPoint[i];
			};
		}
		return max;
    }
	
	public static HashMap<Integer,HashMap<Integer,Integer>> getPoints(int[][] times) {
		HashMap<Integer,HashMap<Integer,Integer>> a = new HashMap<>();
		for (int i = 1; i < times.length; i++) {
			HashMap<Integer, Integer> toMap;
			if(a.get(times[i][0])==null) {
				toMap = new HashMap<>();
				toMap.put(times[i][1], times[i][2]);
				a.put(times[i][0],toMap);
			}else {
				toMap = a.get(times[i][0]);
				toMap.put(times[i][1], times[i][2]);
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		int[][] a = new int[][] {{2,1,1},{2,3,1},{3,4,1}};
		System.out.println(networkDelayTime(a,4,2));
	}
}
