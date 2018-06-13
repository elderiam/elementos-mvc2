package org.unitec.elementosmvc2;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author GrobbierElder
 */
@SpringUI
public class MiUI extends UI{

    //1er paso: Poner como atributo el repo
    @Autowired RepositorioMensaje repoMensa;

    @Override
    protected void init(VaadinRequest request) {

        VerticalLayout layout = new VerticalLayout();
        Label etiqueta = new Label("Bienvenido a mi aplicacion de Java 3");
        etiqueta.addStyleName(ValoTheme.LABEL_H2);

        TextField texto = new TextField();
        texto.setPlaceholder("Cuerpo del Mensaje");
        Button boton = new Button("Guardar Mensaje");
        boton.addStyleName(ValoTheme.BUTTON_DANGER);

        //Caso 1: GUARDAR

        //Manejamos el evento de tipo boton
        boton.addClickListener(algo->{
            String cuerpo=  texto.getValue();
            //Guardamos
                repoMensa.save(new Mensaje(cuerpo));
             // Le comunicamos al usario con un mensajito que se guardo
            Notification.show("Mensaje Guardado",Notification.Type.ERROR_MESSAGE);
        }
        );

        //Caso 2: Mostrar los registros en Vadin

        Grid<Mensaje> grid = new Grid<>();
        grid.setItems(repoMensa.findAll());

        grid.addColumn(Mensaje::getId).setCaption("Id");
        grid.addColumn(Mensaje::getCuerpo).setCaption("Cuerpo");


        //Agregamos la etiqueta y el boton a el layout
        layout.addComponent(etiqueta);
        layout.addComponent(texto);
        layout.addComponent(boton);

        //Agregamos dicha componente a nuestro layout
        layout.addComponent(grid);

        //Finalmente agregamos el layout al contenedor principal de init
        setContent(layout);
    }

}
