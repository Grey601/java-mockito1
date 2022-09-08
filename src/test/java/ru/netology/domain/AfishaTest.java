package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaTest {

    Afisha repo = new Afisha();

    MoviesData movie1 = new MoviesData(1, "Бладшот", "боевик", false);
    MoviesData movie2 = new MoviesData(2, "Вперед", "мультфильм", false);
    MoviesData movie3 = new MoviesData(3, "Отель \"Белград\"", "комедия", false);
    MoviesData movie4 = new MoviesData(4, "Джентльмены", "боевик", false);
    MoviesData movie5 = new MoviesData(5, "Человек-невидимка", "ужасы", false);
    MoviesData movie6 = new MoviesData(6, "Тролли. Мировой тур", "мультфильм", true);
    MoviesData movie7 = new MoviesData(7, "Номер один", "комедия", true);
    MoviesData movie8 = new MoviesData(8, "Вышка", "триллер", false);
    MoviesData movie9 = new MoviesData(9, "Гостья из космоса", "мультфильм", false);
    MoviesData movie10 = new MoviesData(10, "Субурбикон", "детектив", false);
    MoviesData movie11 = new MoviesData(11, "Преступления будущего", "триллер", false);
    MoviesData movie12 = new MoviesData(12, "Место под соснами", "драма", false);
    MoviesData movie13 = new MoviesData(13, "Паразиты", "триллер", false);

    @Test
    public void shouldAddMovies() {
        Afisha repo = new Afisha();
        repo.addMovie(movie1);
        repo.addMovie(movie2);
        repo.addMovie(movie3);
        repo.addMovie(movie4);
        repo.addMovie(movie5);
        repo.addMovie(movie6);
        repo.addMovie(movie7);

        MoviesData[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7};
        MoviesData[] actual = repo.getMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldDelMoviesById() {
        Afisha repo = new Afisha();
        repo.addMovie(movie1);
        repo.addMovie(movie2);
        repo.addMovie(movie3);
        repo.addMovie(movie4);
        repo.addMovie(movie5);
        repo.addMovie(movie6);
        repo.addMovie(movie7);
        repo.delMovieById(movie6.getMovieId());

        MoviesData[] expected = {movie1, movie2, movie3, movie4, movie5, movie7};
        MoviesData[] actual = repo.getMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowMoviesList() {
        Afisha repo = new Afisha();
        repo.addMovie(movie1);
        repo.addMovie(movie2);
        repo.addMovie(movie3);
        repo.addMovie(movie4);
        repo.addMovie(movie5);
        repo.addMovie(movie6);
        repo.addMovie(movie7);
        repo.addMovie(movie8);
        repo.addMovie(movie9);
        repo.addMovie(movie10);
        repo.addMovie(movie11);
        repo.addMovie(movie12);
        repo.addMovie(movie13);

        MoviesData[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10, movie11, movie12, movie13};
        MoviesData[] actual = repo.getMovies();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldShowByDefaultLastAddedMovies() {
        Afisha repo = new Afisha();
        repo.addMovie(movie1);
        repo.addMovie(movie2);
        repo.addMovie(movie3);
        repo.addMovie(movie4);
        repo.addMovie(movie5);
        repo.addMovie(movie6);
        repo.addMovie(movie7);
        repo.addMovie(movie8);
        repo.addMovie(movie9);
        repo.addMovie(movie10);
        repo.addMovie(movie11);
        repo.addMovie(movie12);
        repo.addMovie(movie13);

        MoviesData[] expected = {movie13, movie12, movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4,};
        MoviesData[] actual = repo.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldShowCustomNumberOfLastAddedMovies() {
        Afisha repo = new Afisha(7);
        repo.addMovie(movie1);
        repo.addMovie(movie2);
        repo.addMovie(movie3);
        repo.addMovie(movie4);
        repo.addMovie(movie5);
        repo.addMovie(movie6);
        repo.addMovie(movie7);
        repo.addMovie(movie8);
        repo.addMovie(movie9);
        repo.addMovie(movie10);
        repo.addMovie(movie11);
        repo.addMovie(movie12);
        repo.addMovie(movie13);

        MoviesData[] expected = {movie13, movie12, movie11, movie10, movie9, movie8, movie7,};
        MoviesData[] actual = repo.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldShowCustomNumberOfLastAddedMovies2() {
        Afisha repo = new Afisha(12);
        repo.addMovie(movie1);
        repo.addMovie(movie2);
        repo.addMovie(movie3);
        repo.addMovie(movie4);
        repo.addMovie(movie5);
        repo.addMovie(movie6);
        repo.addMovie(movie7);
        repo.addMovie(movie8);
        repo.addMovie(movie9);
        repo.addMovie(movie10);
        repo.addMovie(movie11);
        repo.addMovie(movie12);
        repo.addMovie(movie13);

        MoviesData[] expected = {movie13, movie12, movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2};
        MoviesData[] actual = repo.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldShowCustomNumberOfLastAddedMovies3() {
        Afisha repo = new Afisha(12);
        repo.addMovie(movie1);
        repo.addMovie(movie2);
        repo.addMovie(movie3);
        repo.addMovie(movie4);
        repo.addMovie(movie5);
        repo.addMovie(movie6);

        MoviesData[] expected = {movie6, movie5, movie4, movie3, movie2, movie1};
        MoviesData[] actual = repo.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldNotAddMovies() {
        Afisha repo = new Afisha();

        MoviesData[] expected = {};
        MoviesData[] actual = repo.getMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotShowMovieList() {
        Afisha repo = new Afisha(12);

        MoviesData[] expected = {};
        MoviesData[] actual = repo.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldShowByDefaultLastAddedMovies2() {
        Afisha repo = new Afisha(0);
        repo.addMovie(movie1);
        repo.addMovie(movie2);
        repo.addMovie(movie3);
        repo.addMovie(movie4);
        repo.addMovie(movie5);
        repo.addMovie(movie6);
        repo.addMovie(movie7);
        repo.addMovie(movie8);
        repo.addMovie(movie9);
        repo.addMovie(movie10);
        repo.addMovie(movie11);
        repo.addMovie(movie12);
        repo.addMovie(movie13);

        MoviesData[] expected = {movie13, movie12, movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4,};
        MoviesData[] actual = repo.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

}
