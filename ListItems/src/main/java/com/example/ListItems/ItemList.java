package com.example.ListItems;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;



public class ItemList extends LinearLayout {
    List<item> itemList;
    itemAdapter itemAdapter;
    RecyclerView recyclerView;
    Context context;

    public ItemList(@NonNull Context context) {
        super(context);
        init(context);
    }

    public ItemList(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public ItemList(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        this.context=context;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);

        inflater.inflate(R.layout.itemlist, this, true);

        itemList =new ArrayList<>();
        recyclerView=findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(context);
        recyclerView.setLayoutManager(linearLayoutManager);

    }

    public void  add(item cardModelvar){
        itemList.add(cardModelvar);
    }

    public void build(){
        itemAdapter =new itemAdapter(itemList,context);
        recyclerView.setAdapter(itemAdapter);

    }
}
