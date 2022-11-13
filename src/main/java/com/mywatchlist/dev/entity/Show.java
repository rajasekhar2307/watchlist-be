package com.mywatchlist.dev.entity;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Show {
    @Id
    private String title;

    private String director;
    private String writer;

    @ElementCollection
    private List<String> showCast;

    @ElementCollection
    private List<String> genres;

    private String runtime;
    private String language;
    private String budget;
    private String boxOffice;
    private String music;
}
