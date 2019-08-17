package com.kenedzel.qbank.dto;

import lombok.Data;

@Data
public class Void {

    public static final Void SUCCESSFUL_SAVE = new Void("0", "success", "saved data");

    private String code;

    private String status;

    private String description;

    private Void(String code, String status, String description) {
        this.code = code;
        this.status = status;
        this.description = description;
    }
}
