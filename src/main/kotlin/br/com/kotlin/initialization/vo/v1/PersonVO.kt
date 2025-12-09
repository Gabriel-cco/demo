package br.com.kotlin.initialization.vo.v1

import com.fasterxml.jackson.annotation.JsonProperty

data class PersonVO (

    @JsonProperty("id")
    var id: Long = 0,
    
    @JsonProperty("firstName")
    var firstName: String = "",
    
    @JsonProperty("lastName")
    var lastName: String = "",
    
    @JsonProperty("address")
    var address: String = "",
    
    @JsonProperty("gender")
    var gender: String = ""
)