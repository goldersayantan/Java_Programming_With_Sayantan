import java.util.Scanner;

class MatrixOperations{
    public static void displayMatrix(int[][] arr)    {
        int rows = arr.length;
        int cols = arr[0].length;
        System.out.println("The matrix will be : ");
        for(int i = 0; i < rows; i++)   {
            for(int j = 0; j < cols; j++)   {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void addition(int[][] arr1, int[][] arr2)    {
        if((arr1.length != arr2.length) || (arr1[0].length != arr2[0].length))  {
            System.out.println("Size of the matrices not match.");
            return;
        }
        int rows = arr1.length;
        int cols = arr1[0].length;
        int[][] resultMatrix = new int[rows][cols];
        for(int i = 0; i < rows; i++)   {
            for(int j = 0; j < cols; j++)   {
                resultMatrix[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        displayMatrix(resultMatrix);
    }

    public static void substraction(int[][] arr1, int[][] arr2)    {
        if((arr1.length != arr2.length) || (arr1[0].length != arr2[0].length))  {
            System.out.println("Size of the matrices not match.");
            return;
        }
        int rows = arr1.length;
        int cols = arr1[0].length;
        int[][] resultMatrix = new int[rows][cols];
        for(int i = 0; i < rows; i++)   {
            for(int j = 0; j < cols; j++)   {
                resultMatrix[i][j] = arr1[i][j] - arr2[i][j];
            }
        }
        displayMatrix(resultMatrix);
    }

    public static void multiplication(int[][] arr1, int[][] arr2)   {
        if(arr1[0].length != arr2.length)   {
            System.out.print("First matrix's column number is not equal to the second matrix's row number ");
            return;
        }

        int rows = arr1.length;         // rows of first matrix
        int cols = arr2[0].length;      // columns of second matrix
        int common = arr1[0].length;    // columns of arr1 = rows of arr2

        int[][] resultmatrix = new int[rows][cols];

        // Matrix multiplication logic
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int sum = 0;
                for (int k = 0; k < common; k++) {
                    sum += arr1[i][k] * arr2[k][j];  // dot product
                }
                resultmatrix[i][j] = sum;
            }
        }
        displayMatrix(resultmatrix);

    }

    public static void transpose(int[][] arr)  {
        int rows = arr.length;
        int cols = arr[0].length;
        int[][] transposeMatrix = new int[cols][rows];
        for(int i = 0; i < rows; i++)   {
            for(int j = 0; j < cols; j++)   {
                transposeMatrix[j][i] = arr[i][j];
            }
        }
        displayMatrix(transposeMatrix);
    }

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows of first matrix : ");
        int rows1 = sc.nextInt();
        System.out.print("Enter the number of columns of first matrix : ");
        int cols1 = sc.nextInt();
        int[][] matrix1 = new int[rows1][cols1];
        for(int i = 0; i < rows1; i++)   {
            for(int j = 0; j < cols1; j++)   {
                System.out.print("Enter a number in [" + i + "][" + j + "] : ");
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("The first matrix will be : ");
        displayMatrix(matrix1);

        System.out.print("Enter the number of rows of second matrix : ");
        int rows2 = sc.nextInt();
        System.out.print("Enter the number of columns of second matrix : ");
        int cols2 = sc.nextInt();
        int[][] matrix2 = new int[rows2][cols2];
        for(int i = 0; i < rows2; i++)   {
            for(int j = 0; j < cols2; j++)   {
                System.out.print("Enter a number in [" + i + "][" + j + "] : ");
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("The second matrix will be : ");
        displayMatrix(matrix2);


        while(true) {
            System.out.println("-----MAIN MENU-----");
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Transpose");
            System.out.println("5. Exit");
            System.out.println("Enter your choice : ");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    addition(matrix1, matrix2);
                    break;
                case 2:
                    substraction(matrix1, matrix2);
                    break;
                case 3:
                    multiplication(matrix1, matrix2);
                    break;
                case 4:
                    transpose(matrix1);
                    transpose(matrix2);
                    break;
                case 5:
                    System.exit(0);
                    System.out.println("Exiting..");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;

            }
        }
    }
}

