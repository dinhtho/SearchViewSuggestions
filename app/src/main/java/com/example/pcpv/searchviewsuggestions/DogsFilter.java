package com.example.pcpv.searchviewsuggestions;

import android.widget.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PCPV on 10/16/2017.
 */

class DogsFilter extends Filter {

    AutoCompleteDogsAdapter adapter;
    ArrayList<String> originalList;
    ArrayList<String> filteredList;

    public DogsFilter(AutoCompleteDogsAdapter adapter,  ArrayList<String> originalList) {
        super();
        this.adapter = adapter;
        this.originalList = originalList;
        this.filteredList = new ArrayList<>();
    }

    @Override
    protected FilterResults performFiltering(CharSequence constraint) {
        filteredList.clear();
        final FilterResults results = new FilterResults();

        if (constraint == null || constraint.length() == 0) {
            filteredList.addAll(originalList);
        } else {
            final String filterPattern = constraint.toString().toLowerCase().trim();

            // Your filtering logic goes in here
            for (final String s : originalList) {
                if (s.toLowerCase().contains(filterPattern)) {
                    filteredList.add(s);
                }
            }
        }
        results.values = filteredList;
        results.count = filteredList.size();
        return results;
    }

    @Override
    protected void publishResults(CharSequence constraint, FilterResults results) {
        adapter.getFilteredList().clear();
        adapter.getFilteredList().addAll((List) results.values);
        adapter.notifyDataSetChanged();
    }
}
