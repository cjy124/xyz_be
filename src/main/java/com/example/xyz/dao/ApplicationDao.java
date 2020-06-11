package com.example.xyz.dao;

import com.example.xyz.model.Application;

import java.util.List;
import java.util.UUID;

public interface ApplicationDao
{
    boolean addApplication( UUID id, Application inApp );

    default boolean addApplication( Application inApp )
    {
        UUID id = UUID.randomUUID();
        return addApplication( id, inApp );
    }

    List<Application> getAllApplications();
}
