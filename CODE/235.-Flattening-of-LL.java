 list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            ListNode dum=temp;
            while(dum!=null){
                list.add(dum.val);
                dum=dum.child;
            }
            temp=temp.next;
        }
        Collections.sort(list);
        ListNode dum=new ListNode(0);
        temp=dum;
        for(int i=0;i<list.size();i++){
            temp.child=new ListNode(list.get(i));
            temp=temp.child;
        }
        return dum.child;
    }
}