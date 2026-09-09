void main() {
    int salary = Integer.parseInt(IO.readln("Enter salary: "));

    int deductionPercent = Integer.parseInt(IO.readln("Enter deduction percent: "));

    int deduction = salary * deductionPercent / 100;
    int netSalary = salary - deduction;

    IO.println("Deduction = " + deduction + " baht");
    IO.println("Net salary = " + netSalary + " baht");
}