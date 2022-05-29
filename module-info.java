module com.example.movies {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.movies to javafx.fxml;
    exports com.example.movies;
}