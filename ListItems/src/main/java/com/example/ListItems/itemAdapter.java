package com.example.ListItems;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class itemAdapter extends RecyclerView.Adapter<itemAdapter.cardViewHolder>  {
    List<item> itemList;
    Context context;

    public itemAdapter(List<item> itemList, Context context) {
        this.itemList = itemList;
        this.context = context;
    }

    @NonNull
    @Override
    public cardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.library_item,parent,false);
        return new cardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull cardViewHolder holder, int position){
        if (itemList.get(position).getHeaderTitle()!=null){
            holder.headerTitle.setVisibility(View.VISIBLE);
            holder.headerTitle.setText(itemList.get(position).getHeaderTitle());
        }

        if (itemList.get(position).getHeaderDescription()!=null){
            holder.headerDescription.setVisibility(View.VISIBLE);
            holder.headerDescription.setText(itemList.get(position).getHeaderDescription());
        }
        if (itemList.get(position).getFooterDescription()!=null){
            holder.footerDescription.setVisibility(View.VISIBLE);
            holder.footerDescription.setText(itemList.get(position).getFooterDescription());
        }

        if (itemList.get(position).getFirstFootertext()!=null){
            holder.firstFootertext.setVisibility(View.VISIBLE);
            holder.firstFootertext.setText(itemList.get(position).getFirstFootertext());
        }
        if (itemList.get(position).getFooterDescription()!=null){
            holder.footerDescription.setVisibility(View.VISIBLE);
            holder.footerDescription.setText(itemList.get(position).getFooterDescription());
        }
        if (itemList.get(position).getSecondFootertext()!=null){
            holder.secondFootertext.setVisibility(View.VISIBLE);
            holder.secondFootertext.setText(itemList.get(position).getSecondFootertext());
        }
        if (itemList.get(position).getThirdFootertext()!=null){
            holder.thirdFootertext.setVisibility(View.VISIBLE);
            holder.thirdFootertext.setText(itemList.get(position).getThirdFootertext());
        }
        if (itemList.get(position).getHeaderImage()!=0){
            holder.headerImage.setVisibility(View.VISIBLE);
            Glide.with(context).load(itemList.get(position).getHeaderImage()).into(holder.headerImage);
        }
        if (itemList.get(position).getMiddleImage()!=0){
            holder.middleImage.setVisibility(View.VISIBLE);
            Glide.with(context).load(itemList.get(position).getMiddleImage()).into(holder.middleImage);
        }
        if (itemList.get(position).getFirstFooterImage()!=0){
            holder.firstFooterImage.setVisibility(View.VISIBLE);
            Glide.with(context).load(itemList.get(position).getFirstFooterImage()).into(holder.firstFooterImage);
        }
        if (itemList.get(position).getSecondFooterImage()!=0){
            holder.secondFooterImage.setVisibility(View.VISIBLE);
            Glide.with(context).load(itemList.get(position).getSecondFooterImage()).into(holder.secondFooterImage);
        }
        if (itemList.get(position).getThirdFooterImage()!=0){
            holder.thirdFooterImage.setVisibility(View.VISIBLE);
            Glide.with(context).load(itemList.get(position).getThirdFooterImage()).into(holder.thirdFooterImage);
        }
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class cardViewHolder extends RecyclerView.ViewHolder {
        TextView headerTitle,headerDescription,footerDescription,firstFootertext,secondFootertext,thirdFootertext;
        ImageView middleImage,firstFooterImage,secondFooterImage,thirdFooterImage;
        CircleImageView headerImage;
        LinearLayout firstFooterLayout,secondFooterLayout,thirdFooterLayout;

        public cardViewHolder(@NonNull View itemView) {
            super(itemView);
            headerTitle=itemView.findViewById(R.id.title);
            headerDescription=itemView.findViewById(R.id.profile_description);
            footerDescription=itemView.findViewById(R.id.footer_description);
            firstFootertext=itemView.findViewById(R.id.like_text);
            secondFootertext=itemView.findViewById(R.id.comment_text);
            thirdFootertext=itemView.findViewById(R.id.share_text);
            middleImage=itemView.findViewById(R.id.mid_image);
            firstFooterImage=itemView.findViewById(R.id.like_img);
            secondFooterImage=itemView.findViewById(R.id.commment_button);
            thirdFooterImage=itemView.findViewById(R.id.share_button);
            headerImage=itemView.findViewById(R.id.profile);
            firstFooterLayout=itemView.findViewById(R.id.like_layout);
            secondFooterLayout=itemView.findViewById(R.id.comment_layout);
            thirdFooterLayout=itemView.findViewById(R.id.share_layout);
        }
    }
}
