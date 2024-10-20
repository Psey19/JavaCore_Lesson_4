public enum Holidays {
    Not_Holiday("Сегодня у вас нет праздника, работайте!"),
    March_8th("08.03"),
    February_23th("23.02"),
    New_Year("31.12");

    private final String date;

    Holidays(String date) {
        this.date = date;
    }
    public String getDate(){
        return this.date;
    }
}
