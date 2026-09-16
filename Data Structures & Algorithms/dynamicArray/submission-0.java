class DynamicArray {
      private int[] array;
      private int capacity;
      private int length;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.length = 0;
        this.array = new int[capacity];
    }

    public int get(int i) {
        return array[i];
    }

    public void set(int i, int n) {
        array[i] = n;
    }

    public void pushback(int n) {
        if (capacity == length) {
            resize();
        }
        array[length] = n;
        length++;
    }

    public int popback() {
        int value = array[length - 1];
        length = length - 1;
        return value;
    }

    public void resize() {
        capacity = capacity * 2;
        int[] newArray = new int[capacity];
        for (int j = 0; j < length; j++) {
            newArray[j] = array[j];
        }
        array = newArray;
    }

    public int getSize() {
       return length;
    }

    public int getCapacity() {
     return capacity;
    }
}