package com.gmail.albermargar9.Tema8.EjerciciosEntregar.Clientes;

public class Cliente {

    public String idCliente;
    public String nombreCompania;
    public String nombreContacto;
    public int antiguedad;
    public double facturacion;
    public String cargoContacto;
    public String direccion;
    public String ciudad;
    public String region;
    public String codigoPostal;
    public String pais;
    public String telefono;
    public String fax;

    public Cliente(String idCliente, String nombreCompania, String nombreContacto, int antiguedad, double facturacion, String cargoContacto, String direccion, String ciudad, String region, String codigoPostal, String pais, String telefono, String fax) {
        this.idCliente = idCliente;
        this.nombreCompania = nombreCompania;
        this.nombreContacto = nombreContacto;
        this.antiguedad = antiguedad;
        this.facturacion = facturacion;
        this.cargoContacto = cargoContacto;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.region = region;
        this.codigoPostal = codigoPostal;
        this.pais = pais;
        this.telefono = telefono;
        this.fax = fax;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCompania() {
        return nombreCompania;
    }

    public void setNombreCompania(String nombreCompania) {
        this.nombreCompania = nombreCompania;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public double getFacturacion() {
        return facturacion;
    }

    public void setFacturacion(double facturacion) {
        this.facturacion = facturacion;
    }

    public String getCargoContacto() {
        return cargoContacto;
    }

    public void setCargoContacto(String cargoContacto) {
        this.cargoContacto = cargoContacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String objetoAString() {
        return idCliente + ";" + nombreCompania + ";" + nombreContacto + ";" +
                antiguedad + ";" + facturacion + ";" + cargoContacto + ";" +
                direccion + ";" + ciudad + ";" + region + ";" +
                codigoPostal + ";" + pais + ";" + telefono + ";" + fax;
    }
}
