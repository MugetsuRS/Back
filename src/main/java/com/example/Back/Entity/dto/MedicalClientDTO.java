package com.example.Back.Entity.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
public class MedicalClientDTO {
    private String name;
    private String surrname;
    private String dayofbirth;
    private String country;
    private String state;
    private String address;
    private String sex;
    private List<CommentsDTO> comments;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurrname(String surrname) {
        this.surrname = surrname;
    }

    public void setDayofbirth(String dayofbirth) {
        this.dayofbirth = dayofbirth;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setComments(List<CommentsDTO> comments) {
        this.comments = comments;
    }
}
