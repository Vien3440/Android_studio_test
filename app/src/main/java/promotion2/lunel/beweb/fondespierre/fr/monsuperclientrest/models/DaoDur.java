package promotion2.lunel.beweb.fondespierre.fr.monsuperclientrest.models;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Array;
import java.util.ArrayList;

import promotion2.lunel.beweb.fondespierre.fr.monsuperclientrest.models.Dao;

/**
 * Created by root on 26/06/17.
 */

public class DaoDur extends Dao {

    @Override
    public JSONArray getAll(){
        JSONArray liste = new JSONArray();

        for (int i = 0 ; i < 10 ; i++){
            JSONObject o = new JSONObject();
            try {
                o.putOpt("nom","nom" + i);
                o.putOpt("prenom","prenom" + i);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            liste.put(o);
        }

        return liste ;
    }
    public ArrayList getAllAsArrayListe() throws JSONException{
        ArrayList liste = new ArrayList();
        JSONArray jsonListe = getAll();

     for(int i = 0 ; i < jsonListe.length() ; i ++ ){
         JSONObject o = jsonListe.getJSONObject(i);
         liste.add(o.optString("nom")+ " " + o.optString("prenom"));
     }

     return liste;
    }
}
