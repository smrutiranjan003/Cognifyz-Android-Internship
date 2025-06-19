package com.example.displaydata;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    private final List<DataModel> dataList;

    public DataAdapter(List<DataModel> dataList) {
        this.dataList = dataList;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView titleView;

        public ViewHolder(View itemView) {
            super(itemView);
            titleView = itemView.findViewById(R.id.itemText);
        }
    }

    @NonNull
    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.titleView.setText(dataList.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
