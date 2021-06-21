package com.example.Back.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class MedicalClient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String surrname;
    private String dayofbirth;
    private String country;
    private String state;
    private String address;
    private String sex;
//    private String age;

    //bi-directional (inverse-end)
    @OneToMany(mappedBy = "medicalClient",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List <Comment> comments;

    public void addcomment (final Comment newcomment){
        comments.add(newcomment);
    }

    public Integer getId() {
        return id;
    }

    public MedicalClient(String name, String surrname, String dayofbirth, String country, String state, String address, String sex, List<Comment> comments) {
        this.name = name;
        this.surrname = surrname;
        this.dayofbirth = dayofbirth;
        this.country = country;
        this.state = state;
        this.address = address;
        this.sex = sex;
        this.comments = comments;
    }

    public String getDayofbirth() {
        return dayofbirth;
    }

    public void setDayofbirth(String dayofbirth) {
        this.dayofbirth = dayofbirth;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        state = state;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurrname() {
        return surrname;
    }

    public void setSurrname(String surrname) {
        this.surrname = surrname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        if(comments!= null){
            comments.forEach(a->{
                a.setMedicalClient(this);
                    });
        }
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "MedicalClient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surrname='" + surrname + '\'' +
                ", dayofbirth='" + dayofbirth + '\'' +
                ", Country='" + country + '\'' +
                ", State='" + state + '\'' +
                ", Address='" + address + '\'' +
                ", sex='" + sex + '\'' +
                ", comments=" + comments +
                '}';
    }
}

