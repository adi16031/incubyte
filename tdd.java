class StringCalculator{

    public static int Add(String numbers){

        if(numbers.length() == 0){
            return 0;
        }
        else{
            String arr[]= numbers.split("\n");
            int sum = 0;
            for(String t :arr){
                String temp[] = t.split(",");
                for(String k:temp)
                sum += Integer.parseInt(k);
            }
            return sum;
        }
    }

    public static void main(String args[]){
        //For empty string
        System.out.println(Add(""));

        System.out.println(Add("1"));
        System.out.println(Add("1,2"));

        //for more than two numbers
        System.out.println(Add("1,2,3,4,5,5,6,7,8,8,9,2,0,-10"));

        //for new line (\n) delimiter
        System.out.println(Add("1,2\n3"));
        System.out.println(Add("1\n2"));
    }
}