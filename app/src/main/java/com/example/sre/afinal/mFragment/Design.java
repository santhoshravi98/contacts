package com.example.sre.afinal.mFragment;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.example.sre.afinal.R;
import com.example.sre.afinal.mData.KShow;
import com.example.sre.afinal.mListView.CutomAdapter;

import java.util.ArrayList;

/**
 * Created by sre on 11/24/17.
 */

public class Design extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.design_frag,container,false);
        ListView lv= (ListView)rootView.findViewById(R.id.designListView);

        FloatingActionButton fab;
        fab = (FloatingActionButton)rootView.findViewById(R.id.fab3);
        CutomAdapter adapter=new CutomAdapter(this.getActivity(),getContent());
        lv.setAdapter(adapter);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rec="design@kurukshetra.org.in";
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:" + rec));
                startActivity(intent);
            }
        });

        return rootView;
    }


    private ArrayList<KShow> getContent() {
        ArrayList<KShow> arr=new ArrayList<>();
        KShow kShow=new KShow("Amit.A",8608198652L);
        arr.add(kShow);
        kShow=new KShow("Mahasri.J",9585085999L);
        arr.add(kShow);

        kShow=new KShow("Niktaa.R.R",9790852001L);
        arr.add(kShow);
        return arr;
    }
    @Override
    public String toString() {
        String title="design";
        return title;
    }

}
