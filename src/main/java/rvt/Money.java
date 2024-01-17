package rvt;

public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "."  + cents + "e";
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
    
        
        return newMoney;
    }

    public Money minus(Money decreaser) {
        Money newMoney = new Money(this.euros - decreaser.euros, this.cents - decreaser.cents);
    
        
        return newMoney;
    }

    public boolean lessThan(Money compared){
        if (this.euros + this.cents < compared.euros + compared.cents){
            return true;
        } else{
            return false;
        }
    }
    
}