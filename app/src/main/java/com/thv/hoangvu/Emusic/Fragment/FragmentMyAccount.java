package com.thv.hoangvu.Emusic.Fragment;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import com.thv.hoangvu.Emusic.Activity.Login;
import com.thv.hoangvu.appnhac.R;


public class FragmentMyAccount extends Fragment {

    TextView tvSetting, tvAbout,tvLogout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_account, container, false);

        // CODE HERE
        tvSetting = view.findViewById(R.id.tvAccount);
        tvAbout = view.findViewById(R.id.tvAbout);
        tvLogout = view.findViewById(R.id.tvLogout);

        tvSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Settings.class);

                startActivity(intent);
            }
        });

        tvAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), AboutThisApp.class);
                startActivityForResult(intent,9898);
            }
        });

        tvLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Login.class);
                startActivity(intent);
                getActivity().finish();
            }
        });

        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 9898 && resultCode== Activity.RESULT_OK)
        {
            //Toast.makeText(getActivity(), "Thay đổi mật khẩu thành công",Toast.LENGTH_SHORT).show();
        }
    }

    /*public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_trang_chu,container,false);
        return view;
    }*/
}