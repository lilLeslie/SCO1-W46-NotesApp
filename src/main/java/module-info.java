module dk.sea.gui {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.sea.gui to javafx.fxml;
    exports dk.sea.gui;
    exports dk.sea.gui.controllers;
    opens dk.sea.gui.controllers to javafx.fxml;
}