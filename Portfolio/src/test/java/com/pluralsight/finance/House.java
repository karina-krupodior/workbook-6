package com.pluralsight.finance;

public class House extends FixedAsset {
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    public House(String name, int yearBuilt, int squareFeet, int bedrooms) {
        super(name, squareFeet * 200);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    @Override
    public double getValue() {
        return squareFeet * 200;
    }
}

//Did the deposit work for both accounts? Why or why not?
//What methods are available for account1?
//What methods are available for account2?
//Why?

//WHY DOES account2.deposit(100) FAIL?
// 💡 It’s about reference type
//account1 is declared as BankAccount, so all BankAccount methods are available, including deposit().
//account2 is declared as Valuable. That interface only has getValue(), so you can’t call deposit() on it — even though it's actually a BankAccount.
//🔍 Think of it like this:
//Valuable v = new BankAccount(...);
// v.deposit(100);  // ❌ Compiler only sees Valuable methods
//🧪 What methods are available?
//Variable	Declared Type	Methods You Can Call
//account1	BankAccount	deposit(), withdraw(), getValue()
//account2	Valuable	getValue() only
//✅ At runtime account2 is a BankAccount, but the compiler only looks at its declared type: Valuable.
//✅ Final Takeaway
//The key lesson here is:
//The type of the variable (not the object) determines what methods are available at compile time.
//If you want to access deposit() on account2, you'd need to cast it:
//((BankAccount) account2).deposit(100);
