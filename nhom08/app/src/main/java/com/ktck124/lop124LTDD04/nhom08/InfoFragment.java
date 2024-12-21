package com.ktck124.lop124LTDD04.nhom08;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ktck124.lop124LTDD04.nhom08.API.APIService;
import com.ktck124.lop124LTDD04.nhom08.API.RetrofitClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class InfoFragment extends Fragment {
    private RecyclerView recyclerView;
    private FeatureAdapter bookAdapter;
    private EditText msv, tensv, lop;
    private List<User> bookList1 = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.filteractivity, container, false);
        recyclerView = view.findViewById(R.id.rvFeatured);
        msv = view.findViewById(R.id.msv);
        tensv = view.findViewById(R.id.tensv);
        lop = view.findViewById(R.id.lop);
        // Khởi tạo danh sách sách
        loaduser();


        return view;
    }

    private void loaduser() {
        APIService apiService = RetrofitClient.getRetrofitInstance().create(APIService.class);
        Call<List<User>> call = apiService.getUserById();
        call.enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                if (response.isSuccessful()) {
                    bookList1 = response.body();
                    setUpRecyclerView(bookList1);
                } else {
                    Log.e("SearchFragment", "API error");
                }
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {
                Log.e("API_ERROR", "Error: " + t.getMessage());
            }
        });
    }


    private void setUpRecyclerView(List<User> books) {
        bookAdapter = new FeatureAdapter(books, getContext(), new FeatureAdapter.OnBookClickListener() {
            @Override
            public void onBookClick(User book) {
//                if (book.getIdUser() != null) {
//                    msv.setText(book.getIdUser()); // Nếu getIdUser trả về một chuỗi, không cần chuyển đổi
//                } else {
//                    msv.setText("Không có ID người dùng");
//                }
//
//                if (book.getName() != null) {
//                    tensv.setText(book.getName());
//                } else {
//                    tensv.setText("Không có tên");
//                }
//
//                if (book.getAddress() != null) {
//                    lop.setText(book.getAddress());
//                } else {
//                    lop.setText("Không có địa chỉ");
//                }

            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(bookAdapter);
    }

}





