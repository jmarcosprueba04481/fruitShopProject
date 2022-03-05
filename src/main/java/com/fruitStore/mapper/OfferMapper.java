package com.fruitStore.mapper;

import com.fruitStore.dto.OfferDto;
import com.fruitStore.entities.Offer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OfferMapper {

    public OfferDto offerEntityToOfferDto (Offer offer){

        OfferDto response = new OfferDto();
        response.setName(offer.getName());
        response.setDescription(offer.getDescription());

        return response;
    }

    public List<OfferDto> listOfferEntityToListOfferDto(List<Offer> offerList){

        List<OfferDto> responseList = new ArrayList<>();
        for(Offer offer : offerList){
            responseList.add(offerEntityToOfferDto(offer));
        }
        return responseList;
    }


}
