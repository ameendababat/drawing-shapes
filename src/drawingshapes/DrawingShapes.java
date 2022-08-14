
package drawingshapes;

import java.util.Scanner;


public class DrawingShapes {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int numRow = input.nextInt();
    
        Coll(numRow);
 
        
        
    }
    public static void Coll(int numRow){
         ClassShaps ch = new ClassShaps();
                
       ch.Shap1(numRow);
      
       System.out.println();
        
        ch.Shap2(numRow);
        
           System.out.println("");
        
          ch.Shap3(numRow);
          
           System.out.println("");
        
          ch.Shap4(numRow);         
          
          System.out.println("");
        
          ch.Shap5(numRow); 
          
          System.out.println("");
        
          ch.Shap6(numRow);
           System.out.println("");
        
          ch.Shap7(numRow);
          
           System.out.println("");
        
          ch.Shap8(numRow);
          
           System.out.println("");
        
          ch.Shap9(numRow);
          
           System.out.println("");
        
          ch.Shap10(numRow);
          
           System.out.println("");
        
          ch.Shap11(numRow);
          
           System.out.println("");
        
          ch.Shap12(numRow);
          
           System.out.println("");
          ch.Shap13(numRow);
          
        System.out.println("");
          ch.Shap14(numRow);
                  
          
          
           System.out.println("");
          ch.Shap15(numRow);
        
    }
    
    
    
    
}
