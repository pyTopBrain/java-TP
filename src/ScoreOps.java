public class ScoreOps {
    public static void main(String[] args) {

        String[] ops={"5","2","C","D","+"};
        System.out.println(calponts(ops));
    }
    static boolean valideOps(String[] ops){


        if (!ops[0].equalsIgnoreCase("C") & !ops[0].equalsIgnoreCase("D")){
            if (!ops[1].equalsIgnoreCase("+")) return true;
            else return false;
        }
        else return false;
    }
    static int calponts(String[] ops){
        int result=Integer.MIN_VALUE;
        int tmp1=0;
        int tmp2=0;
        if (valideOps(ops)){
            result=Integer.parseInt(ops[0]);
            for (int i=0;i<ops.length;i++){
                switch (ops[i]){
                    case "D": {
                        tmp2=tmp1;
                        tmp1=result;
                        result*=2;
                        break;
                    }
                    case "+": {

                        tmp2=tmp1;
                        tmp1=result;
                        result=tmp1+tmp2;
                        break;
                    }
                    case "C": {

                        tmp1=tmp2;
                        result=tmp1;
                        break;
                    }
                    default: {
                        tmp2=tmp1;
                        tmp1=result;
                        result=Integer.parseInt(ops[i]);
                        break;
                    }
                }
            }
        }
        return result;
    }
}
