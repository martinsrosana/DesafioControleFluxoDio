module controlefluxo.desafiocontrolefluxo {
    requires javafx.controls;
    requires javafx.fxml;


    opens controlefluxo.desafiocontrolefluxo to javafx.fxml;
    exports controlefluxo.desafiocontrolefluxo;
}