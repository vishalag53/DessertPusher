package com.vishalag53.dessertpusher

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import android.os.Handler
import androidx.lifecycle.OnLifecycleEvent
import timber.log.Timber

@Suppress("DEPRECATION")
class DessertTimer(lifecycle: Lifecycle) : LifecycleObserver {
    var secondsCount = 0

    private var handler = Handler();
    private lateinit var runnable: Runnable

    init {
        lifecycle.addObserver(this)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun startTimer() {
        runnable = Runnable {
            secondsCount++
            Timber.i("Timer is at : $secondsCount")

            handler.postDelayed(runnable, 1000)
        }

        handler.postDelayed(runnable, 1000)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun stopTimer() {
        handler.removeCallbacks(runnable)
    }
}