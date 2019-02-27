package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        if(array.length %2 == 0){
            return true;
        }

        return false;
    }

    public Integer[] range(int start, int stop) {
        Integer[] range = {};

        for(int i = start; i <= stop; i++){

        }

       return range;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        int sum = 0;

        for(int i =0; i < array.length; i++){
          sum = array[0] + array[1];
        }

        return sum;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
       int product = 0;
       for(int i =0; i < array.length; i++){
           product = array[0] * array[1];
       }


        return product;
    }
}
