package com.objects;

/**
 * Everytime the array has been modified,
 * We need to defragment it and sort to meet
 * the visual expectation.
 */
public class CarList {
    public CarList() {

    }

    /**
     * Our car list storage/database
     */
    public static CarObject[] carList = new CarObject[20];

    /**
     * Add new CarObject to the carList Array
     * Returns true if CarObject successfully added, otherwise false
     * 
     * @param new_car
     * @return boolean
     * @throws Exception
     */
    public static boolean add_item(CarObject new_car) throws Exception {
        int index = length();

        if (index >= carList.length) {
            throw new Exception("No empty slots");
        }

        if (index == 0) {
            carList[index] = new_car;
            return true;
        }
        
        /**
         * Try checking for gaps the add value on it
         * Helpful if we have lot of gaps
         */
        /**
         * This thing can be a problem if the size of the array
         * is too large.
         */
        int num = 0;

        while (true) {
            if (num >= carList.length)
                throw new Exception("No available slots");

            try {
                if (!String.valueOf(carList[num].id).isEmpty()) {
                    num++;
                }
            } catch (Exception e) {
                break;
            }
        }

        carList[num] = new_car;
        sort();

        return true;

    }

    /**
     * Delete CarObject by ID
     * returns boolean if deleted, otherwise false
     * 
     * @param id
     * @return boolean
     */
    public static boolean delete(int id) {
        for (int index = 0; index < carList.length; index++) {
            try {
                if (carList[index].id == id) {
                    carList[index] = null;

                    defragment();
                    sort();

                    return true;
                }
            } catch (Exception e) {
            }
        }

        return false;
    }

    /**
     * Get CarObject by ID
     * 
     * @param id
     * @return CarObject
     * @throws Exception
     */
    public static CarObject get_car_by_id(int id) throws Exception {
        for (int index = 0; index < carList.length; index++) {
            try {
                if (carList[index].id == id) {
                    return carList[index];
                }
            } catch (Exception e) {
            }
        }

        throw new Exception("ID not found");
    }

    /**
     * Get the length
     * Count all indexes that are not empty
     * 
     * @return int
     */
    public static int length() {

        int counted = 0, index;

        for (index = 0; index < carList.length; index++) {
            try {
                /**
                 * Check if ID does exists to confirm that
                 * the index of an array is not empty before counting
                 */
                if (!String.valueOf(carList[index].id).isEmpty()) {
                    counted++;
                }
            } catch (Exception e) {
            }
        }

        return counted;
    }

    /**
     * Remove gaps between array by creating new CarObject array 
     * and add up all indexes that are not empty and overwriting 
     * old declared static global array
     * 
     * @return void
     */
    public static void defragment() {
        CarObject[] temp = new CarObject[carList.length];
        int new_index = 0, index;

        for (index = 0; index < carList.length; index++) {
            try {
                if (!String.valueOf(carList[index].id).isEmpty()) {
                    temp[new_index] = carList[index];
                    new_index++;
                }
            } catch (Exception e) {
            }
        }

        // Overwrite
        carList = temp;
    }

    /**
     * Sort CarObject array by model using bubble sort
     * 
     * @return void
     */
    public static void sort() {

        defragment();

        int len, i, j;

        CarObject[] sample = CarList.carList;
        len = CarList.length();

        CarObject temp;

        // Bubble sort
        for (i = 0; i < len - 1; i++) {
            for (j = i + 1; j < len; j++) {
                if (sample[i].model.toUpperCase().compareTo(sample[j].model.toUpperCase()) > 0) {
                    temp = sample[i];
                    sample[i] = sample[j];
                    sample[j] = temp;
                }
            }
        }
    }

    /**
     * Check if ID does exists in CarObject array
     * 
     * @param id
     * @return boolean
     */
    public static boolean has(int id) {
        for (int index = 0; index < carList.length; index++) {
            try {
                if (carList[index].id == id) {
                    return true;
                }
            } catch (Exception e) {
            }
        }
        return false;
    }
}
