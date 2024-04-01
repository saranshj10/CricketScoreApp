package com.example.CrickScoreAppBackend.controllers;

import com.example.CrickScoreAppBackend.entities.Match;
import com.example.CrickScoreAppBackend.services.MatchService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

@RestController
@RequestMapping("/match")
public class MatchControllers {

    private MatchService matchService;

    public MatchControllers(MatchService matchService) {
        this.matchService = matchService;
    }


    //getLiveMatches
    @GetMapping("/live")
    public ResponseEntity<List<Match>> getAllMatches(){
        return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);
    }

    @GetMapping("/pointsTable")
    public ResponseEntity<?> getPointsTable(){
        return new ResponseEntity<>(this.matchService.getIPL2023PointTable(), HttpStatus.OK);
    }

}
