public class TestaConta {
    public static void main(String[] args) {
     Conta conta = new Conta(400.5,"Henrique",1234);

     int [] nums = new int[5];

     for(int i = 0; i < nums.length; i++){
         nums[i] = i * 2;
         System.out.println(nums[i]);
     }
     
    }
}
