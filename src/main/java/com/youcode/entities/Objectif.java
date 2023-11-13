package com.youcode.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Objectif {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;
    private String status;

//    @ManyToOne
//    @JoinColumn(name = "userId")
//    private User user;


//    @Override
//    public String toString() {
//        return "Objectif{" +
//                "id=" + id +
//                ", description='" + description + '\'' +
//                ", status='" + status + '\'' +
//                '}';
//    }
}
