package com.udacity.oasisaac.sunshine;

import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_main, container, false);
        List<String> list = new ArrayList<String>();
        list.add("Today");
        list.add("Tomorrow");
        list.add("Monday");
        list.add("Tuestday");
        list.add("Wendsday");
        list.add("Thursday");
        list.add("Friday");

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(getActivity(),R.layout.list_item_forecast,R.id.list_item_forecast_textview,list);

        ListView listView = (ListView) view.findViewById(R.id.listview_forecast);
        listView.setAdapter(adapter);


        return view;
    }
}
