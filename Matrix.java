package LeetCode;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class Matrix {
//    public static void main(String[] args) {
//        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
//        setZeroes(matrix);
//        System.out.println(Arrays.deepToString(matrix));
//    }
//    static void setZeroes(int[][] matrix) {
//        int n = matrix.length;
//        int m = matrix[0].length;
//        List<int[]> list = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if(matrix[i][j] == 0){
//                    list.add(new int[]{i, j});
//                }
//            }
//        }
//        // [[1, 1]]
//        for (int[] arr: list) {
//            int a = arr[0];
//            int b = arr[1];
//
//            for(int j = 0; j < m; j++){
//                matrix[a][j] = 0;
//            }
//            for(int j = 0; j < n; j++){
//                matrix[j][b] = 0;
//            }
//        }
//    }
//}

