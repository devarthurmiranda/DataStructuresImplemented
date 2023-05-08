package List.DoubleLinkedList;
public class Cell {
    Cell previous;
    Cell next;
    Object item;

    Cell(Cell next, Object item) {
        this.previous = null;
        this.next = next;
        this.item = item;
    }

    Cell(Object item) {
        this.previous = null;
        this.next = null;
        this.item = item;
    }

    void setNext(Cell next) {
        this.next = next;
    }

    void setPrevious(Cell previous) {
        this.previous = previous;
    }

    Cell getNext() {
        return this.next;
    }

    Cell getPrevious() {
        return this.previous;
    }

    Object getItem() {
        return this.item;
    }



}
