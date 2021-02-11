
class StringCalculator{

    public static int Add(String numbers)throws Exception{
        int sum =0;
        if(numbers.length() == 0){
            return 0;
        }
        else if(numbers.charAt(0) == '-'){
            throw new Exception("neagtives not allowed "+numbers);
        }
        else{
            int index = getIndexofFirstNumber(numbers);
            if(index > 0){
                String delimiters = "";
                if(index>2)
                  delimiters = numbers.substring(2, index);
                  //System.out.println(delimiters);
                String nums = numbers.substring(index, numbers.length());
                sum = 0;
                //String arr[] = nums.split("");
                int i =0;
                String temp = "";
                for(i = 0;i<delimiters.length();i++){
                    for(int j =0;j<nums.length();j++){
                        if(nums.charAt(j) != delimiters.charAt(i)){
                            temp += nums.charAt(j);
                        }

                    }
                    nums =  temp;
                    temp = "";
                }
                String p[] = nums.split("");
                for(int k=0;k<p.length;k++){
                    sum += Integer.parseInt(p[k]);
                    //System.out.println(g);
                }
                return sum;
            }
            else{
                String arr[]= numbers.split("\n");
            sum = 0;
            for(String t :arr){
                String negatives ="";
                String temp[] = t.split(",");
                for(String k:temp){
                    if(Integer.parseInt(k) < 0){
                        negatives += Integer.parseInt(k) + ",";
                    }
                    sum += Integer.parseInt(k);
                }
                if(negatives.length()>0){
                    throw new Exception ("negatives not allowed " +negatives.substring(0,negatives.length()-1));
                }

            }
            }

            return sum;
        }
    }

    public static int getIndexofFirstNumber(String s){
        int i =0;
        for(i=0;i<s.length();i++){
            if((int)s.charAt(i) > 47 && (int)s.charAt(i) < 58)
                break;
        }
        return i;
    }

    public static void main(String args[]){
        try{
            //For empty string
            System.out.println(Add(""));

            System.out.println(Add("1"));
            System.out.println(Add("1,2"));

            //for more than two numbers
            System.out.println(Add("1,2,3,4,5,5,6,7,8,8,9,2,0,-10"));

            //for new line (\n) delimiter
            System.out.println(Add("1,2\n3"));
            System.out.println(Add("1\n2"));

            //for delimiters case
            System.out.println(Add("//;\n1;2"));

            //For negatives
            Add("-2");
            System.out.println(Add("1,5,-7,-8"));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}