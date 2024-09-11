package com.ticketresellbase.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ticket_process")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class TicketProcess {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", columnDefinition = "nvarchar(50)", nullable = false)
    private String name;

    @Column(name = "is_deleted")
    private boolean isDeleted;
}
