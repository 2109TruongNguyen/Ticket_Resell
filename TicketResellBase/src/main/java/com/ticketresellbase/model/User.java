package com.ticketresellbase.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "seller")
    private List<Tickets> ticketsSold;

    @OneToMany(mappedBy = "buyer")
    private List<Tickets> ticketsBought;

    @OneToMany(mappedBy = "staff")
    private List<Tickets> staffCheck;
}
