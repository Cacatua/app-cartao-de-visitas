package com.kktua.businesscard

import android.app.Application
import com.kktua.businesscard.data.AppDatabase
import com.kktua.businesscard.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}