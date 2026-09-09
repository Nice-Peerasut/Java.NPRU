void main() {
    int price = Integer.parseInt(IO.readln("Enter price of one dress: "));
    int quantity = Integer.parseInt(IO.readln("Enter number of dresses to buy: "));
    int discountRate = Integer.parseInt(IO.readln("Enter discount rate: "));

    int totalCost = price * quantity;
    double discountAmount = totalCost * discountRate / 100.0;
    double netPay = totalCost - discountAmount;

    IO.println("----------------------------------------");
    IO.println("Total cost = " + totalCost + " Baht");
    IO.println("discountAmount = " + discountAmount + " Baht");
    IO.println("Net Pay = " + netPay + " Baht");
}