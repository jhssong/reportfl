{
  "filepath": "/tmp/Math-65b/src/main/java/org/apache/commons/math/linear/CholeskyDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CholeskyDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.CholeskyDecomposition"
      ],
      "begin_line": 35,
      "end_line": 355,
      "comment": "\n * Calculates the Cholesky decomposition of a matrix.\n * \u003cp\u003eThe Cholesky decomposition of a real symmetric positive-definite\n * matrix A consists of a lower triangular matrix L with same size that\n * satisfy: A \u003d LL\u003csup\u003eT\u003c/sup\u003eQ \u003d I). In a sense, this is the square root of A.\u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/CholeskyDecomposition.html\"\u003eMathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Cholesky_decomposition\"\u003eWikipedia\u003c/a\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RELATIVE_SYMMETRY_THRESHOLD"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Default threshold above which off-diagonal elements are considered too different\n     * and matrix not symmetric. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ABSOLUTE_POSITIVITY_THRESHOLD"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Default threshold below which diagonal elements are considered null\n     * and matrix not positive definite. "
    },
    {
      "type": "field",
      "varNames": [
        "lTData"
      ],
      "begin_line": 46,
      "end_line": 46,
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
      "begin_line": 52,
      "end_line": 52,
      "comment": " Cached value of LT. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.CholeskyDecompositionImpl(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 72,
      "end_line": 77,
      "comment": "\n     * Calculates the Cholesky decomposition of the given matrix.\n     * \u003cp\u003e\n     * Calling this constructor is equivalent to call {@link\n     * #CholeskyDecompositionImpl(RealMatrix, double, double)} with the\n     * thresholds set to the default values {@link\n     * #DEFAULT_RELATIVE_SYMMETRY_THRESHOLD} and {@link\n     * #DEFAULT_ABSOLUTE_POSITIVITY_THRESHOLD}\n     * \u003c/p\u003e\n     * @param matrix the matrix to decompose\n     * @exception NonSquareMatrixException if matrix is not square\n     * @exception NotSymmetricMatrixException if matrix is not symmetric\n     * @exception NotPositiveDefiniteMatrixException if the matrix is not\n     * strictly positive definite\n     * @see #CholeskyDecompositionImpl(RealMatrix, double, double)\n     * @see #DEFAULT_RELATIVE_SYMMETRY_THRESHOLD\n     * @see #DEFAULT_ABSOLUTE_POSITIVITY_THRESHOLD\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 76,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.CholeskyDecompositionImpl(org.apache.commons.math.linear.RealMatrix, double, double)",
      "begin_line": 94,
      "end_line": 152,
      "comment": "\n     * Calculates the Cholesky decomposition of the given matrix.\n     * @param matrix the matrix to decompose\n     * @param relativeSymmetryThreshold threshold above which off-diagonal\n     * elements are considered too different and matrix not symmetric\n     * @param absolutePositivityThreshold threshold below which diagonal\n     * elements are considered null and matrix not positive definite\n     * @exception NonSquareMatrixException if matrix is not square\n     * @exception NotSymmetricMatrixException if matrix is not symmetric\n     * @exception NotPositiveDefiniteMatrixException if the matrix is not\n     * strictly positive definite\n     * @see #CholeskyDecompositionImpl(RealMatrix)\n     * @see #DEFAULT_RELATIVE_SYMMETRY_THRESHOLD\n     * @see #DEFAULT_ABSOLUTE_POSITIVITY_THRESHOLD\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 103,col 9)",
        "(line 105,col 9)-(line 105,col 51)",
        "(line 106,col 9)-(line 106,col 36)",
        "(line 107,col 9)-(line 107,col 24)",
        "(line 108,col 9)-(line 108,col 24)",
        "(line 111,col 9)-(line 127,col 9)",
        "(line 130,col 9)-(line 150,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.getL()",
      "begin_line": 155,
      "end_line": 160,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.getLT()",
      "begin_line": 163,
      "end_line": 172,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 165,col 9)-(line 167,col 9)",
        "(line 170,col 9)-(line 170,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.getDeterminant()",
      "begin_line": 175,
      "end_line": 182,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 33)",
        "(line 177,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 181,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.getSolver()",
      "begin_line": 185,
      "end_line": 187,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DecompositionSolver"
      ],
      "begin_line": 190,
      "end_line": 353,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "lTData"
      ],
      "begin_line": 193,
      "end_line": 193,
      "comment": " Row-oriented storage for L\u003csup\u003eT\u003c/sup\u003e matrix data. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.Solver.Solver(double[][])",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\n         * Build a solver from decomposed matrix.\n         * @param lTData row-oriented storage for L\u003csup\u003eT\u003c/sup\u003e matrix data\n         ",
      "child_ranges": [
        "(line 200,col 13)-(line 200,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.Solver.isNonSingular()",
      "begin_line": 204,
      "end_line": 207,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 206,col 13)-(line 206,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.Solver.solve(double[])",
      "begin_line": 210,
      "end_line": 243,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 213,col 13)-(line 213,col 40)",
        "(line 214,col 13)-(line 218,col 13)",
        "(line 220,col 13)-(line 220,col 41)",
        "(line 223,col 13)-(line 230,col 13)",
        "(line 233,col 13)-(line 239,col 13)",
        "(line 241,col 13)-(line 241,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 246,
      "end_line": 283,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 248,col 13)-(line 282,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.Solver.solve(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 292,
      "end_line": 295,
      "comment": " Solve the linear equation A \u0026times; X \u003d B.\n         * \u003cp\u003eThe A matrix is implicit here. It is \u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X such that A \u0026times; X \u003d B\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 294,col 13)-(line 294,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 298,
      "end_line": 346,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 301,col 13)-(line 301,col 40)",
        "(line 302,col 13)-(line 306,col 13)",
        "(line 308,col 13)-(line 308,col 53)",
        "(line 309,col 13)-(line 309,col 39)",
        "(line 312,col 13)-(line 326,col 13)",
        "(line 329,col 13)-(line 342,col 13)",
        "(line 344,col 13)-(line 344,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.Solver.getInverse()",
      "begin_line": 349,
      "end_line": 351,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 350,col 13)-(line 350,col 78)"
      ]
    }
  ]
}