package com.example.android.sha_hashing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigInteger;
import java.security.MessageDigest;

public class MainActivity extends AppCompatActivity {

    private EditText input;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.input);
        output = findViewById(R.id.output);    }


    public void btnSHA(View v)
    {
        byte[] inputData = input.getText().toString().getBytes();
        byte[] outputData = new byte[0];

        try {
            outputData = encryptSHA(inputData,"SHA-1");
        } catch (Exception e) {
            e.printStackTrace();
        }


        BigInteger shaData = new BigInteger(1,outputData);
        output.setText(shaData.toString(16));
    }


    public static byte[] encryptSHA(byte[] data, String shaN) throws Exception
    {
        MessageDigest sha = MessageDigest.getInstance(shaN);
        sha.update(data);
        return  sha.digest();
    }

}
