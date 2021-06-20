package com.example.Back.Entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Comment {
    @GeneratedValue
    @Id
    private Integer commentid;
    private String commentary;
    private String dayofadditing;

    @ManyToOne
    @JoinTable(
            name = "user_common",
            joinColumns = @JoinColumn(name = "commentid"),
            inverseJoinColumns = @JoinColumn(name = "userid"))
    private User user;
}
