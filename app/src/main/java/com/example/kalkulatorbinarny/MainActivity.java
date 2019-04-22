package com.example.kalkulatorbinarny;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    String str="";
    String str1,str2,str3,str6,str8;
    String str4="";
    String str5="";
    String str16="";
    String str18="";
    int liczba;
    int liczba2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView = (TextView)findViewById(R.id.textView);
        Button id0=(Button)findViewById(R.id.id0);
        Button id1=(Button)findViewById(R.id.id1);
        Button id2=(Button)findViewById(R.id.id2);
        Button id3=(Button)findViewById(R.id.id3);
        Button id4=(Button)findViewById(R.id.id4);
        Button id5=(Button)findViewById(R.id.id5);
        Button id6=(Button)findViewById(R.id.id6);
        Button id7=(Button)findViewById(R.id.id7);
        Button id8=(Button)findViewById(R.id.id8);
        Button id9=(Button)findViewById(R.id.id9);
        Button idlicz=(Button)findViewById(R.id.idlicz);
        Button idc = (Button)findViewById(R.id.idc);
        Button idliczsze =(Button)findViewById(R.id.idliczsze);
        Button idlicz3=(Button)findViewById(R.id.idlicz3);
        Button idliczos =(Button)findViewById(R.id.idliczos);
        final TextView textView2=(TextView)findViewById(R.id.textView2);
        textView2.setVisibility(View.INVISIBLE);
        textView2.setText("Program został wykonany przez Wojciecha Gołde w dniu 22 dnia kwietnia 2019 roku ");
        Switch swicth1=(Switch)findViewById(R.id.switch1);

        swicth1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    textView2.setVisibility(View.VISIBLE);
                }
                else
                {
                    textView2.setVisibility(View.INVISIBLE);
                }
            }
        });



        id0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1="0";
                str=str+str1;
                textView.setText(str);
            }
        });
        id1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1="1";
                str=str+str1;
                textView.setText(str);
            }
        });
        id2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1="2";
                str=str+str1;
                textView.setText(str);
            }
        });
        id3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1="3";
                str=str+str1;
                textView.setText(str);
            }
        });
        id4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1="4";
                str=str+str1;
                textView.setText(str);
            }
        });
        id5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1="5";
                str=str+str1;
                textView.setText(str);
            }
        });
        id6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1="6";
                str=str+str1;
                textView.setText(str);
            }
        });
        id7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1="7";
                str=str+str1;
                textView.setText(str);
            }
        });
        id8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1="8";
                str=str+str1;
                textView.setText(str);
            }
        });
        id9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1="9";
                str=str+str1;
                textView.setText(str);
            }
        });
        idc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str="";
                str1=null;
                str4="";
                str2=null;
                str5="";
                str3=null;
                str16="";
                str6=null;
                str8=null;
                str18="";
                textView.setText("");
            }
        });
        idlicz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                liczba=Integer.parseInt(str);

                while(true)
                {
                    if(liczba%2==0) str2="0";
                    else if(liczba%2==1) str2="1";
                    if(liczba<=0) break;

                    liczba=liczba/2;
                    str4=str2+str4;
                }
                textView.setText(str4);
            }
        });
        idlicz3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                liczba=Integer.parseInt(str);

                while(true)
                {
                    if(liczba%3==0)str3="0";
                    else if(liczba%3==2)str3="2";
                    else if(liczba%3==1)str3="1";
                    if (liczba<=0)break;
                    liczba=liczba/3;
                    str5=str3+str5;

                }
                textView.setText(str5);
            }
        });
        idliczsze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                liczba=Integer.parseInt(str);

                    while (true) {
                        if (liczba % 16 == 0) str6 = "0";
                        else if (liczba % 16 == 15) str6 = "F";
                        else if (liczba % 16 == 14) str6 = "E";
                        else if (liczba % 16 == 13) str6 = "D";
                        else if (liczba % 16 == 12) str6 = "C";
                        else if (liczba % 16 == 11) str6 = "B";
                        else if (liczba % 16 == 10) str6 = "A";
                        else if (liczba % 16 == 9) str6 = "9";
                        else if (liczba % 16 == 8) str6 = "8";
                        else if (liczba % 16 == 7) str6 = "7";
                        else if (liczba % 16 == 6) str6 = "6";
                        else if (liczba % 16 == 5) str6 = "5";
                        else if (liczba % 16 == 4) str6 = "4";
                        else if (liczba % 16 == 3) str6 = "3";
                        else if (liczba % 16 == 2) str6 = "2";
                        else if (liczba % 16 == 1) str6 = "1";
                        if (liczba <= 0) break;
                        liczba = liczba / 16;
                        str16=str6+str16;
                    }
                    textView.setText(str16);
            }
        });
        idliczos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                liczba=Integer.parseInt(str);
                while(true)
                {
                    if(liczba%8==0)str8="0";
                    else if(liczba%8==7)str8="7";
                    else if(liczba%8==6)str8="6";
                    else if(liczba%8==5)str8="5";
                    else if(liczba%8==4)str8="4";
                    else if(liczba%8==3)str8="3";
                    else if(liczba%8==2)str8="2";
                    else if(liczba%8==1)str8="1";
                    if (liczba <= 0) break;
                    liczba = liczba / 8;
                    str18=str8+str18;
                }
                textView.setText(str18);
            }
        });

    }
}
