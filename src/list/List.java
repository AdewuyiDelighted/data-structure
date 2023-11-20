package list;

import java.util.Arrays;

public class List {

    private boolean isEmpty;
    private int size;
    private int[] input = new int[5];

    public boolean isEmpty() {
        if (size > 0) {
            return false;
        }
        return true;
    }

    public int size() {
        return size;
    }

    public void add(int number) {
        input[size] = number;
        int [] unknown = input;
        size++;
        if(size == input.length){
            input  = new int[size + size];
            input =  helperMethod(unknown,input);
        }
    }

    public int get(int index) {
        return input[index];

    }

    public void remove(int index) {
        if (index <= size) {
            int number = input[index];
            int count = 0;
            int[] arrayThatShiftElement = new int[input.length - 1];
            for (int counter = 0; counter < input.length; counter++) {
                int newNumber = input[counter];
                if (newNumber == number) {
                    continue;
                }
                arrayThatShiftElement[count] = newNumber;
                count++;
            }
            this.input = arrayThatShiftElement;
            size--;
        } else throw new ArrayIndexOutOfBoundsException("Invalid index");

    }

    public void set(int index, int element) {
        input[index] = element;
    }

    public int indexOf(int element) {
        int indexOf = 0;
        for (int index = 0; index < size; index++) {
            if (element == input[index]) {
                indexOf = index;
                break;
            }
        }
        return indexOf;

    }

    public int lastIndexOf(int element) {
        int lastIndexOf = 0;
        for (int index = size - 1; index >= 0; index--) {
            if (element == input[index]) {
                lastIndexOf = index;
                break;
            }
        }
        return lastIndexOf;


    }

    public boolean contains(int element) {
        for (int index = size - 1; index >= 0; index--) {
            if (element == input[index]) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        size = 0;

    }
   @Override
    public String toString(){
        int [] newArray = new int[size];
        for(int index = 0; index < size;index++){
            newArray[index] = input[index];
        }
        return String.format( Arrays.toString(newArray));
    }
    private int[] helperMethod(int [] unkwnown,int[] input){
        int count = 0;
        for(int index  = 0; index < unkwnown.length;index++){
            input[index] = unkwnown[count];
            count++;
        }
        return input;
    }

    public static void main(String[] args) {
        List list = new List();
        list.add(5);
        list.add(6);
        list.add(9);
        System.out.println(list);
    }

}