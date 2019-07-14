package org.greenstand.android.TreeTracker.viewmodels

import android.content.Context
import androidx.lifecycle.MutableLiveData
import org.greenstand.android.TreeTracker.managers.UserLocationManager
import org.greenstand.android.TreeTracker.managers.UserManager
import org.greenstand.android.TreeTracker.usecases.CreateTreeParams
import org.greenstand.android.TreeTracker.usecases.CreateTreeUseCase
import org.greenstand.android.TreeTracker.usecases.ExpireCheckInStatusUseCase
import org.greenstand.android.TreeTracker.usecases.ValidateCheckInStatusUseCase
import org.greenstand.android.TreeTracker.utilities.ImageUtils

class MapViewModel constructor(private val validateCheckInStatusUseCase: ValidateCheckInStatusUseCase,
                               private val expireCheckInStatusUseCase: ExpireCheckInStatusUseCase,
                               private val createTreeUseCase: CreateTreeUseCase,
                               private val userLocationManager: UserLocationManager,
                               private val context: Context,
                               private val userManager: UserManager) : CoroutineViewModel() {

    val checkInStatusLiveData = MutableLiveData<Boolean>()

    suspend fun checkForValidUser() {
        if (validateCheckInStatusUseCase.execute(Unit)) {
            checkInStatusLiveData.postValue(true)
        } else {
            expireCheckInStatusUseCase.execute(Unit)
            checkInStatusLiveData.postValue(false)
        }
    }

    fun getPlanterName(): String {
        return userManager.firstName + " " + userManager.lastName
    }

    suspend fun createFakeTrees(): Boolean {
        userLocationManager.currentLocation ?: return false

        val planterCheckInId = -1

        for (i in 0..499) {

            val file = ImageUtils.createImageFile(context)

            val createTreeParams = CreateTreeParams(
                planterCheckInId = planterCheckInId.toLong(),
                photoPath = file.absolutePath,
                content = "My Note"
            )

            createTreeUseCase.execute(createTreeParams)
        }
        return true
    }

}