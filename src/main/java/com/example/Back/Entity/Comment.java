package com.example.Back.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String commentary;
    private String dayofadditing;

    //bi-directional (owner)
    @ManyToOne(fetch = FetchType.EAGER, cascade = {
            CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH
    })
    @JoinColumn(name = "medicalclient_id")
    private MedicalClient medicalClient;


    public Integer getId() {
        return id;
    }


    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    public String getDayofadditing() {
        return dayofadditing;
    }

    public void setDayofadditing(String dayofadditing) {
        this.dayofadditing = dayofadditing;
    }

    public MedicalClient getMedicalClient() {
        return medicalClient;
    }

    public void setMedicalClient(MedicalClient medicalClient) {
        this.medicalClient = medicalClient;
    }


}
