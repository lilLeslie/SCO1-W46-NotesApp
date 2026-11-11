package dk.sea.gui.controllers;

import dk.sea.gui.models.NoteModel;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

/**
 * Controller class for NotesApp.
 */
public class NotesController {
    @FXML
    private TextArea textArea;
    @FXML
    private Label statusLabel;

    private File currentFile;  // Tracks the currently open/saved file

    private NoteModel noteModel;

    public NotesController(){
        noteModel = new NoteModel();
    }

    /** Called when user clicks "New". */
    @FXML
    private void handleNew() {
        textArea.clear();
        currentFile = null;
        statusLabel.setText("New note");
    }

    /** Called when user clicks "Open". */
    @FXML
    private void handleOpen() throws IOException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open File");
        File file = fileChooser.showOpenDialog(new Stage());
        if (file == null) return;
        currentFile = file;
        textArea.setText(noteModel.loadFile(currentFile));
        statusLabel.setText("Opened: " + file.getName());
    }

    /** Called when user clicks "Save". */
    @FXML
    private void handleSave() throws IOException {
        if (currentFile == null) {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Save File");
            currentFile = fileChooser.showSaveDialog(new Stage());
        }
        if (currentFile == null) return;
        String content = textArea.getText();
        noteModel.saveFile(currentFile, content);
        statusLabel.setText("Saved: " + currentFile.getName());
    }
}