package app;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import io.ConsolePrinter;
import io.DataReader;

public class AppControl {
    private final ConsolePrinter printer = new ConsolePrinter();
    private final DataReader dataReader = new DataReader(printer);
//pętle
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
        AdminOption adminOption;
        do {
            printOptions();
            adminOption = getAdminOption();
            switch (adminOption) {
                case EXIT:
                    break;
                case ADD_CLIENT:
                    break;
                case ADD_ACCOUNT:
                    break;
                case REMOVE_CLIENT:
                    break;
                case REMOVE_ACCOUNT:
                    break;
                case CHANGE_CLIENT_DATA:
                    break;
                case CHANGE_ACCOUNT_DATA:
                    break;
            }
        }
        while (adminOption != AdminOption.EXIT);
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

    //wybieranie opcji które są w enumach
    private AdminOption getAdminOption() {
        boolean optionOk = false;
        AdminOption adminOption = null;
        while (!optionOk) {
            try {
                adminOption = AdminOption.createFromIntAdmin(dataReader.getInt());
                optionOk = true;
            }catch (InputMismatchException i) {
                printer.printLine("Wprowadzono wartość, która nie jest liczbą. Proszę podaj ponownie");
            } catch (NoSuchElementException e) {
                printer.printLine(e.getMessage() + "Brak danej opcji, podaj ponownie");
            }

        }
        return adminOption;
    }

    private MainOption getMainOption () {
        boolean optionOk = false;
        MainOption optionMain = null;
        while (!optionOk) {
            try {
                optionMain = MainOption.createFromIntMain(dataReader.getInt());
                optionOk = true;
            }catch (InputMismatchException i) {
                printer.printLine("Wprowadzono wartość, która nie jest liczbą. Proszę podaj ponownie");
            } catch (NoSuchElementException e) {
                printer.printLine(e.getMessage() + "Brak danej opcji, podaj ponownie");
            }

        }
        return optionMain;
    }

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
    //wypisanie opcji dla admina
    private void printAdminOption() {
        for (AdminOption adminOption: AdminOption.values()
             ) {
            System.out.println(adminOption);
        }
    }
//enumy
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

        //nadpisanie to string z wyrzuceniem wartości i opisu
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

    private enum AdminOption {
        EXIT(0, "Wyjście z programu"),
        ADD_CLIENT(1, "Dodaj nowego klienta"),
        CHANGE_CLIENT_DATA(2, "Zmień dane klienta"),
        REMOVE_CLIENT(3, "Usuń klienta"),
        CHANGE_ACCOUNT_DATA (4, "Zmień dane konta bankowego"),
        ADD_ACCOUNT(5, "Dodaj nowe konto bankowe i przypisz do użytkownika (jeżeli nie ma użytkownika to utworzy nowego)"),
        REMOVE_ACCOUNT(6, "Usuń konto bankowe");

        private final int value;
        private final String description;

        AdminOption (int value, String description){
            this.description = description;
            this.value = value;
        }

        @Override
        public String toString() {
            return value + " " + description;
        }

        static AdminOption createFromIntAdmin (int option) throws NoSuchElementException {
            try {
                return AdminOption.values()[option];
            }catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException("Brak opcji o id: " + option);
            }
        }
    }


}