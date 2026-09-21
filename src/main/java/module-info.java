module io.github.mryxel.cardgame {
    requires javafx.controls;
    requires javafx.fxml;

    opens io.github.mryxel.cardgame to javafx.fxml;
    exports io.github.mryxel.cardgame;
}
