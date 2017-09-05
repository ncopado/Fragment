package com.ncopado.miscontactosapp.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ncopado.miscontactosapp.R;
import com.ncopado.miscontactosapp.adapter.ContactoAdaptador;
import com.ncopado.miscontactosapp.pojo.Contacto;

import java.util.ArrayList;

/**
 * Created by ncopado on 03/09/17.
 */

public class RecyclierViewFragment  extends Fragment{

    ArrayList<Contacto> lstContacto;
    private RecyclerView listaContactos;


    public RecyclierViewFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_recyclerview,container,false);


         listaContactos=(RecyclerView) v.findViewById(R.id.rvContactos);


        LinearLayoutManager llm=new LinearLayoutManager(getActivity());

        llm.setOrientation(LinearLayoutManager.VERTICAL);


        listaContactos.setLayoutManager(llm);
        InicilizarListaContactos();
        InicializarAdaptador();

        return  v;

    }

    public  void InicializarAdaptador(){
        ContactoAdaptador adaptador=new ContactoAdaptador(lstContacto,getActivity());
        listaContactos.setAdapter(adaptador);
    }

    public  void  InicilizarListaContactos(){

        lstContacto=new ArrayList<Contacto>();

        lstContacto.add(new Contacto(R.drawable.rayo,"Neme Copado","2291615266","ncopado@gmail.com"));
        lstContacto.add(new Contacto(R.drawable.rayo,"Paco Copado","2291615266","ncopado@gmail.com"));
        lstContacto.add(new Contacto(R.drawable.rayo,"Kary Copado","2291615266","ncopado@gmail.com"));
        lstContacto.add(new Contacto(R.drawable.rayo,"Carolina","2291615266","ncopado@gmail.com"));
        lstContacto.add(new Contacto(R.drawable.rayo,"Samy Copado","2291615266","ncopado@gmail.com"));


    }
}
