package com.es.EmailScout.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MonitoredEmailDto {
    @NotBlank(message = "Field cant be blank")
    private String email;

    @NotBlank(message = "Field cant be blank")
    private String password;
}
