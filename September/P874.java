package Leetcode.September;

import java.util.HashSet;
import java.util.Set;

public class P874 {

    public int robotSim(int[] commands, int[][] obstacles) {
        
        int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};

        int x = 0, y = 0;
        int maxDistance = 0;

        // forming string set for the obstacles as its easy to compare with
        Set<String> obstacleSet = new HashSet();
        for(int[] obstacle : obstacles){
            obstacleSet.add(obstacle[0] + "," + obstacle[1]);
        }

        int dir = 0;
        for(int command : commands){
            if(command == -1){
                dir = (dir+1)%4;
            }else if(command == -2){
                dir = (dir+3)%4;
            }else{
                // iterative loop for values 1<=k<=9 as while moving we might encounter obstacle
                for(int k=0; k<command; k++){
                    int nextX = x + directions[dir][0];
                    int nextY = y + directions[dir][1];

                    // check if next position is an encounter
                    if(!obstacleSet.contains(nextX + "," + nextY)){
                        x = nextX;
                        y = nextY;

                        maxDistance = Math.max(maxDistance, x*x + y*y);
                    }else{
                        //obstacle encountered
                        break;
                    }
                }
            }
        }
        return maxDistance;
    }
    
    public static void main(String[] args){

    }
}
