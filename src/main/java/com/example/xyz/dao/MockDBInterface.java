package com.example.xyz.dao;

import com.example.xyz.model.Application;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("MockDAO")
public class MockDBInterface implements ApplicationDao
{
    static private List<Application> store = new ArrayList<>();

    @Override
    public boolean addApplication( UUID id, Application inApp )
    {
        inApp.setId( id.toString() );
        store.add( inApp );

        return true;
    }

    @Override
    public List<Application> getAllApplications()
    {
        return store;
    }
}
