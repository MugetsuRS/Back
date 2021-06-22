package com.example.Back.Entity;
import lombok.*;
import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class MedicalClient {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @OneToMany(mappedBy = "medicalClient", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Comment> comments;

    public Integer getId() {
        return id;
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
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
        if (comments != null) {
            comments.forEach(a -> {
                a.setMedicalClient(this);
            });
        }
        this.comments = comments;
    }

//    public void addcomment(final Comment newcomment) {
//        comments.add(newcomment);
//    }



}

