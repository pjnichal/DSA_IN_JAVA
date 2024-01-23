public class ArrayImplement {
    int arr[];
    int idx = 0;

    public ArrayImplement(int size) {
        arr = new int[size];
    }

    public boolean addAtEnd(int number) {
        if (idx == arr.length) {
            return false;
        }

        arr[idx] = number;
        idx++;
        return true;

    }

    public boolean addAtStart(int number) {
        if (idx == arr.length)
            return false;
        if (idx == 0) {
            arr[idx] = number;
            idx++;
            return true;
        }
        for (int i = idx; i > 0; i--) {

            arr[i] = arr[i - 1];

        }
        arr[0] = number;
        idx++;
        return true;

    }

    public void printArray() {
        System.out.println("ARRAY");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " " + i);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        ArrayImplement arrayImplement = new ArrayImplement(10);
        arrayImplement.printArray();
        arrayImplement.addAtEnd(10);
        arrayImplement.addAtEnd(20);
        arrayImplement.addAtEnd(30);
        arrayImplement.addAtEnd(40);
        arrayImplement.addAtEnd(50);
        arrayImplement.addAtEnd(60);
        arrayImplement.addAtEnd(70);
        arrayImplement.addAtEnd(80);
        arrayImplement.addAtEnd(90);

        arrayImplement.printArray();
        System.out.println(arrayImplement.addAtStart(50));
        arrayImplement.printArray();
        System.out.println(arrayImplement.addAtStart(50));
        arrayImplement.printArray();
        // arrayImplement.addAtStart(50);
        // arrayImplement.addAtStart(50);
        // arrayImplement.addAtStart(50);
        // arrayImplement.addAtStart(50);

    }
}
