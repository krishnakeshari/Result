package com.example.android.result;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

/**
 * A simple {@link Fragment} subclass.
 */
public class sgpaFragment extends Fragment {


    public sgpaFragment() {
        // Required empty public constructor
    }

    double result;
    int marks[] = new int[6];
    int credit[] = new int[6];
    Button calculate;

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rootView = inflater.inflate(R.layout.fragment_sgpa, container, false);
        calculate = (Button)rootView.findViewById(R.id.calculate);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText [] e = new EditText[12];
                e[0] = (EditText) rootView.findViewById(R.id.editText1);
                String test = e[0].getText().toString();
                marks[0] = Integer.parseInt(test);

                e[1] = (EditText) rootView.findViewById(R.id.editText2);
                test = e[1].getText().toString();
                credit[0] = Integer.parseInt(test);

                e[2] = (EditText) rootView.findViewById(R.id.editText3);
                test = e[2].getText().toString();
                marks[1] = Integer.parseInt(test);

                e[3] = (EditText) rootView.findViewById(R.id.editText4);
                test = e[3].getText().toString();
                credit[1] = Integer.parseInt(test);

                e[4] = (EditText) rootView.findViewById(R.id.editText5);
                test = e[4].getText().toString();
                marks[2] = Integer.parseInt(test);

                e[5] = (EditText) rootView.findViewById(R.id.editText6);
                test = e[5].getText().toString();
                credit[2] = Integer.parseInt(test);

                e[6] = (EditText) rootView.findViewById(R.id.editText7);
                test = e[6].getText().toString();
                marks[3] = Integer.parseInt(test);

                e[7] = (EditText) rootView.findViewById(R.id.editText8);
                test = e[7].getText().toString();
                credit[3] = Integer.parseInt(test);

                e[8]= (EditText) rootView.findViewById(R.id.editText9);
                test = e[8].getText().toString();
                marks[4] = Integer.parseInt(test);

                e[9] = (EditText) rootView.findViewById(R.id.editText10);
                test = e[9].getText().toString();
                credit[4] = Integer.parseInt(test);

                e[10]= (EditText) rootView.findViewById(R.id.editText11);
                test = e[10].getText().toString();
                marks[5] = Integer.parseInt(test);

                e[11]= (EditText) rootView.findViewById(R.id.editText12);
                test = e[11].getText().toString();
                credit[5] = Integer.parseInt(test);

//              String message = Double.toString(calculateMarks());
                double ans = calculateMarks();
                String message = String.format(Locale.getDefault(),"%.2f", ans);
                TextView sgpaTextView = (TextView) rootView.findViewById(R.id.sgpa_text_view);
                sgpaTextView.setText(message);
            }
        });
        return rootView;
    }
    /**
     * This method calculates the SGPA.
     */
    private double calculateMarks() {
        int sum = 0;
        int sumCredit = 0;
        for (int i = 0; i < 6; i++) {
            sum += (marks[i] * credit[i]);
            sumCredit += credit[i];
        }
        result = (float) sum / sumCredit;
        return result;
    }
}