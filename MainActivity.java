package cusrainfotech.com.loops;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    private static final Object TextView ="" ;
    private TextView textView2;
    private LinearLayout list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // textView2=findViewById(R.id.textView2);
        list=findViewById(R.id.list);

        int count=1;
        String hii="";

        while (count <=10 ){
            TextView textView=new TextView(this);
            hii=  "Hello android Developers "+count;
           textView.setText(hii);
           textView.setId(count-1);
           list.addView(textView,count-1);

            Log.i("tEST","Hello android Developers"+count);
            count=count+1;

        }

    }
}
