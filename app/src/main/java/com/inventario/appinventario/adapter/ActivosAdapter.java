package com.inventario.appinventario.adapter;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.FirestoreRegistrar;
import com.inventario.appinventario.R;
import com.inventario.appinventario.model.Activos;
public class ActivosAdapter extends FirestoreRecyclerAdapter<Activos, ActivosAdapter.ViewHolder> {
    /**
     * Create a new RecyclerView adapter that listens to a Firestore Query.  See {@link
     * FirestoreRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public ActivosAdapter(@NonNull FirestoreRecyclerOptions<Activos> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, int i, @NonNull Activos model) {
        holder.codigo.setText(model.getCodigo());
        holder.encargado.setText(model.getEncargado());
        holder.equipo.setText(model.getEquipo());
        holder.estado.setText(model.getEstado());
        holder.ubicacion.setText(model.getUbicacion());
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.view_activos_single, parent, false);
        return new ViewHolder(view);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView codigo,encargado,equipo,estado,ubicacion;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            codigo  = itemView.findViewById(R.id.codigo);
            encargado  = itemView.findViewById(R.id.encargado);
            equipo  = itemView.findViewById(R.id.equipo);
            estado  = itemView.findViewById(R.id.estado);
            ubicacion  = itemView.findViewById(R.id.ubicacion);
        }
    }
}