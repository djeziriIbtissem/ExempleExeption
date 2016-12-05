/**
 * Created by HP on 27/11/2016.
 */
public class main {

    private static double inverse (int x){
        if (x==0)
            throw new ArithmeticException("division par zero");
        else
        return (1/x);


    }
    public static void
    main(String[] args){

        int x=(int)(Math.random()*100);
        System.out.println("x="+0);
        try{

        System.out.println("f(x)="+ inverse(0));}
        catch (ArithmeticException e){
            System.err.println(e.getMessage());
        }

        System.out.println("continu");
    }
}
