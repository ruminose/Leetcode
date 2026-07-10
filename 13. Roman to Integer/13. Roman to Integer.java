/*
 * Problem: 13. Roman to Integer
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/roman-to-integer/
 * Language: java
 * Date: 2026-07-10
 */

class Solution {
    public int romanToInt(String s) {
        int total = 0;
        HashMap<Character,Integer> romanKey = new HashMap<>();
            romanKey.put('I',1);
            romanKey.put('V',5);
            romanKey.put('X',10);
            romanKey.put('L',50);
            romanKey.put('C',100);
            romanKey.put('D',500);
            romanKey.put('M',1000);
        for(int i =0; i<s.length()-1;i++){
            int currentKey = romanKey.get(s.charAt(i));
            int nextRomanKey = romanKey.get(s.charAt(i+1));
            if(currentKey >= nextRomanKey){
            total = total+currentKey;
            }else{
                total = total-currentKey;
            }
        }
            total = total+romanKey.get(s.charAt(s.length()-1)); 
            return total;
    }
}
//ใช้การเปรียบเทียบค่า ในการทำงาน ตัวเลข Roman เก็บค่าไว้ I เก็บค่า ไว้ที่ 5  โจทคือ รับค่าString เข้ามาผ่านตัวแปร S จากนั้นเปรียบเทียบค่า ถ้า S[1]>=S[2] ให้sum แต่ถ้าน้อยกว่าให้ ลบออก ถ้าคิดแบบเปรียบเทียบค่าคือ ตัวแปรที่ได้รับมาทั้ง 2 ตัวเปรียบเทียบกันแล้วเก้บใส่กระเป่าหรือลบออกจากกระเป่า เพราะฉั้นค่าจะถูกเก้บที่ current
//ไว้จนก่อนถึงตำแหน่งสุดท้ายที่จะเปรียบเพราะ nextRoman ถูกหยุดไปแล้ว ค่าตัวสุดท้ายจึงจะเป็น +เสมอและไม่มีค่าไหนมากกว่าเพราะไม่มีตัวเปรียบเทียบ จึงเป็น + เสมอ

