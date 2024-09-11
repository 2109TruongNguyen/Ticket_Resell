package com.ticketresellbase.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;


@Entity
@Table(name = "tickets")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Tickets {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ticket_name", columnDefinition = "nvarchar(128)", nullable = false)
    private String ticketName;

    @Column(name = "expired_date_time", nullable = false)
    private Date expiredDateTime;

    @Column(name = "price", nullable = false)
    private Long price;

    @Column(name = "sale_percent")
    private Double salePercent;

    @Column(name = "area", columnDefinition = "nvarchar(128)")
    private String area;

    @Lob
    @Column(name = "image", columnDefinition = "varbinary(MAX)")
    private byte[] image;

    @Column(name = "description", columnDefinition = "nvarchar(1024)")
    private String description;

    @Column(name = "link_event", columnDefinition = "nvarchar(512)")
    private String linkEvent;

    @Column(name = "is_checked")
    private boolean isChecked;

    @Column(name = "is_bought")
    private boolean isBought;

    @Column(name = "is_paper")
    private boolean isPaper;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Categories category;

    @ManyToOne
    @JoinColumn(name = "event_id", nullable = false)
    private Events event;

    @ManyToOne
    @JoinColumn(name = "payment_method_id")
    private PaymentMethod paymentMethod;

    @OneToOne
    @JoinColumn(name = "ticket_process_id")
    private TicketProcess ticketProcess;

    @ManyToOne
    @JoinColumn(name = "policy_id")
    private Policy policy;

    @ManyToMany
    @JoinTable(
            name = "ticket_hashtags",
            joinColumns = {@JoinColumn(name = "ticket_id")},
            inverseJoinColumns = {@JoinColumn(name = "hashtag_id")}
    )
    private List<Hashtags> hashtagsList;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private User seller;

    @ManyToOne
    @JoinColumn(name = "buyer_id")
    private User buyer;

    @ManyToOne
    @JoinColumn(name = "staff_id")
    private User staff;
}
