public class Checks {
    public void checkDate(String data) throws HolidayDateException {
        String[] date = data.split("\\.");

        if (date.length != 2) {
            throw new HolidayDateException("Вы забыли поставить разделитель '.'");
        }

        String day = date[0];
        String month = date[1];
        int dayNumber;
        int monthNumber;
        boolean isDay = day.matches("-?\\d+");
        boolean isMonth = month.matches("-?\\d+");

        if (isDay && isMonth) {
            dayNumber = Integer.parseInt(day);
            monthNumber = Integer.parseInt(month);
        } else {
            throw new HolidayDateException("Вы ввели не числовое значение");
        }
        if (day.length() != 2) {
            throw new HolidayDateException("День необходимо указать в формате 'dd'");
        } else if (month.length() != 2) {
            throw new HolidayDateException("Месяц необходимо указать в формате 'MM'");
        } else if (dayNumber < 1) {
            throw new HolidayDateException("День не может быть меньше 1 числа");
        } else if (dayNumber > 31) {
            throw new HolidayDateException("День не может быть больше 31 числа");
        } else if (monthNumber < 1) {
            throw new HolidayDateException("Месяц не может быть меньше 1");
        } else if (monthNumber > 12) {
            throw new HolidayDateException("Месяц не может быть больше 12");
        } else if (monthNumber == 02 && dayNumber > 28) {
            throw new HolidayDateException("В феврале нет столько дней");
        } else if (dayNumber > 30) {
            if (monthNumber == 04 || monthNumber == 06 || monthNumber == 9 || monthNumber == 11) {
                throw new HolidayDateException("В этом месяце 30 дней");
            }
        }
    }
}
