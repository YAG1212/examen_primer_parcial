package alumno.ipn.cecyt9.examen_primer_parcial_yazmn_altamirano;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nom, pas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nom= (EditText)findViewById(R.id.user);
        pas= (EditText)findViewById(R.id.pass);
    }

    public void validacion(View v){
        String name = nom.getText().toString();
        String word = pas.getText().toString();

        if ((name.equals("Yazmin"))&& word.equals("12345")){

            Toast.makeText(this,"usuario correcto :v",Toast.LENGTH_LONG).show();
            Intent i = new Intent(this,menu.class);
            startActivity(i);


        }else{
            Toast.makeText(this,"usuario incorrecto",Toast.LENGTH_LONG ).show();
            Intent i = new Intent(this,Main3Activity.class);
            startActivity(i);
        }

    }
}