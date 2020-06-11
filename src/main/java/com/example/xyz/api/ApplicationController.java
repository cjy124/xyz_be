package com.example.xyz.api;

import com.example.xyz.model.Application;
import com.example.xyz.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/application")
@RestController
public class ApplicationController
{
    private final ApplicationService appService;

    @Autowired
    public ApplicationController( ApplicationService appService )
    {
        this.appService = appService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping
    public void addApplication(@RequestBody Application inApp )
    {
        System.out.println( inApp.getCoyName() );
        appService.addApplication( inApp );
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public List<Application> getAllApplications()
    {
        return appService.getAllApplications();
    }
}
