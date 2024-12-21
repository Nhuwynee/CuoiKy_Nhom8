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


    @POST("userapi.php")
    Call<List<User>> getUser(@Query("id") int IdUser);

    @GET("getuserapi.php")
    Call<List<User>> getUserById();

    // đăng ký
    @POST("insertuserapi.php") // đăng ký
    Call<Void> registerUser(@Body User user);
    @POST("updateuserapi.php")
    Call<Void> updateUser(@Body User user);

    @DELETE("deletecartapi.php")
    Call<Void> deleteBookFromCart(@Query("idBook") int bookId, @Query("idUser") int userId);


}


