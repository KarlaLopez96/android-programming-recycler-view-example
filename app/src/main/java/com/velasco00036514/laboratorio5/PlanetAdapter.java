package com.velasco00036514.laboratorio5;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by alejandro on 4/16/18.
 */

public class PlanetAdapter extends RecyclerView.Adapter<PlanetAdapter.PlanetViewHolder> {
    Context mCtx;
    List<Planet> planetList;

    public PlanetAdapter(Context mCtx, List<Planet> planetList) {
        this.mCtx = mCtx;
        this.planetList = planetList;
    }

    @Override
    public PlanetViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View v = inflater.inflate(R.layout.list_layout, parent, false);

        return new PlanetViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PlanetViewHolder holder, int position) {
        holder.titleTxtView.setText(planetList.get(position).getTitle());
        holder.descrTxtView.setText(planetList.get(position).getDesc());
    }

    @Override
    public int getItemCount() {
        return planetList.size();
    }

    protected class PlanetViewHolder extends RecyclerView.ViewHolder{
        TextView titleTxtView, descrTxtView;

        public PlanetViewHolder(View itemView) {
            super(itemView);

            titleTxtView = itemView.findViewById(R.id.titleTxtView);
            descrTxtView = itemView.findViewById(R.id.descTxtView);
        }
    }
}
