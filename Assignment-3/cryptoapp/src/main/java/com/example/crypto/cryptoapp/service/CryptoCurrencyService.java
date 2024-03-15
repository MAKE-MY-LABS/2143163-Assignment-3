package com.example.crypto.cryptoapp.service;

import com.example.crypto.cryptoapp.model.CryptoCurrenciesList;

// Create a service interface called CryptoCurrencyService
// add a method called getLatestCryptoCurrency

public interface CryptoCurrencyService {
    CryptoCurrenciesList getLatestCryptoCurrency();
}