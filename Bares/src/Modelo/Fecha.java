/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Yessica-
 */
public class Fecha {
private int dia;
private int mez;
private int año;
private FechaHora fh;

    public Fecha(int dia, int mez, int año, FechaHora fh) {
        this.dia = dia;
        this.mez = mez;
        this.año = año;
        this.fh = fh;
    }

    public Fecha(FechaHora fh) {
        this.fh = fh;
    }

    public Fecha(int dia, int mez, int año) {
        this.dia = dia;
        this.mez = mez;
        this.año = año;
    }


    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMez() {
        return mez;
    }

    public void setMez(int mez) {
        this.mez = mez;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public FechaHora getFh() {
        return fh;
    }

    public void setFh(FechaHora fh) {
        this.fh = fh;
    }

    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mez=" + mez + ", a\u00f1o=" + año + ", fh=" + fh + '}';
    }



}
