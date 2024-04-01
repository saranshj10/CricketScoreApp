package com.example.CrickScoreAppBackend.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "cricket_matches")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matchId;
    private String teamHeading;
    private String matchNumberAndVenue;
    private String battingTeamName;
    private String battingTeamScore;
    private String bowlingTeamName;
    private String bowlingTeamScore;
    private String liveText;
    private String matchLink;
    private String matchCompletedText;

    @Enumerated
    private MatchStatus matchStatus;

    public Match(int matchId, String teamHeading, String matchNumberAndVenue, String battingTeamName, String battingTeamScore, String bowlingTeamName, String bowlingTeamScore, String liveText, String matchLink, String matchCompletedText, MatchStatus matchStatus) {
        this.matchId = matchId;
        this.teamHeading = teamHeading;
        this.matchNumberAndVenue = matchNumberAndVenue;
        this.battingTeamName = battingTeamName;
        this.battingTeamScore = battingTeamScore;
        this.bowlingTeamName = bowlingTeamName;
        this.bowlingTeamScore = bowlingTeamScore;
        this.liveText = liveText;
        this.matchLink = matchLink;
        this.matchCompletedText = matchCompletedText;
        this.matchStatus = matchStatus;
    }
    public Match(){}

    /** Getters */
    public int getMatchId() {
        return matchId;
    }

    public String getTeamHeading() {
        return teamHeading;
    }

    public String getMatchNumberAndVenue() {
        return matchNumberAndVenue;
    }

    public String getBattingTeamName() {
        return battingTeamName;
    }

    public String getBattingTeamScore() {
        return battingTeamScore;
    }

    public String getBowlingTeamName() {
        return bowlingTeamName;
    }

    public String getBowlingTeamScore() {
        return bowlingTeamScore;
    }

    public String getLiveText() {
        return liveText;
    }

    public String getMatchLink() {
        return matchLink;
    }

    public String getMatchCompletedText() {
        return matchCompletedText;
    }

    public MatchStatus getMatchStatus() {
        return matchStatus;
    }

    /** Setters */
    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public void setTeamHeading(String teamHeading) {
        this.teamHeading = teamHeading;
    }

    public void setMatchNumberAndVenue(String matchNumberAndVenue) {
        this.matchNumberAndVenue = matchNumberAndVenue;
    }

    public void setBattingTeamName(String battingTeamName) {
        this.battingTeamName = battingTeamName;
    }

    public void setBattingTeamScore(String battingTeamScore) {
        this.battingTeamScore = battingTeamScore;
    }

    public void setBowlingTeamName(String bowlingTeamName) {
        this.bowlingTeamName = bowlingTeamName;
    }

    public void setBowlingTeamScore(String bowlingTeamScore) {
        this.bowlingTeamScore = bowlingTeamScore;
    }

    public void setLiveText(String liveText) {
        this.liveText = liveText;
    }

    public void setMatchLink(String matchLink) {
        this.matchLink = matchLink;
    }

    public void setMatchCompletedText(String matchCompletedText) {
        this.matchCompletedText = matchCompletedText;
    }

    private Date date = new Date();

    public void setMatchStatus() {
        if(matchCompletedText.isBlank())
            this.matchStatus=MatchStatus.LIVE;
        else
            this.matchStatus=MatchStatus.COMPLETED;
    }
}
