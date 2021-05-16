public class SortStrategy {
    Sort mysort;

    public SortStrategy(Sort mysort) {
        this.mysort = mysort;
    }

    public void setMysort(Sort mysort) {
        this.mysort = mysort;
    }

    public void startSort() {
        mysort.SortMothd();
    }

}
