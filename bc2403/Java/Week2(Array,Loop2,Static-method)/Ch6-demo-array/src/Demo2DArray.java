public class Demo2DArray {
 public static void main(String[] args) {
  // 1D Array
  int[] arr = new int[] {2, 1, 3}; // 1 * 3

  // 2D Array
  int[][] arr2 = new int[][] {{2, 3}, {3, 1}, {2, 3}};

  int[][] arr3 = new int[2][3]; // 2 -> row, 3 -> column
  // arr3[0][0] = 2;
  // arr3[0][1] = 3;
  // arr3[1][0] = 3;
  // arr3[1][1] = 1;
  // arr3[2][0] = 2;
  // arr3[2][1] = 3;

   int sum = 0;
  for (int i = 0; i < arr3.length; i++) {
   for (int j = 0; j < arr3[i].length; j++) {
    sum += arr3[i][j];
    //System.out.println(i + " " + j);
   }
  }
  System.out.println(sum); // 14
  

  // int sum2 = 0;
  // for (int i = 0; i < arr3[i].length; i++) {
  //  for (int j = 0; j < arr3.length; j++) {
  //   sum2 += arr3[j][i];
  //   System.out.println(j + " " + i);
  //  }
  // }
  // System.out.println(sum2); 


  // 3D array
  int[][][] arr4 = new int[2][2][2];
  int[][][] arr5 = new int[][][] {{{1, 2}, {2, 3}}, {{1, 2}, {2, 3}}};


 }
}
