package ru.netology.billboard;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Movies {
    private int idFilms;
    private String name;
    private String genreOfTheFilm;
}
