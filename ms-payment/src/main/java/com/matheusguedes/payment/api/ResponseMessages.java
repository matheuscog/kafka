package com.matheusguedes.payment.api;

import org.json.JSONObject;

public class ResponseMessages {

    public static final String YOU_MUST_SEND_A_VALID_PAYMENT = "You must send us a payment to proceed with the operation.";

    public static final String YOU_MUST_ENTER_USER_HASH = "You must enter the user hash to continue the operation.";

    public static final String YOU_MUST_ENTER_VALUE = "You must enter a value to continue the operation.";

    public static final String YOU_MUST_ENTER_PRODUCT_IDENTIFIER = "You must enter the product identifier to continue the operation.";

    public static final String YOU_MUST_ENTER_CARD_NUMBER = "You must enter the card number to continue the operation.";

    public static String createJsonResponseMessage(String message) {
        if(message == null) message = "";
        return new JSONObject().put("message", message).toString();
    }

}