package com.es.EmailScout.entities;

import com.es.EmailScout.auth.entities.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    @NotBlank(message = "Field cant be blank")
    private String sender;

    @Column(nullable = false)
    @NotBlank(message = "Field cant be blank")
    private String receiver;

    @Column(nullable = false)
    @NotBlank(message = "Field cant be blank")
    private Instant date;

    @Column(nullable = false)
    @NotBlank(message = "Field cant be blank")
    private String subject;

    @Column(nullable = false)
    @NotBlank(message = "Field cant be blank")
    private String text;

    @ManyToOne
    @JoinColumn(name="user_userId", nullable = false)
    private User user;
}
