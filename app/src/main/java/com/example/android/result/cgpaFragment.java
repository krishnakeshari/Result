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
public class cgpaFragment extends Fragment {

    double result;
    double sgpa[] = new double[8];
    double credit[] = new double[8];
    Button calculate;

    public cgpaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rootView = inflater.inflate(R.layout.fragment_cgpa, container, false);
        calculate = (Button)rootView.findViewById(R.id.calculate);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText[] e = new EditText[16];
                e[0] = (EditText) rootView.findViewById(R.id.editText1);
                String test = e[0].getText().toString();
                try {
                    sgpa[0] = Double.parseDouble(test);
                } catch (NumberFormatException ex) {
                    sgpa[0] = 0;
                }

                e[1] = (EditText) rootView.findViewById(R.id.editText2);
                test = e[1].getText().toString();
                try {
                    credit[0] = Double.parseDouble(test);
                } catch (NumberFormatException ex) {
                    credit[0] = 0;
                }

                e[2] = (EditText) rootView.findViewById(R.id.editText3);
                test = e[2].getText().toString();
                try {
                    sgpa[1] = Double.parseDouble(test);
                } catch (NumberFormatException ex) {
                    sgpa[1] = 0;
                }

                e[3] = (EditText) rootView.findViewById(R.id.editText4);
                test = e[3].getText().toString();
                try {
                    credit[1] = Double.parseDouble(test);
                } catch (NumberFormatException ex) {
                    credit[1] = 0;
                }

                e[4] = (EditText) rootView.findViewById(R.id.editText5);
                test = e[4].getText().toString();
                try {
                    sgpa[2] = Double.parseDouble(test);
                } catch (NumberFormatException ex) {
                    sgpa[2] = 0;
                }

                e[5] = (EditText) rootView.findViewById(R.id.editText6);
                test = e[5].getText().toString();
                try {
                    credit[2] = Double.parseDouble(test);
                } catch (NumberFormatException ex) {
                    credit[2] = 0;
                }

                e[6] = (EditText) rootView.findViewById(R.id.editText7);
                test = e[6].getText().toString();
                try {
                    sgpa[3] = Double.parseDouble(test);
                } catch (NumberFormatException ex) {
                    sgpa[3] = 0;
                }

                e[7] = (EditText) rootView.findViewById(R.id.editText8);
                test = e[7].getText().toString();
                try {
                    credit[3] = Double.parseDouble(test);
                } catch (NumberFormatException ex) {
                    credit[3] = 0;
                }

                e[8]= (EditText) rootView.findViewById(R.id.editText9);
                test = e[8].getText().toString();
                try {
                    sgpa[4] = Double.parseDouble(test);
                } catch (NumberFormatException ex) {
                    sgpa[4] = 0;
                }

                e[9] = (EditText) rootView.findViewById(R.id.editText10);
                test = e[9].getText().toString();
                try {
                    credit[4] = Double.parseDouble(test);
                } catch (NumberFormatException ex) {
                    credit[4] = 0;
                }

                e[10]= (EditText) rootView.findViewById(R.id.editText11);
                test = e[10].getText().toString();
                try {
                    sgpa[5] = Double.parseDouble(test);
                } catch (NumberFormatException ex) {
                    sgpa[5] = 0;
                }

                e[11]= (EditText) rootView.findViewById(R.id.editText12);
                test = e[11].getText().toString();
                try {
                    credit[5] = Double.parseDouble(test);
                } catch (NumberFormatException ex) {
                    credit[5] = 0;
                }

                e[12]= (EditText) rootView.findViewById(R.id.editText13);
                test = e[12].getText().toString();
                try {
                    sgpa[6] = Double.parseDouble(test);
                } catch (NumberFormatException ex) {
                    sgpa[6] = 0;
                }

                e[13]= (EditText) rootView.findViewById(R.id.editText14);
                test = e[13].getText().toString();
                try {
                    credit[6] = Double.parseDouble(test);
                } catch (NumberFormatException ex) {
                    credit[6] = 0;
                }

                e[14]= (EditText) rootView.findViewById(R.id.editText15);
                test = e[14].getText().toString();
                try {
                    sgpa[7] = Double.parseDouble(test);
                } catch (NumberFormatException ex) {
                    sgpa[7] = 0;
                }

                e[15]= (EditText) rootView.findViewById(R.id.editText16);
                test = e[15].getText().toString();
                try {
                    credit[7] = Double.parseDouble(test);
                } catch (NumberFormatException ex) {
                    credit[7] = 0;
                }

                //String message = Double.toString(calculateMarks());
                double ans = calculateMarks();
                String message = String.format(Locale.getDefault(),"%.2f", ans);
                TextView cgpaTextView = (TextView) rootView.findViewById(R.id.cgpa_text_view);
                cgpaTextView.setText(message);
            }
        });
        return rootView;
    }
    /**
     * This method calculates the CGPA.
     */
    private double calculateMarks() {
        double sum = 0;
        double sumCredit = 0;
        for (int i = 0; i < 8; i++) {
            sum += (sgpa[i] * credit[i]);
            sumCredit += credit[i];
        }
        result = sum / sumCredit;
        return result;
    }
}