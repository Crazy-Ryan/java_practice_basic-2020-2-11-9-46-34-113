package com.thoughtworks;

public enum Suit {
    CLUB("黑桃"),
    HEART("红桃"),
    DIAMOND("梅花"),
    SPADE("方片");

    private String nameCN;

    Suit(String nameCN){
        this.nameCN = nameCN;
    }

    public String getNameCN() {
        return nameCN;
    }
}
