package br.com.alexf.ceepws.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Note(@Id
           @GeneratedValue
           val id: Long = 0L,
           val title: String = "",
           val description: String = "")