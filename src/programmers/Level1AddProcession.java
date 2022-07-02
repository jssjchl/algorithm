package programmers;

public class Level1AddProcession {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer =  new int[arr1.length][arr1[0].length];

        for(int i =0; i <arr1.length; i++){
            for (int j =0; j <arr1[i].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Level1AddProcession a = new Level1AddProcession();
        int [][]arr = {{1, 2}, {2, 3}};
        int [][]arr2 = {{1, 2}, {2, 3}};
        System.out.println(a.solution(arr, arr2));
    }
}
