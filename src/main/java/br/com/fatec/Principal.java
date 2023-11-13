package br.com.fatec;

import br.com.fatec.DAO.CadastrarDAO;
import br.com.fatec.database.Database;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import br.com.fatec.model.Cadastrar;
import java.io.IOException;
import java.sql.SQLException;

/**
 * JavaFX Principal
 */
public class Principal extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("view/Cinetec_login"));
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Principal.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) throws SQLException {
<<<<<<< HEAD
     /* CadastrarDAO cadastrarDAO = new CadastrarDAO();
        Cadastrar dado = new Cadastrar();
        dado.setEmail("12345681");
        var value = cadastrarDAO.contaExiste(dado);
        System.out.println(value);
     */
=======
>>>>>>> 8497799d6139945c5be69900f141651ef0aa10aa
        launch();
    }

}