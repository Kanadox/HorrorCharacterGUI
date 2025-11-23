module edu.ma.westfield.horrorcharactergui {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.media;


    opens edu.ma.westfield.horrorcharactergui to javafx.fxml;
    exports edu.ma.westfield.horrorcharactergui;
}