package com.gaur.mviexampleyt

import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.*

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val  activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun testActivity(){
        Assert.assertEquals(true,activityScenarioRule)
    }
}