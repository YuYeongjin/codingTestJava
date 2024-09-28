package com.example.demo.problem.lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class runningRace {

    public static void main(String[] args) {
        runningRace runningRace = new runningRace();

        String[] players = new String[2];
        String[] callings = new String[10];

        System.out.println(runningRace.solution(players, callings));
    }

    public String[] solution(String[] players, String[] callings) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        for(int i = 0; i < players.length; i++){
            map.put(players[i], i);
        }

        for (String who : callings){
            map.put(who,map.get(who)-1);
        }
        Arrays.stream(players).sorted();
        for(int i = 0 ; i < players.length; i++){
            System.out.print(players[i]+"/");
        }
        return players;
    }
/*
    public String[] solution(String[] players, String[] callings) {

        for (String who : callings){
            here: for (int i = players.length-1; i>1; i--){
                if(players[i].equals(who)){
                    update(players,i);
                    break here;
                }
            }
        }
        for(int i = 0 ; i < players.length; i++){
            System.out.print(players[i]);
        }
        return players;
    }

    private void update(String[] players, int i) {
        String who = players[i];
        int index = i-1;
        players[i] = players[index];
        players[index] = who;
    }

 */
}
