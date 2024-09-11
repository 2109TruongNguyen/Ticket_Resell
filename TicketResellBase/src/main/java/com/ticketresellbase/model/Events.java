package com.ticketresellbase.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "events")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Events {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", columnDefinition = "nvarchar(256)", nullable = false)
    private String name;

    @Lob
    @Column(name = "image", columnDefinition = "varbinary(MAX)")
    private byte[] image;

    @Column(name = "start_date", nullable = false)
    private Date startDate;

    @Column(name = "end_date", nullable = false)
    private Date endDate;

    @Column(name = "details", columnDefinition = "nvarchar(1024)")
    private String details;

    @Column(name = "is_deleted")
    private boolean isDeleted;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "event")
    private List<Tickets> ticketsList;
}
