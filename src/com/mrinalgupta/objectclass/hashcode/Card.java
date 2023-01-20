package com.mrinalgupta.objectclass.hashcode;

public class Card {
    private String number;

    public Card(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        if( obj == null){
            return false;
        }
        if(obj instanceof Card c){
            return c.getNumber().equals(this.number);
        }
        return false;

    }

    @Override
    public int hashCode() {
        return 0;
    }
}
