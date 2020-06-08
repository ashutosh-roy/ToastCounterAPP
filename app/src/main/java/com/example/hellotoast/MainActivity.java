package com.example.hellotoast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private String toast_message="";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }
    public void showToast(View view) {
        toast_message = "Order = " + mCount;
        Toast toast = Toast.makeText(this,toast_message,
                Toast.LENGTH_LONG);
        toast.show();
    }
    public void countUp(View view)
    {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
    public void countDown(View view)
    {
        mCount--;
        if (mCount<0)
            mCount = 0;
        if(mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

    }
    public void clear(View view)
    {   /* Clears the screen in */
        mCount = 0;
        mShowCount.setText(Integer.toString(mCount));
    }
}
