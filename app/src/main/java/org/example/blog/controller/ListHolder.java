package org.example.blog.controller;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import org.example.blog.R;

/**
 * Created by Alan Beas on 11/12/2016.
 */

public class ListHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


        View mView;
        TextView mFrom;
        TextView mTo;
        TextView mDate;
        TextView mPric;

        ListClickListener list_clickListener;

        Context cs;

        public ListHolder(View itemView) {
            super(itemView);
            mView = itemView;
            this.cs = itemView.getContext();
            this.mFrom = (TextView) itemView.findViewById(R.id.post_from);
            this.mTo = (TextView) itemView.findViewById(R.id.post_to);
            this.mDate = (TextView) itemView.findViewById(R.id.post_date);
            this.mPric = (TextView) itemView.findViewById(R.id.post_price);
        }

        public void setFrom(String fromText) {
            TextView post_from = (TextView) mView.findViewById(R.id.post_from);
            post_from.setText(fromText);
        }

        public void setTo(String toText) {
            TextView post_to = (TextView) mView.findViewById(R.id.post_to);
            post_to.setText(toText);
        }


        public void setDate(String dateText) {
            TextView post_date = (TextView) mView.findViewById(R.id.post_date);
            post_date.setText(dateText);
        }


        public void setPrice(String priceText) {
            TextView post_price = (TextView) mView.findViewById(R.id.post_price);
            post_price.setText(priceText);
        }

    @Override
    public void onClick(View v) {
        this.list_clickListener.OnItemClick(v, getLayoutPosition());
    }

    public void setList_clickListener(ListClickListener ls){
        this.list_clickListener=ls;
    }
}
