package com.a2msproject.berbagi_layout.Donatur;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.a2msproject.berbagi_layout.R;

/**
 * Created by Super User on 6/23/2017.
 */

public class Fragment_Donasi_Barang_Menunggu extends Fragment {
    View dataView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        dataView = inflater.inflate(R.layout.card_view_donasi_barang_donatur,
                container, false);
        return dataView;
    }
}
