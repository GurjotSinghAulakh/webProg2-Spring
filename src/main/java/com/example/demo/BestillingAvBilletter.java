package com.example.demo;

public class BestillingAvBilletter {
    private String Film;
    private String AntallBilletter;
    private String Fornavn;
    private String Etternavn;
    private String TelefonNo;
    private String Epost;

    public BestillingAvBilletter(String film, String antallBilletter, String fornavn, String etternavn, String telefonNo, String epost) {
        Film = film;
        AntallBilletter = antallBilletter;
        Fornavn = fornavn;
        Etternavn = etternavn;
        TelefonNo = telefonNo;
        Epost = epost;
    }

    public String getFilm() {
        return Film;
    }

    public void setFilm(String film) {
        Film = film;
    }

    public String getAntallBilletter() {
        return AntallBilletter;
    }

    public void setAntallBilletter(String antallBilletter) {
        AntallBilletter = antallBilletter;
    }

    public String getFornavn() {
        return Fornavn;
    }

    public void setFornavn(String fornavn) {
        Fornavn = fornavn;
    }

    public String getEtternavn() {
        return Etternavn;
    }

    public void setEtternavn(String etternavn) {
        Etternavn = etternavn;
    }

    public String getTelefonNo() {
        return TelefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        TelefonNo = telefonNo;
    }

    public String getEpost() {
        return Epost;
    }

    public void setEpost(String epost) {
        Epost = epost;
    }
}
