package drawingshapes;

public class ClassShaps {

    /////////////////////////////Shap1////////////////////////////////////////////
    public void Shap1(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int x = 0; x < i * 2 - 1; x++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }

    /////////////////////////////Shap2////////////////////////////////////////////
    public void Shap2(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n) {
                    System.out.print("*");
                } else if (j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

    }
    /////////////////////////////Shap3////////////////////////////////////////////

    public void Shap3(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }
    /////////////////////////////Shap4////////////////////////////////////////////

    public void Shap4(int n) {

        for (int i = 1; i <= n; i++) { // hight

            for (int j = 1; j <= n; j++) { // whidh
                if (i == j || j == (n + 1) - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

    }

    /////////////////////////////Shap5////////////////////////////////////////////
    public void Shap5(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int x = 1; x <= i * 2 - 1; x++) {
                if (i == 2 && x == 2) {
                    System.out.print(" ");
                } else if (i == 3 && (x == 2 || x == 3 || x == 4)) {
                    System.out.print(" ");
                } else {

                    System.out.print("*");
                }
            }

            System.out.println("");

        }

    }

    /////////////////////////////Shap6//////////////////////////////////////////// 
    public void Shap6(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (i == 1 || j == (n + 1) - i || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();
        }

    }
    /////////////////////////////Shap7//////////////////////////////////////////// 

    public void Shap7(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || i == (n / 2) + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();
        }

    }

/////////////////////////////Shap8////////////////////////////////////////////         
    public void Shap8(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n || i == j || j == (n + 1) - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();
        }

    }

    /////////////////////////////Shap9////////////////////////////////////////////   
    public void Shap9(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }

            System.out.println();
        }

    }
/////////////////////////////Shap10////////////////////////////////////////////      

    public void Shap10(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");

            }

            System.out.println();
        }

    }
    /////////////////////////////Shap11////////////////////////////////////////////    

    public void Shap11(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }

            for (int x = 1; x <= i; x++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
/////////////////////////////Shap12////////////////////////////////////////////    

    public void Shap12(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int x = 0; x < i * 2 - 1; x++) {
                System.out.print("*");
            }

            System.out.println();

        }
        for (int i = n / 2 + 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int x = 0; x < i * 2 - 1; x++) {
                System.out.print("*");
            }

            System.out.println();

        }
        for (int i = 0; i < n - 2; i++) {
            System.out.print(" ");
        }
        System.out.println("|--|");

        for (int i = 0; i < n - 2; i++) {
            System.out.print(" ");
        }
        System.out.println("|--|");

    }
/////////////////////////////Shap13///////////////////////////////////////////////////////////

    public void print_Line(int n, boolean f) {

        for (int i = 0; i < n; i++) {
            if (f == false) {
                System.out.print("*****");
                f = true;
            } else {
                System.out.print("     ");
                f = false;
            }
        }
    }

    public void Print_Square(int n, boolean f) {
        for (int i = 0; i < 3; i++) {
            print_Line(n, f);
            System.out.println();
        }

    }

    public void Print_Table(int n) {
        boolean z = false;
        for (int i = 0; i < n; i++) {
            Print_Square(n, z);
            if (z == false) {
                z = true;
            } else {
                z = false;
            }

        }

    }

    public void Shap13(int n) {

        // Print_Table(whdth,High); jast
        Print_Table(n);

    }

//////////////////////////////////Shap14//////////////////////////////////////////////////////////////    
    public void Shap14(int n) {  // n=4
        for (int i = 0; i < n; i++) {   // i= 0  2 3 
            for (int j = 0; j <= 4 * n; j++) {   //j= 0 1 2 ---    >>16
                double d1 = Math.sqrt(Math.pow(i - n, 2) + Math.pow(j - n, 2)); // 5.62...
                double d2 = Math.sqrt(Math.pow(i - n, 2) + Math.pow(j - 3 * n, 2));//12.649...

                if (d1 < n + 0.5 || d2 < n + 0.5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
        for (int i = 1; i < 2 * n; i++) { //1 2 3 4 5 6 7 8
            for (int j = 0; j < i; j++) // 0 
            {
                System.out.print(" ");
            }

            for (int k = 0; k < 4 * n + 1 - 2 * i; k++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }
    //////////////////////////////////Shap15//////////////////////////////////////////////////////////////  

    public void Shap15(int n) {

        int space = n - 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int z = 1; z < i * 2; z++) {
                System.out.print("*");
            }
            System.out.println();
            space--;

        }

        int space1 = 1;
        for (int i = n; i >= 1; i--) // 1 2 3 4  /// 4 3  2 1 
        {
            for (int j = 1; j < space1; j++) {
                System.out.print(" ");
            }
            for (int z = i * 2; z > 1; z--) {
                System.out.print("*");
            }
            System.out.println();
            space1++;

        }

    }
    
    

}
