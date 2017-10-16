# SearchView Suggestions Auto-CompleteText

## Simple Adapter
```

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, list);
        autocompleteView = (AutoCompleteTextView) findViewById(R.id.autocompleteView);
       autocompleteView.setAdapter(adapter);
```
![img] (https://github.com/dinhtho/SearchViewSuggestions/blob/master/image.png)