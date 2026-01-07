{
  "filepath": "/tmp/Math-75b/src/main/java/org/apache/commons/math/linear/SingularValueDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SingularValueDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.SingularValueDecomposition"
      ],
      "begin_line": 46,
      "end_line": 444,
      "comment": "\n * Calculates the compact or truncated Singular Value Decomposition of a matrix.\n * \u003cp\u003eThe Singular Value Decomposition of matrix A is a set of three matrices:\n * U, \u0026Sigma; and V such that A \u003d U \u0026times; \u0026Sigma; \u0026times; V\u003csup\u003eT\u003c/sup\u003e.\n * Let A be a m \u0026times; n matrix, then U is a m \u0026times; p orthogonal matrix,\n * \u0026Sigma; is a p \u0026times; p diagonal matrix with positive diagonal elements,\n * V is a n \u0026times; p orthogonal matrix (hence V\u003csup\u003eT\u003c/sup\u003e is a p \u0026times; n\n * orthogonal matrix). The size p depends on the chosen algorithm:\n * \u003cul\u003e\n *   \u003cli\u003efor full SVD, p would be n, but this is not supported by this implementation,\u003c/li\u003e\n *   \u003cli\u003efor compact SVD, p is the rank r of the matrix\n *       (i. e. the number of positive singular values),\u003c/li\u003e\n *   \u003cli\u003efor truncated SVD p is min(r, t) where t is user-specified.\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * \u003cp\u003e\n * Note that since this class computes only the compact or truncated SVD and not\n * the full SVD, the singular values computed are always positive.\n * \u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "m"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Number of rows of the initial matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Number of columns of the initial matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "transformer"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Transformer to bidiagonal. "
    },
    {
      "type": "field",
      "varNames": [
        "mainBidiagonal"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Main diagonal of the bidiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "secondaryBidiagonal"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Secondary diagonal of the bidiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "mainTridiagonal"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Main diagonal of the tridiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "secondaryTridiagonal"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Secondary diagonal of the tridiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "eigenDecomposition"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Eigen decomposition of the tridiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "singularValues"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Singular values. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedU"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Cached value of U. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedUt"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Cached value of U\u003csup\u003eT\u003c/sup\u003e. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedS"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Cached value of S. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedV"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Cached value of V. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedVt"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Cached value of V\u003csup\u003eT\u003c/sup\u003e. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.SingularValueDecompositionImpl(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 96,
      "end_line": 99,
      "comment": "\n     * Calculates the compact Singular Value Decomposition of the given matrix.\n     * @param matrix The matrix to decompose.\n     * @exception InvalidMatrixException (wrapping a {@link\n     * org.apache.commons.math.ConvergenceException} if algorithm fails to converge\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 86)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.SingularValueDecompositionImpl(org.apache.commons.math.linear.RealMatrix, int)",
      "begin_line": 108,
      "end_line": 150,
      "comment": "\n     * Calculates the Singular Value Decomposition of the given matrix.\n     * @param matrix The matrix to decompose.\n     * @param max maximal number of singular values to compute\n     * @exception InvalidMatrixException (wrapping a {@link\n     * org.apache.commons.math.ConvergenceException} if algorithm fails to converge\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 37)",
        "(line 112,col 9)-(line 112,col 40)",
        "(line 114,col 9)-(line 114,col 24)",
        "(line 115,col 9)-(line 115,col 24)",
        "(line 116,col 9)-(line 116,col 24)",
        "(line 117,col 9)-(line 117,col 24)",
        "(line 120,col 9)-(line 120,col 64)",
        "(line 121,col 9)-(line 121,col 63)",
        "(line 122,col 9)-(line 122,col 68)",
        "(line 125,col 9)-(line 125,col 65)",
        "(line 126,col 9)-(line 126,col 69)",
        "(line 127,col 9)-(line 127,col 37)",
        "(line 128,col 9)-(line 128,col 35)",
        "(line 129,col 9)-(line 134,col 9)",
        "(line 137,col 9)-(line 139,col 59)",
        "(line 140,col 9)-(line 140,col 77)",
        "(line 141,col 9)-(line 141,col 50)",
        "(line 142,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 145,col 39)",
        "(line 146,col 9)-(line 148,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getU()",
      "begin_line": 153,
      "end_line": 201,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 156,col 9)-(line 196,col 9)",
        "(line 199,col 9)-(line 199,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT()",
      "begin_line": 204,
      "end_line": 214,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 207,col 9)-(line 209,col 9)",
        "(line 212,col 9)-(line 212,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getS()",
      "begin_line": 217,
      "end_line": 227,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 220,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 226,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getSingularValues()",
      "begin_line": 230,
      "end_line": 233,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getV()",
      "begin_line": 236,
      "end_line": 283,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 239,col 9)-(line 278,col 9)",
        "(line 281,col 9)-(line 281,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getVT()",
      "begin_line": 286,
      "end_line": 296,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 289,col 9)-(line 291,col 9)",
        "(line 294,col 9)-(line 294,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getCovariance(double)",
      "begin_line": 299,
      "end_line": 326,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 44)",
        "(line 303,col 9)-(line 303,col 26)",
        "(line 304,col 9)-(line 306,col 9)",
        "(line 308,col 9)-(line 312,col 9)",
        "(line 314,col 9)-(line 314,col 57)",
        "(line 315,col 9)-(line 321,col 39)",
        "(line 323,col 9)-(line 323,col 62)",
        "(line 324,col 9)-(line 324,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.Anonymous-4327416a-9b4f-47ef-ab2e-3f408fa10646.visit(int, int, double)",
      "begin_line": 317,
      "end_line": 320,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 319,col 17)-(line 319,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getNorm()",
      "begin_line": 329,
      "end_line": 332,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getConditionNumber()",
      "begin_line": 335,
      "end_line": 338,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getRank()",
      "begin_line": 341,
      "end_line": 353,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 78)",
        "(line 346,col 9)-(line 350,col 9)",
        "(line 351,col 9)-(line 351,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getSolver()",
      "begin_line": 356,
      "end_line": 359,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 357,col 9)-(line 358,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DecompositionSolver"
      ],
      "begin_line": 362,
      "end_line": 442,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "pseudoInverse"
      ],
      "begin_line": 365,
      "end_line": 365,
      "comment": " Pseudo-inverse of the initial matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "nonSingular"
      ],
      "begin_line": 368,
      "end_line": 368,
      "comment": " Singularity indicator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.Solver.Solver(double[], org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix, boolean)",
      "begin_line": 377,
      "end_line": 389,
      "comment": "\n         * Build a solver from decomposed matrix.\n         * @param singularValues singularValues\n         * @param uT U\u003csup\u003eT\u003c/sup\u003e matrix of the decomposition\n         * @param v V matrix of the decomposition\n         * @param nonSingular singularity indicator\n         ",
      "child_ranges": [
        "(line 379,col 13)-(line 379,col 47)",
        "(line 380,col 13)-(line 386,col 13)",
        "(line 387,col 13)-(line 387,col 80)",
        "(line 388,col 13)-(line 388,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.Solver.solve(double[])",
      "begin_line": 398,
      "end_line": 401,
      "comment": " Solve the linear equation A \u0026times; X \u003d B in least square sense.\n         * \u003cp\u003eThe m\u0026times;n matrix A may not be square, the solution X is\n         * such that ||A \u0026times; X - B|| is minimal.\u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X that minimizes the two norm of A \u0026times; X - B\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         ",
      "child_ranges": [
        "(line 400,col 13)-(line 400,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 410,
      "end_line": 413,
      "comment": " Solve the linear equation A \u0026times; X \u003d B in least square sense.\n         * \u003cp\u003eThe m\u0026times;n matrix A may not be square, the solution X is\n         * such that ||A \u0026times; X - B|| is minimal.\u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X that minimizes the two norm of A \u0026times; X - B\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         ",
      "child_ranges": [
        "(line 412,col 13)-(line 412,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 422,
      "end_line": 425,
      "comment": " Solve the linear equation A \u0026times; X \u003d B in least square sense.\n         * \u003cp\u003eThe m\u0026times;n matrix A may not be square, the solution X is\n         * such that ||A \u0026times; X - B|| is minimal.\u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a matrix X that minimizes the two norm of A \u0026times; X - B\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         ",
      "child_ranges": [
        "(line 424,col 13)-(line 424,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.Solver.isNonSingular()",
      "begin_line": 431,
      "end_line": 433,
      "comment": "\n         * Check if the decomposed matrix is non-singular.\n         * @return true if the decomposed matrix is non-singular\n         ",
      "child_ranges": [
        "(line 432,col 13)-(line 432,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.Solver.getInverse()",
      "begin_line": 438,
      "end_line": 440,
      "comment": " Get the pseudo-inverse of the decomposed matrix.\n         * @return inverse matrix\n         ",
      "child_ranges": [
        "(line 439,col 13)-(line 439,col 33)"
      ]
    }
  ]
}