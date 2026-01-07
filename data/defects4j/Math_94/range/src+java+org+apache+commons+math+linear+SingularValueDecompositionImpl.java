{
  "filepath": "/tmp/Math-94b/src/java/org/apache/commons/math/linear/SingularValueDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SingularValueDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.SingularValueDecomposition"
      ],
      "begin_line": 34,
      "end_line": 438,
      "comment": "\n * Calculates the Singular Value Decomposition of a matrix.\n * \u003cp\u003eThe Singular Value Decomposition of matrix A is a set of three matrices:\n * U, \u0026Sigma; and V such that A \u003d U \u0026times; \u0026Sigma; \u0026times; V\u003csup\u003eT\u003c/sup\u003e.\n * Let A be an m \u0026times; n matrix, then U is an m \u0026times; m orthogonal matrix,\n * \u0026Sigma; is a m \u0026times; n diagonal matrix with positive diagonal elements,\n * and V is an n \u0026times; n orthogonal matrix.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "m"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Number of rows of the initial matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Number of columns of the initial matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "transformer"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Transformer to bidiagonal. "
    },
    {
      "type": "field",
      "varNames": [
        "mainBidiagonal"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Main diagonal of the bidiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "secondaryBidiagonal"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Secondary diagonal of the bidiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "mainTridiagonal"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Main diagonal of the tridiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "secondaryTridiagonal"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Secondary diagonal of the tridiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "eigenDecomposition"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Eigen decomposition of the tridiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "singularValues"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Singular values. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedU"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Cached value of U. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedUt"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Cached value of U\u003csup\u003eT\u003c/sup\u003e. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedS"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Cached value of S. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedV"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Cached value of V. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedVt"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Cached value of V\u003csup\u003eT\u003c/sup\u003e. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.SingularValueDecompositionImpl(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 89,
      "end_line": 126,
      "comment": "\n     * Calculates the Singular Value Decomposition of the given matrix. \n     * \u003cp\u003eCalling this constructor is equivalent to first call the no-arguments\n     * constructor and then call {@link #decompose(RealMatrix)}.\u003c/p\u003e\n     * @param matrix The matrix to decompose.\n     * @exception InvalidMatrixException (wrapping a {@link ConvergenceException}\n     * if algorithm fails to converge\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 37)",
        "(line 93,col 9)-(line 93,col 40)",
        "(line 95,col 9)-(line 95,col 24)",
        "(line 96,col 9)-(line 96,col 24)",
        "(line 97,col 9)-(line 97,col 24)",
        "(line 98,col 9)-(line 98,col 24)",
        "(line 101,col 9)-(line 101,col 64)",
        "(line 102,col 9)-(line 102,col 63)",
        "(line 103,col 9)-(line 103,col 68)",
        "(line 106,col 9)-(line 106,col 65)",
        "(line 107,col 9)-(line 107,col 69)",
        "(line 108,col 9)-(line 108,col 37)",
        "(line 109,col 9)-(line 109,col 35)",
        "(line 110,col 9)-(line 115,col 9)",
        "(line 118,col 9)-(line 120,col 59)",
        "(line 121,col 9)-(line 121,col 65)",
        "(line 122,col 9)-(line 124,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getU()",
      "begin_line": 129,
      "end_line": 171,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 132,col 9)-(line 166,col 9)",
        "(line 169,col 9)-(line 169,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT()",
      "begin_line": 174,
      "end_line": 184,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 177,col 9)-(line 179,col 9)",
        "(line 182,col 9)-(line 182,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getS()",
      "begin_line": 187,
      "end_line": 197,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 190,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 196,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getSingularValues()",
      "begin_line": 200,
      "end_line": 203,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getV()",
      "begin_line": 206,
      "end_line": 248,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 209,col 9)-(line 243,col 9)",
        "(line 246,col 9)-(line 246,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getVT()",
      "begin_line": 251,
      "end_line": 261,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 254,col 9)-(line 256,col 9)",
        "(line 259,col 9)-(line 259,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getNorm()",
      "begin_line": 264,
      "end_line": 267,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getConditionNumber()",
      "begin_line": 270,
      "end_line": 273,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getRank()",
      "begin_line": 276,
      "end_line": 288,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 78)",
        "(line 281,col 9)-(line 285,col 9)",
        "(line 286,col 9)-(line 286,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getSolver()",
      "begin_line": 291,
      "end_line": 294,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 292,col 9)-(line 293,col 62)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DecompositionSolver"
      ],
      "begin_line": 297,
      "end_line": 436,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 300,
      "end_line": 300,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "singularValues"
      ],
      "begin_line": 303,
      "end_line": 303,
      "comment": " Singular values. "
    },
    {
      "type": "field",
      "varNames": [
        "uT"
      ],
      "begin_line": 306,
      "end_line": 306,
      "comment": " U\u003csup\u003eT\u003c/sup\u003e matrix of the decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "v"
      ],
      "begin_line": 309,
      "end_line": 309,
      "comment": " V matrix of the decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "nonSingular"
      ],
      "begin_line": 312,
      "end_line": 312,
      "comment": " Singularity indicator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.Solver.Solver(double[], org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix, boolean)",
      "begin_line": 321,
      "end_line": 327,
      "comment": "\n         * Build a solver from decomposed matrix.\n         * @param singularValues singularValues\n         * @param uT U\u003csup\u003eT\u003c/sup\u003e matrix of the decomposition\n         * @param v V matrix of the decomposition\n         * @param nonSingular singularity indicator\n         ",
      "child_ranges": [
        "(line 323,col 13)-(line 323,col 49)",
        "(line 324,col 13)-(line 324,col 37)",
        "(line 325,col 13)-(line 325,col 36)",
        "(line 326,col 13)-(line 326,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.Solver.solve(double[])",
      "begin_line": 337,
      "end_line": 354,
      "comment": " Solve the linear equation A \u0026times; X \u003d B in least square sense.\n         * \u003cp\u003eThe m\u0026times;n matrix A may not be square, the solution X is\n         * such that ||A \u0026times; X - B|| is minimal.\u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X that minimizes the two norm of A \u0026times; X - B\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 340,col 13)-(line 342,col 13)",
        "(line 344,col 13)-(line 344,col 45)",
        "(line 345,col 13)-(line 351,col 13)",
        "(line 352,col 13)-(line 352,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 364,
      "end_line": 381,
      "comment": " Solve the linear equation A \u0026times; X \u003d B in least square sense.\n         * \u003cp\u003eThe m\u0026times;n matrix A may not be square, the solution X is\n         * such that ||A \u0026times; X - B|| is minimal.\u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X that minimizes the two norm of A \u0026times; X - B\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 367,col 13)-(line 369,col 13)",
        "(line 371,col 13)-(line 371,col 47)",
        "(line 372,col 13)-(line 378,col 13)",
        "(line 379,col 13)-(line 379,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 391,
      "end_line": 411,
      "comment": " Solve the linear equation A \u0026times; X \u003d B in least square sense.\n         * \u003cp\u003eThe m\u0026times;n matrix A may not be square, the solution X is\n         * such that ||A \u0026times; X - B|| is minimal.\u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a matrix X that minimizes the two norm of A \u0026times; X - B\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 394,col 13)-(line 396,col 13)",
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