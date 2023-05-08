package List.DoubleLinkedList;

public class DoubleLinkedList {
    Cell first;
    Cell last;
    int size = 0;

    public Boolean isOcuppied(int position) {
        return position >= 0 && position < this.size;
    }

    public Cell getCell(int position) {
        if(!this.isOcuppied(position)) {
            throw new IllegalArgumentException("Invalid position");
        } else{
            Cell current = this.first;
            for(int i = 0; i < position; i++) {
                current = current.getNext();
            }
            return current;
        }
    }

    public Object getItem(int position) {
        return this.getCell(position).getItem();
    }

    public void addStart(Object item){
        if(this.size == 0){
            Cell newCell = new Cell(item);
            this.first = newCell;
            this.last = newCell;
        } else{
            Cell newCell = new Cell(this.first, item);
            this.first.setPrevious(newCell);
            this.first = newCell;
        }
        this.size++;
    }

    public void add(Object item){
        if(this.size == 0){
            this.addStart(item);
        } else{
            Cell newCell = new Cell(item);
            this.last.setNext(newCell);
            newCell.setPrevious(this.last);
            this.last = newCell;
            this.size++;
        }
    }

    public void add(int position, Object item){
        if(position == 0){
            this.addStart(item);
        } else if(position == this.size){
            this.add(item);
        } else{
            Cell previous = this.getCell(position - 1);
            Cell next = previous.getNext();
            Cell newCell = new Cell(previous.getNext(), item);
            newCell.setPrevious(previous);
            previous.setNext(newCell);
            next.setPrevious(newCell);
            this.size++;
        }
    }

    public void removeStart(){
        if(!this.isOcuppied(0)){
            throw new IllegalArgumentException("Position not found");
        } else if(this.size == 0){
           this.last = null;
        } else{
            this.first = this.first.getNext();
            this.first.setPrevious(null);
            this.size--;
        }
    }

    public void removeEnd(){
        if(!this.isOcuppied(size-1)){
            throw new IllegalArgumentException("Position not found");
        } else if(this.size == 1){
            this.removeStart();
        } else{
            Cell previous = this.last.getPrevious();
            previous.setNext(null);
            this.last = previous;
            this.size--;
        }
    }

    public void remove(int position){
        if(!this.isOcuppied(position)){
            throw new IllegalArgumentException("Position not found");
        } else if(position == 0){
            this.removeStart();
        } else if(position == this.size - 1){
            this.removeEnd();
        } else{
            Cell previous = this.getCell(position - 1);
            Cell current = previous.getNext();
            Cell next = current.getNext();
            previous.setNext(next);
            next.setPrevious(previous);
            this.size--;
        }
    }

    public Boolean has(Object item){
        Cell current = this.first;
        while(current != null){
            if(current.getItem().equals(item)){
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public int size(){
        return this.size;
    }

    public void clear(){
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public String getList(){
        if(this.size == 0){
            return "[]";
        } else{
            StringBuilder builder = new StringBuilder("[");
            Cell current = this.first;
            for(int i = 0; i < this.size; i++){
                builder.append(current.getItem());
                if(i != this.size - 1){
                    builder.append(", ");
                }
                current = current.getNext();
            }
            builder.append("]");
            return builder.toString();
        }
    }
}