package ru.netology.billboard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BillboardManagerTest {

    BillboardManager movie = new BillboardManager();

    private Movies movie1 = new Movies(1, "The Green Mile", "драма");
    private Movies movie2 = new Movies(2, "Frozen", "мультфильм");
    private Movies movie3 = new Movies(3, "Forrest Gump", "драма");
    private Movies movie4 = new Movies(4, "The Dark Knight", "фантастика");
    private Movies movie5 = new Movies(5, "Shrek", "мультфильм");
    private Movies movie6 = new Movies(6, "The lion King", "мультфильм");
    private Movies movie7 = new Movies(7, "1 + 1", "драма, комедия, биография");
    private Movies movie8 = new Movies(8, "Pirates of the Caribbean", "фэнтези");
    private Movies movie9 = new Movies(9, "Knockin' on Heaven's Door", "драма");
    private Movies movie10 = new Movies(10, "Titanic", "мелодрама");
    private Movies movie11 = new Movies(11, "Sonic", "мультфильм");


    @Test
    public void shouldNullMovie() {

        Movies[] expected = {};
        Movies[] actual = movie.findAllMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddMovie() {

        movie.addMovies(movie1);

        Movies[] expected = {movie1};
        Movies[] actual = movie.findAllMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void theAddedNineFilmsShouldBeReturned() {

        movie.addMovies(movie1);
        movie.addMovies(movie2);
        movie.addMovies(movie3);
        movie.addMovies(movie4);
        movie.addMovies(movie5);
        movie.addMovies(movie6);
        movie.addMovies(movie7);
        movie.addMovies(movie8);
        movie.addMovies(movie9);

        Movies[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9};
        Movies[] actual = movie.findAllMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void allAddedMoviesShouldReturn() {

        movie.addMovies(movie1);
        movie.addMovies(movie2);
        movie.addMovies(movie3);
        movie.addMovies(movie4);
        movie.addMovies(movie5);
        movie.addMovies(movie6);
        movie.addMovies(movie7);
        movie.addMovies(movie8);
        movie.addMovies(movie9);
        movie.addMovies(movie10);

        Movies[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10};
        Movies[] actual = movie.findAllMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllLimitAddMovies() {

        movie.addMovies(movie1);
        movie.addMovies(movie2);
        movie.addMovies(movie3);
        movie.addMovies(movie4);
        movie.addMovies(movie5);
        movie.addMovies(movie6);
        movie.addMovies(movie7);
        movie.addMovies(movie8);
        movie.addMovies(movie9);
        movie.addMovies(movie10);
        movie.addMovies(movie11);

        Movies[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10, movie11};
        Movies[] actual = movie.findAllMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void theLastNineFilmsShouldGoBackInReverseOrder() {

        movie.addMovies(movie1);
        movie.addMovies(movie2);
        movie.addMovies(movie3);
        movie.addMovies(movie4);
        movie.addMovies(movie5);
        movie.addMovies(movie6);
        movie.addMovies(movie7);
        movie.addMovies(movie8);
        movie.addMovies(movie9);

        Movies[] expected = {movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        Movies[] actual = movie.findLastFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void theLastTenFilmsShouldGoBackInReverseOrder() {

        movie.addMovies(movie1);
        movie.addMovies(movie2);
        movie.addMovies(movie3);
        movie.addMovies(movie4);
        movie.addMovies(movie5);
        movie.addMovies(movie6);
        movie.addMovies(movie7);
        movie.addMovies(movie8);
        movie.addMovies(movie9);
        movie.addMovies(movie10);

        Movies[] expected = {movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        Movies[] actual = movie.findLastFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastTenLimitOne() {

        BillboardManager movie = new BillboardManager(1);

        movie.addMovies(movie1);
        movie.addMovies(movie2);


        Movies[] expected = {movie2};
        Movies[] actual = movie.findLastFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastTenLimitFour() {

        BillboardManager movie = new BillboardManager(4);

        movie.addMovies(movie1);
        movie.addMovies(movie2);
        movie.addMovies(movie3);
        movie.addMovies(movie4);
        movie.addMovies(movie5);
        movie.addMovies(movie6);
        movie.addMovies(movie7);
        movie.addMovies(movie8);
        movie.addMovies(movie9);
        movie.addMovies(movie10);

        Movies[] expected = {movie10, movie9, movie8, movie7};
        Movies[] actual = movie.findLastFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLengthArray() {

        BillboardManager movie = new BillboardManager(15);

        movie.addMovies(movie1);
        movie.addMovies(movie2);
        movie.addMovies(movie3);

        Movies[] expected = {movie3, movie2, movie1};
        Movies[] actual = movie.findLastFilms();

        Assertions.assertArrayEquals(expected, actual);
    }
}
