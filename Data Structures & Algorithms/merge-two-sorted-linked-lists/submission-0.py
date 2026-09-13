# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        
        self.head=None
        self.tail=None
        self.curr=self.head

        while(list1 and list2):
            if (list1.val<list2.val):
                if(self.head):
                    newnode=ListNode(list1.val)
                    self.tail.next=newnode
                    self.tail=newnode
                else:
                    self.head=ListNode(list1.val)
                    self.tail=self.head
                list1=list1.next
            else:
                if(self.head):
                    newnode=ListNode(list2.val)
                    self.tail.next=newnode
                    self.tail=newnode
                else:
                    self.head=ListNode(list2.val)
                    self.tail=self.head
                list2=list2.next
        
        if(list1):
            while(list1):
                if(self.head==None):
                    self.head=ListNode(list1.val)
                    self.tail=self.head
                else:
                    newnode=ListNode(list1.val)
                    self.tail.next=newnode
                    self.tail=newnode
                list1=list1.next
        if(list2):
            while(list2):
                if(self.head==None):
                    self.head=ListNode(list2.val)
                    self.tail=self.head
                else:
                    newnode=ListNode(list2.val)
                    self.tail.next=newnode
                    self.tail=newnode
                list2=list2.next
        return self.head