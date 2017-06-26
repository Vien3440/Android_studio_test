package promotion2.lunel.beweb.fondespierre.fr.monsuperclientrest.models;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

import org.json.JSONArray;

import java.util.List;

/**
 * Created by root on 26/06/17.
 */

public class JSONArrayAdapter extends ArrayAdapter {
    private final JSONArray objects;
    public JSONArrayAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull JSONArray objects, JSONArray objects1) {
        super(context, resource);
        this.objects = objects;
    }
}
