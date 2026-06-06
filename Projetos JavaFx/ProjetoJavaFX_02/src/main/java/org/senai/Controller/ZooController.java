package org.senai.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import org.senai.Model.*;

import java.util.ArrayList;

public class ZooController {

    //Mapeamento dos elementos do arquivo Fxml
    @FXML
    ComboBox<String> cmbTipo;
    @FXML
    TextField txtNome;
    @FXML
    TextField txtIdade;
    @FXML
    ListView<Animal> lstAnimais;
    @FXML
    ListView<String> lstSons;
    @FXML
    TextArea txtSaida;

    ObservableList<Animal> listaAnimais = FXCollections.observableArrayList();


    @FXML
    void initialize(){

        //Criar uma lista de tipos de animais para o combobox
        ArrayList<String> tipos = new ArrayList<>();
        tipos.add("Cachorro");
        tipos.add("Gato");
        tipos.add("Vaca");
        tipos.add("Macaco");

        //Adicionar  alista de tipos ao combibox

        cmbTipo.setItems(javafx.collections.FXCollections.observableArrayList(tipos));

        //Definir o valor inicial do Combobox
        cmbTipo.getSelectionModel().selectFirst();

        lstAnimais.setItems(listaAnimais);
    }
    Animal animal;

    public void onAdicionar(ActionEvent actionEvent) {
        String nome = txtNome.getText();
        int idade = Integer.parseInt(txtIdade.getText());
        String tipo = cmbTipo.getValue();

        if(tipo.equals("Cachorro")){
            animal = new Cachorro(nome, idade);
            listaAnimais.add(animal);
        } else if(tipo.equals("Gato")){
            animal = new Gato(nome, idade);
            listaAnimais.add(animal);
        } else if (tipo.equals("Vaca")) {
            animal = new Vaca(nome, idade);
            listaAnimais.add(animal);

        } else if (tipo.equals("Macaco")){
            animal = new Macaco(nome, idade);
            listaAnimais.add(animal);

        }
    }
    public void onEmitirSom(ActionEvent actionEvent) {
        Animal selecionado = lstAnimais.getSelectionModel().getSelectedItem();

        // Retorna um ternario, se o que for selecionado na lstAnimais nao for nulo
        String tipo = (selecionado != null) ? selecionado.getClass().getSimpleName(): cmbTipo.getValue();

        if (tipo == null) return;

        //Saida da TextArea
        txtSaida.appendText(tipo + " emitiu som!\n");

        String nomeArquivo = tipo.toLowerCase() + ".mp3";
        var url = getClass().getResource("/org/senai/Sons/" + nomeArquivo);
        if (url != null) {
            Media media = new Media(url.toExternalForm());
            MediaPlayer player = new MediaPlayer(media);
            player.play();
        }
    }
}
