package com.minhtien.bthinhom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import cz.msebera.android.httpclient.Header;

public class MainActivity extends AppCompatActivity {
   ListView listView;
    Response responseObj;
    CustomAdapter adapter;
    String url = "http://tigia.hunggiasaigon.com/";
    Gson gson;
    AsyncHttpClient client;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.myList);
        client = new AsyncHttpClient();
        client.get(MainActivity.this, url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                Log.d("test","ket noi thanh cong");
                String responsestr = new String(responseBody);
                gson = new Gson();
                responseObj = gson.fromJson(responsestr,Response.class);
                Log.d("test","lay du lieu thanh cong");
                adapter = new CustomAdapter(MainActivity.this, responseObj.getItems());
                listView.setAdapter(adapter);
            }
            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Log.d("test","ket noi that bai");
            }
        });
    }
}
