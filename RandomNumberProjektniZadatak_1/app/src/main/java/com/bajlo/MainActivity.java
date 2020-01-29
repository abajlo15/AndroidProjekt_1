package com.bajlo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);

        ucitaj();
    }

    public void ucitaj() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.math.tools")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        numberInterface numInt = retrofit.create(numberInterface.class);

        Call<ContentsRequest> call = numInt.dohvatiBroj(15);
        call.enqueue(new Callback<ContentsRequest>() {
            @Override
            public void onResponse(Call<ContentsRequest> call, Response<ContentsRequest> response) {



              if(!response.isSuccessful()){
                  textView.setText("Code: " + response.code());
                  return;

              }

              ContentsRequest contents = response.body();
              String content ="";
              content += contents.getResponse().getContents().getAnswer().toString();

              textView.append(content);

                Log.d("RADI", content);
            }

            @Override
            public void onFailure(Call<ContentsRequest> call, Throwable t) {

                Log.d("Nee radi", "ne radi");

            }
        });


    }
}
