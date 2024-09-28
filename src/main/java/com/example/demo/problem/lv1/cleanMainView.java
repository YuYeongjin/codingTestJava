package com.example.demo.problem.lv1;

public class cleanMainView {

    public static void main(String[] args) {
        cleanMainView view = new cleanMainView();

        String[] wallpaper = new String[3];
        wallpaper[0] = ".#...";
        wallpaper[1] = "..#..";
        wallpaper[2] = "...#.";
        System.out.println(view.solution(wallpaper));
    }
    public int[] solution(String[] wallpaper) {
        int[] answer =  new int[4];
        answer[0] = 51;
        answer[1] = 51;
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if(wallpaper[i].charAt(j) == '#') {
                    checking(i,j,answer);
                }
            }
        }
        return answer;
    }

    public void checking(int i, int j, int[] test) {
        if(test[0]>i){
            test[0]=i;
        }
        if(test[1]>j){
            test[1]=j;
        }
        if(test[2]<i+1){
            test[2]=i+1;
        }
        if(test[3]<j+1){
            test[3]=j+1;
        }
    }
}
