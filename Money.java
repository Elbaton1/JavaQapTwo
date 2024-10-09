public class Money {
    private long dollars;
    private long cents;

    
    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = Math.round((amount - dollars) * 100);
    }

    
    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    
    public Money add(Money other) {
        long newCents = this.cents + other.cents;
        long newDollars = this.dollars + other.dollars + (newCents / 100);
        newCents %= 100;
        return new Money(newDollars + newCents / 100.0);
    }

    
    public Money subtract(Money other) {
        long newCents = this.cents - other.cents;
        long newDollars = this.dollars - other.dollars;
        if (newCents < 0) {
            newCents += 100;
            newDollars--;
        }
        return new Money(newDollars + newCents / 100.0);
    }

    
    public int compareTo(Money other) {
        if (this.dollars > other.dollars) {
            return 1;
        } else if (this.dollars < other.dollars) {
            return -1;
        } else {
            if (this.cents > other.cents) {
                return 1;
            } else if (this.cents < other.cents) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    
    @Override
    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }
}
