package org.example.models;

import org.springframework.stereotype.Component;

public class Music {

    private String songName;

    private int topPlace;

    public Music(String songName, int topPlace) {
        this.songName = songName;
        this.topPlace = topPlace;
    }

    public Music() {
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public int getTopPlace() {
        return topPlace;
    }

    public void setTopPlace(int topPlace) {
        this.topPlace = topPlace;
    }

    public String getInfo(){
        return this.topPlace + " - " + this.songName;
    }
}
