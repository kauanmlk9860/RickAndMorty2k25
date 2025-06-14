package br.senai.sp.jandira.rickandmorty.service

import br.senai.sp.jandira.rickandmorty.model.Character
import br.senai.sp.jandira.rickandmorty.model.Result
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface CharacterService {

    @GET("character")
    fun lisALLCharacters(): Call<Result>

    @GET("character/{id}")
    fun getCharacterById(@Path("") id: Int): Call<Character>

    @POST("character")
    fun insert(@Body character: Character): Call<Character>


}
