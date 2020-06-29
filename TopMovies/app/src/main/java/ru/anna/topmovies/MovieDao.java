package ru.anna.topmovies;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface MovieDao {
    @Query("SELECT * FROM movie_table")
    List<MovieDb> getAll();


    @Insert
    void insertAll(List<MovieDb> movies);

}