class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;

        // for(int i=0;i<m;++i){
        //     for(int j=0;j<n;++j){
        //         if(matrix[i][j]==0){
        //             matrix[0][j]=-1;
        //             matrix[i][0]=-1;

        //         }
        //     }
        // }
        // for(int i=0;i<m;++i){
        //     for(int j=0;j<n;++j){
        //         if(matrix[i][j]==-1){
        //            matrix[]
        //         }
        //     }
        // }

        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col=new ArrayList<>();

         for (int i = 0; i < m; i++)
            row.add(0);

        for (int j = 0; j < n; j++)
            col.add(0);

        for(int i=0;i<m;++i){
            for(int j=0;j<n;++j){
                if(matrix[i][j]==0){
                    row.set(i,1);
                    col.set(j,1);
                }
            }
        }
        for(int i=0;i<m;++i){
            for(int j=0;j<n;++j){
                if(row.get(i)==1 || col.get(j)==1){
                    matrix[i][j]=0;
                }
            }
        }
        
        


    }
}