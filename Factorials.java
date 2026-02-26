public class Factorials {
    public static void main(String[] args){
        int fact=6;
        for(int i=1;i<=fact;i++){
            if(fact%i==0) {
                System.out.println(i);
            }
        }
    }
}
