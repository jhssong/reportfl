{
  "filepath": "/tmp/Math-56b/src/main/java/org/apache/commons/math/linear/CholeskyDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CholeskyDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.CholeskyDecomposition"
      ],
      "begin_line": 35,
      "end_line": 328,
      "comment": "\n * Calculates the Cholesky decomposition of a matrix.\n * \u003cp\u003eThe Cholesky decomposition of a real symmetric positive-definite\n * matrix A consists of a lower triangular matrix L with same size that\n * satisfy: A \u003d LL\u003csup\u003eT\u003c/sup\u003eQ \u003d I). In a sense, this is the square root of A.\u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/CholeskyDecomposition.html\"\u003eMathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Cholesky_decomposition\"\u003eWikipedia\u003c/a\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RELATIVE_SYMMETRY_THRESHOLD"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * Default threshold above which off-diagonal elements are considered too different\n     * and matrix not symmetric.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ABSOLUTE_POSITIVITY_THRESHOLD"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Default threshold below which diagonal elements are considered null\n     * and matrix not positive definite.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lTData"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Row-oriented storage for L\u003csup\u003eT\u003c/sup\u003e matrix data. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedL"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Cached value of L. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedLT"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Cached value of LT. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.CholeskyDecompositionImpl(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 71,
      "end_line": 74,
      "comment": "\n     * Calculates the Cholesky decomposition of the given matrix.\n     * \u003cp\u003e\n     * Calling this constructor is equivalent to call {@link\n     * #CholeskyDecompositionImpl(RealMatrix, double, double)} with the\n     * thresholds set to the default values {@link\n     * #DEFAULT_RELATIVE_SYMMETRY_THRESHOLD} and {@link\n     * #DEFAULT_ABSOLUTE_POSITIVITY_THRESHOLD}\n     * \u003c/p\u003e\n     * @param matrix the matrix to decompose\n     * @throws NonSquareMatrixException if the matrix is not square.\n     * @throws NonSymmetricMatrixException if the matrix is not symmetric.\n     * @throws NonPositiveDefiniteMatrixException if the matrix is not\n     * strictly positive definite.\n     * @see #CholeskyDecompositionImpl(RealMatrix, double, double)\n     * @see #DEFAULT_RELATIVE_SYMMETRY_THRESHOLD\n     * @see #DEFAULT_ABSOLUTE_POSITIVITY_THRESHOLD\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 73,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.CholeskyDecompositionImpl(org.apache.commons.math.linear.RealMatrix, double, double)",
      "begin_line": 91,
      "end_line": 143,
      "comment": "\n     * Calculates the Cholesky decomposition of the given matrix.\n     * @param matrix the matrix to decompose\n     * @param relativeSymmetryThreshold threshold above which off-diagonal\n     * elements are considered too different and matrix not symmetric\n     * @param absolutePositivityThreshold threshold below which diagonal\n     * elements are considered null and matrix not positive definite\n     * @throws NonSquareMatrixException if the matrix is not square.\n     * @throws NonSymmetricMatrixException if the matrix is not symmetric.\n     * @throws NonPositiveDefiniteMatrixException if the matrix is not\n     * strictly positive definite.\n     * @see #CholeskyDecompositionImpl(RealMatrix)\n     * @see #DEFAULT_RELATIVE_SYMMETRY_THRESHOLD\n     * @see #DEFAULT_ABSOLUTE_POSITIVITY_THRESHOLD\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 97,col 9)",
        "(line 99,col 9)-(line 99,col 51)",
        "(line 100,col 9)-(line 100,col 36)",
        "(line 101,col 9)-(line 101,col 24)",
        "(line 102,col 9)-(line 102,col 24)",
        "(line 105,col 9)-(line 120,col 9)",
        "(line 123,col 9)-(line 142,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.getL()",
      "begin_line": 146,
      "end_line": 151,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 147,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.getLT()",
      "begin_line": 154,
      "end_line": 162,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 156,col 9)-(line 158,col 9)",
        "(line 161,col 9)-(line 161,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.getDeterminant()",
      "begin_line": 165,
      "end_line": 172,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 33)",
        "(line 167,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.getSolver()",
      "begin_line": 175,
      "end_line": 177,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DecompositionSolver"
      ],
      "begin_line": 180,
      "end_line": 327,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "lTData"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": " Row-oriented storage for L\u003csup\u003eT\u003c/sup\u003e matrix data. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.Solver.Solver(double[][])",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\n         * Build a solver from decomposed matrix.\n         * @param lTData row-oriented storage for L\u003csup\u003eT\u003c/sup\u003e matrix data\n         ",
      "child_ranges": [
        "(line 189,col 13)-(line 189,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.Solver.isNonSingular()",
      "begin_line": 193,
      "end_line": 196,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 195,col 13)-(line 195,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.Solver.solve(double[])",
      "begin_line": 199,
      "end_line": 227,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 200,col 13)-(line 200,col 40)",
        "(line 201,col 13)-(line 203,col 13)",
        "(line 205,col 13)-(line 205,col 41)",
        "(line 208,col 13)-(line 215,col 13)",
        "(line 218,col 13)-(line 224,col 13)",
        "(line 226,col 13)-(line 226,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 230,
      "end_line": 263,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 231,col 13)-(line 262,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.Solver.solve(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 272,
      "end_line": 274,
      "comment": " Solve the linear equation A \u0026times; X \u003d B.\n         * \u003cp\u003eThe A matrix is implicit here. It is \u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X such that A \u0026times; X \u003d B\n         * @throws DimensionMismatchException if the matrices dimensions do not match.\n         * @throws SingularMatrixException if the decomposed matrix is singular.\n         ",
      "child_ranges": [
        "(line 273,col 13)-(line 273,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 277,
      "end_line": 321,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 278,col 13)-(line 278,col 40)",
        "(line 279,col 13)-(line 281,col 13)",
        "(line 283,col 13)-(line 283,col 53)",
        "(line 284,col 13)-(line 284,col 39)",
        "(line 287,col 13)-(line 301,col 13)",
        "(line 304,col 13)-(line 317,col 13)",
        "(line 319,col 13)-(line 319,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.Solver.getInverse()",
      "begin_line": 324,
      "end_line": 326,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 325,col 13)-(line 325,col 78)"
      ]
    }
  ]
}