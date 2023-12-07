module com.example.ui_chat {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ui_chat to javafx.fxml;
    exports com.example.ui_chat;
}