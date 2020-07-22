/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que.util;

/**
 *
 * @author ACER
 */
//đây là class chứa các hàm toán học tính toán với mục tiêu xài chung
//cho các nơi khác, phàm cái gì mang tính xài chung, ta sẽ dùng static
public class MathUtil {
    // tính n! = 1*2*3*...n Vì n ! tăng giá trị rất nhanh, sớm tràn miền int
    //int chỉ tối đa 2 tỷ 1, nên ta xài long mới an toàn
    //thực ra 15! là to lắm rồi, nên ta chỉ tính gia thừa từ 15 trở lại
    public static long computeFactorial(int n){
        long result = 1;
        if(n < 0 || n > 15){
            throw new IllegalArgumentException("Invalid Input, n must be >= 0");
        }
//        for (int i = 1; i <= n; i++) {
//            result *= i;
//        }
//        return result;
        if(n == 0 || n == 1){
            return 1;
        }
        //điều kiện dùng đệ quy
        //sống sót đến lệnh chỗ này thì n chắc chắn rơi vào 2 ... 15
        return (n*computeFactorial(n-1)); //n * (n - 1)
    }
}
