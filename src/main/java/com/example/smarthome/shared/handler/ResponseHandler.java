package com.example.smarthome.shared.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {
    public static ResponseEntity<Object> generateResponse(Boolean message,
                                                          HttpStatus status,
                                                          Object responseObj) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("isSuccessful", message);
        map.put("statusCode", status.value());
        map.put("data", responseObj);
        return new ResponseEntity<Object>(map, status);
    }
}
