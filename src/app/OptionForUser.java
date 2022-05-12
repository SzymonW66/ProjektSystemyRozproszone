package app;

import java.util.NoSuchElementException;

public enum OptionForUser {
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

        static AppControl.OptionForUser createFrotmInt(int option) throws NoSuchElementException {
            try {
                return AppControl.OptionForUser.values()[option];
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException("Brak opcji o id: " + option);
            }
        }
    }

