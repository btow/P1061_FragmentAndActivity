package com.example.samsung.p1061_fragmentandactivity;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by samsung on 03.05.2017.
 */

public class Fragment2 extends Fragment {

    private View view;
    private Button btnFragment;
    private String message;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment2, null);

        btnFragment = (Button) view.findViewById(R.id.btnFragment);
        btnFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message = getString(R.string.button_click_in) + " " + getString(R.string.fragment_2);
                Messager.sendToAllRecipients(v.getContext(), message);
            }
        });

        return view;
    }
}
