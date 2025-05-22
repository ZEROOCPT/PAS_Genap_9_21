package com.example.pas_genap_9_21;
import retrofit2.Call;
import retrofit2.http.GET;
public interface SportsApi {
    @GET("/api/v1/json/3/search_all_teams.php?l=English%20Premier%20League")
    Call<TeamResponse> getTeamsByLeague();

    @GET("/api/v1/json/3/eventsnextleague.php?id=4328")
    Call<ScheduleResponse> getScheduleByLeague();

}
