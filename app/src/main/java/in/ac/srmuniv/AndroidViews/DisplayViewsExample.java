package in.ac.srmuniv.AndroidViews;

import in.ac.srmuniv.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
 
  public  class DisplayViewsExample extends Activity
{    
    //---the images to display---
    Integer[] imageIDs = {
            R.drawable.srm1,
            R.drawable.srm2,
            R.drawable.srm3,
            R.drawable.srm4,
            R.drawable.srm5,
            R.drawable.srm6,
            R.drawable.srm7,
            R.drawable.srm8
    };
 
    @Override    
      public  void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.displayview);
 
        Gallery gallery = (Gallery) findViewById(R.id.gallery1);
 
        gallery.setAdapter(new ImageAdapter(this));        
        gallery.setOnItemClickListener(new OnItemClickListener() 
        {
              public  void onItemClick(AdapterView parent, 
            View v, int position, long id) 
            {                
            	//---display the images selected---
                  ImageView imageView = (ImageView) findViewById(R.id.img1);                
                  imageView.setImageResource(imageIDs[position]);


            }
        });
    }
 
      public  class ImageAdapter extends BaseAdapter 
    {
        private Context context;
        private int itemBackground;
 
          public  ImageAdapter(Context c) 
        {
            context = c;
            //---setting the style---
            TypedArray a = obtainStyledAttributes(R.styleable.Gallery1);
            itemBackground = a.getResourceId(
                R.styleable.Gallery1_android_galleryItemBackground, 0);
            a.recycle();                    
        }
 
        //---returns the number of images---
          public  int getCount() {
            return imageIDs.length;
        }
 
        //---returns the ID of an item--- 
          public  Object getItem(int position) {
            return position;
        }            
 
          public  long getItemId(int position) {
            return position;
        }
 
        //---returns an ImageView view---
          public  View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(imageIDs[position]);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setLayoutParams(new Gallery.LayoutParams(150, 120));
            imageView.setBackgroundResource(itemBackground);
            return imageView;
        }
    }    
}
