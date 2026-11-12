class ArrayQueue {
    ArrayList<Integer> arr;
    public ArrayQueue() {
        arr=new ArrayList<>();
    }

    public void push(int x) {
       arr.add(x);
    }

    public int pop() {
       int dum=arr.get(0);
       arr.remove(0);
       return dum;

    }

    public int peek() {
        return arr.get(0);
    }

    public boolean isEmpty() {
        if(arr.size()==0){
            return true;
        }
        return false;
    }
}
