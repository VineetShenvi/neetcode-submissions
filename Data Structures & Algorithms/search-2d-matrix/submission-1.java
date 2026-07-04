class Solution {
    public int getRow(int[][] matrix, int target) 
    {
        int low = 0, high = matrix.length-1;

        while (low <= high)
        {   
            int mid = (low+high)/2;

            if (matrix[mid][0] == target) return mid;

            if (matrix[mid][0] < target) low = mid+1;
            else high = mid-1;
        }

        return high;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = getRow(matrix, target);
        if (row==-1) row = 0;
        
        int low = 0, high = matrix[0].length-1;

        while (low <= high)
        {   
            int mid = (low+high)/2;

            if (matrix[row][mid] == target) return true;

            if (matrix[row][mid] < target) low = mid+1;
            else high = mid-1;
        }

        return false;
    }
}
