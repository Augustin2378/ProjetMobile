package fr.epf.projet_Nadiedjoa_Andreani

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class CountryViewModelFactory(private val context: Context, private val restCountryApi: RestCountryApi) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CountryViewModel::class.java)) {
            return CountryViewModel(context, restCountryApi) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
