package com.example.demo.problem.lv5;

import java.util.HashMap;
import java.util.Map;

public class rectangulesXY {


    public static void main(String[] args) {
        int[][] rectangles = new int[2][4];
        rectangles[0][0] = 0;
        rectangles[0][1] = 1;
        rectangles[0][2] = 4;
        rectangles[0][3] = 4;

        rectangles[1][0] = 3;
        rectangles[1][1] = 1;
        rectangles[1][2] = 5;
        rectangles[1][3] = 3;

        rectangulesXY r = new rectangulesXY();
        System.out.println(r.solution(rectangles));
    }



    public long solution(int[][] rectangles) {
        long answer = -1;

        // 1. 최대, 최소 xy 값
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX =0;
        int maxY =0;
        int[] max = new int[4];
        Map<Integer,Long> extent = new HashMap<>();
        long addExtent = 0l;

        // 2. 각 직사각형의 넓이
        for(int i = 0 ; i < rectangles.length ; i++) {
            Long value = Long.valueOf((rectangles[i][3] - rectangles[i][1]) * (rectangles[i][2] + rectangles[i][0]));
            extent.put(i,value);
            addExtent += value;



        }

        // 3. 겹치는 값 확인



        return answer;
    }
}
