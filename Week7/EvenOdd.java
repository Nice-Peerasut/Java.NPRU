void main() {
    IO.print("Enter number : ");
    int num = Integer.parseInt(IO.readln());

    if (num % 2 == 0) {
        IO.println("Even Number");
    } else {
        IO.println("Odd Number");
    }

    IO.println("End Program");
}