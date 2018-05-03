package br.com.alexf.ceepws.service

import br.com.alexf.ceepws.model.Note
import br.com.alexf.ceepws.repository.NoteRepository
import org.springframework.stereotype.Component

@Component
class NoteService(
        private val noteRepository: NoteRepository) {

    fun all(): List<Note> {
        return noteRepository.findAll().toList()
    }

    fun deleteById(id: Long) {
        noteRepository.deleteById(id)
    }

    fun existsById(id: Long): Boolean {
        return noteRepository.existsById(id)
    }

    fun save(note: Note): Note {
        return noteRepository.save(note)
    }

    fun alter(id: Long, note: Note): Note {
        var safeNote = note.copy(id = id)
        return save(safeNote)
    }

}