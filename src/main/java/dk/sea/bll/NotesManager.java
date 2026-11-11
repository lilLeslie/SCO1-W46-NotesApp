package dk.sea.bll;

import dk.sea.dal.NoteDAO;

import java.io.File;
import java.nio.file.Path;
import java.util.List;

public class NotesManager {
    private NoteDAO noteDAO;

    public NotesManager(){
        noteDAO = new NoteDAO();
    }

    public List<String> readFile(File file){
        return noteDAO.readFile(file);
    }

}
