package com.ktck124.lop124LTDD04.nhom08.API;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static Retrofit retrofit;



     private static final String BASE_URL = "http://192.168.40.1:8080/READIFY/";



//    // NGUYỆT:
//     private static final String BASE_URL = "http://192.168.4.109:8080/READIFY/";
    // private static final String BASE_URL = "http://192.168.5.62:8080/READIFY/";
// Lưu Ngọc Yến Như

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
