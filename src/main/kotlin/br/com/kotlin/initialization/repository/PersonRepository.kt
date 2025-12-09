package br.com.kotlin.initialization.repository

import br.com.kotlin.initialization.domain.Person
import org.springframework.data.jpa.repository.JpaRepository

interface PersonRepository : JpaRepository<Person, Long?> {
}