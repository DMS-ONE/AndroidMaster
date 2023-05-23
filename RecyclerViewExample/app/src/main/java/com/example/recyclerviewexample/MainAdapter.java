package com.example.recyclerviewexample;


import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    private ArrayList<String> locallDataSet;

<<<<<<< Updated upstream
=======
    private List<ClipData.Item> itemList;

    public MainAdapter(List<ClipData.Item> itemList){
        this.itemList = itemList;
    }

    //뷰 홀더 클래스
   public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView textView;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            textView = itemView.findViewById(R.id.textView);

            itemView.setOnClickListener((View.OnClickListener) this);
        }
        public TextView getTextView(){
            return textView;
        }

        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();
            if(position != RecyclerView.NO_POSITION) {
                swapItems(position);
            }
        }

        private void swapItems(int position) {
            int newPosition = 1;

            Collections.swap(itemList, position, newPosition);
            notifyItemMoved(position, newPosition);
        }

    }
>>>>>>> Stashed changes

    //생성자
    public MainAdapter(ArrayList<String> dataSet) {
        locallDataSet = dataSet;

    }

    @NonNull
    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);
        MainAdapter.ViewHolder viewHolder = new MainAdapter.ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        String text = locallDataSet.get(position);
        holder.textView.setText(text);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SecoundActivity.class);
                intent.putExtra("item_number", position + 1);
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return locallDataSet.size();
    }

    //뷰 홀더 클래스
    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
        }
        public TextView getTextView() {
            return textView;
        }
    }
}
