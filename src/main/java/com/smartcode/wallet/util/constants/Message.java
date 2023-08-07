package com.smartcode.wallet.util.constants;

public interface Message {

    String CARD_NOT_AVAILABLE = "This card is already used";

    static String cardNotFound(Integer id){
        return String.format("Card with id: %d not found",id);
    }

}
