package com.tello.prepare;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SearchEnemy {
    /*
     * like map
     * [[0,0,0,0,0,1,0,0,0,0,0],
     * [0,0,0,0,0,1,0,0,0,0,0],
     * [0,0,0,0,0,0,0,0,0,0,0],
     * [0,0,0,0,0,1,0,0,0,0,0],
     * [0,0,0,0,0,1,0,0,0,0,0],
     * [0,0,0,0,0,0,0,0,0,0,0],
     * [0,0,0,0,0,1,0,0,0,0,0],
     * [0,0,0,0,0,1,0,0,0,0,0]]
     *
     * location (1,0)
     * enemys (5,3),(4,2)
     */
    public Position searchNearestEnemy(int[][] map, Position nowLocation, List<Position> enemys, int range){
        int xLength = map[0].length;
        int yLength = map.length;
        System.out.println("xLength:"+xLength);
        System.out.println("yLength:"+yLength);
        List<Position> visited = new ArrayList<>();
        Queue<Position> queue = new LinkedList<>();
        queue.add(nowLocation);
        int nowRange = 0;
        while (nowRange<=range&&!queue.isEmpty()){
            int size = queue.size();
            for (int i=0;i<size;i++){
                Position position = queue.poll();
                if(map[position.getY()][position.getX()]==1||visited.contains(position)){
                    continue;
                }
                System.out.println("nowRange: "+nowRange+"===="+position);
                if(enemys.contains(position)){
                    return position;
                }
                visited.add(position);
                List<Position> positionList = getNearPosition(xLength,yLength,position);
                for(Position pos:positionList){
                    queue.offer(pos);
                }
            }
            nowRange++;
        }
        return null;
    }

//    public List<Position> getNearPosition(int xLength,int yLength,Position location){
//        List<Position> positions = new ArrayList<>();
//        int x = location.getX();
//        int y = location.getY();
//        if(location.getX()>0){
//            positions.add(new Position(location.getX()-1, location.getY()));
//        }
//        if(location.getX()<xLength-1){
//            positions.add(new Position(location.getX()+1, location.getY()));
//        }
//        if(location.getY()>0){
//            positions.add(new Position(location.getX(), location.getY()-1));
//        }
//        if(location.getY()<yLength-1){
//            positions.add(new Position(location.getX(), location.getY()+1));
//        }
//        return positions;
//    }

//    允许对角一步
    public List<Position> getNearPosition(int xLength,int yLength,Position location){
        List<Position> positions = new ArrayList<>();
        int x = location.getX();
        int y = location.getY();
        boolean xLarger0 = location.getX()>0;
        boolean xSmallermax = location.getX()<xLength-1;
        boolean yLarger0 = location.getY()>0;
        boolean ySmallermax = location.getY()<yLength-1;

        if(xLarger0){
            Position left = new Position(location.getX()-1, location.getY());
            left.setDirect(0);
            left.setPrePosition(location);
            positions.add(left);
        }
        if(yLarger0){
            Position up = new Position(location.getX(), location.getY()-1);
            up.setDirect(2);
            up.setPrePosition(location);
            positions.add(up);
        }
        if(xSmallermax){
            Position right = new Position(location.getX()+1, location.getY());
            right.setDirect(4);
            right.setPrePosition(location);
            positions.add(right);
        }
        if(ySmallermax){
            Position down = new Position(location.getX(), location.getY()+1);
            down.setDirect(6);
            down.setPrePosition(location);
            positions.add(down);
        }
        if(xLarger0&&yLarger0){
            Position upLeft = new Position(location.getX()-1, location.getY()-1);
            upLeft.setDirect(1);
            upLeft.setPrePosition(location);
            positions.add(upLeft);
        }
        if(xSmallermax&&yLarger0){
            Position upRight = new Position(location.getX()+1, location.getY()-1);
            upRight.setDirect(3);
            upRight.setPrePosition(location);
            positions.add(upRight);
        }
        if(xSmallermax&&ySmallermax){
            Position downRight = new Position(location.getX()+1, location.getY()+1);
            downRight.setDirect(5);
            downRight.setPrePosition(location);
            positions.add(downRight);
        }
        if(xLarger0&&ySmallermax){
            Position downLeft = new Position(location.getX()-1, location.getY()+1);
            downLeft.setDirect(7);
            downLeft.setPrePosition(location);
            positions.add(downLeft);
        }
        return positions;
    }

    public static void main(String[] args) {
//        int[][] map = new int[100][11];
//        map[0]=new int[]{0,0,0,0,0,0,0,0,0,0,0};
//        for(int i=1;i<100;i++){
//            map[i]=new int[]{0,0,0,0,0,1,0,0,0,0,0};
//        }
        int[][] map =
      {{0,0,0,0,0,1,0,0,0,0,0},
      {0,0,0,0,0,1,0,0,0,0,0},
      {0,0,0,1,0,0,0,0,0,0,0},
      {0,1,0,0,0,1,0,0,0,0,0},
      {0,0,1,0,0,1,0,0,0,0,0},
      {0,0,0,0,0,0,0,0,0,0,0},
      {0,0,0,0,0,1,0,0,0,0,0},
      {0,0,0,0,0,1,0,0,0,0,0}};
        Position nowPosition = new Position(0,2);
        List<Position> enemys = new ArrayList<>();
        enemys.add(new Position(10,7));
//        enemys.add(new Position(3,2));
        SearchEnemy searchEnemy = new SearchEnemy();
        Position position = searchEnemy.searchNearestEnemy(map,nowPosition,enemys,10);
        while (position!=null){
            System.out.println(position.toString()+position.getDirect());
            position = position.getPrePosition();
        }
    }
}
