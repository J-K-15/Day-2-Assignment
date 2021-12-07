//ASSIGNMENT 1: To take two values using Command line argument and print their sum
class SUM {
    public static void main(String[] args)
    {
        int num1, num2;
        num1 = Integer.parseInt(args[0]);
        num2 = Integer.parseInt(args[1]);
        
        System.out.println("SUM of "+args[0]+" and "+args[1]+" = "+(num1+num2));
    }    
}
