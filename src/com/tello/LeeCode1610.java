package com.tello;

import java.util.ArrayList;
import java.util.List;

//1610. 可见点的最大数目
public class LeeCode1610 {
	public static int visiblePoints(List<List<Integer>> points, int angle, List<Integer> location) {
		ArrayList<Double> angList = new ArrayList<>();
		int i =0;
		for (List<Integer> pos : points) {
			double sx = (double)pos.get(0)-location.get(0);
			double sy = (double)pos.get(1)-location.get(1);
			if(sy!=0) {
				angList.add(Math.toDegrees(Math.atan(sx/sy)));				
			}else if(sx == 0){
				angList.add(0.0);
			}else {
				angList.add(90.0);
			}
			System.out.println(angList.get(i));
			i++;
		}
		for (Double ang : angList) {
			System.out.println(ang);
		}
		
		return angle;
    }
	public static void main(String[] args) {
		List<List<Integer>> intList = new ArrayList<>();
		List<Integer> a = new ArrayList<>();
		a.add(2);
		a.add(1);
		List<Integer> b = new ArrayList<>();
		b.add(2);
		b.add(2);
		List<Integer> c = new ArrayList<>();
		c.add(3);
		c.add(4);
		ArrayList<Integer> d = new ArrayList<>();
		d.add(1);
		d.add(1);
		intList.add(a);
		intList.add(b);
		intList.add(c);
		intList.add(d);
		ArrayList<Integer> location = new ArrayList<>();
		d.add(1);
		d.add(1);
		visiblePoints(intList,90,location);
	}
}
