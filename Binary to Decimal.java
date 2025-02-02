class Conveter {
    public String toBinary(int decimal)
    {
        String result = "";
        while(decimal != 0)
        {
            int lastBit = decimal & 1;
            result = lastBit + result;
            decimal = decimal >> 1;
        }
        return result;
    }
    public int toDecimal(int binary)
    {
        int result = 0;
        int index = 0;
        while(binary != 0)
        {
            int lastDigit = binary % 10;
            if (lastDigit == 1){
                result = result + (int) Math.pow(2, index);
            }
            index++;
            binary = binary / 10;
        }
        return result;
    }
}
public class Main{
    public static void main(String args[])
    {
        Conveter conv = new Conveter();
        System.out.println(conv.toBinary(10));
        System.out.print(conv.toDecimal(1010));
    }
}