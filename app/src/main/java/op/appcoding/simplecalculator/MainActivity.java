package op.appcoding.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1, num2;
    private TextView Answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.number1);
        num2 = (EditText) findViewById(R.id.number2);

        Answer = (TextView) findViewById(R.id.ans);

    }

    /*Todo

  Create The Functions with Same Name Used In XML after onClick

 ACCESS SPECIFIER = public
 RETURN TYPE = void
 FUNCTION NAME = Same As In Object/ Component's onClick
 ARGUMENTS = 'View anyNamedView'

     */


    public void doAdd(View V) {
        long Num1 = Long.parseLong(num1.getText().toString());
        long Num2 = Long.parseLong(num2.getText().toString());

        long ans = Num1 + Num2;

        Answer.setText("Answer=\n" + ans);
    }

    public void doSub(View V) {

        long Num1 = Long.parseLong(num1.getText().toString());
        long Num2 = Long.parseLong(num2.getText().toString());

        long ans = Num1 - Num2;

        Answer.setText("Answer=\n" + ans);
    }

    public void doMult(View V) {


        long Num1 = Long.parseLong(num1.getText().toString());
        long Num2 = Long.parseLong(num2.getText().toString());

        long ans = Num1 * Num2;

        Answer.setText("Answer=\n" + ans);
    }

    public void doDiv(View V) {
        long Num1 = Long.parseLong(num1.getText().toString());
        long Num2 = Long.parseLong(num2.getText().toString());

        //To Handle Divide By Zero Err - Exception Handling
        try {

            long ans = Num1 / Num2;


            Answer.setText("Answer=\n" + ans);
        } catch (ArithmeticException E) {
            Answer.setText(E.getMessage());
        }
    }


}