package practicalTest;

public class FloatingPointValue {

    public static void main(String[] args) {
        FloatingPointValue FPV = new FloatingPointValue();
        Long firstPartOfNum = 123L;
        Integer lastPartOfNum = 123;
        FPV.createNum(firstPartOfNum,lastPartOfNum);
        // FPV.createNum(123,123);
        FPV.sum(FPV.createNum(123L,123),FPV.createNum(123L,123));
    }
    public String createNum(Long firstPart,Integer lastPart){

        String firstStringNum = firstPart.toString();
        String lastStringNum = lastPart.toString();
        String stringNum =(firstStringNum +"."+ lastStringNum);
        System.out.println(stringNum);
        return stringNum;
    }
    public String sum(String firstNum,String lastNum){
        Long num1 = Long.parseLong(createNum(123L,123));
        Long num2 = Long.parseLong(createNum(123L,123));
        Long res =num1+num2;
        firstNum = num1.toString();
        lastNum = num2.toString();
        String stringRes = res.toString();
        System.out.println(res);
        return stringRes;
    }

}
