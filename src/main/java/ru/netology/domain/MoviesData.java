package ru.netology.domain;

public class MoviesData {
    private int movieId;
    private String movieName;
    private String movieGenre;
    private boolean premiereTomorrow;

    public MoviesData(int movieId, String movieName, String movieGenre, boolean premiereTomorrow) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieGenre = movieGenre;
        this.premiereTomorrow = premiereTomorrow;
    }

    public MoviesData() {
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

   // public void setMovieName(String movieName) {
   //     this.movieName = movieName;
   // }

    public String getMovieGenre() {
        return movieGenre;
    }

   // public void setMovieGenre(String movieGenre) {
   //     this.movieGenre = movieGenre;
   // }

    public boolean getPremiereTomorrow() {
        return premiereTomorrow;
    }

  //  public void setPremiereTomorrow(boolean premiereTomorrow) {
  //      this.premiereTomorrow = premiereTomorrow;
  //  }

}