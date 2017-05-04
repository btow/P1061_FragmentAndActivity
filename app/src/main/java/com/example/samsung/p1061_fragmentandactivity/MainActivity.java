package com.example.samsung.p1061_fragmentandactivity;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnSomeEventListenerInterface {

    private Fragment fragment1;
    private Fragment fragment2;
    private FragmentTransaction fragmentTransaction;
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment2 = new Fragment2();
        fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.fragment2, fragment2);
        fragmentTransaction.commit();
    }

    public void onClickBtn(View view) {
        message = "Access to " + getString(R.string.fragment_1) + " from Activity";
        fragment1 = getFragmentManager().findFragmentById(R.id.fragment1);
        ((TextView) fragment1.getView().findViewById(R.id.tvFragment)).setText(message);

        message = "Access to " + getString(R.string.fragment_2) + " from Activity";
        Messager.sendToAllRecipients(getBaseContext(), message);
        ((TextView) fragment2.getView().findViewById(R.id.tvFragment)).setText(message);
    }

    @Override
    public void someEvent(String s) {
        message = "Text from " + getString(R.string.fragment_2) + ": " + s;
        fragment1 = getFragmentManager().findFragmentById(R.id.fragment1);
        ((TextView) fragment1.getView().findViewById(R.id.tvFragment)).setText(message);
    }
}
