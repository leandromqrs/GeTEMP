package GeTEMP;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class CPUController {
	@FXML
    private Button buttonCPU = new Button();
    @FXML
    private Button buttonBenchmark = new Button();
    @FXML
    private Pane paneButtonBenchmark = new Pane();
    
    @FXML
    private void buttonCPU_Action() {
        buttonCPU.setStyle("-fx-background-color: #2C313C");
    }
    
    @FXML
    private void buttonBenchmark_Action() {
        buttonBenchmark.setStyle("-fx-background-color: #2C313C");
        paneButtonBenchmark.setVisible(!paneButtonBenchmark.isVisible());
    }
    
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("MemoryInfo");
    }
}
