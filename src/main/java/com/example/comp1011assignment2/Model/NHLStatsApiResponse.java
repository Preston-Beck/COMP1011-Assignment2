package com.example.comp1011assignment2.Model;

public class NHLStatsApiResponse {
    private Team[] teams;
    private String copyright;

    public Team[] getTeams() {
        return teams;
    }

    public void setTeams(Team[] teams) {
        this.teams = teams;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }
}
