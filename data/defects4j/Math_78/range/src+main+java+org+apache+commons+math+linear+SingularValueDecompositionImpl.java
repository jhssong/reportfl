{
  "filepath": "/tmp/Math-78b/src/main/java/org/apache/commons/math/linear/SingularValueDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SingularValueDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.SingularValueDecomposition"
      ],
      "begin_line": 34,
      "end_line": 469,
      "comment": "\n * Calculates the Singular Value Decomposition of a matrix.\n * \u003cp\u003eThe Singular Value Decomposition of matrix A is a set of three matrices:\n * U, \u0026Sigma; and V such that A \u003d U \u0026times; \u0026Sigma; \u0026times; V\u003csup\u003eT\u003c/sup\u003e.\n * Let A be an m \u0026times; n matrix, then U is an m \u0026times; m orthogonal matrix,\n * \u0026Sigma; is a m \u0026times; n diagonal matrix with positive diagonal elements,\n * and V is an n \u0026times; n orthogonal matrix.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "m"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Number of rows of the initial matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Number of columns of the initial matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "transformer"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Transformer to bidiagonal. "
    },
    {
      "type": "field",
      "varNames": [
        "mainBidiagonal"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Main diagonal of the bidiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "secondaryBidiagonal"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Secondary diagonal of the bidiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "mainTridiagonal"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Main diagonal of the tridiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "secondaryTridiagonal"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Secondary diagonal of the tridiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "eigenDecomposition"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Eigen decomposition of the tridiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "singularValues"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Singular values. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedU"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Cached value of U. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedUt"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Cached value of U\u003csup\u003eT\u003c/sup\u003e. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedS"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Cached value of S. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedV"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Cached value of V. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedVt"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Cached value of V\u003csup\u003eT\u003c/sup\u003e. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.SingularValueDecompositionImpl(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 84,
      "end_line": 122,
      "comment": "\n     * Calculates the Singular Value Decomposition of the given matrix.\n     * @param matrix The matrix to decompose.\n     * @exception InvalidMatrixException (wrapping a {@link\n     * org.apache.commons.math.ConvergenceException} if algorithm fails to converge\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 37)",
        "(line 88,col 9)-(line 88,col 40)",
        "(line 90,col 9)-(line 90,col 24)",
        "(line 91,col 9)-(line 91,col 24)",
        "(line 92,col 9)-(line 92,col 24)",
        "(line 93,col 9)-(line 93,col 24)",
        "(line 96,col 9)-(line 96,col 64)",
        "(line 97,col 9)-(line 97,col 63)",
        "(line 98,col 9)-(line 98,col 68)",
        "(line 101,col 9)-(line 101,col 65)",
        "(line 102,col 9)-(line 102,col 69)",
        "(line 103,col 9)-(line 103,col 37)",
        "(line 104,col 9)-(line 104,col 35)",
        "(line 105,col 9)-(line 110,col 9)",
        "(line 113,col 9)-(line 115,col 59)",
        "(line 116,col 9)-(line 116,col 65)",
        "(line 117,col 9)-(line 120,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getU()",
      "begin_line": 125,
      "end_line": 168,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 128,col 9)-(line 163,col 9)",
        "(line 166,col 9)-(line 166,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT()",
      "begin_line": 171,
      "end_line": 181,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 174,col 9)-(line 176,col 9)",
        "(line 179,col 9)-(line 179,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getS()",
      "begin_line": 184,
      "end_line": 194,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 187,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 193,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getSingularValues()",
      "begin_line": 197,
      "end_line": 200,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getV()",
      "begin_line": 203,
      "end_line": 246,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 206,col 9)-(line 241,col 9)",
        "(line 244,col 9)-(line 244,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getVT()",
      "begin_line": 249,
      "end_line": 259,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 252,col 9)-(line 254,col 9)",
        "(line 257,col 9)-(line 257,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getCovariance(double)",
      "begin_line": 262,
      "end_line": 288,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 26)",
        "(line 266,col 9)-(line 268,col 9)",
        "(line 270,col 9)-(line 274,col 9)",
        "(line 276,col 9)-(line 276,col 57)",
        "(line 277,col 9)-(line 283,col 39)",
        "(line 285,col 9)-(line 285,col 62)",
        "(line 286,col 9)-(line 286,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.Anonymous-79ab8283-bd2a-4e6a-be68-de365fc17687.visit(int, int, double)",
      "begin_line": 279,
      "end_line": 282,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 281,col 17)-(line 281,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getNorm()",
      "begin_line": 291,
      "end_line": 294,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getConditionNumber()",
      "begin_line": 297,
      "end_line": 300,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getRank()",
      "begin_line": 303,
      "end_line": 315,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 78)",
        "(line 308,col 9)-(line 312,col 9)",
        "(line 313,col 9)-(line 313,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getSolver()",
      "begin_line": 318,
      "end_line": 321,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 319,col 9)-(line 320,col 62)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DecompositionSolver"
      ],
      "begin_line": 324,
      "end_line": 467,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "singularValues"
      ],
      "begin_line": 327,
      "end_line": 327,
      "comment": " Singular values. "
    },
    {
      "type": "field",
      "varNames": [
        "uT"
      ],
      "begin_line": 330,
      "end_line": 330,
      "comment": " U\u003csup\u003eT\u003c/sup\u003e matrix of the decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "v"
      ],
      "begin_line": 333,
      "end_line": 333,
      "comment": " V matrix of the decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "nonSingular"
      ],
      "begin_line": 336,
      "end_line": 336,
      "comment": " Singularity indicator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.Solver.Solver(double[], org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix, boolean)",
      "begin_line": 345,
      "end_line": 351,
      "comment": "\n         * Build a solver from decomposed matrix.\n         * @param singularValues singularValues\n         * @param uT U\u003csup\u003eT\u003c/sup\u003e matrix of the decomposition\n         * @param v V matrix of the decomposition\n         * @param nonSingular singularity indicator\n         ",
      "child_ranges": [
        "(line 347,col 13)-(line 347,col 49)",
        "(line 348,col 13)-(line 348,col 37)",
        "(line 349,col 13)-(line 349,col 36)",
        "(line 350,col 13)-(line 350,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.Solver.solve(double[])",
      "begin_line": 361,
      "end_line": 380,
      "comment": " Solve the linear equation A \u0026times; X \u003d B in least square sense.\n         * \u003cp\u003eThe m\u0026times;n matrix A may not be square, the solution X is\n         * such that ||A \u0026times; X - B|| is minimal.\u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X that minimizes the two norm of A \u0026times; X - B\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 364,col 13)-(line 368,col 13)",
        "(line 370,col 13)-(line 370,col 45)",
        "(line 371,col 13)-(line 377,col 13)",
        "(line 378,col 13)-(line 378,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 390,
      "end_line": 409,
      "comment": " Solve the linear equation A \u0026times; X \u003d B in least square sense.\n         * \u003cp\u003eThe m\u0026times;n matrix A may not be square, the solution X is\n         * such that ||A \u0026times; X - B|| is minimal.\u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X that minimizes the two norm of A \u0026times; X - B\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 393,col 13)-(line 397,col 13)",
        "(line 399,col 13)-(line 399,col 47)",
        "(line 400,col 13)-(line 406,col 13)",
        "(line 407,col 13)-(line 407,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 419,
      "end_line": 442,
      "comment": " Solve the linear equation A \u0026times; X \u003d B in least square sense.\n         * \u003cp\u003eThe m\u0026times;n matrix A may not be square, the solution X is\n         * such that ||A \u0026times; X - B|| is minimal.\u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a matrix X that minimizes the two norm of A \u0026times; X - B\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 422,col 13)-(line 427,col 13)",
        "(line 429,col 13)-(line 429,col 48)",
        "(line 430,col 13)-(line 439,col 13)",
        "(line 440,col 13)-(line 440,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.Solver.isNonSingular()",
      "begin_line": 448,
      "end_line": 450,
      "comment": "\n         * Check if the decomposed matrix is non-singular.\n         * @return true if the decomposed matrix is non-singular\n         ",
      "child_ranges": [
        "(line 449,col 13)-(line 449,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.Solver.getInverse()",
      "begin_line": 456,
      "end_line": 465,
      "comment": " Get the pseudo-inverse of the decomposed matrix.\n         * @return inverse matrix\n         * @throws InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 459,col 13)-(line 461,col 13)",
        "(line 463,col 13)-(line 463,col 86)"
      ]
    }
  ]
}