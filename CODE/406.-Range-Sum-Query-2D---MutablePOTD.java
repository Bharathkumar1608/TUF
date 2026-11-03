class NumMatrix {
    int[][] bit;
    int[][] mat;
    int m, n;

    public NumMatrix(int[][] matrix) {
        m = matrix.length;
        n = matrix[0].length;

        bit = new int[m + 1][n + 1];
        mat = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                update(i, j, matrix[i][j]);
            }
        }
    }

    public void update(int row, int col, int val) {
        int diff = val - mat[row][col];
        mat[row][col] … diff;
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return sum(row2 + 1, col2 + 1)
             - sum(row1, col2 + 1)
             - sum(row2 + 1, col1)
             + sum(row1, col1);
    }

    public int sum(int row, int col) {
        int sum = 0;

        for (int i = row; i > 0; i -= i & -i) {
            for (int j = col; j > 0; j -= j & -j) {
                sum += bit[i][j];
            }
        }

        return sum;
    }
}