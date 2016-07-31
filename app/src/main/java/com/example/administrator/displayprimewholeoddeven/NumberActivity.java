package com.example.administrator.displayprimewholeoddeven;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NumberActivity extends AppCompatActivity {
    Button buttonwhole, buttonprime, buttonodd, buttoneven, increment, decrement;
    TextView textdisp, numdisp;
    int whole, prime, odd, even, i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        textdisp = (TextView) findViewById(R.id.textdisp);
        numdisp = (TextView) findViewById(R.id.numdisp);
    }

    public void whole(View view) {
        whole = 1;
        prime = 0;
        odd = 0;
        even = 0;
        textdisp.setText("whole number");
        i = 0;
        numdisp.setText("" + i);
    }

    public void prime(View view) {
        prime = 1;
        whole = 0;
        odd = 0;
        even = 0;
        i = 2;
        textdisp.setText("prime number");
        numdisp.setText("" + i);
    }

    public void odd(View view) {
        odd = 1;
        whole = 0;
        prime = 0;
        even = 0;
        i = 1;
        textdisp.setText("odd number");
        numdisp.setText("" + i);
    }

    public void even(View view) {
        even = 1;
        whole = 0;
        prime = 0;
        odd = 0;
        i = 2;
        textdisp.setText("even number");
        numdisp.setText("" + i);
    }

    public void increment(View view) {
        if (whole == 1) {
            i = i + 1;
            numdisp.setText("" + i);
        }
        if (prime == 1) {
            int k = 1;
            while (k == 1) {
                i = i + 1;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        k = 1;
                        break;
                    } else {
                        k = 0;
                    }
                }
            }
            numdisp.setText("" + i);
        }

        if (odd == 1) {
            i = i + 2;
            numdisp.setText("" + i);
        }
        if (even == 1) {
            i = i + 2;
            numdisp.setText("" + i);
        }

    }

    public void decrement(View view) {
        if (whole == 1) {
            if (i == 0) {
                numdisp.setText("" + i);
            } else {
                i = i - 1;
                numdisp.setText("" + i);
            }
        }
        if (prime == 1) {

                String s = numdisp.getText().toString();
                int i = Integer.parseInt(s);
            if (i <= 3) {
                i = 2;
                numdisp.setText("" + i);
            }
            else {
                int k = 1;
                while (k == 1) {
                    i = i - 1;
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0) {
                            k = 1;
                            break;
                        } else {
                            k = 0;
                        }
                    }
                }
                numdisp.setText("" + i);
            }
        }

        if (odd == 1) {
            if (i == 1) {
                numdisp.setText("" + i);
            } else {

                i = i - 2;
                numdisp.setText("" + i);
            }
        }
        if (even == 1) {
            if (i == 2) {
                numdisp.setText("" + i);
            } else {
                i = i - 2;
                numdisp.setText("" + i);
            }

        }
    }
}