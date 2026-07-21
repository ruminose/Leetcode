/*
 * Problem: 21. Merge Two Sorted Lists
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/merge-two-sorted-lists/submissions/2076108163/
 * Language: java
 * Date: 2026-07-21
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode header = new ListNode(0);
        ListNode normal = header;
        while(list1 != null && list2 != null)
        {
            if(list1.val <= list2.val)
            {
                normal.next = list1;
                list1=list1.next;
            }else{
                normal.next = list2;
                list2 = list2.next;
            }
            normal = normal.next;
        }
        if(list1 != null)
        {
            normal.next = list1;
        }
        if(list2 != null)
        {
                normal.next=list2;
        }
        return header.next;
    }
}
//กันตัวเองลืม
/*
การทำงานคือ มีlist node ย่อยมาให้ 2 ตัว โจทต้องการให้เรียงเลขของ list สองตัวนี้ให้เรียงกัน น้อยไปมากและโจทต้องการจะตรวจตั้งแต่ต้นแถว ดั้งนั้นจะต้องมี header ล๊อค[0] ไว้เพื่อเวลาตรวจสอบคำตอบจะได้ถูกต้อง

เพราะตัวบันทึกค่าจะต้องบันทึกและวิ่งต่อ 1 ช่องเสมอทำให้ถ้าส่งตัวบันทึกไปโจทจะไม่สามารถตรวจสอบตั้งแต่ต้นแถวได้

การทำงาน
เมื่อใดก็ตามที่ list 1 ยังมีค่าและ list 2 ยังมีค่า 
เมื่อเทียบค่าแล้วฝั่ง 1 น้อยกว่าหยิบลงไปบันทึกในลิส จนกว่าจะหมดทำให้ เมื่อฝั่งซ้ายถูกเก็บจนหมดบางทีจะเหลือฝั่งขวาเก้บตกไว้หลังจากการทำงานแบบ เปรียบเทียบแล้วบันทึก

เพราะฉะนั้น เมื่อ while ทำตามเงื่อนไขครบแต่สมมุติค่าใน loop ใด loop หนึ่งยังไม่หมด จะต้องมาเขียนตรวจสอบว่า lis1null ไหม list 2 nullไหมถ้ายัง ก็ให้ต่อท้ายแถวไปเลยถึงจะเป้นการตรวจสอบแบบไม่มีประสิทธิภาพเท่าไหร่แต่ในโจทนี้ถือว่าแก้ได้

*/
