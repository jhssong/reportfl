{
  "filepath": "/tmp/Math-87b/src/java/org/apache/commons/math/linear/SingularValueDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SingularValueDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.SingularValueDecomposition"
      ],
      "begin_line": 35,
      "end_line": 438,
      "comment": "\n * Calculates the Singular Value Decomposition of a matrix.\n * \u003cp\u003eThe Singular Value Decomposition of matrix A is a set of three matrices:\n * U, \u0026Sigma; and V such that A \u003d U \u0026times; \u0026Sigma; \u0026times; V\u003csup\u003eT\u003c/sup\u003e.\n * Let A be an m \u0026times; n matrix, then U is an m \u0026times; m orthogonal matrix,\n * \u0026Sigma; is a m \u0026times; n diagonal matrix with positive diagonal elements,\n * and V is an n \u0026times; n orthogonal matrix.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "m"
      ],
      "begin_line": 38,
      "end_line": 38,
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
        "transformer"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Transformer to bidiagonal. "
    },
    {
      "type": "field",
      "varNames": [
        "mainBidiagonal"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Main diagonal of the bidiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "secondaryBidiagonal"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Secondary diagonal of the bidiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "mainTridiagonal"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Main diagonal of the tridiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "secondaryTridiagonal"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Secondary diagonal of the tridiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "eigenDecomposition"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Eigen decomposition of the tridiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "singularValues"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Singular values. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedU"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Cached value of U. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedUt"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Cached value of U\u003csup\u003eT\u003c/sup\u003e. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedS"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Cached value of S. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedV"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Cached value of V. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedVt"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Cached value of V\u003csup\u003eT\u003c/sup\u003e. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.SingularValueDecompositionImpl(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 85,
      "end_line": 122,
      "comment": "\n     * Calculates the Singular Value Decomposition of the given matrix. \n     * @param matrix The matrix to decompose.\n     * @exception InvalidMatrixException (wrapping a {@link ConvergenceException}\n     * if algorithm fails to converge\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 37)",
        "(line 89,col 9)-(line 89,col 40)",
        "(line 91,col 9)-(line 91,col 24)",
        "(line 92,col 9)-(line 92,col 24)",
        "(line 93,col 9)-(line 93,col 24)",
        "(line 94,col 9)-(line 94,col 24)",
        "(line 97,col 9)-(line 97,col 64)",
        "(line 98,col 9)-(line 98,col 63)",
        "(line 99,col 9)-(line 99,col 68)",
        "(line 102,col 9)-(line 102,col 65)",
        "(line 103,col 9)-(line 103,col 69)",
        "(line 104,col 9)-(line 104,col 37)",
        "(line 105,col 9)-(line 105,col 35)",
        "(line 106,col 9)-(line 111,col 9)",
        "(line 114,col 9)-(line 116,col 59)",
        "(line 117,col 9)-(line 117,col 65)",
        "(line 118,col 9)-(line 120,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getU()",
      "begin_line": 125,
      "end_line": 167,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 128,col 9)-(line 162,col 9)",
        "(line 165,col 9)-(line 165,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT()",
      "begin_line": 170,
      "end_line": 180,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 173,col 9)-(line 175,col 9)",
        "(line 178,col 9)-(line 178,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getS()",
      "begin_line": 183,
      "end_line": 193,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 186,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 192,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getSingularValues()",
      "begin_line": 196,
      "end_line": 199,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getV()",
      "begin_line": 202,
      "end_line": 244,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 205,col 9)-(line 239,col 9)",
        "(line 242,col 9)-(line 242,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getVT()",
      "begin_line": 247,
      "end_line": 257,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 250,col 9)-(line 252,col 9)",
        "(line 255,col 9)-(line 255,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getNorm()",
      "begin_line": 260,
      "end_line": 263,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getConditionNumber()",
      "begin_line": 266,
      "end_line": 269,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getRank()",
      "begin_line": 272,
      "end_line": 284,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 78)",
        "(line 277,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 282,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getSolver()",
      "begin_line": 287,
      "end_line": 290,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 288,col 9)-(line 289,col 62)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DecompositionSolver"
      ],
      "begin_line": 293,
      "end_line": 436,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "singularValues"
      ],
      "begin_line": 296,
      "end_line": 296,
      "comment": " Singular values. "
    },
    {
      "type": "field",
      "varNames": [
        "uT"
      ],
      "begin_line": 299,
      "end_line": 299,
      "comment": " U\u003csup\u003eT\u003c/sup\u003e matrix of the decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "v"
      ],
      "begin_line": 302,
      "end_line": 302,
      "comment": " V matrix of the decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "nonSingular"
      ],
      "begin_line": 305,
      "end_line": 305,
      "comment": " Singularity indicator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.Solver.Solver(double[], org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix, boolean)",
      "begin_line": 314,
      "end_line": 320,
      "comment": "\n         * Build a solver from decomposed matrix.\n         * @param singularValues singularValues\n         * @param uT U\u003csup\u003eT\u003c/sup\u003e matrix of the decomposition\n         * @param v V matrix of the decomposition\n         * @param nonSingular singularity indicator\n         ",
      "child_ranges": [
        "(line 316,col 13)-(line 316,col 49)",
        "(line 317,col 13)-(line 317,col 37)",
        "(line 318,col 13)-(line 318,col 36)",
        "(line 319,col 13)-(line 319,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.Solver.solve(double[])",
      "begin_line": 330,
      "end_line": 349,
      "comment": " Solve the linear equation A \u0026times; X \u003d B in least square sense.\n         * \u003cp\u003eThe m\u0026times;n matrix A may not be square, the solution X is\n         * such that ||A \u0026times; X - B|| is minimal.\u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X that minimizes the two norm of A \u0026times; X - B\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 333,col 13)-(line 337,col 13)",
        "(line 339,col 13)-(line 339,col 45)",
        "(line 340,col 13)-(line 346,col 13)",
        "(line 347,col 13)-(line 347,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 359,
      "end_line": 378,
      "comment": " Solve the linear equation A \u0026times; X \u003d B in least square sense.\n         * \u003cp\u003eThe m\u0026times;n matrix A may not be square, the solution X is\n         * such that ||A \u0026times; X - B|| is minimal.\u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X that minimizes the two norm of A \u0026times; X - B\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 362,col 13)-(line 366,col 13)",
        "(line 368,col 13)-(line 368,col 47)",
        "(line 369,col 13)-(line 375,col 13)",
        "(line 376,col 13)-(line 376,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 388,
      "end_line": 411,
      "comment": " Solve the linear equation A \u0026times; X \u003d B in least square sense.\n         * \u003cp\u003eThe m\u0026times;n matrix A may not be square, the solution X is\n         * such that ||A \u0026times; X - B|| is minimal.\u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a matrix X that minimizes the two norm of A \u0026times; X - B\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 391,col 13)-(line 396,col 13)",
        "(line 398,col 13)-(line 398,col 48)",
        "(line 399,col 13)-(line 408,col 13)",
        "(line 409,col 13)-(line 409,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.Solver.isNonSingular()",
      "begin_line": 417,
      "end_line": 419,
      "comment": "\n         * Check if the decomposed matrix is non-singular.\n         * @return true if the decomposed matrix is non-singular\n         ",
      "child_ranges": [
        "(line 418,col 13)-(line 418,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.Solver.getInverse()",
      "begin_line": 425,
      "end_line": 434,
      "comment": " Get the pseudo-inverse of the decomposed matrix.\n         * @return inverse matrix\n         * @throws InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 428,col 13)-(line 430,col 13)",
        "(line 432,col 13)-(line 432,col 86)"
      ]
    }
  ]
}