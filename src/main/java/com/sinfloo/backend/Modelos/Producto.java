package com.sinfloo.backend.Modelos;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "producto")
public class Producto implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String cliente;
    @Column
    private String fecha;
    @Column
    private String nooperacion;
    @Column
    private String pedido;
    @Column
    private String refsae;
    @Column
    private String producto;
    @Column
    private String color;
    @Column
    private String pigmentado;
    @Column
    private String sae;
    @Column
    private String cantidad;
    @Column
    private String clave;
    @Column
    private String factorconversion;
    @Column
    private String piezas;
    @Column
    private String caja;
    @Column
    private String bolsa;
    @Column
    private String claveempaque;
    @Column
    private String observaciones;
    @Column
    private String descripcion;
    @Column
    private String cantinsumos;
    @Column
    private String cantarrmaquina;
    @Column
    private String descarrmaquina;
    @Column
    private String cantproduccion;
    @Column
    private String descproduccion;
    @Column
    private String canttotalmatprima;
    @Column
    private String desctotalmatprima;
    @Column
    private String observacionesgral;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the nooperacion
     */
    public String getNooperacion() {
        return nooperacion;
    }

    /**
     * @param nooperacion the nooperacion to set
     */
    public void setNooperacion(String nooperacion) {
        this.nooperacion = nooperacion;
    }

    /**
     * @return the pedido
     */
    public String getPedido() {
        return pedido;
    }

    /**
     * @param pedido the pedido to set
     */
    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    /**
     * @return the refsae
     */
    public String getRefsae() {
        return refsae;
    }

    /**
     * @param refsae the refsae to set
     */
    public void setRefsae(String refsae) {
        this.refsae = refsae;
    }

    /**
     * @return the producto
     */
    public String getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the pigmentado
     */
    public String getPigmentado() {
        return pigmentado;
    }

    /**
     * @param pigmentado the pigmentado to set
     */
    public void setPigmentado(String pigmentado) {
        this.pigmentado = pigmentado;
    }

    /**
     * @return the sae
     */
    public String getSae() {
        return sae;
    }

    /**
     * @param sae the sae to set
     */
    public void setSae(String sae) {
        this.sae = sae;
    }

    /**
     * @return the cantidad
     */
    public String getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * @return the factorconversion
     */
    public String getFactorconversion() {
        return factorconversion;
    }

    /**
     * @param factorconversion the factorconversion to set
     */
    public void setFactorconversion(String factorconversion) {
        this.factorconversion = factorconversion;
    }

    /**
     * @return the piezas
     */
    public String getPiezas() {
        return piezas;
    }

    /**
     * @param piezas the piezas to set
     */
    public void setPiezas(String piezas) {
        this.piezas = piezas;
    }

    /**
     * @return the caja
     */
    public String getCaja() {
        return caja;
    }

    /**
     * @param caja the caja to set
     */
    public void setCaja(String caja) {
        this.caja = caja;
    }

    /**
     * @return the bolsa
     */
    public String getBolsa() {
        return bolsa;
    }

    /**
     * @param bolsa the bolsa to set
     */
    public void setBolsa(String bolsa) {
        this.bolsa = bolsa;
    }

    /**
     * @return the claveempaque
     */
    public String getClaveempaque() {
        return claveempaque;
    }

    /**
     * @param claveempaque the claveempaque to set
     */
    public void setClaveempaque(String claveempaque) {
        this.claveempaque = claveempaque;
    }

    /**
     * @return the observaciones
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * @param observaciones the observaciones to set
     */
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the cantinsumos
     */
    public String getCantinsumos() {
        return cantinsumos;
    }

    /**
     * @param cantinsumos the cantinsumos to set
     */
    public void setCantinsumos(String cantinsumos) {
        this.cantinsumos = cantinsumos;
    }

    /**
     * @return the cantarrmaquina
     */
    public String getCantarrmaquina() {
        return cantarrmaquina;
    }

    /**
     * @param cantarrmaquina the cantarrmaquina to set
     */
    public void setCantarrmaquina(String cantarrmaquina) {
        this.cantarrmaquina = cantarrmaquina;
    }

    /**
     * @return the descarrmaquina
     */
    public String getDescarrmaquina() {
        return descarrmaquina;
    }

    /**
     * @param descarrmaquina the descarrmaquina to set
     */
    public void setDescarrmaquina(String descarrmaquina) {
        this.descarrmaquina = descarrmaquina;
    }

    /**
     * @return the cantproduccion
     */
    public String getCantproduccion() {
        return cantproduccion;
    }

    /**
     * @param cantproduccion the cantproduccion to set
     */
    public void setCantproduccion(String cantproduccion) {
        this.cantproduccion = cantproduccion;
    }

    /**
     * @return the descproduccion
     */
    public String getDescproduccion() {
        return descproduccion;
    }

    /**
     * @param descproduccion the descproduccion to set
     */
    public void setDescproduccion(String descproduccion) {
        this.descproduccion = descproduccion;
    }

    /**
     * @return the canttotalmatprima
     */
    public String getCanttotalmatprima() {
        return canttotalmatprima;
    }

    /**
     * @param canttotalmatprima the canttotalmatprima to set
     */
    public void setCanttotalmatprima(String canttotalmatprima) {
        this.canttotalmatprima = canttotalmatprima;
    }

    /**
     * @return the desctotalmatprima
     */
    public String getDesctotalmatprima() {
        return desctotalmatprima;
    }

    /**
     * @param desctotalmatprima the desctotalmatprima to set
     */
    public void setDesctotalmatprima(String desctotalmatprima) {
        this.desctotalmatprima = desctotalmatprima;
    }

    /**
     * @return the observacionesgral
     */
    public String getObservacionesgral() {
        return observacionesgral;
    }

    /**
     * @param observacionesgral the observacionesgral to set
     */
    public void setObservacionesgral(String observacionesgral) {
        this.observacionesgral = observacionesgral;
    }

}
