package com.sinfloo.backend.Modelos;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "inspeccion")
public class Inspeccion implements Serializable{

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    @Column
    public String cliente;
    @Column
    public String product;
    @Column
    public String clave;
    @Column
    public String frecinsp;
    @Column
    public String tammuestra;
    @Column
    public String longespiral;
    @Column
    public String tiempo;
    @Column
    public String observaciones;
    @Column
    public String dminterior;
    @Column
    public String espesor;
    @Column
    public String colorbrillo;
    @Column
    public String jefeprod;
    @Column
    public String param1;
    @Column
    public String param2;
    @Column
    public String param3;
    @Column
    public String param4;
    @Column
    public String param5;
    @Column
    public String supturno;
    @Column
    public String nomaquina;
    @Column
    public String fecha;
    @Column
    public String turno;
    @Column
    public String hora;
    @Column
    public String longesp;
    @Column
    public String dmint;
    @Column
    public String espcalib;
    @Column
    public String paso;
    @Column
    public String colb;
    @Column
    public String timee;
    @Column
    public String zona1;
    @Column
    public String zona2;
    @Column
    public String zona3;
    @Column
    public String velextrusora;
    @Column
    public String veljalador;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getFrecInsp() {
        return frecinsp;
    }

    public void setFrecInsp(String frecInsp) {
        this.frecinsp = frecInsp;
    }

    public String getTamMuestra() {
        return tammuestra;
    }

    public void setTamMuestra(String tamMuestra) {
        this.tammuestra = tamMuestra;
    }

    public String getLongEspiral() {
        return longespiral;
    }

    public void setLongEspiral(String longEspiral) {
        this.longespiral = longEspiral;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getDmInterior() {
        return dminterior;
    }

    public void setDmInterior(String dmInterior) {
        this.dminterior = dmInterior;
    }

    public String getEspesor() {
        return espesor;
    }

    public void setEspesor(String espesor) {
        this.espesor = espesor;
    }

    public String getColorBrillo() {
        return colorbrillo;
    }

    public void setColorBrillo(String colorBrillo) {
        this.colorbrillo = colorBrillo;
    }

    public String getJefeProd() {
        return jefeprod;
    }

    public void setJefeProd(String jefeProd) {
        this.jefeprod = jefeProd;
    }

    public String getParam1() {
        return param1;
    }

    public void setParam1(String param1) {
        this.param1 = param1;
    }

    public String getParam2() {
        return param2;
    }

    public void setParam2(String param2) {
        this.param2 = param2;
    }

    public String getParam3() {
        return param3;
    }

    public void setParam3(String param3) {
        this.param3 = param3;
    }

    public String getParam4() {
        return param4;
    }

    public void setParam4(String param4) {
        this.param4 = param4;
    }

    public String getParam5() {
        return param5;
    }

    public void setParam5(String param5) {
        this.param5 = param5;
    }

    public String getSupTurno() {
        return supturno;
    }

    public void setSupTurno(String supTurno) {
        this.supturno = supTurno;
    }

    public String getNoMaquina() {
        return nomaquina;
    }

    public void setNoMaquina(String noMaquina) {
        this.nomaquina = noMaquina;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLongEsp() {
        return longesp;
    }

    public void setLongEsp(String longEsp) {
        this.longesp = longEsp;
    }

    public String getDmInt() {
        return dmint;
    }

    public void setDmInt(String dmInt) {
        this.dmint = dmInt;
    }

    public String getEspCalib() {
        return espcalib;
    }

    public void setEspCalib(String espCalib) {
        this.espcalib = espCalib;
    }

    public String getPaso() {
        return paso;
    }

    public void setPaso(String paso) {
        this.paso = paso;
    }

    public String getColBrillo() {
        return colb;
    }

    public void setColBrillo(String colBrillo) {
        this.colb = colBrillo;
    }

    public String getTime() {
        return timee;
    }

    public void setTime(String time) {
        this.timee = time;
    }

    public String getZona1() {
        return zona1;
    }

    public void setZona1(String zona1) {
        this.zona1 = zona1;
    }

    public String getZona2() {
        return zona2;
    }

    public void setZona2(String zona2) {
        this.zona2 = zona2;
    }

    public String getZona3() {
        return zona3;
    }

    public void setZona3(String zona3) {
        this.zona3 = zona3;
    }

    public String getVelExtrusora() {
        return velextrusora;
    }

    public void setVelExtrusora(String velExtrusora) {
        this.velextrusora = velExtrusora;
    }

    public String getVelJalador() {
        return veljalador;
    }

    public void setVelJalador(String velJalador) {
        this.veljalador = velJalador;
    }
}
