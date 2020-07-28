package services;

import model.Note;

import java.util.List;

public interface INoteService extends IRepository<Note> {
    List<Note> searchNote(String searchWord);
}
