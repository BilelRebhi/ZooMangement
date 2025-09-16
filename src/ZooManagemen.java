import java.util.Scanner;

public class
ZooManagemen {
    public static void main(String[] args)
    {

       /* int nbrCages=20;
        String zooName="my zoo";
        System.out.println(zooName+"comporte"+nbrCages+"cages");*/
        Scanner input=new Scanner(System.in);
        String name="";
        int  nbrCages=0;
            do{

                System.out.println("donner le nom de zoo");
                 name=input.nextLine();
            }while(!(name.matches("[a-zA-Z ]+"))||name.trim().isEmpty());
            do{
                System.out.println("donner le nombre de cages ");
                nbrCages=input.nextInt();
               }while(nbrCages<0);
            System.out.println(name +" "+"comporte"+ " "+nbrCages+" "+"cages");

           input.close();


    }
}
