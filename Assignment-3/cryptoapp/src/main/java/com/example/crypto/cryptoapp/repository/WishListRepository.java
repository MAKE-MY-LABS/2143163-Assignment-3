package com.example.crypto.cryptoapp.repository;

/*
 * Create a repository interface called WishListRepository which extends CrudRepository
 * add a type of CryptoCurrency and String
 * add a annotation called @Repository
 */
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.crypto.cryptoapp.model.CryptoCurrency;

@Repository
public interface WishListRepository extends CrudRepository<CryptoCurrency, String> {

}