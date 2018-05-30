package org.unitec.elementosmvc2;

import org.springframework.data.annotation.Id;

import java.time.LocalDate;

public class Mensaje {

    @Id
    private String id;
    private String  cuerpo;
    private LocalDate fecha;

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
