public class Main {
    public static void main(String[] args) {
        //task 1
        byte age = 27;
        if (age >= 2 && age <= 6) {
            System.out.println("челвоеку нужно ходить в садик");
        } else {
            if (age > 6 && age <= 18) {
                System.out.println("Человеку нужно ходить в школу");
            } else {
                if (age > 18 && age <= 24) {
                    System.out.println("Человеку пора ходить в институт");
                }else{
                    if (age > 24){
                        System.out.println("Человеку пора на работу");
                    }
                }
            }
        }
        //task 2
        byte age2 = 4;
        if (age2 < 5){
            System.out.println("нельзя кататься на атрационне");
        }else{
            if (age2 >= 5 && age2 < 14){
                System.out.println("Можно кататься на атракционе только в сопровождении взрослого");
            }else{
                System.out.println("Можно кататься без взрослых");
            }
        }
        //task 3
        int one = 10;
        int two = 5;
        int free = 3;
        if (one > two && one > free){
            System.out.println("Число " + one + " самое большое");
        }else {
            if (two > one && two > free){
                System.out.println("Число " + two + " самое большое");
            }else {
                if (free > one && free > two){
                    System.out.println("Число " + free + " самое большое");
                }
            }
        }
    }
}