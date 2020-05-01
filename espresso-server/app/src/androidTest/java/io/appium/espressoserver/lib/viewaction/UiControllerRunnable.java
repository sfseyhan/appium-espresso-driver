package io.appium.espressoserver.lib.viewaction;

import androidx.test.espresso.UiController;
import io.appium.espressoserver.lib.handlers.exceptions.AppiumException;

public interface UiControllerRunnable<T> {

    T run(UiController uiController) throws AppiumException;

}
