package my.com.jeff.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewMsg; //TextView = class  //textViewMsg = instance
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //onCreate() = main() function
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setContentView = Display UI
        // R = resource
        // layout = folder

        //Link UI to program
        textViewMsg = findViewById(R.id.textViewMessage);


    }

    public void showMessage(View view){
        textViewMsg.setText("Hello , Tee Wei Kit");
    }

    public void clearMessage(View view){
        textViewMsg.setText("");
    }
}
