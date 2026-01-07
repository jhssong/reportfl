{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/linear/CholeskyDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CholeskyDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.CholeskyDecomposition"
      ],
      "begin_line": 34,
      "end_line": 354,
      "comment": "\n * Calculates the Cholesky decomposition of a matrix.\n * \u003cp\u003eThe Cholesky decomposition of a real symmetric positive-definite\n * matrix A consists of a lower triangular matrix L with same size that\n * satisfy: A \u003d LL\u003csup\u003eT\u003c/sup\u003eQ \u003d I). In a sense, this is the square root of A.\u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/CholeskyDecomposition.html\"\u003eMathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Cholesky_decomposition\"\u003eWikipedia\u003c/a\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RELATIVE_SYMMETRY_THRESHOLD"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Default threshold above which off-diagonal elements are considered too different\n     * and matrix not symmetric. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ABSOLUTE_POSITIVITY_THRESHOLD"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Default threshold below which diagonal elements are considered null\n     * and matrix not positive definite. "
    },
    {
      "type": "field",
      "varNames": [
        "lTData"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Row-oriented storage for L\u003csup\u003eT\u003c/sup\u003e matrix data. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedL"
      ],
      "begin_line": 48,
      "end_line": 48,
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
      "end_line": 76,
      "comment": "\n     * Calculates the Cholesky decomposition of the given matrix.\n     * \u003cp\u003e\n     * Calling this constructor is equivalent to call {@link\n     * #CholeskyDecompositionImpl(RealMatrix, double, double)} with the\n     * thresholds set to the default values {@link\n     * #DEFAULT_RELATIVE_SYMMETRY_THRESHOLD} and {@link\n     * #DEFAULT_ABSOLUTE_POSITIVITY_THRESHOLD}\n     * \u003c/p\u003e\n     * @param matrix the matrix to decompose\n     * @exception NonSquareMatrixException if matrix is not square\n     * @exception NotSymmetricMatrixException if matrix is not symmetric\n     * @exception NotPositiveDefiniteMatrixException if the matrix is not\n     * strictly positive definite\n     * @see #CholeskyDecompositionImpl(RealMatrix, double, double)\n     * @see #DEFAULT_RELATIVE_SYMMETRY_THRESHOLD\n     * @see #DEFAULT_ABSOLUTE_POSITIVITY_THRESHOLD\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 75,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.CholeskyDecompositionImpl(org.apache.commons.math.linear.RealMatrix, double, double)",
      "begin_line": 93,
      "end_line": 151,
      "comment": "\n     * Calculates the Cholesky decomposition of the given matrix.\n     * @param matrix the matrix to decompose\n     * @param relativeSymmetryThreshold threshold above which off-diagonal\n     * elements are considered too different and matrix not symmetric\n     * @param absolutePositivityThreshold threshold below which diagonal\n     * elements are considered null and matrix not positive definite\n     * @exception NonSquareMatrixException if matrix is not square\n     * @exception NotSymmetricMatrixException if matrix is not symmetric\n     * @exception NotPositiveDefiniteMatrixException if the matrix is not\n     * strictly positive definite\n     * @see #CholeskyDecompositionImpl(RealMatrix)\n     * @see #DEFAULT_RELATIVE_SYMMETRY_THRESHOLD\n     * @see #DEFAULT_ABSOLUTE_POSITIVITY_THRESHOLD\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 102,col 9)",
        "(line 104,col 9)-(line 104,col 51)",
        "(line 105,col 9)-(line 105,col 36)",
        "(line 106,col 9)-(line 106,col 24)",
        "(line 107,col 9)-(line 107,col 24)",
        "(line 110,col 9)-(line 126,col 9)",
        "(line 129,col 9)-(line 149,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.getL()",
      "begin_line": 154,
      "end_line": 159,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 155,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.getLT()",
      "begin_line": 162,
      "end_line": 171,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 164,col 9)-(line 166,col 9)",
        "(line 169,col 9)-(line 169,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.getDeterminant()",
      "begin_line": 174,
      "end_line": 181,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 33)",
        "(line 176,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.getSolver()",
      "begin_line": 184,
      "end_line": 186,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DecompositionSolver"
      ],
      "begin_line": 189,
      "end_line": 352,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "lTData"
      ],
      "begin_line": 192,
      "end_line": 192,
      "comment": " Row-oriented storage for L\u003csup\u003eT\u003c/sup\u003e matrix data. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.Solver.Solver(double[][])",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\n         * Build a solver from decomposed matrix.\n         * @param lTData row-oriented storage for L\u003csup\u003eT\u003c/sup\u003e matrix data\n         ",
      "child_ranges": [
        "(line 199,col 13)-(line 199,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.Solver.isNonSingular()",
      "begin_line": 203,
      "end_line": 206,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 205,col 13)-(line 205,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.Solver.solve(double[])",
      "begin_line": 209,
      "end_line": 242,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 212,col 13)-(line 212,col 40)",
        "(line 213,col 13)-(line 217,col 13)",
        "(line 219,col 13)-(line 219,col 41)",
        "(line 222,col 13)-(line 229,col 13)",
        "(line 232,col 13)-(line 238,col 13)",
        "(line 240,col 13)-(line 240,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 245,
      "end_line": 282,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 247,col 13)-(line 281,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.Solver.solve(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 291,
      "end_line": 294,
      "comment": " Solve the linear equation A \u0026times; X \u003d B.\n         * \u003cp\u003eThe A matrix is implicit here. It is \u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X such that A \u0026times; X \u003d B\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 293,col 13)-(line 293,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 297,
      "end_line": 345,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 300,col 13)-(line 300,col 40)",
        "(line 301,col 13)-(line 305,col 13)",
        "(line 307,col 13)-(line 307,col 53)",
        "(line 308,col 13)-(line 308,col 39)",
        "(line 311,col 13)-(line 325,col 13)",
        "(line 328,col 13)-(line 341,col 13)",
        "(line 343,col 13)-(line 343,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.Solver.getInverse()",
      "begin_line": 348,
      "end_line": 350,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 349,col 13)-(line 349,col 78)"
      ]
    }
  ]
}