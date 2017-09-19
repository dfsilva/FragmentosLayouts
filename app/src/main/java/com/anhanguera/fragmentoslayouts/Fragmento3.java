package com.anhanguera.fragmentoslayouts;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Fragmento3 extends Fragment {


    public Fragmento3() {
        // Required empty public constructor
    }

    public static Fragmento3 newInstance() {
        Fragmento3 fragment = new Fragmento3();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fragmento3, container, false);
    }

}
