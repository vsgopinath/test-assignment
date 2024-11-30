package com.abnamro.apps.referenceandroid.screens

import com.abnamro.apps.referenceandroid.MainActivityFragment
import com.abnamro.apps.referenceandroid.R
import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.common.views.KView
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView
import io.github.kakaocup.kakao.toolbar.KToolbar

object HomeScreen : KScreen<HomeScreen>() {
    override val layoutId: Int? = R.layout.activity_main
    override val viewClass: Class<MainActivityFragment>? = MainActivityFragment::class.java

    val bodyText = KTextView {
        containsText("Hello World")
    }

    val toolbar = KToolbar {
        withId(R.id.toolbar)
    }

    val floatingButton = KButton {
        withId(R.id.fab)
    }

    fun verifyHomeScreen() {
        bodyText {
            isDisplayed()
        }
        toolbar {
            isDisplayed()
        }
        floatingButton {
            isDisplayed()
        }
    }

    fun verifyTextInSnackbar() {
        floatingButton {
            isDisplayed()
            click()
        }
        KTextView {
            withText(R.string.snackbar)
            isDisplayed()
        }
    }

    fun checkSettingsInToolBar() {
        toolbar {
            isDisplayed()
        }
       val menuButton =  KView {
            withContentDescription("More options")
        }
        menuButton {
            click()
        }
        KTextView {
            withText("Settings")
            isDisplayed()
        }
    }
}