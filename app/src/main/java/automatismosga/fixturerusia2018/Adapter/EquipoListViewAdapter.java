package automatismosga.fixturerusia2018.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import automatismosga.fixturerusia2018.Pojo.Equipo;
import automatismosga.fixturerusia2018.R;

/**
 * Created by Gus on 29/11/2016.
 */
public class EquipoListViewAdapter extends BaseAdapter {

    protected Activity activity;
    protected ArrayList<Equipo> items;

    public EquipoListViewAdapter(Activity activity, ArrayList<Equipo> items) {
        this.activity = activity;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    public void clear() {
        items.clear();
    }

    public void addAll(ArrayList<Equipo> equipo) {
        for (int i = 0; i < equipo.size(); i++) {
            items.add(equipo.get(i));
        }
    }

    @Override
    public Object getItem(int arg0) {
        return items.get(arg0);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (convertView == null) {
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.list_view_grupo_a, null);
        }

        Equipo dir = items.get(position);

        TextView tvEquipo1 = (TextView) v.findViewById(R.id.tvEquipo1);
        tvEquipo1.setText(dir.getNombre());





        return v;
    }
}
