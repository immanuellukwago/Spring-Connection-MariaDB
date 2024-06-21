package com.immanuel.objects;

import org.springframework.beans.factory.annotation.Value;

public class Address {
    @Value("${country}")
    String country;

    @Value("${city}")
    String city;

    @Value("${p_o_Box}")
    String p_o_Box;

    public Address() {
    }

    @Override
    public String toString() {
        return "{" + country + "-" + city + "-" + p_o_Box + "}";
    }
}
