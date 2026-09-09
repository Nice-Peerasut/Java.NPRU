void main() {
    IO.print("Enter Hours: ");
    double hours = Double.parseDouble(IO.readln());

    IO.print("Enter Minutes: ");
    double minutes = Double.parseDouble(IO.readln());


    double totalMinutes = (hours * 60) + minutes;

    IO.println("Total minutes = %.0f minutes".formatted(totalMinutes));
}