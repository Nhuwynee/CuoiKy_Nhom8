package com.ktck124.lop124LTDD04.nhom08;


import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class FeatureAdapter extends RecyclerView.Adapter<FeatureAdapter.ViewHolder> {
    private List<User> items;
    private Context context;
    private OnBookClickListener listener;

    public FeatureAdapter(List<User> items, Context context,OnBookClickListener listener) {
        this.items = items;
        this.context = context;
        this.listener = listener;
    }


    public interface OnBookClickListener {
        void onBookClick(User user);
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_feature, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        User item = items.get(position);
        holder.sellerInfo.setText(item.getIdUser());
        holder.title.setText(item.getPhone());
        holder.address.setText(item.getAddress());
        String imageName = item.getAvatarImage();
        Log.d("ImageLoader", "Original Image Name: " + imageName); // Log tên gốc của ảnh

        if (imageName != null) {
            if (imageName.endsWith(".jpg")) {
                imageName = imageName.substring(0, imageName.length() - 4);
            } else if (imageName.endsWith(".png")) {
                imageName = imageName.substring(0, imageName.length() - 4);
            }

            Log.d("ImageLoader", "Processed Image Name: " + imageName); // Log tên ảnh sau khi xử lý

            int resId = context.getResources().getIdentifier(imageName, "drawable", context.getPackageName());
            Log.d("ImageLoader", "Resource ID: " + resId); // Log ID của tài nguyên ảnh

            if (resId != 0) {
                Glide.with(context)
                        .load(resId)
                        .error(R.drawable.hello) // Ảnh dự phòng nếu không tìm thấy
                        .into(holder.itemImage);
            } else {
                Log.e("ImageLoader", "Resource not found for: " + imageName);
                holder.itemImage.setImageResource(R.drawable.hello); // Ảnh dự phòng nếu không tìm thấy
            }
        } else {
            Log.e("ImageLoader", "Image name is null");
            holder.itemImage.setImageResource(R.drawable.hello); // Nếu `imgResource` null
        }

        // Set bookmark icon logic if needed (e.g., changing the image based on a condition)
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView sellerInfo, title, address;
        ImageView itemImage, bookmarkIcon;

        public ViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            sellerInfo = itemView.findViewById(R.id.seller_info);
            itemImage = itemView.findViewById(R.id.item_image);
            bookmarkIcon = itemView.findViewById(R.id.bookmark_icon);
        }
    }
}
