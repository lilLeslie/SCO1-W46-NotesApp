package dk.sea.gui.models;

import dk.sea.bll.NotesManager;

import java.io.File;
import java.util.List;

public class NoteModel {
    NotesManager notesManager;

    public NoteModel(){
        notesManager = new NotesManager();
    }

    public String loadFile(File file){
        StringBuilder content = new StringBuilder();
        List<String> data = notesManager.readFile(file);
        for (String line : data){
            content.append(line).append("\n");
        }
        return content.toString();
    }
}
