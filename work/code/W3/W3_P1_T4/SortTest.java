
public class SortTest {
    public static void main(String[] args) {
        SortStrategy mySortStrategy = new SortStrategy(new QuickSort());
        mySortStrategy.startSort();
        mySortStrategy.setMysort(new ShellSort());
        mySortStrategy.startSort();
    }
}
