package dk.sea.bll;

import dk.sea.dal.NoteDAO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class NotesManager {
    private NoteDAO noteDAO;

    public NotesManager(){
        noteDAO = new NoteDAO();
    }

    public String readFile(File file) throws IOException {
        StringBuilder sb = new StringBuilder();
        List<String> data = noteDAO.readFile(file.toPath());
        for (String line : data){
            sb.append(line).append("\n");
        }
        return sb.toString();
    }

    public void writeToFile(File file, String content){
        List<String> data = Arrays.stream(content.split("\n")).toList();
        noteDAO.writeToFile(file.toPath(), data);
    }

}
