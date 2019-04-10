package arraylists;

import java.util.ArrayList;

public class ArrayLists {

//    public void displayName(String arrayLst) {
//        //System.out.println("Year of birth is:");
//        for(String tempNm : arrayLst){
//            System.out.print(tempNm + " / ");
//        }
//        System.out.println("");
//    } 
    public static void main(String[] args) {

        ArrayList<String> employeeName = new ArrayList<>();
        employeeName.add("John");
        employeeName.add("Steve");
        employeeName.add("Kate");

        ArrayList<String> employeeSurname = new ArrayList<>();
        employeeSurname.add("Doe");
        employeeSurname.add("McGrant");
        employeeSurname.add("Wiiliam");

        ArrayList<String> employeeBirth = new ArrayList<>();
        employeeBirth.add("24-10-1990");
        employeeBirth.add("10-05-2000");
        employeeBirth.add("01-04-1985");

        //цикл for
            // Name
                System.out.print("Names: ");
                for(String tempNm : employeeName) {
                    System.out.print(tempNm + " / ");
                }
                System.out.println("");
            // Surame
                System.out.print("Surnames: ");
                for(String tempSn : employeeSurname) {
                    System.out.print(tempSn + " / ");
                }
                System.out.println("");
            // Birthday
                System.out.print("Birthdays: ");
                for(String tempBd : employeeBirth) {
                    System.out.print(tempBd + " / ");
                }
                System.out.println("\n");

        //цикл while
            // Name
                int sizeNm = 0;
                System.out.print("Names: ");
                while(sizeNm < employeeName.size()){
                    System.out.print(employeeName.get(sizeNm) + " / ");
                    sizeNm ++;
                }
                System.out.println("");
            //Surname
                int sizeSn = 0;
                System.out.print("Surnames: ");
                while(sizeSn < employeeName.size()){
                    System.out.print(employeeSurname.get(sizeSn) + " / ");
                    sizeSn ++;
                }
                System.out.println("");
            //Birthday
                int sizeBr = 0;
                System.out.print("Birthday: ");
                while(sizeBr < employeeBirth.size()){
                    System.out.print(employeeName.get(sizeBr) + " / ");
                    sizeBr ++;
                }            
                System.out.println("\n");

        //цикл do-while
            // Name
            int sizeNme = 0;
                System.out.print("Names: ");
                do{
                  System.out.print(employeeName.get(sizeNme) + " / ");
                  sizeNme ++;
                }while(sizeNme < employeeName.size());
                System.out.println("");
            //Surname
                int sizeSnm = 0;
                System.out.print("Surname: ");
                do{
                  System.out.print(employeeSurname.get(sizeSnm) + " / ");
                  sizeSnm ++;
                }while(sizeSnm < employeeSurname.size());
                System.out.println("");
            //Birthday
                int sizeBrt = 0;
                System.out.print("Birthday: ");
                do{
                  System.out.print(employeeBirth.get(sizeBrt) + " / ");
                  sizeBrt ++;
                }while(sizeBrt < employeeBirth.size());
                System.out.println("\n");
    }

}
