package com.abnamro.apps.referenceandroid.tests

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.abnamro.apps.referenceandroid.MainActivity
import com.abnamro.apps.referenceandroid.screens.HomeScreen
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class InteractionTest : TestCase() {

    @get:Rule
    var rule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun checkHomeScreen() = run {
        step("Verify elements in Home Screen") {
            HomeScreen {
                verifyHomeScreen()
            }
        }
    }

    @Test
    fun checkSnackBar() = run {
        step("Verify text displayed on Floating Button click") {
            HomeScreen {
                verifyTextInSnackbar()
            }
        }
    }

    @Test
    fun checkToolbar() = run {
        step("Verify settings button in Toolbar") {
            HomeScreen {
                checkSettingsInToolBar()
            }
        }
    }

}
