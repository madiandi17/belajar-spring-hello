package com.wordpress.bmadi.belajar.spring.hello.domain;

public class Hello {

    private String pesan;

    public String getPesan() {
        System.out.println("Pesannya adalah : " + pesan);
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

}
