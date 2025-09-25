package be.ecam.basics.exercises;

import java.util.Objects;

public class Account {
    // Double manque de précision
    // private double balance;
    // solde stocké en centimes (entier exact)
    private long balanceCents;

    public Account() {
        this(0.0);
    }

    public Account(double initial) {
        if (initial < 0) throw new IllegalArgumentException("Initial balance cannot be negative");
        // this.balance = initial;
        this.balanceCents = toCents(initial);
    }

    public double getBalance() {
        // return balance;
        return fromCents(balanceCents);
    }

    public void deposit(double amount) {
        long cents = toCents(amount);
        if (cents < 0) throw new IllegalArgumentException("Deposit amount cannot be negative");
        // balance += amount;
        balanceCents += cents;
    }

    public void withdraw(double amount) {
        long cents = toCents(amount);
        if (cents < 0) throw new IllegalArgumentException("Withdrawal amount cannot be negative");
        // if (amount > balance) throw new IllegalStateException("insufficient");
        // balance -= amount;
        if (cents > balanceCents) throw new IllegalStateException("Insufficient balance");
        balanceCents -= cents;
    }

    public void transferTo(Account other, double amount) {
        Objects.requireNonNull(other, "Target account cannot be null");
        withdraw(amount);
        other.deposit(amount);
    }

    // Conversion double en centimes exacts
    private long toCents(double amount) {
        return Math.round(amount * 100);
    }

    // Conversion centimes en double
    private double fromCents(long cents) {
        return cents / 100.0;
    }
}
