/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;
import static que.util.MathUtil.computeFactorial;

/**
 *
 * @author ACER
 */
public class MathUtilTest {
    
    @Test //bao cho JVM biết rằng đâu là hàm main()
    // trong hàm này chứa các lệnh để test code chính củ mình ở bên MathUtiil
    //Ta test các tình hướng thành công ở đây
    //thành công: cF(5) -> trả về 120 gọi là thành công
    public void testSuccessfullCase(){
        //tao kì vọng có 30, xem mày đua đưa vào tực tế là bao nhiêu
        //                                                  50
        //2 thứ khớp nhau, mày xử lý như dự kiến, đèn xanh, thông thường
        //                                      , đèn đỏ, toang
        assertEquals(120, computeFactorial(5));
        assertEquals(720, computeFactorial(6));
        assertEquals(1, computeFactorial(0));
        assertEquals(1, computeFactorial(1));
        assertEquals(2, computeFactorial(2));
    }
    
    @Test(expected = IllegalArgumentException.class) //@ nghĩa là annotation, dấu hiệu  báo cho JVM và thư viện jar liên quan biết phải làm gì
    //hàm này chứa các tình huống cà chớn, ví dụ cF(-5), cF(16)
    public void testFailedCase(){
        //tao kỳ vọng mày ném ra ngoại lệ thì coi như code ngon
        //ngoại lệ không phải là 1 value để có thể so sánh được 
        //nên mình không sài hàm asertEquals() được
        //vì hàm này cần 2 value expect và actual 
        //trong khi đó ném ra ngoại lệ không phải là actual value để so sánh
        //ta phải xài chiêu khác khi bắt ngoại lệ coi có đúng là ngoại lệ mình cần không
        computeFactorial(-5);
        computeFactorial(16); //giai thua tang rat nhanh, khong choi qua 15
        //code có thể còn tiềm ẩn lỗi logic nhưng Clean and Build 
        //luôn ra file .jar nếu code không sai cú phát
        //vậy thì nguy hiểm quá đi 
        //mình phải Disable cái nút Clean and Build nếu code còn màu đỏ tức là còn error logic
        //nhớ 2 con số: 1005 netbeans 8, 1024 Netbeans 10 trở lên khi chơi với Ant project 
    }
    
}
