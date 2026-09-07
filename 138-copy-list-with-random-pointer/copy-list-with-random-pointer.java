
class Solution {
    public Node copyRandomList(Node head) {
        Node ans=new Node(-1);
        Node dummy=ans;
        Node temp=head;
        while(temp!=null){
            Node temp1=new Node(temp.val);
            dummy.next=temp1;
            dummy=dummy.next;
            temp=temp.next;
        }
        ans=ans.next;
        temp=head;
        Node temp2=ans;
        HashMap<Node,Node> map=new HashMap<>();
        while(temp!=null){
            map.put(temp,temp2);
            temp=temp.next;
            temp2=temp2.next;
        }
        for(Node ele:map.keySet()){
            map.get(ele).random=map.get(ele.random);
        }
        return ans;
    }
}