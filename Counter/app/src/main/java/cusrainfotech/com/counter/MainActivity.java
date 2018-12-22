package cusrainfotech.com.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int Nos2000,Nos500,Nos200,Nos100,Nos50,Nos20,Nos10;
    EditText E2000,E500,E200,E100,E50,E20,E10;
    TextView T2000,T500,T200,T100,T50,T20,T10,Total;
    int Total2000,Total500,Total200,Total100,Total50,Total20,Total10;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       E10=(EditText)findViewById(R.id.editTextNos10);T10=(TextView)findViewById(R.id.AmtOf10);Total10= Integer.parseInt(T10.getText().toString());
       E20=(EditText)findViewById(R.id.editTextNos20);T20=(TextView)findViewById(R.id.AmtOf20);Total20= Integer.parseInt(T20.getText().toString());
       E50=(EditText)findViewById(R.id.editTextNos50);T50=(TextView)findViewById(R.id.AmtOf50);Total50= Integer.parseInt(E50.getText().toString());
       E100=(EditText)findViewById(R.id.editTextNos100);T100=(TextView)findViewById(R.id.AmtOf100);Total100= Integer.parseInt(E100.getText().toString());
       E200=(EditText)findViewById(R.id.editTextNos200);T200=(TextView)findViewById(R.id.AmtOf200);Total200= Integer.parseInt(E200.getText().toString());
       E500=(EditText)findViewById(R.id.editTextNos500);T500=(TextView)findViewById(R.id.AmtOf500);Total500= Integer.parseInt(E500.getText().toString());
       E2000=(EditText)findViewById(R.id.editTextNos2000);T2000=(TextView)findViewById(R.id.AmtOf2000);Total2000= Integer.parseInt(E2000.getText().toString());
       E2000=(EditText)findViewById(R.id.editTextNos2000);Total=(TextView)findViewById(R.id.TextTotal);imageView=findViewById(R.id.imageView0);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E10.setText("0");E20.setText("0");E50.setText("0");E100.setText("0");E200.setText("0");E500.setText("0");E2000.setText("0");
            }
        });
       E10.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try
                { if(E10 != null)
                    Nos10= Integer.parseInt(E10.getText().toString());
                        T10.setText(String.valueOf(Nos10*10));
                        CallculateTotal();
                }
                    catch (NumberFormatException e)
                { Nos10 = 0;
                    T10.setText(String.valueOf(Nos10));
                   CallculateTotal();
                    } }
            @Override
            public void afterTextChanged(Editable s) {
            }});

        E20.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try
                { if(E20 != null)
                    Nos20= Integer.parseInt(E20.getText().toString());
                    T20.setText(String.valueOf(Nos20*20));
                   CallculateTotal();
                }
                catch (NumberFormatException e)
                { Nos20 = 0;
                    T20.setText(String.valueOf(Nos20));
                   CallculateTotal(); } }
            @Override
            public void afterTextChanged(Editable s) { }});

        E50.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try
                { if(E50 != null)
                    Nos50= Integer.parseInt(E50.getText().toString());
                    T50.setText(String.valueOf(Nos50*50));
                   CallculateTotal();
                }
                catch (NumberFormatException e)
                { Nos50 = 0;
                    T50.setText(String.valueOf(Nos50));
                   CallculateTotal(); } }
            @Override
            public void afterTextChanged(Editable s) { }});

        E100.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try
                { if(E100 != null)
                    Nos100= Integer.parseInt(E100.getText().toString());
                    T100.setText(String.valueOf(Nos100*100));
                   CallculateTotal();
                }
                catch (NumberFormatException e)
                { Nos100 = 0;
                    T100.setText(String.valueOf(Nos100));
                   CallculateTotal(); } }
            @Override
            public void afterTextChanged(Editable s) { }});

        E500.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try
                { if(E500 != null)
                    Nos500= Integer.parseInt(E500.getText().toString());
                    T500.setText(String.valueOf(Nos500*500));
                   CallculateTotal();
                }
                catch (NumberFormatException e)
                { Nos500 = 0;
                    T500.setText(String.valueOf(Nos500));
                   CallculateTotal(); } }
            @Override
            public void afterTextChanged(Editable s) { }});

        E2000.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try
                { if(E2000 != null)
                    Nos2000= Integer.parseInt(E2000.getText().toString());
                    T2000.setText(String.valueOf(Nos2000*2000));
                   CallculateTotal();
                }
                catch (NumberFormatException e)
                { Nos2000 = 0;
                    T2000.setText(String.valueOf(Nos2000));
                   CallculateTotal(); } }
            @Override
            public void afterTextChanged(Editable s) { }});

        E200.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try
                { if(E200 != null)
                    Nos200= Integer.parseInt(E200.getText().toString());
                    T200.setText(String.valueOf(Nos200*200));
                   CallculateTotal();
                }
                catch (NumberFormatException e)
                { Nos200 = 0;
                    T200.setText(String.valueOf(Nos200));
                   CallculateTotal(); } }
            @Override
            public void afterTextChanged(Editable s) { }});

         }


    private void CallculateTotal() {
        Total10= Integer.parseInt(T10.getText().toString());Total20= Integer.parseInt(T20.getText().toString());Total50= Integer.parseInt(T50.getText().toString());
        Total100= Integer.parseInt(T100.getText().toString());Total500= Integer.parseInt(T500.getText().toString());Total2000= Integer.parseInt(T2000.getText().toString());
        Total200= Integer.parseInt(T200.getText().toString());
        int total= Total10+Total20+Total50+Total100+Total200+Total500+Total2000;
        Total.setText(String.valueOf(total));
    }




}
