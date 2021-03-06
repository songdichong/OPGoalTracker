/*
 * Copyright 2017 Yongjia Huang, Dichong Song, Mingwei Li, Donglin Han, Long Ma,CMPUT301F17T25 CMPUT301, University of Alberta, All Rights Reserved.
 * You may use distribut, or modify this code under terms and conditions of the ode of Student Behavior at University of Alberta
 * You may find a copy of the license in this project. Otherwise please contact jajayongjia@gmail.com
 */

package ca.ualberta.cs.opgoaltracker.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;

import ca.ualberta.cs.opgoaltracker.R;
import ca.ualberta.cs.opgoaltracker.exception.CommentTooLongException;
import ca.ualberta.cs.opgoaltracker.models.HabitEvent;

/**
 * Created by malon_000 on 2017-11-03.
 */

public class NewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        // to do: get all habitlist from user followed
        //get last/latest habit from habit list
        //sort in arrayList
        //

        ArrayList<HabitEvent> displayList = new ArrayList<HabitEvent>();
        try {
            displayList.add(new HabitEvent("test","this is first test",new Date()));
        } catch (CommentTooLongException e) {
            e.printStackTrace();
        }
        try {
            displayList.add(new HabitEvent("test","this is second test",new Date()));
        } catch (CommentTooLongException e) {
            e.printStackTrace();
        }
        try {
            displayList.add(new HabitEvent("test","this is third test",new Date()));
        } catch (CommentTooLongException e) {
            e.printStackTrace();
        }

        HabitEventAdapter adapter = new HabitEventAdapter(this,displayList);
        ListView listview=(ListView)findViewById(R.id.newsListAct);
        listview.setAdapter(adapter);


        listview.setAdapter(adapter);
    }


}
