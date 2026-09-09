void main() {
    IO.print("Enter number ");
    
    int choice = Integer.parseInt(IO.readln());

    if (choice == 1) {
        IO.print("Enter the base of the triangle: ");
        double base = Double.parseDouble(IO.readln());

        IO.print("Enter the height of the triangle: ");
        double height = Double.parseDouble(IO.readln());
        double area = 0.5 * base * height;

        IO.println("Area of the triangle: " + area + " square units");
    }
}