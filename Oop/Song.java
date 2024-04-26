package Oop;

public class Song {
    private String name;
    private String author;
    private int number;

    public Song(String name, String author, int number) {
        this.name = name;
        this.author = author;
        this.number = number;
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (compared instanceof Song == false) {
            return false;
        }

        Song comparedSong = (Song) compared;

        if (
            this.name.equals(comparedSong.name) &&
            this.author.equals(comparedSong.author) &&
            this.number == comparedSong.number
        ) {
            return true;
        }

        return false;
    }
}
