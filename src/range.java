import java.util.Iterator;

public class range implements Iterable<Integer> {
    int start;
    int stop;
    int step;
    int length;

    public range(int start, int stop, int step) {
        this.start = start;
        this.stop = stop;
        this.step = step;
        if((start < stop && step <= 0) || (start > stop && step >= 0)) {
            length = 0;
        }
if(step == 0){
    throw new RuntimeException("step cannot be zero");
}
        this.size(); // length calculate
    }
    public range(int start, int stop) {
        this.start = start;
        this.stop = stop;

        if(start<=stop){
        this.step = 1;
        } else if (start>stop) {
            this.step = -1;
        }
        if((start < stop && step <= 0) || (start > stop && step >= 0)) {
            length = 0;
        }
        this.size(); // length calculate
    }



public int getvalue(int index){
      if(index<0) {
          int i = length + index;
          int value = start + i * step;
          return value;
      }
    int value = start + index * step;
      return value;
}
    public void  setStart(int num){
        this.start = num ;
        size();
    }
    public void  setStop(int num){
        this.stop = num ;
        size();
    }
    public void  setStep(int num){
        this.step = num ;
        size();
    }

public int  size() {
    //for +ve only
    if (stop > 0 && start < stop && start >= 0) {
        length = (stop - start + step - 1) / step;

    }
    //for -ve only
    else if (stop < 0 && start > stop && start <= 0) {
        length = (start - stop + (-step) - 1) / (-step);
    }
    //For -ve to +ve
    else if (start < 0 && stop > 0) {
        length = (stop - start + step - 1) / step;

    }
    //for +ve to -ve
    else if (start > 0 && stop < 0) {
        length = (start - stop + (-step) - 1) / (-step);

    }


    return length;

}
    @Override
    public Iterator<Integer> iterator() {
    return  new Iterator<Integer>() {
        int index = 0;
        @Override
        public boolean hasNext() {
            return index < length;
        }

        @Override
        public Integer next() {
           int value = start + index * step;
            index++;
            return value;

        }
        };
    }
public String toString(){
        return  "Start :"+ start +"\nStop :" + stop + "\nStep :" + step;
}
    }
