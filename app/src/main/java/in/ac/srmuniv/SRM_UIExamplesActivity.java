package in.ac.srmuniv;
import in.ac.srmuniv.AndroidViews.AutoCompleteExample;
import in.ac.srmuniv.AndroidViews.BasicViewsExample;
import in.ac.srmuniv.AndroidViews.DateTimePickerExample;
import in.ac.srmuniv.AndroidViews.DisplayViewsExample;
import in.ac.srmuniv.AndroidViews.ListViewExample;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.AutoCompleteTextView;

public class SRM_UIExamplesActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		startActivity(new Intent(this,DisplayViewsExample.class));

	}
}