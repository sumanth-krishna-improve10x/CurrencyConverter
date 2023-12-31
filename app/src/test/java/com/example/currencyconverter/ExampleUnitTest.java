package com.example.currencyconverter;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.currencyconverter.models.Currency;
import com.example.currencyconverter.network.CurrencyApi;
import com.example.currencyconverter.network.CurrencyApiService;
import com.google.gson.Gson;

import java.io.IOException;

import retrofit2.Call;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void getCurrency() throws IOException{
        CurrencyApiService currencyApiService = new CurrencyApi().createCurrencyApiService();
        Call<Currency> call = currencyApiService.getCurrency();
        Currency currency = call.execute().body();
        assertNotNull(currency);
        System.out.println(new Gson().toJson(currency));
    }
}