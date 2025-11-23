module edu.ma.westfield.horrorcharactergui {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens edu.ma.westfield.horrorcharactergui to javafx.fxml;
    exports edu.ma.westfield.horrorcharactergui;
}