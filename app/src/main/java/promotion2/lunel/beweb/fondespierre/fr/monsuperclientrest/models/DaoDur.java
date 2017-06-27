package promotion2.lunel.beweb.fondespierre.fr.monsuperclientrest.models;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


import java.util.ArrayList;

import promotion2.lunel.beweb.fondespierre.fr.monsuperclientrest.models.Dao;

/**
 * Dans cette methode l'on simule le rendue d'une requet en DB qui nous retourne un Tbl clé valaur
 */
public class DaoDur extends Dao {

    // @Override nous dit que l'on implement les (la) methode(s) de notre DaoInterface
    @Override
    public JSONArray getAll(){
        JSONArray liste = new JSONArray();


        for (int i = 0 ; i < 10 ; i++){
            JSONObject o = new JSONObject();
            try {
                o.putOpt("nom","nom" + i);
                o.putOpt("prenom","prenom" + i);

//                catch = arrayPush() (en php)
            } catch (JSONException e) {
//                printStackTrace = sortie standar
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
