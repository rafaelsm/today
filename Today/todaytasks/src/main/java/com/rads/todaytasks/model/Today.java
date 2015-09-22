package com.rads.todaytasks.model;

import java.util.Date;
import java.util.List;

/**
 * Created by Rafael on 9/20/15.
 */

public class Today {

    private Date day;
    private List<Task> tasks;

    private static Today instance = null;
    private Today(){
        day = new Date();
    }

    public static Today getInstance() {
        if (instance == null){
            instance = new Today();
        }

        return instance;
    }

    public Date getDay() {
        return day;
    }
}
