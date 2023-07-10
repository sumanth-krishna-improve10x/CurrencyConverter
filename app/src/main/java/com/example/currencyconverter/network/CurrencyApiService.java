package com.example.currencyconverter.network;


import com.example.currencyconverter.Constant;
import com.example.currencyconverter.models.Currency;
import com.example.currencyconverter.models.Data;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CurrencyApiService {

    @GET(Constant.CURRENCY_END_POINT)
    Call<Currency> getCurrency();
}
