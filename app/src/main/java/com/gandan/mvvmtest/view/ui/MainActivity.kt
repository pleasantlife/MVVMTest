package com.gandan.mvvmtest.view.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gandan.mvvmtest.R
import com.gandan.mvvmtest.service.DataRepository
import com.gandan.mvvmtest.service.DataRepository.Companion.getProjectList
import com.gandan.mvvmtest.service.DataRepository.Companion.service

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getProjectList("futurefly")

    }
}
