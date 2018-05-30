package org.unitec.elementosmvc2;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;

/**
 *
 * @author GrobbierElder
 */
@SpringUI
public class MiUI extends UI{

    @Override
    protected void init(VaadinRequest request) {

        VerticalLayout layout = new VerticalLayout();
        Label etiqueta = new Label("Bienvenido a mi aplicacion de Java 3");
        etiqueta.addStyleName(ValoTheme.LABEL_H2);

        TextField texto = new TextField();
        texto.setPlaceholder("Cuerpo del Mensaje");
        Button boton = new Button("Guardar Mensaje");
        boton.addStyleName(ValoTheme.BUTTON_DANGER);
        //Agregamos la etiqueta y el boton a el layout
        layout.addComponent(etiqueta);
        layout.addComponent(texto);
        layout.addComponent(boton);

        //Finalmente agregamos el layout al contenedor principal de init
        setContent(layout);
    }

}
