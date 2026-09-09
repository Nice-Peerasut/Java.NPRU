void main() {
    IO.print("Enter Width (m): ");
    double width = Double.parseDouble(IO.readln());

    IO.print("Enter Length (m): ");
    double length = Double.parseDouble(IO.readln());

    double bsa = 360 / (width * length);

    IO.println("Width = %.2f m, Length = %.2f m, BSA = %.2f".formatted(width, length, bsa));
}