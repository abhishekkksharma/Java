package StacksAndQueues.Queues.Custom;

public class DynamicQueue extends CircularQueue {
    public DynamicQueue(){
        super();
    }
    public DynamicQueue(int size){
        super(size);
    }
    @Override
    public boolean insert(int item) {
        if(this.isFull()){
            int[] temp =  new int[data.length*2];
            for(int i=0;i<data.length;i++){
                temp[i]=data[(front+i)%data.length];
            }
            front=0;
            end=data.length;
            data=temp;
        }
        return super.insert(item);
    }
    public static void main(String[] args) {
        DynamicQueue dq = new DynamicQueue(5);
        dq.insert(1);
        dq.insert(2);
        dq.insert(3);
        dq.insert(4);
        dq.insert(5);
        dq.insert(6);

        dq.display();
    }
}
