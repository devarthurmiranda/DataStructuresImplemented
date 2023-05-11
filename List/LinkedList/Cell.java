
public class Cell {
    Cell next;
    Object item;

    public Cell(Object item, Cell next) {
        this.item = item;
        this.next = null;
    }

    public Cell getNext() {
        return this.next;
    }

    public void setNext(Cell next) {
        this.next = next;
    }

    public Object getItem() {
        return this.item;
    }

    public void setItem(Object item) {
        this.item = item;
    }
}
