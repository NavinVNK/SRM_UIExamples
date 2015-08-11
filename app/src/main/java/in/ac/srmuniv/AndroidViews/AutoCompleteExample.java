package in.ac.srmuniv.AndroidViews;

import in.ac.srmuniv.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
 
  public  class AutoCompleteExample extends Activity
{
    String[] IndiancricketTeam = 
    {
            "Sachin Tendulkar",
            "Virender Sehwag",
            "Rahul Dravid",
            "VVS Laxman",
            "Virat Kohli",
            "Mahender singh Dhoni",
            "Ashwin",
            "Zaheer Khan",
            "Umesh Yadhav",
            "Ishant Sharma",
            "Rahul sharma"
    };
 
    @Override
      public  void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.autocomplete);
 
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
            android.R.layout.simple_dropdown_item_1line, IndiancricketTeam);
 
        AutoCompleteTextView textView = (AutoCompleteTextView)
                findViewById(R.id.players);
        textView.setThreshold(3);
        textView.setAdapter(adapter);         
    }
}
