package application.example.calculatornik;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     EditText etFirstValue,etSecondValue;
     TextView tvAns;
     Button btnAdd,btnSubs,btnMultiply,btnDiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFirstValue= findViewById(R.id.etFirstValue);
        etSecondValue= findViewById(R.id.etSecondValue);
        tvAns= findViewById(R.id.tvAns);
        btnAdd= findViewById(R.id.btnAdd);
        btnSubs= findViewById(R.id.btnSubs);
        btnDiv= findViewById(R.id.btnDiv);
        btnMultiply= findViewById(R.id.btnMultiply);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue, secondValue, ans;
                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue = Integer.parseInt(etSecondValue.getText().toString());
                ans = firstValue + secondValue;
                tvAns.setText("Ans =" + ans);
            }
            });
                btnSubs.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int firstValue, secondValue, ans;
                        firstValue = Integer.parseInt(etFirstValue.getText().toString());
                        secondValue = Integer.parseInt(etSecondValue.getText().toString());
                        ans = firstValue - secondValue;
                        tvAns.setText("Ans =" + ans);
                    }
                    });
                        btnMultiply.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                int firstValue, secondValue, ans;
                                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                                secondValue = Integer.parseInt(etSecondValue.getText().toString());
                                ans = firstValue * secondValue;
                                tvAns.setText("Ans =" + ans);
                            }
                            });
                                btnDiv.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        int firstValue, secondValue, ans;
                                        firstValue = Integer.parseInt(etFirstValue.getText().toString());
                                        secondValue = Integer.parseInt(etSecondValue.getText().toString());
                                        ans = firstValue / secondValue;
                                        tvAns.setText("Ans =" + ans);

                                    }
                                });
                            }
                        }