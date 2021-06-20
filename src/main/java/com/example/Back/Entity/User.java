package com.example.Back.Entity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class User {
    @GeneratedValue
    @Id
    private Integer userid;
    private String name;
    private String surrname;
    private String dayofbirth;
    private String sex;
    private String country;
    private String state;
    private String address;

    @OneToMany
    private List<Comment> comments;

}
