package com.barriodigital.demo.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "report_events")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReportEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String eventId;

    private Long requestId;
    private String oldStatus;
    private String newStatus;
    private String citizenId;
    private LocalDateTime createdAt;
}