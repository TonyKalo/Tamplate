package com.example.template.ui.login


import android.content.Context
import com.example.template.data.DataManager
import com.example.template.di.qualifiers.AppContext
import com.example.template.ui.base.BaseViewModel
import com.example.template.utils.scheduler.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

class LoginViewModel @Inject constructor(@AppContext appContext: Context, dataManager: DataManager, schedulerProvider: SchedulerProvider, compositeDisposable: CompositeDisposable)
    : BaseViewModel(appContext,dataManager,schedulerProvider,compositeDisposable) {

}