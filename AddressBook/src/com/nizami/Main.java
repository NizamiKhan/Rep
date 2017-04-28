package com.nizami;

import com.nizami.objects.Person;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.nizami.controllers.MainController;
import com.nizami.interfaces.impls.CollectionAddressBook;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader=new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("fxml/main.fxml"));
        Parent fxmlMain=fxmlLoader.load();
        MainController mainController=fxmlLoader.getController();
        mainController.setMainStage(primaryStage);

        primaryStage.setTitle("Адресная книга");
        primaryStage.setMinHeight(600);
        primaryStage.setMinWidth(450);
        primaryStage.setScene(new Scene(fxmlMain, 300, 275));
        primaryStage.show();
    }

    public void testData() {
        CollectionAddressBook addressBook = new CollectionAddressBook();

        Person person=new Person();
        person.setFio("Khanguseynov");
        person.setPhone("89506188130");

        Person person2=new Person();
        person2.setFio("Parshihin");
        person2.setPhone("88005553535");

        addressBook.add(person);
        addressBook.add(person2);

        person.setPhone("11111");
        addressBook.delete(person);

    }

    public static void main(String[] args) {
        launch(args);
    }
}
