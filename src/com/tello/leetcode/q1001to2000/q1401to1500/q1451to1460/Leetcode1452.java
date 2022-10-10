package com.tello.leetcode.q1001to2000.q1401to1500.q1451to1460;

import java.util.*;

public class Leetcode1452 {
    public List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {
        List<Integer> subList = new ArrayList<>();
        Queue removeQueue = new LinkedList();
        subList.add(0);
        int size = favoriteCompanies.size();
        for (int i = 1; i < size; i++) {
            List<String> toCompare = favoriteCompanies.get(i);
            boolean subBoolean = false;
            for (int j = subList.size()-1; j >=0; j--) {
                boolean contain = true;
                List<String> sub = favoriteCompanies.get(subList.get(j));
                if(toCompare.size()>sub.size()){
                    if(!toCompare.containsAll(sub)){
                        contain = false;
                    }
                    if(contain){
                        subBoolean = true;
                        removeQueue.add(j);
                        System.out.println("remove "+j);
                        if(!subList.contains(i)){
                            subList.add(i);
                            System.out.println("add "+i);
                        }
                    }
                }else{
                    if(!sub.containsAll(toCompare)){
                        contain = false;
                    }
                    if(contain){
                        subBoolean = true;
                        break;
                    }
                }
            }
            while (!removeQueue.isEmpty()){
                subList.remove((int)removeQueue.poll());
            }
            if(!subBoolean){
                subList.add(i);
                System.out.println(i);
            }
        }
        return subList;
//        Set<Integer> subList = new HashSet<>();
//        subList.add(0);
//        for (int i = 1; i < favoriteCompanies.size(); i++) {
//            List<String> toCompare = favoriteCompanies.get(i);
//            boolean contain = true;
//            Iterator<Integer> it = subList.iterator();
//            while(it.hasNext()) {
//                int nowPos =it.next();
//                List<String> sub = favoriteCompanies.get(nowPos);
//                if(toCompare.size()>sub.size()){
//                    if(!toCompare.containsAll(sub)){
//                        contain = false;
//                    }
//                    if(contain){
//                        it.remove();
//                        if(!subList.contains(i)){
//                            subList.add(i);
//                        }
//                    }
//                }else{
//                    if(!sub.containsAll(toCompare)){
//                        contain = false;
//                    }
//                    if(contain){
//                        break;
//                    }
//                }
//            }
//            if(!contain){
//                subList.add(i);
//                System.out.println(i);
//            }
//        }
//        return Arrays.asList(subList.toArray(new Integer[]{}));
    }
}
