package app;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import io.ConsolePrinter;
public class AppControl {
    private final ConsolePrinter printer = new ConsolePrinter();

    public void mainLoop() {
    MainOption mainOption;
    do{
        printMainOption();
        mainOption = getMainOption();
        switch (mainOption){
            case EXIT:
                break;
            case TERMINAL:
                adminLoop();
                break;
            case USER_LOGIN:
                userLoop();
                break;
        }
    } while(mainOption != MainOption.EXIT);
    }

    public void adminLoop() {

    }

    public void userLoop() {
        OptionForUser option;
        do {
            printOptions();
            option = getOption();
            switch (option) {
                case EXIT:
                    break;
                case DO_TRANSFER:
                    break;
                case CHECK_ACCOUNT:
                    break;
                case DEPOSIT_MONEY:
                    break;
                case WITHDRAW_MONEY:
                    break;
            }
        } while (option != OptionForUser.EXIT);
    }

    //wypisanie opcji dla usera
    private void printOptions() {
        for (OptionForUser option : OptionForUser.values())
            System.out.println(option);
    }

    //wypisanie opcji dla mainLoop
    private void printMainOption() {
        for (MainOption mainOption : MainOption.values())
            System.out.println(mainOption);
    }

    private MainOption getMainOption () {
        boolean optionOk = false;
        MainOption optionMain = null;
        while (!optionOk) {
            try {
                optionMain = OptionForUser.createFrotmInt(dataReader.getInt());
                optionOk = true;
            }catch (InputMismatchException i) {
                printer.printLine("Wprowadzono wartość, która nie jest liczbą. Proszę podaj ponownie");
            } catch (NoSuchElementException e) {
                printer.printLine(e.getMessage() + "Brak danej opcji, podaj ponownie");
            }

        }
        return optionMain;
    }


    //możliwośc wybierania opcji dla UserLoop
    private OptionForUser getOption() {
        boolean optionOK = false;
        OptionForUser option = null;
        while (!optionOK) {
            try {
                option = OptionForUser.createFrotmInt(dataReader.getInt());
                optionOK = true;
            } catch (InputMismatchException i) {
                printer.printLine("Wprowadzono wartość, która nie jest liczbą podaj ponownie");
            } catch (NoSuchElementException e) {
                printer.printLine(e.getMessage() + ", podaj ponownie");
            }
        }
        return option;
    }
//enum dla user wraz z dodatkami
    private enum OptionForUser {
        EXIT(0, "Wyjście z programu"),
        DO_TRANSFER(1, "Wykonaj przelew"),
        WITHDRAW_MONEY(2, "Wyciąg pieniędzy"),
        DEPOSIT_MONEY(3, "Wpłata pieniądzy"),
        CHECK_ACCOUNT(4, "Sprawdź stan konta");


        private final int value;
        private final String description;

        OptionForUser(int value, String description) {
            this.value = value;
            this.description = description;
        }

        //nadpisanie to string z wyrzuceniem wartości i opisu
        @Override
        public String toString() {
            return value + " - " + description;
        }

        static OptionForUser createFrotmInt(int option) throws NoSuchElementException {
            try {
                return OptionForUser.values()[option];
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException("Brak opcji o id: " + option);
            }
        }
    }
//enum dla mainLoop
    private enum MainOption {
        EXIT (0, "Wyjście z programu"),
        TERMINAL (1, "Konsola administratora (wymaga "),
        USER_LOGIN (2, "Konsola klienta (wymaga numeru konta i pinu)");

       private final int value;
       private final String description;

        MainOption(int value, String description) {
            this.description = description;
            this.value = value;
        }

        @Override
        public String toString() {
            return value + " "  + description;
        }

        static MainOption createFromIntMain (int option) throws NoSuchElementException {
            try {
                return MainOption.values()[option];
            }catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException("Brak opcji o id: " + option);
            }
        }

    }


}