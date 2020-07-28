package controller;

import model.NoteType;
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
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "NodeTypeServlet", urlPatterns = "/noteTypes")
public class NodeTypeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private INoteTypeService iNoteTypeService;

    public void init() {
        iNoteTypeService = new NoteTypeServiceImpl();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                insertNoteType(request, response);
                break;
            case "edit":
                updateNoteType(request, response);
                break;
            default:
                response.sendRedirect("/noteTypes");
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
        NoteType noteType = iNoteTypeService.getById(id);
        request.setAttribute("noteType", noteType);
        RequestDispatcher dispatcher = request.getRequestDispatcher("note_type/edit.jsp");
        dispatcher.forward(request, response);
    }


    private void insertNoteType(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String des = request.getParameter("description");
        NoteType noteType = new NoteType(name, des);
        iNoteTypeService.save(noteType);
        response.sendRedirect("/noteTypes");
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("note_type/create.jsp");
        dispatcher.forward(request, response);
    }

    private void deleteNote(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        iNoteTypeService.deleteById(id);
        response.sendRedirect("/noteTypes");
    }

    private void listNote(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<NoteType> listNoteType = iNoteTypeService.getAll();
        request.setAttribute("listNoteType", listNoteType);
        RequestDispatcher dispatcher = request.getRequestDispatcher("note_type/list.jsp");
        dispatcher.forward(request, response);
    }

    private void updateNoteType(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String des = request.getParameter("description");
        NoteType noteType = new NoteType(id,name, des);
        iNoteTypeService.update(noteType);
        response.sendRedirect("/noteTypes");
    }
}
