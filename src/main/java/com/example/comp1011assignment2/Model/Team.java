package com.example.comp1011assignment2.Model;

import com.example.comp1011assignment2.Model.Venue;

public class Team {
        private int id;
        private String name;
        private String link;
        private Venue venue;

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getLink() {
                return link;
        }

        public void setLink(String link) {
                this.link = link;
        }

        public Venue getVenue() {
                return venue;
        }

        public void setVenue(Venue venue) {
                this.venue = venue;
        }
}