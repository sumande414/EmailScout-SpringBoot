package com.es.EmailScout.entities;

import com.es.EmailScout.auth.entities.User;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MonitoredEmail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="user_userId", nullable = false)
    private User user;

    @Column(nullable = false)
    private String monitoredEmail;

    @Column(nullable = false)
    private String appPassword;
}
