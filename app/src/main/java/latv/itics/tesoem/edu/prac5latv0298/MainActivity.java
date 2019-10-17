package latv.itics.tesoem.edu.prac5latv0298;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Mensaje (View v) {
        Toast.makeText(this, "Bievenido a esta aplicacion", Toast.LENGTH_SHORT).show();


    }
}
