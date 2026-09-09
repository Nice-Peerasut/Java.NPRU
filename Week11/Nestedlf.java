void main() {
    
    
    if (age <=0 || age > 120) { else
    
    
    IO.print("Enter your age: ");
    int age = Integer.parseInt(IO.readln());

    if (age <= 0) {
        IO.println("ไม่อยู่ในช่วงอายุที่ถูกต้อง");
    } else

    if (age <= 9) {
        IO.print("วัยเด็ก");
    } else

    if (age <= 19) {
        IO.print("วัยรุ่น");
    } else

    if (age <= 59) {
        IO.print("โต");
    } else
        IO.println("ชราวัย");
}
