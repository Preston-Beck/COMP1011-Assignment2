package com.example.comp1011assignment2.Model;

public class Team {
        private int id;
        private String name;
        private String link;
        private Venue venue;
        private String abbreviation;
        private String teamName;
        private String locationName;
        private int firstYearOfPlay;
        private Division division;
        private Conference conference;
        private Franchise franchise;
        private String shortName;
        private String officialSiteUrl;
        private int franchiseId;
        private boolean active;

        /**
         * Constructor to make a Team object. Includes 14 parameters
         * @param name
         * @param link
         * @param venue
         * @param abbreviation
         * @param teamName
         * @param locationName
         * @param firstYearOfPlay
         * @param division
         * @param conference
         * @param franchise
         * @param shortName
         * @param officialSiteUrl
         * @param franchiseId
         * @param active
         */
        public Team(String name, String link, Venue venue,
                    String abbreviation, String teamName,
                    String locationName, int firstYearOfPlay,
                    Division division, Conference conference,
                    Franchise franchise, String shortName,
                    String officialSiteUrl, int franchiseId,
                    boolean active) {
                setName(name);
                setLink(link);
                setVenue(venue);
                setAbbreviation(abbreviation);
                setTeamName(teamName);
                setLocationName(locationName);
                setFirstYearOfPlay(firstYearOfPlay);
                setDivision(division);
                setConference(conference);
                setFranchise(franchise);
                setShortName(shortName);
                setOfficialSiteUrl(officialSiteUrl);
                setFranchiseId(franchiseId);
                setActive(active);
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                if(id < 0)
                        throw new IllegalArgumentException("ID cannot be negative.");
                else
                        this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                if(name.length() > 1)
                        this.name = name;
                else
                        throw new IllegalArgumentException("Name must be greater than 1 character in length.");
        }

        public String getLink() {
                return link;
        }

        public void setLink(String link) {
                if(link.contains("https"))
                        this.link = link;
                else
                        throw new IllegalArgumentException("Links must be secure.");
        }

        public Venue getVenue() {
                return venue;
        }

        public void setVenue(Venue venue) {
                if(venue.getName().length() > 1 && venue.getCity().length() > 1)
                        this.venue = venue;
                else
                        throw new IllegalArgumentException("Venue name and city must be greater than 1 character in length.");
        }

        public String getAbbreviation() {
                return abbreviation;
        }

        public void setAbbreviation(String abbreviation) {
                this.abbreviation = abbreviation;
        }

        public String getTeamName() {
                return teamName;
        }

        public void setTeamName(String teamName) {

                this.teamName = teamName;
        }

        public String getLocationName() {
                return locationName;
        }

        public void setLocationName(String locationName) {
                this.locationName = locationName;
        }

        public int getFirstYearOfPlay() {
                return firstYearOfPlay;
        }

        public void setFirstYearOfPlay(int firstYearOfPlay) {
                this.firstYearOfPlay = firstYearOfPlay;
        }

        public Division getDivision() {
                return division;
        }

        public void setDivision(Division division) {
                this.division = division;
        }

        public Conference getConference() {
                return conference;
        }

        public void setConference(Conference conference) {
                this.conference = conference;
        }

        public Franchise getFranchise() {
                return franchise;
        }

        public void setFranchise(Franchise franchise) {
                this.franchise = franchise;
        }

        public String getShortName() {
                return shortName;
        }

        public void setShortName(String shortName) {
                this.shortName = shortName;
        }

        public String getOfficialSiteUrl() {
                return officialSiteUrl;
        }

        public void setOfficialSiteUrl(String officialSiteUrl) {
                this.officialSiteUrl = officialSiteUrl;
        }

        public int getFranchiseId() {
                return franchiseId;
        }

        public void setFranchiseId(int franchiseId) {
                this.franchiseId = franchiseId;
        }

        public boolean isActive() {
                return active;
        }

        public void setActive(boolean active) {
                this.active = active;
        }

        /**
         * toString method used to output the Team object in a readable fashion
         * @return
         */
        public String toString(){
                return String.format("The %s, who play at the %s", name, venue);
        }
}