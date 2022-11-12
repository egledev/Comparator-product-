/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customproductcomparator;

import java.util.Comparator;

/**
 *
 * @author ABDO
 */
public class CustomProductComparator implements Comparator<Product>{

    @Override
    public int compare(Product o1, Product o2) {
    	
        int proV = o1.getCategoryName().compareTo(o2.getCategoryName());
        
        if(proV==0)
        {
            double deff =  (o1.getPrice() - o2.getPrice());
            proV = (deff>0)? 1 : ((deff>0)? 1 : 0); 
        }
        
        if(proV==0)
        {
            proV = o1.getCategoryName().compareTo(o2.getCategoryName());
        }
        return proV;
    }

   
    
}
