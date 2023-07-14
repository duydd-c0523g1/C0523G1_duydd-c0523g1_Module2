package ss10_dsa_list.bai_tap.bai1_arraylist;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object[] element;
    public MyList() {
        System.out.println("Khởi tạo mảng không tham số");
        element = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity) {
        if (capacity > 0) {
            System.out.println("Khởi tạo mảng thành công với kích thước là: " + capacity);
            element = new Object[capacity];
        }else {
            System.out.println("Kích thước mảng phải lớn hơn 0");
        }
    }
    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.element.length + minCapacity;
            element = Arrays.copyOf(element, newSize);
            System.out.println("Khởi tạo mảng thành công với kích thước là: " + element.length);
        }
    }
}
