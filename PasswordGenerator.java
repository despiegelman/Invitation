public class PasswordGenerator {
    private static int count;
    private int numOfDigits;
    private String opener;

    public PasswordGenerator(int num, String s){
        numOfDigits = num;
        opener = s;
    }

    public PasswordGenerator(int num){
        numOfDigits = num;
        opener = "A";
    }

    public int pwCount(){
        return count;
    }

    public String pwGen(){
        String result = opener + ".";
        for (int i = 1; i <= numOfDigits; i++){
            int number = (int)(Math.random()*10);
            result += number;
        }
        count++;
        return result;
    }
}
