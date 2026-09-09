void main() {
    IO.print("Enter number : ");
    int num = Integer.parseInt(IO.readln());

    if (num % 2 == 0) {
        IO.println("The Number " + num + " is Even.");
    } else {
        IO.println("The Number " + num + " is Odd.");
    }

    IO.println("End Program");
}