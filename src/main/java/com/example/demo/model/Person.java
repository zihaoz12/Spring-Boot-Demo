package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class Person {
    private final UUID id;
    @NotBlank
    private final String firstName;
    private final String lastName;
    private final int rollNum;
    private final String email;
    private final int mobileNum;

    public Person(@JsonProperty("id") UUID id,
                  @JsonProperty("firstName") String firstName,
                  @JsonProperty("lastName") String lastName,
                  @JsonProperty("rollNum") int rollNum,
                  @JsonProperty("email") String email,
                  @JsonProperty("mobileNum") int mobileNum
                  ){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.rollNum = rollNum;
        this.email = email;
        this.mobileNum = mobileNum;
    }

    public UUID getId(){
        return id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getRollNum(){
        return rollNum;
    }

    public String getEmail(){
        return email;
    }

    public int getMobileNum(){ return mobileNum; }

}
