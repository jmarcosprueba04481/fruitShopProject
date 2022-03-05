package com.fruitStore.mockFruitStoreRepository;

import com.fruitStore.entities.Offer;
import org.springframework.stereotype.Component;

@Component
public class OfferProductMock {

    //Offer description
    private static final String PEARS_ORANGE_OFFER_DESC = "Get free Orange for every 2 pears you buy";
    private static final String APPLE_OFFER_DESC = "Buy 3 apples and pay 2";
    private static final String PEAR_OFFER_DISCOUNT_DESC = "For every 4 EUROS spent in PEARS, we will " +
            "deduct one euro from your final invoice";

    //Offer names
    private static final String PEARS_ORANGE_OFFER = "2PearsForOrange";
    private static final String APPLE_OFFER = "3applesPay2";
    private static final String DISCOUNT_OFFER = "4EurosDeduct1";


    public Offer getOfferPearOrangeMock(){

        return Offer.builder()
                .name(PEARS_ORANGE_OFFER)
                .description(PEARS_ORANGE_OFFER_DESC)
                .build();

    }

    public Offer getAppleOffer(){
        return Offer.builder()
                .name(APPLE_OFFER_DESC)
                .description(APPLE_OFFER)
                .build();
    }

    public Offer getDiscountOffer(){
        return Offer.builder()
                .name(DISCOUNT_OFFER)
                .description(PEAR_OFFER_DISCOUNT_DESC)
                .build();
    }


}
