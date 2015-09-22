package com.rads.todaytasks.model;

import android.annotation.SuppressLint;

import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by Rafael on 9/20/15.
 */

public class TodayTest {

    private Today today;

    @Before
    public void createInstance(){
        today = Today.getInstance();
    }

    @Test
    public void singletonTest(){
        assertNotNull(today);
    }

    @Test
    public void dayIsTodayTest(){
        Date day = today.getDay();
        Date currentDay = new Date();

        @SuppressLint("SimpleDateFormat")
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        assertEquals(true, sdf.format(day).equalsIgnoreCase(sdf.format(currentDay)));

    }

}
