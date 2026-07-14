/*
 * Problem: 9. Palindrome Number
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/palindrome-number/
 * Language: java
 * Date: 2026-07-14
 */

class Solution {
    public boolean isPalindrome(int x) {
        int revx = 0;
        int temp;
        int basex = x;
        while(x > 0)
        {
            temp = x % 10;
            revx = (revx * 10) + temp;
            x = x / 10;
        }
        return basex == revx;
    }
}

// % เพื่อเอา เศษใส่ในตัวแปร temp ชั่วคราวเพื่ือเก็บเศษเพื่อทดค่าออกคูณด้วย 10 เพื่อเพิ่มหลักขึ้นไปจากนั้นนำค่า x หารออกเพื่อลดหน่วยลง จนกว่า x จะเหลือ 0 พอได้ตัวแปรสลับค่าแล้วนำมาเทียบ x ที่ส่งมาว่าค่าตรงกันหรือไม่ ถ้าตรงก็จบเป็น palindome อ่านจากซ้ายหรือขวาค่าเท่ากัน
