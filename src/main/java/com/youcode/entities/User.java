package com.youcode.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "userId")
    private Integer id;
    private String name;
    private String avatar;

//    @OneToMany(mappedBy = "user")
//    private List<Objectif> objectifs = new ArrayList<>();
//    public List<Objectif> getObjectifs() {
//        return Collections.unmodifiableList(objectifs);
//    }
//    public void addObjectif(Objectif objectif){
//        objectifs.add(objectif);
//    }
//    public void addObjectif(Objectif objectif) {
//        if (this.objectifs == null) {
//            this.objectifs = new ArrayList<>();
//        }
//        this.objectifs.add(objectif);
//    }


//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", avatar='" + avatar + '\'' +
//                '}';
//    }
}
