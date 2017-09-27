package br.com.alexf.ceepws.repository

import br.com.alexf.ceepws.model.Note
import org.springframework.data.repository.CrudRepository

interface NoteRepository : CrudRepository<Note, Long>