/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.condominiovalhalla;

/**
 *
 * @author dzuniga
 */
public class qp {
    private String filial, codigo, placa;
    private boolean estado;

    public String getFilial() {
        return filial;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getPlaca() {
        return placa;
    }

    public boolean isEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public qp(String filial, String codigo, String placa, boolean estado) {
        this.filial = filial;
        if (verificaCodigo(codigo)){
            this.codigo = codigo;
        }
        this.placa = placa;
        this.estado = estado;
    }
    private boolean verificaCodigo(String codigo){
        return codigo.matches("^101\\d{7}$");
    }

    public void agregar(String filial, String codigo, String placa){
        
    
    }
    
}
