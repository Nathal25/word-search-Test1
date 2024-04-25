module com.example.wordsearchtest1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.wordsearchtest1 to javafx.fxml;
    exports com.example.wordsearchtest1;
}