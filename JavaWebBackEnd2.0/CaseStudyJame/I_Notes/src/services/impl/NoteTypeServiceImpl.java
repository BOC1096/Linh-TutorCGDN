package services.impl;

import model.NoteType;
import services.INoteTypeService;
import ultil.MySQLConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NoteTypeServiceImpl implements INoteTypeService {
    private MySQLConnection db = new MySQLConnection();

    public NoteTypeServiceImpl() {
    }

    @Override
    public List<NoteType> getAll() {
        List<NoteType> listNode = new ArrayList<>();
        String query = "Select * from note_type";
        try {
            ResultSet rs = db.query(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                NoteType noteType = new NoteType(id, name, description);
                listNode.add(noteType);
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
    public NoteType getById(int id) {
        NoteType noteType = null;
        String query = "Select * from note_type where id = " + id;
        try {
            ResultSet rs = db.query(query);
            while (rs.next()) {
                String name = rs.getString("name");
                String desciption = rs.getString("description");
                noteType = new NoteType(id, name, desciption);
            }
            return noteType;
        } catch (SQLException e) {
            e.printStackTrace();
            return noteType;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean update(NoteType noteType) {
        String query = "Update note_type set name = '" + noteType.getName()
                + "',description = '" + noteType.getDescription()
                + "' where id = " + noteType.getId();
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
        String query = "Delete FROM note_type where id = " + id;
        boolean rowDelete = false;
        try {
            rowDelete = db.execute(query);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowDelete;
    }

    @Override
    public boolean save(NoteType noteType) {
        String query = "Insert into note_type(name,description) values ('" + noteType.getName() + "','" + noteType.getDescription() + "')";
        try {
            db.execute(query);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        NoteTypeServiceImpl noteTypeService = new NoteTypeServiceImpl();
        noteTypeService.update(new NoteType(2,"Cong viec 2","Test Update"));

    }

}
