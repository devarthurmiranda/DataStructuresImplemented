package LinkedList;
public class Cell {
    Cell next;
    Object element;

    public Cell(Object element, Cell next) {
        this.element = element;
        this.next = null;
    }

    public Cell getNext() {
        return this.next;
    }

    public void setNext(Cell next) {
        this.next = next;
    }

    public Object getElement() {
        return this.element;
    }

    public void setElement(Object element) {
        this.element = element;
    }
}
