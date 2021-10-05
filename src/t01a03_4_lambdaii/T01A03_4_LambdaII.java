/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t01a03_4_lambdaii;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/**
 *
 * @author jose
 */
public class T01A03_4_LambdaII extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Declaramos el campo de texto
        Text texto = new Text("Programming is fun");
        
        // Creamos funcion lambda que recoge el evento de arrastrar el texto pulsando el boton izquierdo del raton
        texto.setOnMouseDragged(e -> {
            if(e.isPrimaryButtonDown())
            {
                // Asignamos posicion X al texto, la cual va a ser la posicion X del raton (posicion del evento [e])
                texto.setX(e.getX());
                // Asignamos posicion Y al texto, la cual va a ser la posicion Y del raton (posicion del evento [e])
                texto.setY(e.getY());
            }
        });
        
        // Declaramos el nodo raiz de tipo Pane, para que nos deje libertad al mover el texto (si ponemos por ejemplo un StackPane, al mover el texto
        //dará saltos ya que se mueve continuamente al centro y a la posicion del raton
        Pane root = new Pane();
        // Añadimos el texto al nodo raiz
        root.getChildren().add(texto);
        
        // Creamos la escena donde su nodo hijo sera root y tendrá las dimensiones especificadas 500 de ancho y 200 de alto
        Scene scene = new Scene(root, 500, 200);
        
        // Le damos la posicion inicial centrada al texto
        texto.setX((scene.getWidth() / 2) - (texto.getText().length() * 3.5));
        texto.setY(scene.getHeight() / 2);
        
        // Le damos titulo a la ventana (al stage)
        primaryStage.setTitle("MouseEvent Lambda");
        // Asignamos la escena al stage (escenario) principal
        primaryStage.setScene(scene);
        // Mostramos la escena primaria (principal)
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
