package hw3q5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * This class represents a SalesRecord object following the outline of the requirement:
 * Each sales record contains the following fields:
 * Sales Date: DD/MM/YY
 * Store ID: integer
 * Register Number: integer
 * Sale Amount: float
 * Each sales record represents a sale made at a specific cashier register in a specific store.
 */
public class SalesRecord {

    private int DD;
    private int MM;
    private int YY;
    private int storeID;
    private int registerNumber;
    private float saleAmount;

    /***
     * Constructor for the SalesRecord class. Initializes all variables according to the given Sales Record Requirements:
     * DD: Random value from 1 to 30
     * MM: Random value from 1 to 12
     * YY: Always 16
     * Store ID: Fixed for each producer, ranging from 1 to p
     * Register Number: Random value from 1 to 6
     * Sale Amount: Random value from 0.50 to 999.99
     * @param DD The day portion of the date ranging from 1 to 30
     * @param MM the month portion of the date ranging from 1 to 12
     * @param storeID the store ID number, ranging from 1 to p where p is the number of producer threads
     * @param registerNumber the register number, ranging from 1 to 6
     * @param saleAmount the sale amount ranging from 0.50 to 999.99
     */
    public SalesRecord(int DD, int MM, int storeID, int registerNumber, float saleAmount){
        this.DD = DD;
        this.MM = MM;
        this.YY = 16;
        this.storeID = storeID;
        this.registerNumber = registerNumber;
        this.saleAmount = saleAmount;
    }

    //Getter Functions: Retrieve variables of the SalesRecord object

    public String getDate(){
        LocalDate salesDate = LocalDate.of(YY, MM, DD);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yy");
        return salesDate.format(myFormatObj);
    }

    public int getStoreID(){
        return storeID;
    }

    public int getRegisterNumber(){
        return registerNumber;
    }

    public float getSaleAmount(){
        return saleAmount;
    }
    

}
