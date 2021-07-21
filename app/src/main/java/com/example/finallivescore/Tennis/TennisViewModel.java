package com.example.finallivescore.Tennis;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class TennisViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    List<League> Leagues = new ArrayList<>();

    public void setLeagues(List<League> leagues) {
        Leagues = leagues;
    }

    public List<League> getLeagues() {
        return Leagues;
    }
}