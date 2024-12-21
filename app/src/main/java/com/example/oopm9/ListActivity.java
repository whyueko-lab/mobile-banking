package com.example.oopm9;

import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private NameAdapter nameAdapter;

    private List<String> nameList;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        nameList = new ArrayList<>();
        nameList.add("Liverpool");
        nameList.add("Manchester City");
        nameList.add("Chelsea");
        nameList.add("Arsenal");

        nameAdapter = new NameAdapter(nameList);
        recyclerView.setAdapter(nameAdapter);
    }

    class NameAdapter extends RecyclerView.Adapter<NameAdapter.NameViewHolder> {

        private List<String> names;

        NameAdapter(List<String> names) {
            this.names = names;
        }
        public NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.list_item, parent, false);
            return new NameViewHolder(view);
        }
        public void onBindViewHolder(@NonNull NameViewHolder holder, int position) {

            holder.textView.setText(names.get(position));
        }
        public int getItemCount() {
            return (names !=null) ? names.size() : 0;
        }

        class NameViewHolder extends RecyclerView.ViewHolder {

            TextView textView;

            NameViewHolder(View itemView) {
                super(itemView);
                textView = itemView.findViewById(R.id.textView);
            }
        }
    }
}
