package com.example.zakwathu;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RadiosFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RadiosFragment extends Fragment {


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public RadiosFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RadiosFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RadiosFragment newInstance(String param1, String param2) {
        RadiosFragment fragment = new RadiosFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_radios,container,false);
        //Capital radio intent
        ImageView capitalRad = (ImageView)rootView.findViewById(R.id.capital);
        ImageView zodiakRad = (ImageView) rootView.findViewById(R.id.zodiak);
        ImageView mbcRad = (ImageView) rootView.findViewById(R.id.mbc);
        ImageView ufuluRad = (ImageView)rootView.findViewById(R.id.ufulu);
        ImageView timesRad = (ImageView) rootView.findViewById(R.id.times);
        ImageView mzatiRad = (ImageView) rootView.findViewById(R.id.mzati);

        ImageView mbc2Rad = (ImageView)rootView.findViewById(R.id.mbc2);
        ImageView mariaRad = (ImageView) rootView.findViewById(R.id.maria);
        ImageView chisomoRad = (ImageView) rootView.findViewById(R.id.chisomo);
        ImageView beyondRad = (ImageView)rootView.findViewById(R.id.beyond);
        ImageView mobiRad = (ImageView) rootView.findViewById(R.id.mobi);
        ImageView islamRad = (ImageView) rootView.findViewById(R.id.islam);

        capitalRad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(requireActivity(), CapitalFM.class);
                startActivity(intent);



            }
        });

        //Zodiak intent

        zodiakRad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(requireActivity(), ZodiakFM.class);
                startActivity(i);
            }
        });

        //MBC radio 1 intent

        mbcRad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(requireActivity(), MbcFM.class);
                startActivity(i);
            }
        });

        ufuluRad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(requireActivity(), UfuluFM.class);
                startActivity(i);
            }
        });


        timesRad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(requireActivity(), TimesFM.class);
                startActivity(i);
            }
        });

        mzatiRad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(requireActivity(), MzatiFM.class);
                startActivity(i);
            }
        });

        mbc2Rad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(requireActivity(), Radio2FM.class);
                startActivity(i);
            }
        });

        mariaRad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(requireActivity(), MariaFM.class);
                startActivity(i);
            }
        });

        chisomoRad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(requireActivity(), ChisomoFM.class);
                startActivity(i);
            }
        });

        beyondRad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(requireActivity(), BeyondFM.class);
                startActivity(i);
            }
        });

        mobiRad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(requireActivity(), MobiFM.class);
                startActivity(i);
            }
        });

        islamRad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(requireActivity(),
                        IslamFM.class);
                startActivity(i);
            }
        });

        // Inflate the layout for this fragment
        return rootView;
       // return inflater.inflate(R.layout.fragment_radios, container, false);
    }


}