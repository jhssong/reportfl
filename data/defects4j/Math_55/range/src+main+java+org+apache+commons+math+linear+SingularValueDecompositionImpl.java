{
  "filepath": "/tmp/Math-55b/src/main/java/org/apache/commons/math/linear/SingularValueDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SingularValueDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.SingularValueDecomposition"
      ],
      "begin_line": 37,
      "end_line": 338,
      "comment": "\n * Calculates the compact Singular Value Decomposition of a matrix.\n * \u003cp\u003e\n * The Singular Value Decomposition of matrix A is a set of three matrices: U,\n * \u0026Sigma; and V such that A \u003d U \u0026times; \u0026Sigma; \u0026times; V\u003csup\u003eT\u003c/sup\u003e. Let A be\n * a m \u0026times; n matrix, then U is a m \u0026times; p orthogonal matrix, \u0026Sigma; is a\n * p \u0026times; p diagonal matrix with positive or null elements, V is a p \u0026times;\n * n orthogonal matrix (hence V\u003csup\u003eT\u003c/sup\u003e is also orthogonal) where\n * p\u003dmin(m,n).\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "m"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Number of rows of the initial matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Number of columns of the initial matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "eigenDecomposition"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Eigen decomposition of the tridiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "singularValues"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Singular values. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedU"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Cached value of U. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedUt"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Cached value of U\u003csup\u003eT\u003c/sup\u003e. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedS"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Cached value of S. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedV"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Cached value of V. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedVt"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Cached value of V\u003csup\u003eT\u003c/sup\u003e. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.SingularValueDecompositionImpl(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 62,
      "end_line": 138,
      "comment": "\n     * Calculates the compact Singular Value Decomposition of the given matrix.\n     *\n     * @param matrix Matrix to decompose.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 37)",
        "(line 64,col 9)-(line 64,col 40)",
        "(line 66,col 9)-(line 66,col 23)",
        "(line 67,col 9)-(line 67,col 23)",
        "(line 68,col 9)-(line 68,col 23)",
        "(line 69,col 9)-(line 69,col 24)",
        "(line 71,col 9)-(line 71,col 48)",
        "(line 72,col 9)-(line 72,col 45)",
        "(line 76,col 9)-(line 84,col 9)",
        "(line 86,col 9)-(line 86,col 45)",
        "(line 90,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 99,col 14)",
        "(line 100,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 126,col 9)",
        "(line 131,col 9)-(line 137,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getU()",
      "begin_line": 141,
      "end_line": 145,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT()",
      "begin_line": 148,
      "end_line": 154,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 149,col 9)-(line 151,col 9)",
        "(line 153,col 9)-(line 153,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getS()",
      "begin_line": 157,
      "end_line": 163,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 158,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 162,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getSingularValues()",
      "begin_line": 166,
      "end_line": 168,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getV()",
      "begin_line": 171,
      "end_line": 174,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getVT()",
      "begin_line": 177,
      "end_line": 183,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 178,col 9)-(line 180,col 9)",
        "(line 182,col 9)-(line 182,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getCovariance(double)",
      "begin_line": 186,
      "end_line": 211,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 44)",
        "(line 189,col 9)-(line 189,col 26)",
        "(line 190,col 9)-(line 192,col 9)",
        "(line 194,col 9)-(line 197,col 9)",
        "(line 199,col 9)-(line 199,col 57)",
        "(line 200,col 9)-(line 207,col 39)",
        "(line 209,col 9)-(line 209,col 62)",
        "(line 210,col 9)-(line 210,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.Anonymous-2dfbb38f-ae1b-4e9e-b20b-82ab17a5982b.visit(int, int, double)",
      "begin_line": 202,
      "end_line": 206,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 205,col 17)-(line 205,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getNorm()",
      "begin_line": 214,
      "end_line": 216,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getConditionNumber()",
      "begin_line": 219,
      "end_line": 221,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getRank()",
      "begin_line": 224,
      "end_line": 233,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 86)",
        "(line 227,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 232,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getSolver()",
      "begin_line": 236,
      "end_line": 238,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 88)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DecompositionSolver"
      ],
      "begin_line": 241,
      "end_line": 337,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "pseudoInverse"
      ],
      "begin_line": 243,
      "end_line": 243,
      "comment": " Pseudo-inverse of the initial matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "nonSingular"
      ],
      "begin_line": 245,
      "end_line": 245,
      "comment": " Singularity indicator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.Solver.Solver(double[], org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix, boolean)",
      "begin_line": 255,
      "end_line": 272,
      "comment": "\n         * Build a solver from decomposed matrix.\n         *\n         * @param singularValues Singular values.\n         * @param uT U\u003csup\u003eT\u003c/sup\u003e matrix of the decomposition.\n         * @param v V matrix of the decomposition.\n         * @param nonSingular Singularity indicator.\n         ",
      "child_ranges": [
        "(line 257,col 13)-(line 257,col 42)",
        "(line 258,col 13)-(line 269,col 13)",
        "(line 270,col 13)-(line 270,col 77)",
        "(line 271,col 13)-(line 271,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.Solver.solve(double[])",
      "begin_line": 285,
      "end_line": 287,
      "comment": "\n         * Solve the linear equation A \u0026times; X \u003d B in least square sense.\n         * \u003cp\u003e\n         * The m\u0026times;n matrix A may not be square, the solution X is such that\n         * ||A \u0026times; X - B|| is minimal.\n         * \u003c/p\u003e\n         * @param b Right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X that minimizes the two norm of A \u0026times; X - B\n         * @throws org.apache.commons.math.exception.DimensionMismatchException\n         * if the matrices dimensions do not match.\n         ",
      "child_ranges": [
        "(line 286,col 13)-(line 286,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 300,
      "end_line": 302,
      "comment": "\n         * Solve the linear equation A \u0026times; X \u003d B in least square sense.\n         * \u003cp\u003e\n         * The m\u0026times;n matrix A may not be square, the solution X is such that\n         * ||A \u0026times; X - B|| is minimal.\n         * \u003c/p\u003e\n         * @param b Right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X that minimizes the two norm of A \u0026times; X - B\n         * @throws org.apache.commons.math.exception.DimensionMismatchException\n         * if the matrices dimensions do not match.\n         ",
      "child_ranges": [
        "(line 301,col 13)-(line 301,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 316,
      "end_line": 318,
      "comment": "\n         * Solve the linear equation A \u0026times; X \u003d B in least square sense.\n         * \u003cp\u003e\n         * The m\u0026times;n matrix A may not be square, the solution X is such that\n         * ||A \u0026times; X - B|| is minimal.\n         * \u003c/p\u003e\n         *\n         * @param b Right-hand side of the equation A \u0026times; X \u003d B\n         * @return a matrix X that minimizes the two norm of A \u0026times; X - B\n         * @throws org.apache.commons.math.exception.DimensionMismatchException\n         * if the matrices dimensions do not match.\n         ",
      "child_ranges": [
        "(line 317,col 13)-(line 317,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.Solver.isNonSingular()",
      "begin_line": 325,
      "end_line": 327,
      "comment": "\n         * Check if the decomposed matrix is non-singular.\n         *\n         * @return {@code true} if the decomposed matrix is non-singular.\n         ",
      "child_ranges": [
        "(line 326,col 13)-(line 326,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.Solver.getInverse()",
      "begin_line": 334,
      "end_line": 336,
      "comment": "\n         * Get the pseudo-inverse of the decomposed matrix.\n         *\n         * @return the inverse matrix.\n         ",
      "child_ranges": [
        "(line 335,col 13)-(line 335,col 33)"
      ]
    }
  ]
}