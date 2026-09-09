void main() {
    int initialSaving = Integer.parseInt(IO.readln("Enter initial saving: "));
    int monthlySaving = Integer.parseInt(IO.readln("Enter monthly saving: "));
    int months = Integer.parseInt(IO.readln("Enter number of months: "));
    int interestPercent = Integer.parseInt(IO.readln("Enter interest percent: "));

    int totalSaving = initialSaving + monthlySaving * months;
    double interest = totalSaving * interestPercent / 100.0;
    double finalSaving = totalSaving + interest;

    IO.println("Total saving before interest = " + totalSaving + " baht");
    IO.println("Interest = " + interest + " baht");
    IO.println("Final saving = " + finalSaving + " baht");
}