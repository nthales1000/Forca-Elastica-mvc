import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ForcaElasticaController {
    ForcaElasticaView forcaView;
    Stage stage;
    ForcaElastica forcaElastica;
    public TextField textFieldConstanteElastica;
    public TextField textFieldDeformacao;
    public Label labelResultado;

    public ForcaElasticaController() {
        this.stage = new Stage();
        this.forcaView = new ForcaElasticaView();
        this.forcaView.setController(this);
    }

    public void iniciar() throws Exception {
        this.forcaView.start(this.stage);
        this.stage.show();
    }

    public void botaoCalcularClicado(ActionEvent event) {
        try {
            double constanteElastica = Double.parseDouble(textFieldConstanteElastica.getText());
            double deformacao = Double.parseDouble(textFieldDeformacao.getText());
            ForcaElastica forcaElastica = new ForcaElastica(constanteElastica, deformacao);
            double resultado = forcaElastica.calcularForca();
            labelResultado.setText("A força elástica resultante é: " + resultado + " N");
        } catch (NumberFormatException exception) {
            labelResultado.setText("Dados de entrada incompletos ou inválidos");
        }
    }

    public void botaoLimparClicado(ActionEvent event) {
        textFieldConstanteElastica.setText("");
        textFieldDeformacao.setText("");
        labelResultado.setText("");
    }
}
