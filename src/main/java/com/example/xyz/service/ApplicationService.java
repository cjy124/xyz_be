package com.example.xyz.service;

import com.example.xyz.dao.ApplicationDao;
import com.example.xyz.model.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService
{
    private final ApplicationDao appDao;

    @Autowired
    public ApplicationService(@Qualifier("MockDAO") ApplicationDao appDao )
    {
        this.appDao = appDao;
    }

    public boolean addApplication( Application inApp )
    {
        return appDao.addApplication( inApp );
    }

    public List<Application> getAllApplications()
    {
        return appDao.getAllApplications();
    }
}
