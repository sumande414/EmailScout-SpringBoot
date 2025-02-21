package com.es.EmailScout.services;

import com.es.EmailScout.dto.MonitoredEmailDto;
import com.es.EmailScout.entities.MonitoredEmail;
import com.es.EmailScout.repositories.MonitoredEmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class MonitoredEmailService {

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private MonitoredEmailRepository monitoredEmailRepository;

    public MonitoredEmailDto addMonitoredEmail(MonitoredEmailDto monitoredEmailDto){
        var monitoredEmail = MonitoredEmail.builder()
                .monitoredEmail(monitoredEmailDto.getEmail())
                .appPassword(passwordEncoder.encode(monitoredEmailDto.getPassword()))
                .user(userService.getCurrentUser())
                .build();
        MonitoredEmail savedMonitoredEmail = monitoredEmailRepository.save(monitoredEmail);
        return new MonitoredEmailDto(
                savedMonitoredEmail.getMonitoredEmail(),
                savedMonitoredEmail.getAppPassword()
        );
    }

}
