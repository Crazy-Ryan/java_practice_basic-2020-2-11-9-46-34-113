package com.thoughtworks;

public enum CardSuit {
    CLUB("梅花"),
    HEART("红桃"),
    DIAMOND("方片"),
    SPADE("黑桃");

    private String nameCN;

    CardSuit(String nameCN){
        this.nameCN = nameCN;
    }

    public String getNameCN() {
        return nameCN;
    }
}
