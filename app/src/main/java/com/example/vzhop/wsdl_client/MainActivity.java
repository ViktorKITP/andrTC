package com.example.vzhop.wsdl_client;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.teamcenter.schemas.core._2006_03.session.*;
import com.teamcenter.schemas.soa._2006_03.base.ModelObject;
import com.teamcenter.schemas.soa._2006_03.base.Property;
import com.teamcenter.services.core._2006_03.*;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("Temp","Hello World!");
        String serverHost = "http://192.168.2.58:7001/tc";


    }


}
