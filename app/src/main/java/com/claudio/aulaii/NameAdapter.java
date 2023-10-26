package com.claudio.aulaii;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NameAdapter extends RecyclerView.Adapter<NameAdapter.NameViewHolder> {

    private List<String> names;

    public NameAdapter(List<String> names) {
        this.names = names;
    }

    @NonNull
    @Override
    public NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_name, parent, false);
        return new NameViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull NameViewHolder nameViewHolder, int position) {
        String name = names.get(position);
        nameViewHolder.tvName.setText(name);
    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    class NameViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;

        NameViewHolder(View view) {
            super(view);
            tvName = view.findViewById(R.id.tvName);
        }
    }
}
