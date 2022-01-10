package com.tinashe.notesapp.repository;

import com.tinashe.notesapp.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
