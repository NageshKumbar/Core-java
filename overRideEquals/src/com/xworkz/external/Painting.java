package com.xworkz.external;

import java.util.Objects;

public class Painting {
    String artist;
    String style;
    int year;
    String medium;

    public void setPainting(String artist, String style, int year, String medium) {
        this.artist = artist;
        this.style = style;
        this.year = year;
        this.medium = medium;
    }

    @Override
    public String toString() {
        return "Artist = " + artist + ", Style = " + style + ", Year = " + year + ", Medium = " + medium;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Painting) {
            Painting painting = (Painting) obj;
            if (Objects.equals(this.artist, painting.artist) && Objects.equals(this.style, painting.style) && Objects.equals(this.year, painting.year) && Objects.equals(this.medium, painting.medium)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
