public class Main {
    public static void main(String[] args) {
        Portfolio myPortfolio = new Portfolio("My assets","Karina");
            Jewelry ring = new Jewelry("Gold Ring",50, 18);
            House apartment = new House("apartment", 2022,2000, 4);
            Gold bar = new Gold(50,"Gold Bar", 10);

            BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(5000);

        CreditCard creditCard = new CreditCard();
        creditCard.charge(200);
        creditCard.pay(1000);

        myPortfolio.add(ring);
        myPortfolio.add(apartment);
        myPortfolio.add(bar);
        myPortfolio.add(bankAccount);
        myPortfolio.add(creditCard);

        System.out.println("Total Portfolio Value: $" + myPortfolio.getValue());

        }
    }

