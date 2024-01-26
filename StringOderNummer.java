package com.example;

import java.io.IOException;

public class StringOderNummer {
    private String value;

    public void setValue(Double value) {
        this.value = value.toString();
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
