package com.example.uliana.moneymanagerapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.uliana.moneymanagerapp.transactionsmodel.Transaction;

import java.util.ArrayList;

public class TransactionsAdapter  extends ArrayAdapter <Transaction> {
    public TransactionsAdapter(Context context, ArrayList <Transaction> transactions) {
        super(context, 0,transactions );
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Transaction transaction = getItem(position);

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_items,parent,false );
        }

        TextView title = convertView.findViewById(R.id.title);
        TextView sum = convertView.findViewById(R.id.sum);
        TextView date = convertView.findViewById(R.id.date);

        title.setText(transaction.getTitle());
        sum.setText(transaction.getSum());
        date.setText(transaction.getDate());
        return convertView;
    }
}
