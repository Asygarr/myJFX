module com.asygar.myjfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.asygar.myjfx to javafx.fxml;
    exports com.asygar.myjfx;
    exports com.asygar.myjfx.tes;
    opens com.asygar.myjfx.tes to javafx.fxml;
}