package br.senai.sp.jandira.rickandmorty.model

import android.hardware.biometrics.BiometricManager.Strings

data class Character(
    var id: Int = 0,
    var name: String = "",
    var status: String = "",
    var species: String = "",
    var image: String = ""
)

