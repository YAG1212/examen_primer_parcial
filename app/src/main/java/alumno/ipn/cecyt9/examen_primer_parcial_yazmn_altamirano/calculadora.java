package alumno.ipn.cecyt9.examen_primer_parcial_yazmn_altamirano;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class calculadora extends AppCompatActivity {

    private EditText op1,op2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        op1=(EditText)findViewById(R.id.num1);
        op2=(EditText)findViewById(R.id.num2);

    }

    public void suma(View v){

        double opc1=Integer.parseInt(op1.getText().toString());
        double opc2= Integer.parseInt(op2.getText().toString());

        double sum = opc1 + opc2 ;

        mostrar(sum);

    }

    public void resta(View v){

        double opc1=Integer.parseInt(op1.getText().toString());
        double opc2= Integer.parseInt(op2.getText().toString());

        double res = opc1 - opc2 ;

        mostrar(res);

    }

    public void multi(View v){

        double opc1=Integer.parseInt(op1.getText().toString());
        double opc2= Integer.parseInt(op2.getText().toString());

        double mul = opc1 * opc2 ;

        mostrar(mul);

    }

    public void divide(View v){

        double opc1=Integer.parseInt(op1.getText().toString());
        double opc2= Integer.parseInt(op2.getText().toString());

        double divi = opc1 / opc2 ;

        mostrar(divi);

    }

    public void raiz(View v){

        double opc1=Integer.parseInt(op1.getText().toString());
        double opc2= Integer.parseInt(op2.getText().toString());

        double raiz = Math.sqrt(opc1 + opc2);

        mostrar(raiz);

    }

    public void seno(View v){

        double opc1=Integer.parseInt(op1.getText().toString());
        double opc2= Integer.parseInt(op2.getText().toString());

        double seno = Math.sin(opc1*Math.PI/180+opc2*Math.PI/180);

        mostrar(seno);

    }

    public void coseno(View v){

        double opc1=Integer.parseInt(op1.getText().toString());
        double opc2= Integer.parseInt(op2.getText().toString());

        double coseno = Math.cos(opc1*Math.PI/180+opc2*Math.PI/180);

        mostrar(coseno);

    }

    public void tangente(View v){

        double opc1=Integer.parseInt(op1.getText().toString());
        double opc2= Integer.parseInt(op2.getText().toString());

        double tan = Math.tan(opc1*Math.PI/180+opc2*Math.PI/180);

        mostrar(tan);

    }


    private void mostrar(double result) {

        Toast.makeText(this,"El resultado es: " + result, Toast.LENGTH_LONG).show();
        ;

    }
}
