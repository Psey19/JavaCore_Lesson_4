public class HolidayDateException extends Exception{
    public HolidayDateException(String message) {
        super("Неверный формат даты (" + message + ")");
    }
}
