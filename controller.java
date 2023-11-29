import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

	//En esta parte declaramos las clases que vamos a usar que son el TextField, Label, Button y yo añadí un segundo Label.
    @FXML
    private TextField usernameInput;

    @FXML
    private Label greetingLabelito;

    @FXML
    private Button greetButton;

    @FXML
    private Label greetingLabel;

    //Se añade la acción que se crea en SceneBuilder para cuando el botón es pulsado.
    @FXML
    void oneclick(ActionEvent event) {
        // Hacemos un Scanner para que guarde el nombre puesto en usernameInput (en el textfield)
        String nombre = usernameInput.getText();

        // Verificamos si el TextField esta vacío o tiene algo escrito.
        if (!nombre.isEmpty()) {
            // En caso de haber escrito algo en el TextField, lo muestra con un "Hola y lo que se haya escrito".
            greetingLabel.setText("¡Hola, " + nombre + "!");
        } else {
            // En el caso de que lo dejemos vacío saltará un mensaje indicando que se necesita ingresar un nombre.
            greetingLabel.setText("Por favor, ingresa un nombre.");
        }
    }
}
