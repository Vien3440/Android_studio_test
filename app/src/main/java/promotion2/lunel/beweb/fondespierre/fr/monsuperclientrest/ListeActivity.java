package promotion2.lunel.beweb.fondespierre.fr.monsuperclientrest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

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

        JSONAdapter  adapter = null;

        try {
            adapter = new JSONAdapter(this, R.layout.item_list,getListAsJson());
        } catch (JSONException e) {
            e.printStackTrace();
        }


        listView.setAdapter(adapter);

    }
    private List<String> getListe() {

        List<String> liste = new ArrayList<>();

        liste.add("Papy tchoulo");
        liste.add("Papy tchoulo");
        liste.add("Papy tchoulo");
        liste.add("Papy choulo");
        liste.add("Papy choulo");
        liste.add("Papy choulo");
        liste.add("Papy choulo");
        liste.add("Papy choulo");
        liste.add("Papy choulo");

        return liste;
    }
    private JSONArray getListAsJson() throws JSONException {
        JSONArray liste = new JSONArray();

        for  (int i=0 ; i< 10 ; i++){
            JSONObject o = new JSONObject();
            o.put("nom", "le nom est : " + i );
            o.put("id",i);
            liste.put(o);
        }
return liste;
    }
}