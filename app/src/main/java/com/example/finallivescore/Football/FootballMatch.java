package com.example.finallivescore.Football;

import java.util.Calendar;
import java.util.Date;

public class FootballMatch {
    Team[] Teams = new Team[2];
    Calendar MatchTime = null;

    public Team[] getTeams() {
        return Teams;
    }

    public void setTeams(Team[] teams) {
        Teams = teams;
    }

    public Calendar getMatchTime() {
        return MatchTime;
    }

    public void setMatchTime(Calendar matchTime) {
        MatchTime = matchTime;
    }
}
