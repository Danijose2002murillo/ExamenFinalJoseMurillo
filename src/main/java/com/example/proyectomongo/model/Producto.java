package com.example.proyectomongo.model;

public class Producto {

    public int id;
    public int id_factura;
    public int cod_prooducto;
    public String producto;
    public int cantidad;
    public double precio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public int getCod_prooducto() {
        return cod_prooducto;
    }

    public void setCod_prooducto(int cod_prooducto) {
        this.cod_prooducto = cod_prooducto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
