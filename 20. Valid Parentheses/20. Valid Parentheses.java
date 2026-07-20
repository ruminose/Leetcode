/*
 * Problem: 20. Valid Parentheses
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/valid-parentheses/
 * Language: java
 * Date: 2026-07-20
 */

class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> paren = new HashMap<>();
        paren.put(')','(');
        paren.put(']','[');
        paren.put('}','{');
        Stack <Character> boxStack = new Stack <>();
        for(int i = 0; i < s.length();i++)
        {
            char current = s.charAt(i);
            if(current == '(' || current == '[' || current == '{')
            {
                boxStack.push(current);
            }else{
                if(boxStack.isEmpty()){
                    return false;
                }
                char top = boxStack.pop();

                if(top != paren.get(current)){
                return false;
                }
            };
        }
        return boxStack.isEmpty();
    }
}
//ใช้ hash จะได้ไม่ต้องเขียน if else ใช้ stack เพราะหลักการ LIFO
/*ฮธิบายให้ตัวเองเข้าใจแบบง่ายกันลืม 
หยิบอันล่าสุดมาเทียบกับแบบใน hashmap ว่า ไอตัวล่าสุดเนี่ยต้องปิดแบบวงเล็บไหน แบบนี้ใช่ไหม แล้วก็ถามตัวปัจจุบันว่า current เนี้ย มันเท่ากับ top ไอตัวล่าสุดหรือเปล่าที่มีในดิกถ้าเท่าก็ โอเคนี้คู่่มันไง box.isempty ก็ดูในกล่องโอเคไม่มีแล้วมีคู่มันอยู่แล้วนี่ไง ของหมดกล่องแล้วด้วย เป็น เป้นทรูเพราะจบทั้งหมด แต่ถ้าpop ออกมาแล้วเป็น { แต่ตัวcurrent ลูปมามาหมดแล้วที่รับมาแต่ ดันเป็น ( แต่พอเช็คในกล่อง อ้าวนี้ไม่มีคู่ของมันนี่หว่า value ของ ( เป็น ) แต่ top ที่พึ่งดึงออกมาดันเป็น } ไม่มี คู่ จบไม่ได้ ==false
*/
