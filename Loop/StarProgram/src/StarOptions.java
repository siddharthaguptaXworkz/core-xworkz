public class StarOptions {
    private String option;
    public StarOptions(String option) {
        this.option = option;
        menu();
    }
    public void menu() {
        switch (this.option) {
            case "OPTION_1":
                option1();
                break;
            case "OPTION_2":
                option2();
                break;
            case "OPTION_3":
                option3();
                break;
            case "ALL_OPTIONS":
                allOptions();
                break;
            default:
                System.out.println("Error: No Valid Option");


        }
    }
    public void option1() {
        int shift = 5*2;
        int k;
        for(int row = 1; row <= 5; row++ ){
            for(int j = 0; j < row; j++ )
                System.out.print("*");
            shift-=2;
//            System.out.print("\t");
            for(k = 0 ; k<shift; k++) {
                if (k == (shift / 2)) {
                    System.out.print("|");
                }
                System.out.print(" ");
            }
            if (k == (shift / 2)) {
                System.out.print("|");
            }

            for(int j = 0; j < row; j++ )
                System.out.print("*");
            System.out.println();
        }
    }

    public void option2() {
        int rows=5, i, j,k;
        int shift=0;
        for (i = rows; i >= 1; i--)
        {
            for (j = i; j >= 1; j--)
            {
                System.out.print("*");
            }
            shift+=2;
            for(k = 0 ; k<shift; k++) {
                if (k == (shift / 2)) {
                    System.out.print("|");
                }
                System.out.print(" ");
            }
            if (k == (shift / 2)) {
                System.out.print("|");
            }
            for (j = i; j >= 1; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void option3() {
        int i,j,k,rows=3,shift= 3*2;
        for (i= 0; i<= rows-1; i++)
        {
            for (j=0; j<=i; j++)
            {
                System.out.print("*");
            }
            shift-=2;
            for(k = 0 ; k<shift; k++) {
                if (k == (shift / 2)) {
                    System.out.print("|");
                }
                System.out.print(" ");
            }
            if (k == (shift / 2)) {
                System.out.print("|");
            }
            for (j=0; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        shift=0;
        for (i=rows-1; i>=0; i--)
        {
            for(j=0; j <= i-1;j++)
            {
                System.out.print("*");
            }
            shift+=2;
            for(k = 0 ; k<shift; k++) {
                if (k==rows) {
                    break;
                }
                if (k == (shift / 2)) {
                    // System.out.print("k "+ k+ "shift/2" + shift/2);
                    System.out.print("|");
                }
                System.out.print(" ");
            }

            for(j=0; j <= i-1;j++)
            {
                System.out.print("*");
            }
//            if (k == (shift / 2)) {
//                System.out.print("|");
//            }
            System.out.println("");
        }
    }



    public void allOptions() {
        option1();
        option2();
        option3();

    }
}
