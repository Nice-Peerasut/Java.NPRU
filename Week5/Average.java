void main() {
   int score1 =Integer.parseInt(IO.readln("Enter score 1: "));

  int score2  =Integer.parseInt(IO.readln("Enter score 2: "));

  int score3 = Integer.parseInt(IO.readln("Enter score 3: "));

  int bonus = Integer.parseInt(IO.readln("Enter bonus score : "));

  int totalScore = score1 + score2 + score3;
  int totalWithBonus = totalScore + bonus;
  double average = totalWithBonus / 3.0;

    IO.println("Total score = " + totalScore + " points");
    IO.println("Total with bonus = " + totalWithBonus + " points");
    IO.println(("Average of totalWithBonus") + ("(") + totalWithBonus + (")") + ("= %.2f points").formatted(average));
}