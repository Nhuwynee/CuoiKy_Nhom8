package com.ktck124.lop124LTDD04.nhom08.API;



import com.ktck124.lop124LTDD04.nhom08.User;



import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
// Fetch books

public interface APIService {





    @GET("getuserapi.php")
    Call<List<User>> getUserById();




}


