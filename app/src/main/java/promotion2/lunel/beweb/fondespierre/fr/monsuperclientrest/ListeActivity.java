package promotion2.lunel.beweb.fondespierre.fr.monsuperclientrest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.json.JSONException;

import promotion2.lunel.beweb.fondespierre.fr.monsuperclientrest.models.Dao;
import promotion2.lunel.beweb.fondespierre.fr.monsuperclientrest.models.DaoDur;

/**
 * Created by root on 26/06/17.
 */

public class ListeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.liste_activity);
        // recup l'intantion
        Intent intent = this.getIntent();
        // recupere les infos du username
        String username = intent.getStringExtra("username");
        TextView welcome = (TextView)findViewById(R.id.welcome);
        welcome.setText(welcome.getText().toString()+" "+username);


        DaoDur dao = new DaoDur();

        ListView listView = (ListView)findViewById(R.id.liste);

        ArrayAdapter adapter = null;
        try {
            adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,dao.getAllAsArrayListe());
        } catch (JSONException e) {
            e.printStackTrace();
        }

        listView.setAdapter(adapter);
    }
}