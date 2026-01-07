{
  "filepath": "/tmp/Math-61b/src/main/java/org/apache/commons/math/linear/CholeskyDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CholeskyDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.CholeskyDecomposition"
      ],
      "begin_line": 36,
      "end_line": 356,
      "comment": "\n * Calculates the Cholesky decomposition of a matrix.\n * \u003cp\u003eThe Cholesky decomposition of a real symmetric positive-definite\n * matrix A consists of a lower triangular matrix L with same size that\n * satisfy: A \u003d LL\u003csup\u003eT\u003c/sup\u003eQ \u003d I). In a sense, this is the square root of A.\u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/CholeskyDecomposition.html\"\u003eMathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Cholesky_decomposition\"\u003eWikipedia\u003c/a\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RELATIVE_SYMMETRY_THRESHOLD"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Default threshold above which off-diagonal elements are considered too different\n     * and matrix not symmetric. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ABSOLUTE_POSITIVITY_THRESHOLD"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Default threshold below which diagonal elements are considered null\n     * and matrix not positive definite. "
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
      "begin_line": 50,
      "end_line": 50,
      "comment": " Cached value of L. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedLT"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Cached value of LT. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.CholeskyDecompositionImpl(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 73,
      "end_line": 78,
      "comment": "\n     * Calculates the Cholesky decomposition of the given matrix.\n     * \u003cp\u003e\n     * Calling this constructor is equivalent to call {@link\n     * #CholeskyDecompositionImpl(RealMatrix, double, double)} with the\n     * thresholds set to the default values {@link\n     * #DEFAULT_RELATIVE_SYMMETRY_THRESHOLD} and {@link\n     * #DEFAULT_ABSOLUTE_POSITIVITY_THRESHOLD}\n     * \u003c/p\u003e\n     * @param matrix the matrix to decompose\n     * @exception NonSquareMatrixException if matrix is not square\n     * @exception NotSymmetricMatrixException if matrix is not symmetric\n     * @exception NotPositiveDefiniteMatrixException if the matrix is not\n     * strictly positive definite\n     * @see #CholeskyDecompositionImpl(RealMatrix, double, double)\n     * @see #DEFAULT_RELATIVE_SYMMETRY_THRESHOLD\n     * @see #DEFAULT_ABSOLUTE_POSITIVITY_THRESHOLD\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 77,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.CholeskyDecompositionImpl(org.apache.commons.math.linear.RealMatrix, double, double)",
      "begin_line": 95,
      "end_line": 153,
      "comment": "\n     * Calculates the Cholesky decomposition of the given matrix.\n     * @param matrix the matrix to decompose\n     * @param relativeSymmetryThreshold threshold above which off-diagonal\n     * elements are considered too different and matrix not symmetric\n     * @param absolutePositivityThreshold threshold below which diagonal\n     * elements are considered null and matrix not positive definite\n     * @exception NonSquareMatrixException if matrix is not square\n     * @exception NotSymmetricMatrixException if matrix is not symmetric\n     * @exception NotPositiveDefiniteMatrixException if the matrix is not\n     * strictly positive definite\n     * @see #CholeskyDecompositionImpl(RealMatrix)\n     * @see #DEFAULT_RELATIVE_SYMMETRY_THRESHOLD\n     * @see #DEFAULT_ABSOLUTE_POSITIVITY_THRESHOLD\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 104,col 9)",
        "(line 106,col 9)-(line 106,col 51)",
        "(line 107,col 9)-(line 107,col 36)",
        "(line 108,col 9)-(line 108,col 24)",
        "(line 109,col 9)-(line 109,col 24)",
        "(line 112,col 9)-(line 128,col 9)",
        "(line 131,col 9)-(line 151,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.getL()",
      "begin_line": 156,
      "end_line": 161,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 157,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 160,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.getLT()",
      "begin_line": 164,
      "end_line": 173,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 166,col 9)-(line 168,col 9)",
        "(line 171,col 9)-(line 171,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.getDeterminant()",
      "begin_line": 176,
      "end_line": 183,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 33)",
        "(line 178,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.getSolver()",
      "begin_line": 186,
      "end_line": 188,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DecompositionSolver"
      ],
      "begin_line": 191,
      "end_line": 354,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "lTData"
      ],
      "begin_line": 194,
      "end_line": 194,
      "comment": " Row-oriented storage for L\u003csup\u003eT\u003c/sup\u003e matrix data. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.Solver.Solver(double[][])",
      "begin_line": 200,
      "end_line": 202,
      "comment": "\n         * Build a solver from decomposed matrix.\n         * @param lTData row-oriented storage for L\u003csup\u003eT\u003c/sup\u003e matrix data\n         ",
      "child_ranges": [
        "(line 201,col 13)-(line 201,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.Solver.isNonSingular()",
      "begin_line": 205,
      "end_line": 208,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 207,col 13)-(line 207,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.Solver.solve(double[])",
      "begin_line": 211,
      "end_line": 244,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 214,col 13)-(line 214,col 40)",
        "(line 215,col 13)-(line 219,col 13)",
        "(line 221,col 13)-(line 221,col 41)",
        "(line 224,col 13)-(line 231,col 13)",
        "(line 234,col 13)-(line 240,col 13)",
        "(line 242,col 13)-(line 242,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 247,
      "end_line": 284,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 249,col 13)-(line 283,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.Solver.solve(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 293,
      "end_line": 296,
      "comment": " Solve the linear equation A \u0026times; X \u003d B.\n         * \u003cp\u003eThe A matrix is implicit here. It is \u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X such that A \u0026times; X \u003d B\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 295,col 13)-(line 295,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 299,
      "end_line": 347,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 302,col 13)-(line 302,col 40)",
        "(line 303,col 13)-(line 307,col 13)",
        "(line 309,col 13)-(line 309,col 53)",
        "(line 310,col 13)-(line 310,col 39)",
        "(line 313,col 13)-(line 327,col 13)",
        "(line 330,col 13)-(line 343,col 13)",
        "(line 345,col 13)-(line 345,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.Solver.getInverse()",
      "begin_line": 350,
      "end_line": 352,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 351,col 13)-(line 351,col 78)"
      ]
    }
  ]
}