package com.maru.how_much_doc;

/*
 * Created by CHOI HEE JAE on 2019-11-21
 */

import android.app.Application;

import com.google.gson.Gson;
import com.maru.how_much_doc.api.RetrofitService;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GlobalApplication extends Application {
    private RetrofitService apiService;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public RetrofitService getApiService() {
        if (apiService == null) {
            apiService = provideRetrofit().create(RetrofitService.class);
        }
        return apiService;
    }

    private Retrofit provideRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(RetrofitService.API_URL)
                .client(provideOkHttpClient())
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .build();
    }

    private OkHttpClient provideOkHttpClient() {
        OkHttpClient.Builder okhttpClientBuilder = new OkHttpClient.Builder();
        okhttpClientBuilder.connectTimeout(30, TimeUnit.SECONDS);
        okhttpClientBuilder.readTimeout(30, TimeUnit.SECONDS);
        okhttpClientBuilder.writeTimeout(30, TimeUnit.SECONDS);

        return okhttpClientBuilder.build();
    }
}
