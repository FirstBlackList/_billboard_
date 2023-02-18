package ru.netology.billboard;

public class BillboardManager {

    private int countMovie = 10;
    private Movies[] movies = new Movies[0];

    public BillboardManager() {
    }

    public BillboardManager(int countMovie) {
        this.countMovie = countMovie;
    }

    public void addMovies(Movies movie) {

        Movies[] tmp = new Movies[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public Movies[] findLastFilms() {

        Movies[] result = new Movies[Math.min(countMovie, movies.length)];
        for (int i = 0; i < result.length; i++) {
            int value = movies.length - i - 1;
            result[i] = movies[value];
        }
        return result;
    }

    public Movies[] findAllMovies() {
        return movies;
    }
}
