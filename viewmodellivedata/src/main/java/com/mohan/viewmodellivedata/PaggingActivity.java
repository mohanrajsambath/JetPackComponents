package com.mohan.viewmodellivedata;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PaggingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagging_layout);

        Call<StackResponse> mRetroftiApicall = ARetrofitClient.getInstance()
                .getApi()
                .getAnswers(1,20,"desc","activity","stackoverflow");
        mRetroftiApicall.enqueue(new Callback<StackResponse>() {
            @Override
            public void onResponse(Call<StackResponse> call, Response<StackResponse> response) {
                StackResponse mStackResponse=response.body();
                Toast.makeText(PaggingActivity.this,String.valueOf(mStackResponse.items.size()),Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<StackResponse> call, Throwable t) {

            }
        });

    }
}
