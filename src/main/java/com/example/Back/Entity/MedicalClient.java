package com.example.Back.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class MedicalClient {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String surrname;
    private String sex;

    //bi-directional (inverse-end)
    @OneToMany(mappedBy = "medicalClient",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List <Comment> comments;

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
                ", sex='" + sex + '\'' +
                ", comments=" + comments +
                '}';
    }
}

