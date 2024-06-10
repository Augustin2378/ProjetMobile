package fr.epf.projet_Nadiedjoa_Andreani

import retrofit2.http.GET
import retrofit2.http.Path

interface RestCountryApi {
        @GET("countries")
        suspend fun getAllCountries(): List<Country>

        @GET("/name/{name}")
        suspend fun getCountryByName(@Path("name") name: String): List<Country>
}
