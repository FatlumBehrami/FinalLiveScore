package com.example.finallivescore.Tennis;

public class Player {
    String Name = "";

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }

    int Score = 0;
}
