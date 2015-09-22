package com.rads.today;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TodayActivityFragment extends Fragment {

    public TodayActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        loadTasks();

        return inflater.inflate(R.layout.fragment_today, container, false);
    }

    private void loadTasks() {

    }
}
