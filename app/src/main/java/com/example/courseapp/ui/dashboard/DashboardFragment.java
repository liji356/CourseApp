package com.example.courseapp.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.courseapp.R;
import com.example.courseapp.databinding.FragmentDashboardBinding;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;
    private FragmentDashboardBinding binding;
    EditText ed1,ed2;
    AppCompatButton b1;

    String getName,getRoll;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        ed1=(EditText) root.findViewById(R.id.name);
        ed2=(EditText) root.findViewById(R.id.roll);
        b1=(AppCompatButton) root.findViewById(R.id. sub);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getName=ed1.getText().toString();
                getRoll=ed2.getText().toString();


                Toast.makeText(getActivity(),getName, Toast.LENGTH_SHORT).show();
                Toast.makeText(getActivity(),getRoll, Toast.LENGTH_SHORT).show();
            }
        });


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}