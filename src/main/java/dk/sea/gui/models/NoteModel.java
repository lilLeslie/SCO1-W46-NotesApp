package dk.sea.gui.models;

import dk.sea.bll.NotesManager;

import java.io.File;
import java.io.IOException;

public class NoteModel {
    NotesManager notesManager;

    public NoteModel(){
        notesManager = new NotesManager();
    }

    public String loadFile(File file) throws IOException {
        return notesManager.readFile(file);
    }

    public void saveFile(File file, String content){
        notesManager.writeToFile(file, content);
    }
}
