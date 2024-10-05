package com.example.demo.problem.lv5;

import java.util.*;
import java.util.stream.Collectors;

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
        long answer = 0;

        Map<Integer,List<Integer>> box = new HashMap<>();
        // 2. 각 직사각형의 넓이
        for(int i = 0 ; i < rectangles.length ; i++) {

            for(int j = rectangles[i][2] ; j > rectangles[i][0] ; j--) {
                List<Integer> yValue = List.of(rectangles[i][1],rectangles[i][3]);

                System.out.println("x축 값 : " + j + " // 해당 축의 y값" +yValue);
                if (box.get(j) == null || box.get(j).size() == 0) {
                    box.put(j, yValue);
                    answer += yValue.get(1)-yValue.get(0);
                    System.out.println("x축 값 : " + j + " // 결과가 추가" +answer);
                } else{
                    List<Integer> pastValue = box.get(j);
                    if(pastValue.get(0)<yValue.get(0)){
                        // 기존보다 왼쪽에 값이 생성
                    } else if()


                    answer++;
                    System.out.println("x축 값 : " + j + " // 낱개 결과가 추가" +answer);
                }
            }

        }

        // 3. 겹치는 값 확인


        return answer;
    }
}

/*

       Set<String> checkk = new HashSet<>();
   for(int j = rectangles[i][2] ; j > rectangles[i][0] ; j--) {
                for(int k = rectangles[i][3] ; k > rectangles[i][1] ; k--) {
                    if(checkk.add(j+","+k)){
                        answer ++;
                    }
                }

            }

 */