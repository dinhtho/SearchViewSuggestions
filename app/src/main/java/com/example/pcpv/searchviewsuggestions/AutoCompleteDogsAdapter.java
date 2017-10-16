package com.example.pcpv.searchviewsuggestions;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by PCPV on 10/16/2017.
 */

class AutoCompleteDogsAdapter extends ArrayAdapter<String> {

    private final ArrayList<String> list;

    public ArrayList<String> getFilteredList() {
        return filteredList;
    }

    private ArrayList<String> filteredList = new ArrayList<>();

    public AutoCompleteDogsAdapter(Context context, ArrayList<String> list) {
        super(context, 0, list);
        this.list = list;
    }

    @Override
    public int getCount() {
        return filteredList.size();
    }

    @Override
    public Filter getFilter() {
        return new DogsFilter(this, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item from filtered list.
        String s = filteredList.get(position);

        // Inflate your custom row layout as usual.
        LayoutInflater inflater = LayoutInflater.from(getContext());
        convertView = inflater.inflate(R.layout.item_suggestions, parent, false);

        TextView tvName = (TextView) convertView.findViewById(R.id.tv_string);
        tvName.setText(s);

        return convertView;
    }
}
