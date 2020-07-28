package services.impl;

import model.Note;
import model.NoteType;
import services.INoteService;
import services.INoteTypeService;
import ultil.MySQLConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NoteServiceImpl implements INoteService {

    private MySQLConnection db = new MySQLConnection();
    INoteTypeService noteTypeService = new NoteTypeServiceImpl();
    @Override
    public List<Note> getAll() {
        List<Note> listNode = new ArrayList<>();
        String query = "Select * from note";
        try {
            ResultSet rs = db.query(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String content = rs.getString("content");
                int type_id = rs.getInt("type_id");
                NoteType noteType = noteTypeService.getById(type_id);
                Note note = new Note(id,title,content,noteType);
                listNode.add(note);
            }
            return listNode;
        } catch (SQLException e) {
            e.printStackTrace();
            return listNode;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Note getById(int id) {
        Note note = null;
        String query = "Select * from note where id = " + id;
        try {
            ResultSet rs = db.query(query);
            while (rs.next()) {
                String title = rs.getString("title");
                String content = rs.getString("content");
                int type_id = rs.getInt("type_id");
                NoteType noteType = noteTypeService.getById(type_id);
                note = new Note(id, title,content,noteType);
            }
            return note;
        } catch (SQLException e) {
            e.printStackTrace();
            return note;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean update(Note note) {
        String query = "Update note set title = '" + note.getTitle()
                + "',content = '" + note.getContent()
                + "',type_id = '" + note.getNoteType().getId()
                + "' where id = " + note.getId();
        System.out.println(query);
        try {
            boolean rowUpdate = db.executeUpdate(query);
            return rowUpdate;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        String query = "Delete FROM note where id = " + id;
        boolean rowDelete = false;
        try {
            rowDelete = db.execute(query);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowDelete;
    }

    @Override
    public boolean save(Note note) {
        String query = "Insert into note(title,content,type_id) values ('"
                + note.getTitle() + "','"
                + note.getContent() + "','"
                + note.getNoteType().getId() + "')";
        try {
            db.execute(query);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }



    public static void main(String[] args) {
        INoteTypeService noteTypeService = new NoteTypeServiceImpl();
        INoteService iNoteService = new NoteServiceImpl();
        Note note = new Note(2,"Test Update","Test Update", noteTypeService.getById(2));
        iNoteService.update(note);
    }

    @Override
    public List<Note> searchNote(String searchWord) {
        List<Note> listNode = new ArrayList<>();
        String query = "Select * from note where title like '%" + searchWord +"%'";
        try {
            ResultSet rs = db.query(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String content = rs.getString("content");
                int type_id = rs.getInt("type_id");
                NoteType noteType = noteTypeService.getById(type_id);
                Note note = new Note(id,title,content,noteType);
                listNode.add(note);
            }
            return listNode;
        } catch (SQLException e) {
            e.printStackTrace();
            return listNode;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
