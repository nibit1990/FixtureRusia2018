package automatismosga.fixturerusia2018.Adapter;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Element;
import org.w3c.dom.Node;

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
        EditText etResultadoEquipo1 = (EditText) v.findViewById(R.id.etResultadoEquipo1);

        etResultadoEquipo1.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {

                // you can call or do what you want with your EditText here


            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
         
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {}
        });







        return v;
    }


}
