package com.example.template.ui.splash


import android.content.Context
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.cyberslabs.bandsbuddy.utils.helpers.SingleLiveEvent
import com.example.template.data.DataManager
import com.example.template.di.qualifiers.AppContext
import com.example.template.ui.base.BaseViewModel
import com.example.template.utils.scheduler.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import kotlinx.coroutines.*
import java.lang.Exception
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class SplashViewModel @Inject constructor(@AppContext appContext: Context, dataManager: DataManager, schedulerProvider: SchedulerProvider,compositeDisposable: CompositeDisposable, coroutineJob: CompletableJob)
    : BaseViewModel(appContext,dataManager,schedulerProvider,compositeDisposable, coroutineJob) {

    var navigateToNextScreen = SingleLiveEvent<Any>()
    var a = 0


     fun loadData() = GlobalScope.async (Dispatchers.Main) {
         try {
             val task1 = async(Dispatchers.IO) { delay(3000) }
             val task2 = async(Dispatchers.IO) { delay(2000) }
             val task3 = async(Dispatchers.IO) { delay(1000) }
             awaitAll(task1, task2, task3)
             navigateToNextScreen.call()
         } catch (e: Exception) {
             handleError(e)
         }
     }

}