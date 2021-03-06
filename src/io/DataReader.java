package io;

import model.BankAccount;
import model.User;

import java.util.Scanner;

public class DataReader {
private Scanner input = new Scanner(System.in);
private NumberGenerator numberGenerator = new NumberGenerator();
private ConsolePrinter printer;

public DataReader(ConsolePrinter printer){
    this.printer = printer;
}

public String getString(){
    return input.nextLine();
}

    public int getInt() {
        try {
            return input.nextInt();
        } finally {
            input.nextLine();
        }
    }

public void close(){
    input.close();
}
public User readAndCreateClient(){
    printer.printLine("Podaj imię: ");
    String name = input.nextLine();
    printer.printLine("Podaj nazwisko: ");
    String lastName = input.nextLine();
    printer.printLine("Podaj pesel: ");
    String pesel =  input.nextLine();
    printer.printLine("Podaj login: ");
    String login = input.nextLine();
    printer.printLine("Podaj hasło");
    String password = input.nextLine();

    return new User(name, lastName, pesel, login, password);
}

//public BankAccount readAndCreateBankAccount(){
//    printer.printLine("Generowanie unikalnego numeru konta...");
//  //  String accountNumber = generateUniqueNumber(); //TODO-stworzyć w NumberGenerator (ma przyjąć listę aktualnych numerów kont i na jej podstawie wygnerować nową)
//   // printer.printLine("Unikalny nume konta to: " + accountNumber);
//    printer.printLine("Podaj ile pieniędzy powinno być na koncie: ");
//    String moneyInAccount = input.nextLine();
//    printer.printLine("Generowanie losowego numeru pin...");
//    String pin = numberGenerator.generate4DigitPin();
//    printer.printLine("Pin to: " + pin);
//
//    return new BankAccount( moneyInAccount, pin);
////TODO Dwie najtrudniejsze rzeczy: połączyć numery kont z użytkownikami, dodać import i export do pliku csv/json,
//}
}
