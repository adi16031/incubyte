import org.graalvm.compiler.core.common.type.ArithmeticOpTable.BinaryOp.Add;

class StringCalculator{

    public static int Add(String numbers){
        if(numbers.length() == 0){
            return 0;
        }
        else if(numbers.length() == 1){
            return(Integer.parseInt(numbers));
        }
        else{
            String arr[]= numbers.split(",");
            int sum = 0;
            for(String t :arr){
                sum += Integer.parseInt(t);
            }
            return sum;
        }
    }

    public static void main(String args[]){
        System.out.println(Add(""));
        System.out.println(Add("1"));
        System.out.println(Add("1,2"));
    }
}