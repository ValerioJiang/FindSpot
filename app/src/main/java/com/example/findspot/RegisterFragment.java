package com.example.findspot;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class RegisterFragment extends Fragment {

    EditText emailRegisterInput, pwdRegisterInput, confirmPwdRegisterInput, birthDateRegisterInput, nameRegisterInput, surnameRegisterInput;
    Button registerBtn;
    View registerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        initalizeFragment(inflater, container);
        return registerView;
    }

    public void initalizeFragment(@NonNull LayoutInflater inflater, @Nullable ViewGroup container) {
        registerView = inflater.inflate(R.layout.register_fragment, container, false);
        emailRegisterInput = registerView.findViewById(R.id.emailRegisterInput);
        pwdRegisterInput = registerView.findViewById(R.id.pwdRegisterInput);
        confirmPwdRegisterInput = registerView.findViewById(R.id.confirmPwdRegisterInput);
        birthDateRegisterInput = registerView.findViewById(R.id.birthDateRegisterInput);
        nameRegisterInput = registerView.findViewById(R.id.nameRegisterInput);
        surnameRegisterInput = registerView.findViewById(R.id.surnameRegisterInput);

        registerBtn = registerView.findViewById(R.id.registerBtn);

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO fare controlli che i text siano ok
                Toast.makeText(getActivity(), "Hi", Toast.LENGTH_LONG);
            }
        });
    }
}
