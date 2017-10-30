package com.example.android.cryptocurrencyconverter;


public class Rate {

    private double mBitcoinRate;
    private double mExchangeRate;
    private String mCurrency;
    private String mCurrencyShortForm;

    public Rate(double bitcoinRate, double exchangeRate, String currency, String currencyShortForm){
        mBitcoinRate = bitcoinRate;
        mExchangeRate = exchangeRate;
        mCurrency = currency;
        mCurrencyShortForm = currencyShortForm;
    }

    public double getBitcoinRate(){return  mBitcoinRate;}

    public double getExchangeRate(){return mExchangeRate;}

    public String getCurrency(){return mCurrency;}

    public String getCurrencyShortForm(){return mCurrencyShortForm;}
}
