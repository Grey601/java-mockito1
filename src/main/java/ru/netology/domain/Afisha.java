package ru.netology.domain;

public class Afisha {
    private MoviesData[] movies = new MoviesData[0];
    private int defaultLengthOfMovieList = 10;

    public Afisha() {
    }

    public Afisha(int lengthOfMovieList) {
        if (lengthOfMovieList > 0) {
           defaultLengthOfMovieList = lengthOfMovieList;
        }
    }

    public void addMovie(MoviesData movie) {
        MoviesData[] tmp = new MoviesData[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public void delMovieById(int movieId) {
        MoviesData[] tmp = new MoviesData[movies.length - 1];
        int copyToIndex = 0;
        for (MoviesData movie : movies) {
            if (movie.getMovieId() != movieId) {
                tmp[copyToIndex] = movie;
                copyToIndex++;
            }
        }
        movies = tmp;
    }

    MoviesData[] getMovies() {
        return movies;
    }

    public MoviesData[] findLast() {
        int moviesListLength = movies.length;
        if (moviesListLength < defaultLengthOfMovieList) {
            defaultLengthOfMovieList = moviesListLength;
        }
        MoviesData[] all = getMovies();
        MoviesData[] reversed = new MoviesData[defaultLengthOfMovieList];
        for (int i=0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }

}
