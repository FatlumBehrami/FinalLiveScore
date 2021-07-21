package com.example.finallivescore.Football;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class FootballViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    List<League> Leagues = new ArrayList<>();

    public List<League> getLeagues() {
        return Leagues;
    }
}