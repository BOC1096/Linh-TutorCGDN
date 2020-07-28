package controller;

import model.Note;
import model.NoteType;
import services.INoteService;
import services.INoteTypeService;
import services.impl.NoteServiceImpl;
import services.impl.NoteTypeServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "NoteServlet", urlPatterns = "/notes")
public class NoteServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private INoteTypeService iNoteTypeService;
    private INoteService noteService;
    public void init() {
        noteService = new NoteServiceImpl();
        iNoteTypeService = new NoteTypeServiceImpl();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                insertNote(request, response);
                break;
            case "edit":
                updateNote(request, response);
                break;
            default:
                response.sendRedirect("/notes");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "create":
                showNewForm(request, response);
                break;
            case "edit":
                showEditForm(request, response);
                break;
            case "delete":
                deleteNote(request, response);
                break;
            default:
                listNote(request, response);
                break;
        }
    }


    private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Note note = noteService.getById(id);
        request.setAttribute("note", note);
        List<NoteType> noteTypes = iNoteTypeService.getAll();
        request.setAttribute("noteTypes",noteTypes);
        RequestDispatcher dispatcher = request.getRequestDispatcher("notes/edit.jsp");
        dispatcher.forward(request, response);
    }


    private void insertNote(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        int type_id = Integer.parseInt(request.getParameter("type_id"));
        NoteType noteType = iNoteTypeService.getById(type_id);
        Note note = new Note(title, content,noteType);
        noteService.save(note);
        response.sendRedirect("/notes");
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("notes/create.jsp");
        List<NoteType> noteTypes = iNoteTypeService.getAll();
        request.setAttribute("noteTypes",noteTypes);
        dispatcher.forward(request, response);
    }

    private void deleteNote(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        noteService.deleteById(id);
        response.sendRedirect("/notes");
    }

    private void listNote(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String search = request.getParameter("search");
        List<Note> noteList;
        if (search != null) {
            noteList = noteService.searchNote(search);
            request.setAttribute("listNotes", noteList);
        }else {
            noteList = noteService.getAll();
            request.setAttribute("listNotes", noteList);
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("notes/list.jsp");
        dispatcher.forward(request, response);
    }

    private void updateNote(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        int type_id = Integer.parseInt(request.getParameter("type_id"));
        NoteType noteType = iNoteTypeService.getById(type_id);
        Note note = new Note(id,title, content,noteType);
        noteService.update(note);
        response.sendRedirect("/notes");
    }
}
