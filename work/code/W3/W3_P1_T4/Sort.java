

public interface Sort {
    public void SortMothd();
};

class QuickSort implements Sort {
    public void SortMothd(){
         System.out.println("QuickSort");
     }
}

class ShellSort implements Sort {
    public void SortMothd(){
        System.out.println("ShellSort");
    }
}