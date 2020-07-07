package ru.anna.topmovies;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieApiInterface {

    @GET("movie/top_rated")
    Call<MovieResponse> getTopRatedMovies(@Query("api_key") String apiKey, @Query("language") String language);

    @GET("movie/popular")
    Call<MovieResponse> getPopularMovies (@Query("api_key")String apiKey, @Query("language") String language);
}
