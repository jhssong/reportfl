{
  "filepath": "/tmp/Math-88b/src/java/org/apache/commons/math/linear/CholeskyDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CholeskyDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.CholeskyDecomposition"
      ],
      "begin_line": 34,
      "end_line": 353,
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
      "end_line": 150,
      "comment": "\n     * Calculates the Cholesky decomposition of the given matrix.\n     * @param matrix the matrix to decompose\n     * @param relativeSymmetryThreshold threshold above which off-diagonal\n     * elements are considered too different and matrix not symmetric\n     * @param absolutePositivityThreshold threshold below which diagonal\n     * elements are considered null and matrix not positive definite\n     * @exception NonSquareMatrixException if matrix is not square\n     * @exception NotSymmetricMatrixException if matrix is not symmetric\n     * @exception NotPositiveDefiniteMatrixException if the matrix is not\n     * strictly positive definite\n     * @see #CholeskyDecompositionImpl(RealMatrix)\n     * @see #DEFAULT_RELATIVE_SYMMETRY_THRESHOLD\n     * @see #DEFAULT_ABSOLUTE_POSITIVITY_THRESHOLD\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 102,col 9)",
        "(line 104,col 9)-(line 104,col 51)",
        "(line 105,col 9)-(line 105,col 36)",
        "(line 106,col 9)-(line 106,col 24)",
        "(line 107,col 9)-(line 107,col 24)",
        "(line 110,col 9)-(line 131,col 9)",
        "(line 134,col 9)-(line 148,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.getL()",
      "begin_line": 153,
      "end_line": 158,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 154,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.getLT()",
      "begin_line": 161,
      "end_line": 170,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 163,col 9)-(line 165,col 9)",
        "(line 168,col 9)-(line 168,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.getDeterminant()",
      "begin_line": 173,
      "end_line": 180,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 33)",
        "(line 175,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 179,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.getSolver()",
      "begin_line": 183,
      "end_line": 185,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DecompositionSolver"
      ],
      "begin_line": 188,
      "end_line": 351,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "lTData"
      ],
      "begin_line": 191,
      "end_line": 191,
      "comment": " Row-oriented storage for L\u003csup\u003eT\u003c/sup\u003e matrix data. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.Solver.Solver(double[][])",
      "begin_line": 197,
      "end_line": 199,
      "comment": "\n         * Build a solver from decomposed matrix.\n         * @param lTData row-oriented storage for L\u003csup\u003eT\u003c/sup\u003e matrix data\n         ",
      "child_ranges": [
        "(line 198,col 13)-(line 198,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.Solver.isNonSingular()",
      "begin_line": 202,
      "end_line": 205,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 204,col 13)-(line 204,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.Solver.solve(double[])",
      "begin_line": 208,
      "end_line": 241,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 211,col 13)-(line 211,col 40)",
        "(line 212,col 13)-(line 216,col 13)",
        "(line 218,col 13)-(line 218,col 41)",
        "(line 221,col 13)-(line 228,col 13)",
        "(line 231,col 13)-(line 237,col 13)",
        "(line 239,col 13)-(line 239,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 244,
      "end_line": 281,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 246,col 13)-(line 280,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealVectorImpl)",
      "begin_line": 290,
      "end_line": 293,
      "comment": " Solve the linear equation A \u0026times; X \u003d B.\n         * \u003cp\u003eThe A matrix is implicit here. It is \u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X such that A \u0026times; X \u003d B\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 292,col 13)-(line 292,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 296,
      "end_line": 344,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 299,col 13)-(line 299,col 40)",
        "(line 300,col 13)-(line 304,col 13)",
        "(line 306,col 13)-(line 306,col 53)",
        "(line 307,col 13)-(line 307,col 39)",
        "(line 310,col 13)-(line 324,col 13)",
        "(line 327,col 13)-(line 340,col 13)",
        "(line 342,col 13)-(line 342,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecompositionImpl.Solver.getInverse()",
      "begin_line": 347,
      "end_line": 349,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 348,col 13)-(line 348,col 78)"
      ]
    }
  ]
}