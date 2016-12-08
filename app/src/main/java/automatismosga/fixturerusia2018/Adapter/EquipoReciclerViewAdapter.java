package automatismosga.fixturerusia2018.Adapter;

import android.app.Activity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import automatismosga.fixturerusia2018.Pojo.Equipo;
import automatismosga.fixturerusia2018.R;

/**
 * Created by Gus on 29/11/2016.
 */
public class EquipoReciclerViewAdapter extends RecyclerView.Adapter<EquipoReciclerViewAdapter.EquipoViewHolder> {



    private List<Equipo> items;




    public static class EquipoViewHolder extends RecyclerView.ViewHolder {
        // Campos respectivos de un item
        public ImageView ivBandera;
        public TextView tvNombre;
        public TextView tvPuntos;

        public String Nombre;
        public int Puntos;

        public EquipoViewHolder(View v) {
            super(v);

            ivBandera = (ImageView) v.findViewById(R.id.ivBandera);
            tvNombre = (TextView) v.findViewById(R.id.tvNombre);
            tvPuntos = (TextView) v.findViewById(R.id.puntos);


            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

            Toast.makeText(itemView.getContext(), "Nombre:" + Nombre + " Puntos:" + Puntos, Toast.LENGTH_SHORT).show();



                }
            });
    }
    }



    public EquipoReciclerViewAdapter(List<Equipo> items) {
        this.items = items;
    }





    @Override
    public int getItemCount() {
        return items.size();

    }




    @Override
    public EquipoViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.equipo_card, viewGroup, false);
        return new EquipoViewHolder(v);
    }



    @Override
    public void onBindViewHolder(final EquipoViewHolder viewHolder, final int position) {

        viewHolder.ivBandera.setImageResource(items.get(position).getBandera());
        viewHolder.tvNombre.setText(items.get(position).getNombre());
        viewHolder.tvPuntos.setText("Puntos:"+String.valueOf(items.get(position).getPuntos()));

        viewHolder.Nombre = items.get(position).getNombre();
        viewHolder.Puntos = items.get(position).getPuntos();


        viewHolder.ivBandera.setOnClickListener(new View.OnClickListener(){

                @Override
            public void onClick(View v) {
                    // item clicked


                }
            });





    }



}