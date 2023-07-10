package com.example.currencyconverter;


import com.example.currencyconverter.models.Data;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CurrencyApiService {

    @GET(Constant.CURRENCY_END_POINT)
    Call<List<Data>> getCurrency();
}
