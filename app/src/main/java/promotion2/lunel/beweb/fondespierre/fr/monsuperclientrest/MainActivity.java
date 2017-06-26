package promotion2.lunel.beweb.fondespierre.fr.monsuperclientrest;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static promotion2.lunel.beweb.fondespierre.fr.monsuperclientrest.R.layout.login;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       setContentView(login);
        final Context activity = this;
        final EditText username = (EditText)findViewById(R.id.username);
        final EditText password = (EditText)findViewById(R.id.password);
        Button button = (Button) findViewById(R.id.buttonValid);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if( !username.getText().toString().isEmpty() && !password.getText().toString().isEmpty()){
//                     Si les champs sont bien rempli alors l'on peut init mon
                    Intent intent = new Intent(activity,ListeActivity.class);
                    intent.putExtra("username",username.getText().toString());
                    activity.startActivity(intent);
                }
            }
        });
    }
}
