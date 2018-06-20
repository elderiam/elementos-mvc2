package org.unitec.elementosmvc2;

import org.springframework.data.annotation.Id;

import java.time.LocalDate;


//Es una clase entidad
public class Mensaje {

    @Id
    private String id;
    private String  cuerpo;
    private LocalDate fecha;

    @Override
    public String toString() { //Guarda una cadena el toString
        return "Mensaje{" +
                "id='" + id + '\'' +
                ", cuerpo='" + cuerpo + '\'' +
                ", fecha=" + fecha +
                '}';
    }

    public Mensaje(String id, String cuerpo, LocalDate fecha) { //Este es para hacer un UPDATE
        this.id = id;
        this.cuerpo = cuerpo;
        this.fecha = fecha;
    }

    public Mensaje(String cuerpo, LocalDate fecha) {
        this.cuerpo = cuerpo;
        this.fecha = fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Mensaje() {
    }

    public Mensaje(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

}
