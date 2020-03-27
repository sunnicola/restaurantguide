package com.example.restaurantguide;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.text.NumberFormat;
import java.util.ArrayList;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder> {
    private Context mContext;
    private ArrayList<Restaurant> mRestaurants;
    private RecyclerViewClickListener mListener;

    //Data source is Restaurant arraylist, pass this through
    //paramertised constructor
    public RestaurantAdapter(Context context, ArrayList<Restaurant> restaurants, RecyclerViewClickListener listener) {
        mContext = context;
        mRestaurants = restaurants;
        mListener = listener;
    }

   public interface RecyclerViewClickListener{
    void onClick(View view, int position);
  }

    public static class RestaurantViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public ImageView item_image;
        public TextView name, location, cuisine, rating, cost;
        private RecyclerViewClickListener mListener;

        public RestaurantViewHolder(View v, RecyclerViewClickListener listener) {
            super(v);
            mListener = listener;
            v.setOnClickListener(this);
            item_image= v.findViewById(R.id.imageIv);
            name = v.findViewById(R.id.tvName);
            location = v.findViewById(R.id.tvLocation);
            cuisine = v.findViewById(R.id.tvCuisine);
            rating = v.findViewById(R.id.tvRating);
            cost = v.findViewById(R.id.tvCost);
        }

        @Override
        public void onClick(View view) {
            mListener.onClick(view, getAdapterPosition());
        }
    }


    @Override
    public RestaurantAdapter.RestaurantViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
        return new RestaurantViewHolder(v,mListener);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(RestaurantViewHolder holder, int position) {
        Restaurant restaurant = mRestaurants.get(position);
        holder.item_image.setImageResource(mRestaurants.get(position).getImg());
        holder.name.setText(restaurant.getName());
        holder.location.setText(restaurant.getLocation());
        holder.cuisine.setText(restaurant.getCuisine());
        holder.rating.setText(String.valueOf(restaurant.getRating()));
        holder.cost.setText(String.valueOf("$" + restaurant.getCost()));
       // holder.itemView.setOnClickListener(mListener);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mRestaurants.size();
    }
}

