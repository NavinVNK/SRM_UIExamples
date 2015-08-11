package in.ac.srmuniv.AndroidViews;

import in.ac.srmuniv.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.TimePicker;
import android.widget.Toast;
 
  public  class DateTimePickerExample extends Activity 
{
    int hour, minute;
    static  final  int TIME_DIALOG_ID = 0;
 
    @Override  
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);        
        setContentView(R.layout.datetimepicker);
        showDialog(TIME_DIALOG_ID);
    }
 
    @Override    
    protected Dialog onCreateDialog(int id) 
    {
        switch (id) {
            case TIME_DIALOG_ID: 
                return new TimePickerDialog(
                    this, mTimeSetListener, hour, minute, false);
        }
        return null;    
    }
 
    private TimePickerDialog.OnTimeSetListener mTimeSetListener =
    new TimePickerDialog.OnTimeSetListener() 
    {        
          public  void onTimeSet(TimePicker view, int hourOfDay, int minuteOfHour) 
        {
            hour = hourOfDay;
            minute = minuteOfHour;  
            Toast.makeText(getBaseContext(), 
                "You have selected : " + hour + ":" + minute,
                Toast.LENGTH_SHORT).show();
        }
    };
}

