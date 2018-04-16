package alumno.ipn.cecyt9.examen_primer_parcial_yazmn_altamirano;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void calculadora(View V){

        Intent i = new Intent(this,calculadora.class);
        startActivity(i);
    }

    public void intenciones(View v){
        Intent W = new Intent(this,intenciones.class);
        startActivity(W);
    }
    public void reserva(View v ){
        Intent P = new Intent(this,Main2Activity.class);
        startActivity(P);
    }

    public void animal(View v ){
        Intent P = new Intent(this,animal.class);
        startActivity(P);
    }

}



