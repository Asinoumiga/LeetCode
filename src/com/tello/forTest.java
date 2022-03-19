package com.tello;

import com.tello.prepare.Position;

import java.util.ArrayList;
import java.util.List;

public class forTest {
//	public long solution(int n) throws Exception{
//        if(n<1||n>200){
//            throw new Exception("out of range");
//        }
//        long result = 1;
//        for(int i=1;i<=n;i++){
//            result *=i;
//        }
//        return result;
//    }

    public static void main(String[] args) {
        List<Position> intList = new ArrayList<>();
        intList.add(new Position(1,2));
        System.out.println(intList.contains(new Position(1,2)));
    }
}
