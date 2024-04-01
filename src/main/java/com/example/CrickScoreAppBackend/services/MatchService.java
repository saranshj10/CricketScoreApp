package com.example.CrickScoreAppBackend.services;

import com.example.CrickScoreAppBackend.entities.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {
    //get All the matches
    List<Match> getAllMatches();
    //get Live Matches
    List<Match> getLiveMatches();
    //get Ipl Points table
    List<List<String>> getIPL2023PointTable();

}
