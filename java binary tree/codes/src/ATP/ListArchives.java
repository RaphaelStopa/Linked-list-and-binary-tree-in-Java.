package ATP;

public class ListArchives {

    private String filename;
    private int frequency;
    private ListArchives next;

    public ListArchives(String filename, int frequency) {
        this.filename = filename;
        this.frequency = frequency;
        this.next = null;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public ListArchives getNext() {
        return next;
    }

    public void setNext(ListArchives next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return  "Archive: " + filename +
                ", frequency: " + frequency + "." + "\n"  + (
                next != null ? next : "END OF THIS LIST." );
    }
}
