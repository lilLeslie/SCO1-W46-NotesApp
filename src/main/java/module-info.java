module dk.sea.notesapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.sea.notesapp to javafx.fxml;
    exports dk.sea.notesapp;
}