{
  "filepath": "/tmp/Math-99b/src/java/org/apache/commons/math/linear/decomposition/SingularValueDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SingularValueDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.decomposition.SingularValueDecomposition"
      ],
      "begin_line": 39,
      "end_line": 450,
      "comment": "\n * Calculates the Singular Value Decomposition of a matrix.\n * \u003cp\u003eThe Singular Value Decomposition of matrix A is a set of three matrices:\n * U, \u0026Sigma; and V such that A \u003d U \u0026times; \u0026Sigma; \u0026times; V\u003csup\u003eT\u003c/sup\u003e.\n * Let A be an m \u0026times; n matrix, then U is an m \u0026times; m orthogonal matrix,\n * \u0026Sigma; is a m \u0026times; n diagonal matrix with positive diagonal elements,\n * and V is an n \u0026times; n orthogonal matrix.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "m"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Number of rows of the initial matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Number of columns of the initial matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "transformer"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Transformer to bidiagonal. "
    },
    {
      "type": "field",
      "varNames": [
        "mainBidiagonal"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Main diagonal of the bidiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "secondaryBidiagonal"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Secondary diagonal of the bidiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "mainTridiagonal"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Main diagonal of the tridiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "secondaryTridiagonal"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Secondary diagonal of the tridiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "eigenDecomposition"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Eigen decomposition of the tridiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "singularValues"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Singular values. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedU"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Cached value of U. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedUt"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Cached value of U\u003csup\u003eT\u003c/sup\u003e. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedS"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Cached value of S. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedV"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Cached value of V. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedVt"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Cached value of V\u003csup\u003eT\u003c/sup\u003e. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.decomposition.SingularValueDecompositionImpl.SingularValueDecompositionImpl(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 92,
      "end_line": 129,
      "comment": "\n     * Calculates the Singular Value Decomposition of the given matrix. \n     * @param matrix The matrix to decompose.\n     * @exception InvalidMatrixException (wrapping a {@link ConvergenceException}\n     * if algorithm fails to converge\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 37)",
        "(line 96,col 9)-(line 96,col 40)",
        "(line 98,col 9)-(line 98,col 24)",
        "(line 99,col 9)-(line 99,col 24)",
        "(line 100,col 9)-(line 100,col 24)",
        "(line 101,col 9)-(line 101,col 24)",
        "(line 104,col 9)-(line 104,col 64)",
        "(line 105,col 9)-(line 105,col 63)",
        "(line 106,col 9)-(line 106,col 68)",
        "(line 109,col 9)-(line 109,col 65)",
        "(line 110,col 9)-(line 110,col 69)",
        "(line 111,col 9)-(line 111,col 37)",
        "(line 112,col 9)-(line 112,col 35)",
        "(line 113,col 9)-(line 118,col 9)",
        "(line 121,col 9)-(line 123,col 59)",
        "(line 124,col 9)-(line 124,col 65)",
        "(line 125,col 9)-(line 127,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.SingularValueDecompositionImpl.getU()",
      "begin_line": 132,
      "end_line": 174,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 135,col 9)-(line 169,col 9)",
        "(line 172,col 9)-(line 172,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.SingularValueDecompositionImpl.getUT()",
      "begin_line": 177,
      "end_line": 187,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 180,col 9)-(line 182,col 9)",
        "(line 185,col 9)-(line 185,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.SingularValueDecompositionImpl.getS()",
      "begin_line": 190,
      "end_line": 200,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 193,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 199,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.SingularValueDecompositionImpl.getSingularValues()",
      "begin_line": 203,
      "end_line": 206,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.SingularValueDecompositionImpl.getV()",
      "begin_line": 209,
      "end_line": 251,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 212,col 9)-(line 246,col 9)",
        "(line 249,col 9)-(line 249,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.SingularValueDecompositionImpl.getVT()",
      "begin_line": 254,
      "end_line": 264,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 257,col 9)-(line 259,col 9)",
        "(line 262,col 9)-(line 262,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.SingularValueDecompositionImpl.getNorm()",
      "begin_line": 267,
      "end_line": 270,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.SingularValueDecompositionImpl.getConditionNumber()",
      "begin_line": 273,
      "end_line": 276,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.SingularValueDecompositionImpl.getRank()",
      "begin_line": 279,
      "end_line": 291,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 78)",
        "(line 284,col 9)-(line 288,col 9)",
        "(line 289,col 9)-(line 289,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.SingularValueDecompositionImpl.getSolver()",
      "begin_line": 294,
      "end_line": 297,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 295,col 9)-(line 296,col 62)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.decomposition.DecompositionSolver"
      ],
      "begin_line": 300,
      "end_line": 448,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 303,
      "end_line": 303,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "singularValues"
      ],
      "begin_line": 306,
      "end_line": 306,
      "comment": " Singular values. "
    },
    {
      "type": "field",
      "varNames": [
        "uT"
      ],
      "begin_line": 309,
      "end_line": 309,
      "comment": " U\u003csup\u003eT\u003c/sup\u003e matrix of the decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "v"
      ],
      "begin_line": 312,
      "end_line": 312,
      "comment": " V matrix of the decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "nonSingular"
      ],
      "begin_line": 315,
      "end_line": 315,
      "comment": " Singularity indicator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.decomposition.SingularValueDecompositionImpl.Solver.Solver(double[], org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix, boolean)",
      "begin_line": 324,
      "end_line": 330,
      "comment": "\n         * Build a solver from decomposed matrix.\n         * @param singularValues singularValues\n         * @param uT U\u003csup\u003eT\u003c/sup\u003e matrix of the decomposition\n         * @param v V matrix of the decomposition\n         * @param nonSingular singularity indicator\n         ",
      "child_ranges": [
        "(line 326,col 13)-(line 326,col 49)",
        "(line 327,col 13)-(line 327,col 37)",
        "(line 328,col 13)-(line 328,col 36)",
        "(line 329,col 13)-(line 329,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.SingularValueDecompositionImpl.Solver.solve(double[])",
      "begin_line": 340,
      "end_line": 359,
      "comment": " Solve the linear equation A \u0026times; X \u003d B in least square sense.\n         * \u003cp\u003eThe m\u0026times;n matrix A may not be square, the solution X is\n         * such that ||A \u0026times; X - B|| is minimal.\u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X that minimizes the two norm of A \u0026times; X - B\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 343,col 13)-(line 347,col 13)",
        "(line 349,col 13)-(line 349,col 45)",
        "(line 350,col 13)-(line 356,col 13)",
        "(line 357,col 13)-(line 357,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.SingularValueDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 369,
      "end_line": 388,
      "comment": " Solve the linear equation A \u0026times; X \u003d B in least square sense.\n         * \u003cp\u003eThe m\u0026times;n matrix A may not be square, the solution X is\n         * such that ||A \u0026times; X - B|| is minimal.\u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X that minimizes the two norm of A \u0026times; X - B\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 372,col 13)-(line 376,col 13)",
        "(line 378,col 13)-(line 378,col 47)",
        "(line 379,col 13)-(line 385,col 13)",
        "(line 386,col 13)-(line 386,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.SingularValueDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 398,
      "end_line": 423,
      "comment": " Solve the linear equation A \u0026times; X \u003d B in least square sense.\n         * \u003cp\u003eThe m\u0026times;n matrix A may not be square, the solution X is\n         * such that ||A \u0026times; X - B|| is minimal.\u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a matrix X that minimizes the two norm of A \u0026times; X - B\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 401,col 13)-(line 408,col 13)",
        "(line 410,col 13)-(line 410,col 48)",
        "(line 411,col 13)-(line 420,col 13)",
        "(line 421,col 13)-(line 421,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.SingularValueDecompositionImpl.Solver.isNonSingular()",
      "begin_line": 429,
      "end_line": 431,
      "comment": "\n         * Check if the decomposed matrix is non-singular.\n         * @return true if the decomposed matrix is non-singular\n         ",
      "child_ranges": [
        "(line 430,col 13)-(line 430,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.SingularValueDecompositionImpl.Solver.getInverse()",
      "begin_line": 437,
      "end_line": 446,
      "comment": " Get the pseudo-inverse of the decomposed matrix.\n         * @return inverse matrix\n         * @throws InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 440,col 13)-(line 442,col 13)",
        "(line 444,col 13)-(line 444,col 86)"
      ]
    }
  ]
}