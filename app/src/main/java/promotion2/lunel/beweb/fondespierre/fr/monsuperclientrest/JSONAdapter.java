package promotion2.lunel.beweb.fondespierre.fr.monsuperclientrest;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by root on 27/06/17.
 */

public class JSONAdapter extends ArrayAdapter {

    private final JSONArray liste ;
    private  final  Activity context ;
    private  final int resource;

    public JSONAdapter(@NonNull Activity context, @LayoutRes int resource, JSONArray liste) {
        super(context, resource);
        this.liste = liste;
        this.context = context;
        this.resource = resource;
    }

    @Nullable
    @Override
    public JSONObject getItem(int position) {
        return liste.optJSONObject(position);
    }

    @Override
    public int getCount(){
        return liste.length();
    }

    @NonNull
    @Override
    public View getView (int position, @Nullable View convertView, @NonNull ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        convertView = inflater.inflate(this.resource,null);
        TextView nom = (TextView)convertView.findViewById(R.id.nom);
        nom.setText(getItem(position).optString("nom"));

        return convertView;
    }
}

