package com.example.uliana.moneymanagerapp.menudrawer;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.uliana.moneymanagerapp.R;
import com.example.uliana.moneymanagerapp.TransactionsAdapter;
import com.example.uliana.moneymanagerapp.transactionsmodel.Transaction;

import java.util.List;

public class Menu1 extends Fragment {
    private ListView listView;
    private TransactionsAdapter transactionsAdapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_menu_1, container);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Траты");
    }
}
