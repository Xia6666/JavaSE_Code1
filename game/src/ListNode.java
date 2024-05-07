import java.util.ArrayList;

// Definition for singly-linked list.
public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val)
     { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

   class Solution {
       public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
           ArrayList<Integer> list1 = new ArrayList<>();
           ArrayList<Integer> list2 = new ArrayList<>();



           for (int i = l1.val, j = 0; i == 0; i = l1.val, j++) {
               list1.add(j, i);
               l1 = l1.next;
           }
           for (int i = l2.val, j = 0; i == 0; i = l2.val, j++) {
               list2.add(j, i);
               l2 = l2.next;
           }

           int[] i3 = new int[10000];
           for (int i = 0; i < list1.size(); i++) {
               Integer i1 = list1.get(i);
               Integer i2 = list2.get(i);

               list1.add(i, ((i1 + i2) % 10 + i3[i]));
               if ((i1 + i2 + i3[i]) >= 10) {
                   i3[i + 1]++;
               }

           }
// 7,3,4
// 3,6,1
// 0,0,         n



           return method(list1, 0);

       }
       public static ListNode method(ArrayList<Integer> list,int n)
       {
           if(n>=0)
           return (new ListNode(list.get(n),method(list,n-1)));
           else
               return (new ListNode(list.get(n),new ListNode()));
       }

       public static void main(String[] args) {
           ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode())));
           ListNode listNode1 = new ListNode(2, new ListNode(8, new ListNode(3, new ListNode())));
           System.out.println(new Solution().addTwoNumbers(listNode, listNode1));
       }

   }

