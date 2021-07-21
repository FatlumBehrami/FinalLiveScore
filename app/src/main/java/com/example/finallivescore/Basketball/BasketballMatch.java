package com.example.finallivescore.Basketball;

public class BasketballMatch {
    Team[] Teams = new Team[2];
    String Time = "";

    public void setTeams(Team[] teams) {
        Teams = teams;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public Team[] getTeams() {
        return Teams;
    }
}
