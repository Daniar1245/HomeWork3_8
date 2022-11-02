package com.geektech.homework3_8

import java.io.Serializable

data class PersonType(val name: String? = null,
                      val status: String? = null,
                      val image: String? = null
) : Serializable
