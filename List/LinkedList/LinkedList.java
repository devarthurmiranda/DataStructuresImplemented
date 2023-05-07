public class LinkedList {
    private Cell first;
    private Cell last;
    private int total = 0;

    public void addBeginning(Object element){
        Cell newCell = new Cell(element, first);
        this.first = newCell;
        if(this.total == 0){
            this.last = this.first;
        }
        this.total++;
    }

    public void add(Object element){
        if(this.total == 0){
            this.addBeginning(element);
        }else{
            Cell newCell = new Cell(element, null);
            this.last.setNext(newCell);
            this.last = newCell;
            this.total++;
        }
    }

    public void add(int position, Object element){
        if(position == 0){
            this.addBeginning(element);
        }else if(position == this.total){
            this.add(element);
        }else{
            Cell previous = this.getCell(position - 1);
            Cell newCell = new Cell(element, previous.getNext());
            previous.setNext(newCell);
            this.total++;
        }
    }

    private Cell getCell(int position) { // Get the cell in a specific position
        if(!(position >= 0 && position < this.total)){ // Verify if we access a valid position in the list
            throw new IllegalArgumentException("Position invalid");
        } else{
            Cell current = this.first;
            for(int i = 0; i < position; i++){
                current = current.getNext();
            }
            return current;
        }
    }

    public Object get(int position){ // Get the element in a specific position
        return this.getCell(position).getElement();
    }

    public void removeBeginning(){
        if(!(this.total == 0)){
            this.first = this.first.getNext();
            this.total--;
            if(this.total == 0){
                this.last = null;
            }
        }
    }

    public void removeEnd(){
        if(!(this.total == 0)){
            if(this.total == 1){
                this.removeBeginning();
            }else{
                Cell penultimate = this.getCell(this.total - 2);
                penultimate.setNext(null);
                this.last = penultimate;
                this.total--;
            }
        }
    }

    public void remove(int position){ // Remove the element in a specific position
        if(position == 0){
            this.removeBeginning();
        }else{
            Cell previous = this.getCell(position - 1);
            Cell current = previous.getNext();
            previous.setNext(current.getNext());
            current.setNext(null);
            current.setElement(null);
            this.total--;
            if(this.total == position){
                this.last = previous;
            }
        }
    }

    public boolean has(Object element){
        Cell current = this.first;
        while(current != null){
            if(current.getElement().equals(element)){
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public int size(){
        return this.total;
    }
}
