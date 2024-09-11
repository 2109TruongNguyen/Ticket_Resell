package com.ticketresellbase.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "policy")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Policy {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", columnDefinition = "nvarchar(MAX)")
    private String content;

    private Integer fee;

    @Column(name = "is_deleted")
    private boolean isDeleted;

    @ManyToOne
    @JoinColumn(name = "type_policy_id")
    private TypePolicy typePolicy;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "policy")
    private List<Tickets> ticketsList;
}
