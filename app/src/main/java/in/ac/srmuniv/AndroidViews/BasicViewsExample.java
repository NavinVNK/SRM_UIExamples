package in.ac.srmuniv.AndroidViews;

import in.ac.srmuniv.R;
import android.app.Activity;
import android.os.Bundle;

import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import android.widget.EditText;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.SeekBar;
import android.text.TextWatcher;
import android.widget.RatingBar;
import android.widget.Toast;
import android.widget.ToggleButton;

public class BasicViewsExample extends Activity {

	@Override
    public  void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.basicviews);
      

      //---Button view---
      Button btnOpen = (Button) findViewById(R.id.btnOpen);
      btnOpen.setOnClickListener(new View.OnClickListener() {
            public  void onClick(View v) {
              Toast.makeText(getBaseContext(), 
                      "You have clicked the Open button", 
                      Toast.LENGTH_LONG).show();
          }
      });
    //---EditText view---
      EditText text=(EditText)findViewById(R.id.txtName);
      text.addTextChangedListener(new TextWatcher() {

          @Override
          public void afterTextChanged(Editable s) {
              // TODO Auto-generated method stub

          }

          @Override
          public void beforeTextChanged(CharSequence s, int start, int count, int after) {
              // TODO Auto-generated method stub

          }

          @Override
          public void onTextChanged(CharSequence s, int start, int before, int count) {

        	  DisplayToast("EditText text changed");
          } 
      });
      SeekBar sbar=(SeekBar)findViewById(R.id.seekBar1);
      sbar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
		
		@Override
		public void onStopTrackingTouch(SeekBar seekBar) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void onStartTrackingTouch(SeekBar seekBar) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void onProgressChanged(SeekBar seekBar, int progress,
				boolean fromUser) {
			DisplayToast("Progress bar value "+Integer.toString(progress));
			
		}
	});
   final RatingBar setRatingBar = (RatingBar) findViewById(R.id.setRating);
      setRatingBar.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
		
		@Override
		public void onRatingChanged(RatingBar ratingBar, float rating,
				boolean fromUser) {
			DisplayToast("New Rating: " + rating);
		
		}
	});
      
      //---CheckBox---
      CheckBox checkBox = (CheckBox) findViewById(R.id.chkAutosave);
      checkBox.setOnClickListener(new View.OnClickListener() 
      {
            public  void onClick(View v) {
              if (((CheckBox)v).isChecked()) 
                  DisplayToast("CheckBox is checked");
              else
                  DisplayToast("CheckBox is unchecked");            
          }
      });

      //---RadioButton---
      RadioGroup radioGroup = (RadioGroup) findViewById(R.id.rdbGp1);        
      radioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() 
      {
            public  void onCheckedChanged(RadioGroup group, int checkedId) {
              //---displays the ID of the RadioButton that is checked---
              DisplayToast(Integer.toString(checkedId));
          }
      });

      //---ToggleButton---
      ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggle1);
      toggleButton.setOnClickListener(new View.OnClickListener() 
      {
            public  void onClick(View v) {
             if (((ToggleButton)v).isChecked())
                  DisplayToast("Toggle button is On");
             else
                 DisplayToast("Toggle button is Off");
          }
      });
  }

  private void DisplayToast(String msg)
  {
       Toast.makeText(getBaseContext(), msg, 
               Toast.LENGTH_SHORT).show();        
  }    


}
