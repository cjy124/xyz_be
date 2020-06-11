package com.example.xyz.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Application
{
    private final String coyName;
    private final String coyAdd;
    private final String appName;
    private final String appContact;
    private final String appEmail;
    private final String empName;
    private final String empIC;
    private final String empPP;
    private final String empOrigin;
    private final String empDest;
    private final String empTStart;
    private final String empTEnd;
    private String appStatus;
    private String cost;
    private String id;

    public Application( @JsonProperty( "coyName" ) String coyName,
                        @JsonProperty( "coyAdd" ) String coyAdd,
                        @JsonProperty( "appName" ) String appName,
                        @JsonProperty( "appContact" ) String appContact,
                        @JsonProperty( "appEmail" ) String appEmail,
                        @JsonProperty( "empName" ) String empName,
                        @JsonProperty( "empIC" ) String empIC,
                        @JsonProperty( "empPP" ) String empPP,
                        @JsonProperty( "empOrigin" ) String empOrigin,
                        @JsonProperty( "empDest" ) String empDest,
                        @JsonProperty( "empTStart" ) String empTStart,
                        @JsonProperty( "empTEnd" ) String empTEnd )
    {
        this.coyName = coyName;
        this.coyAdd = coyAdd;
        this.appName = appName;
        this.appContact = appContact;
        this.appEmail = appEmail;
        this.empName = empName;
        this.empIC = empIC;
        this.empPP = empPP;
        this.empOrigin = empOrigin;
        this.empDest = empDest;
        this.empTStart = empTStart;
        this.empTEnd = empTEnd;
        this.appStatus = "Pending";
        this.cost = "";
    }

    public String getCoyName()
    {
        return coyName;
    }

    public String getCoyAdd()
    {
        return coyAdd;
    }

    public String getAppName()
    {
        return appName;
    }

    public String getAppContact()
    {
        return appContact;
    }

    public String getAppEmail()
    {
        return appEmail;
    }

    public String getEmpName()
    {
        return empName;
    }

    public String getEmpIC()
    {
        return empIC;
    }

    public String getEmpPP()
    {
        return empPP;
    }

    public String getEmpOrigin()
    {
        return empOrigin;
    }

    public String getEmpDest()
    {
        return empDest;
    }

    public String getEmpTStart()
    {
        return empTStart;
    }

    public String getEmpTEnd()
    {
        return empTEnd;
    }

    public String getAppStatus()
    {
        return appStatus;
    }

    public String getCost()
    {
        return cost;
    }

    public String getId()
    {
        return id;
    }

    public void setId( String id )
    {
        this.id = id;
    }
}