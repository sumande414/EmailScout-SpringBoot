package com.es.EmailScout.controllers;

import com.es.EmailScout.dto.MonitoredEmailDto;
import com.es.EmailScout.services.MonitoredEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/monitor-email/")
public class MonitoredEmailController {
    @Autowired
    private MonitoredEmailService monitoredEmailService;

    @PostMapping("/add-email")
    public ResponseEntity<MonitoredEmailDto> addEmail(@RequestBody MonitoredEmailDto monitoredEmailDto){
        return new ResponseEntity<>(monitoredEmailService.addMonitoredEmail(monitoredEmailDto), HttpStatus.CREATED);
    }
}
