package chandan.mandar.sql;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText roll,name,mark;
    Button add,delete,modify,view,viewall,show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        roll=findViewById(R.id.editText);
        name=findViewById(R.id.editText2);
        mark=findViewById(R.id.editText3);

        add=findViewById(R.id.button);
        delete=findViewById(R.id.button2);
        modify=findViewById(R.id.button3);
        view=findViewById(R.id.button4);
        viewall=findViewById(R.id.button5);
        show=findViewById(R.id.button6);

        add.setOnClickListener(this);
        delete.setOnClickListener(this);
        modify.setOnClickListener(this);
        view.setOnClickListener(this);
        viewall.setOnClickListener(this);
        show.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.button:
                Toast.makeText(this, "ADD", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(this, "DELETE", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Toast.makeText(this, "MODIFY", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                Toast.makeText(this, "VIEW", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                Toast.makeText(this, "VIEWALL", Toast.LENGTH_SHORT).show();
                break;case R.id.button6:
            Toast.makeText(this, "SHOW", Toast.LENGTH_SHORT).show();
            break;


        }

    }
}
