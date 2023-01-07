package com.example.findspot;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginFragment extends Fragment {

    EditText emailTxtInput, pwdTxtInput;
    Button loginBtn, toRegisterBtn;
    View loginView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        initalizeFragment(inflater, container);
        return loginView;
    }

    public void initalizeFragment(@NonNull LayoutInflater inflater, @Nullable ViewGroup container){
        loginView = inflater.inflate(R.layout.login_fragment, container, false);
        emailTxtInput = loginView.findViewById(R.id.emailTxtInput);
        pwdTxtInput = loginView.findViewById(R.id.pwdTxtInput);

        loginBtn = loginView.findViewById(R.id.loginBtn);
        toRegisterBtn = loginView.findViewById(R.id.toRegisterBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Hi", Toast.LENGTH_LONG).show();
            }
        });

        toRegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO
            }
        });
    }

}