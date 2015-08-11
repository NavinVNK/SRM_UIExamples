package in.ac.srmuniv.AndroidViews;



import in.ac.srmuniv.R;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.app.ListActivity; 
 
  public  class ListViewExample extends ListActivity 
{
    String[] bond_films = {
                                  "Dr.No",
                                  "Man with Golden gun",
                                  "You only Live twice",
                                  "Live and Let die",
                                  "Thunderball",
                                  "License to Kill",
                                  "From Russia with Love",
                                  "Moonraker",
                                  "Octopussy",
                                  "A View to Kill",
                                  "On Her Majesty Service",
                                  "Golden Eye"
       
    }; 
    @Override  
      public  void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.listview);
        ListView lstView = getListView();
      //lstView.setChoiceMode(ListView.CHOICE_MODE_NONE);
      //lstView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
      lstView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
      lstView.setTextFilterEnabled(true);
 
        setListAdapter(new ArrayAdapter<String>(this,
        		android.R.layout.simple_list_item_multiple_choice, bond_films));
    }    
 
      public  void onListItemClick(
    ListView parent, View v,
    int position, long id) 
    {   
        Toast.makeText(this, 
            "You have selected " + bond_films [position], 
            Toast.LENGTH_SHORT).show();
    }  
}
