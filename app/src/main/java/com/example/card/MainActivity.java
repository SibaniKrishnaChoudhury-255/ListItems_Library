package com.example.card;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ListItems.item;
import com.example.ListItems.ItemList;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    String text1,text2,text3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1="Photography is the art, application and practice of creating durable images by recording " +
                "light or other electromagnetic radiation, either electronically by means of an image sensor, or " +
                "chemically by means of a light-sensitive material such as photographic film.";
        text2="2 days ago - Greece now allowing visitors from all nations (with a catch) after clarifying coronavirus tourism policy. ... " +
                "Greece is taking steps to welcome more visitors in time for the summer vacation season. " +
                "Starting June 15, international flights also can land in Thessaloniki, the country's second-largest city.";
        text3="Give your unch a makeover with these healthy unch ideas, including nutritious soups, ... " +
                "Either way, you'll start looking forward to getting to eat these healthy and easy unch";

        ItemList ItemList =findViewById(R.id.library);
        item item1 =new item();
        item item2 =new item();
        item item3 =new item();
        item item4 =new item();
        item item5 =new item();

        item1.setHeaderTitle("Clement horpos")
              .setHeaderImage(R.drawable.little)
              .setMiddleImage(R.drawable.fun);

        item2.setHeaderTitle("vivan krishna das")
                .setHeaderDescription("i am a great coder")
                .setHeaderImage(R.drawable.profile)
                .setMiddleImage(R.drawable.code)
                .setFirstFootertext("Like");

        item3 .setHeaderTitle("sarui kareoi")
                .setHeaderDescription("i am a fantastic photGrapher")
                .setHeaderImage(R.drawable.photography)
                .setFooterDescription(text1)
                .setMiddleImage(R.drawable.photography)
                .setFirstFootertext("Comment")
                .setSecondFootertext("share");

        item4 .setHeaderTitle("harihar yolo")
                .setHeaderDescription("All about today Lunch")
                .setHeaderImage(R.drawable.profile)
                .setFooterDescription(text3)
                .setMiddleImage(R.drawable.unch)
                .setSecondFootertext("like");


        item5 .setHeaderTitle("Chikro kaet")
                .setHeaderDescription("Travel vlogs at Greece")
                .setHeaderImage(R.drawable.photography)
                .setFooterDescription(text2)
                .setMiddleImage(R.drawable.travel)
                .setFirstFootertext("Comment")
                .setSecondFootertext("share");

        ItemList.add(item5);
        ItemList.add(item1);
        ItemList.add(item2);
        ItemList.add(item3);
        ItemList.add(item4);

        ItemList.build();

  }
}
