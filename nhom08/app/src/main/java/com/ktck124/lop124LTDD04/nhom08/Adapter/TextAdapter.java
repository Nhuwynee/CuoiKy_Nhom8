package com.ktck124.lop124LTDD04.nhom08.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


import com.ktck124.lop124LTDD04.nhom08.R;

import java.util.List;

public class TextAdapter extends RecyclerView.Adapter<TextAdapter.TextViewHolder> {
    private List<String> textList;
    private List<String> categories;
    private OnItemClickListener onItemClickListener;

    public TextAdapter(List<String> textList) {
        this.textList = textList;
    }

    public interface OnItemClickListener {
        void onItemClick(String category);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.onItemClickListener = listener;
    }

    @Override
    public TextViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category, parent, false);
        return new TextViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TextViewHolder holder, int position) {
        String text = textList.get(position);
        holder.textViewItem.setText(text);
    }

    @Override
    public int getItemCount() {
        return textList.size();
    }

    public static class TextViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewItem;

        public TextViewHolder(View itemView) {
            super(itemView);
            textViewItem = itemView.findViewById(R.id.text_category);
        }
    }
}

