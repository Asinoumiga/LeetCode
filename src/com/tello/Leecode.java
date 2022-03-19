package com.tello;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Leecode {
	
	public static int[] findDiagonalOrder(List<List<Integer>> nums) {
		int num=0;
        HashMap<Integer, ArrayList<Integer>> map = new HashMap();
        int maxRange = 0;
        for(int i=0;i<nums.size();i++){
        	if(nums.get(i).size()>maxRange){
                maxRange = nums.get(i).size();
            }
        }
        for(int i=0;i<nums.size();i++){
            for(int j=0;j<nums.get(i).size();j++){
            	ArrayList<Integer> a = map.get(i+j);
            	if(a==null) {
            		a=new ArrayList<>();
            	}
            	a.add(nums.get(i).get(j));
                map.put(i+j,a);
                num++;
            }
            if(i+nums.get(i).size()>maxRange){
                maxRange = i+nums.get(i).size();
            }
        }
        int[] result = new int[num+1];
        int index = 0;
        
        for(int i=0;i<maxRange;i++) {
        	ArrayList<Integer> a = map.get(i);
        	
        	for(int j=a.size()-1;j>=0;j--) {
        		result[index++]=a.get(j);
        	}
        }
        
        return result;
    }
	
	public static void main(String[] args) {
		ArrayList<List<Integer>> request = new ArrayList<>();
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		ArrayList<Integer> b = new ArrayList<>();
		b.add(4);
		b.add(5);
		b.add(6);
		ArrayList<Integer> c = new ArrayList<>();
		c.add(7);
		c.add(8);
		c.add(9);
		request.add(a);
		request.add(b);
		request.add(c);
		int[] result = findDiagonalOrder(request);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
