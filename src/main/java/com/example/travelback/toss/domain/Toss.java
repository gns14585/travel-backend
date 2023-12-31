package com.example.travelback.toss.domain;

import lombok.Data;

@Data
public class Toss {
    private Integer tossid;
    private Integer id;
    private Integer amount;
    private String orderId;
    private String inserted;
    private String userId;
    private String requested;
    private String phoneNumber;
    private String transTitle,transStartDate,transEndDate,reservation;
}
