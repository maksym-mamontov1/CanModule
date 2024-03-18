package com.can.module.presentation

import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.MutableStateFlow
import com.can.module.ui.state.ScreenState

abstract class BaseViewModel<S: ScreenState>(): CoroutineScope {

    private val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
        onError(throwable)
    }

    private val mutableStateFlow: MutableStateFlow = MutableStateFlow()
    val stateFlow: StateFlow
        get() = mutableStateFlow.asStateFlow()

    fun onError(throwable: Throwable) {
        //TODO
    }
}