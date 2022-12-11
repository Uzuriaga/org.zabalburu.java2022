/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu;

import java.util.Objects;

/**
 *
 * @author daw1
 */
public class Envio {

    private static int numEnvios;

    private Integer id;
    private String destinatario;
    private String remitente;
    private double peso;
    private int tipoEnvio = Envio.ENVIO_NORMAL;

    private final static int ENVIO_NORMAL = 1;
    private final static int ENVIO_EXPRESS = 2;
    private final static int ENVIO_24HORAS = 3;
    private final static int ENVIO_8HORAS = 4;

    public Envio() {
        Envio.numEnvios++;
        this.id = Envio.numEnvios;
    }

    public Envio(Integer id, String destinatario, String remitente, int peso) {
        this();
        this.id = id;
        this.destinatario = destinatario;
        this.remitente = remitente;
        this.peso = peso;
    }

    public Integer getId() {
        return id;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTipo() {
        return tipoEnvio;
    }

    public void setTipo(int tipo) {
        switch (this.tipoEnvio) {
            case ENVIO_NORMAL:
            case ENVIO_EXPRESS:
            case ENVIO_24HORAS:
            case ENVIO_8HORAS:

                break;
            default:
                this.tipoEnvio = 1;
        }
    }

    public String getDescripcionTipo() {

        switch (this.tipoEnvio) {

            case Envio.ENVIO_EXPRESS:
                return "Express";
            case Envio.ENVIO_24HORAS:
                return "24 Horas";
            case Envio.ENVIO_8HORAS:
                return "8 Horas";
            default:
                return "Normal";
        }
    }

    public double getCosteBase() {
        double costeBase;
        switch (this.tipoEnvio) {

            case ENVIO_EXPRESS:
                costeBase = 10;
                break;
            case ENVIO_24HORAS:
                costeBase = 12;
                break;
            case ENVIO_8HORAS:
                costeBase = 15;
                break;
            default:
                costeBase = 7;
        }
        return costeBase;
    }

    public double getCoste200() {
        double coste200;
        switch (this.tipoEnvio) {

            case ENVIO_EXPRESS:
                coste200 = 0.50;
                break;
            case ENVIO_24HORAS:
                coste200 = 0.70;
                break;
            case ENVIO_8HORAS:
                coste200 = 0.80;
                break;
            default:
                coste200 = 0.90;
        }
        return coste200;
    }

    //Es decir, un paquete de 4.500 g enviado por modalidad Express costaría 10 € 
    //fijos más 16,1 € por el peso (4500 / 200 ⇒22,5 ⇒ 23 * 0,7 ⇒ 16,1 € 
    public double getCostePeso() {
        return Math.ceil(this.peso / 200) * getCoste200();
    }

    public double getCoste() {

        double coste;
        coste = getCosteBase() + getCostePeso();
        return coste;
    }

//Compare to
    public int copareTo(Envio otro) {
        if (this.getCoste() > otro.getCoste()) {
            return 1;
        } else if (this.getCoste() == otro.getCoste()) {
            return 0;
        } else {
            return -1;
        }
        
        //return (int) (this.getCoste()- otro.getCoste());
        
    }

    //Comparar remitente
   //public boolean mismoRemitente(Envio o){
        public boolean mismoRemitente(Envio uno,Envio dos){
            if ( uno.getRemitente().equalsIgnoreCase(dos.remitente)) {
                return true;
            } else {
                return false;
            }
            //return uno.getRemitente().equalsIgnoreCase(dos.remitente));
        }
    
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Envio other = (Envio) obj;
        return Objects.equals(this.id, other.id);
    }

    //Coste con descuento
    public double descuento() {
        double descuento = 0;
        if (this.getCoste() < 50) {
            descuento = getCoste() + 0;
        } else if (this.getCoste() >= 50 && this.getCoste() <= 100) {
            descuento = getCoste() - ((0.3) * getCoste());
        } else {
            descuento = getCoste() - ((0.5) * getCoste());
        }
        return descuento;
    }

}
