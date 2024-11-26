module org.example.chatapp_p2p {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;
    requires com.jfoenix;
    requires controlsfx;
    requires webcam.capture;
    requires fontawesomefx;
    requires javafx.base;
    requires javafx.graphics;
    requires javafx.swing;
    requires javafx.media;

    opens org.example.chatapp_p2p.Model to javafx.base;
    opens org.example.chatapp_p2p.Interfaces to javafx.fxml;
    exports org.example.chatapp_p2p.Interfaces;

//    opens com.ca.chatappcs4.Model to javafx.base;
//    opens com.ca.chatappcs4.Interfaces to javafx.fxml;
//    exports com.ca.chatappcs4.Interfaces;
}