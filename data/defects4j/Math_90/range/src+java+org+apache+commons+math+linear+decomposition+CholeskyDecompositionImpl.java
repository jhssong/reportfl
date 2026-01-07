{
  "filepath": "/tmp/Math-90b/src/java/org/apache/commons/math/linear/decomposition/CholeskyDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CholeskyDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.decomposition.CholeskyDecomposition"
      ],
      "begin_line": 40,
      "end_line": 365,
      "comment": "\n * Calculates the Cholesky decomposition of a matrix.\n * \u003cp\u003eThe Cholesky decomposition of a real symmetric positive-definite\n * matrix A consists of a lower triangular matrix L with same size that\n * satisfy: A \u003d LL\u003csup\u003eT\u003c/sup\u003eQ \u003d I). In a sense, this is the square root of A.\u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/CholeskyDecomposition.html\"\u003eMathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Cholesky_decomposition\"\u003eWikipedia\u003c/a\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RELATIVE_SYMMETRY_THRESHOLD"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Default threshold above which off-diagonal elements are considered too different\n     * and matrix not symmetric. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ABSOLUTE_POSITIVITY_THRESHOLD"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Default threshold below which diagonal elements are considered null\n     * and matrix not positive definite. "
    },
    {
      "type": "field",
      "varNames": [
        "lTData"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Row-oriented storage for L\u003csup\u003eT\u003c/sup\u003e matrix data. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedL"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Cached value of L. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedLT"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Cached value of LT. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.decomposition.CholeskyDecompositionImpl.CholeskyDecompositionImpl(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 80,
      "end_line": 85,
      "comment": "\n     * Calculates the Cholesky decomposition of the given matrix.\n     * \u003cp\u003e\n     * Calling this constructor is equivalent to call {@link\n     * #CholeskyDecompositionImpl(RealMatrix, double, double)} with the\n     * thresholds set to the default values {@link\n     * #DEFAULT_RELATIVE_SYMMETRY_THRESHOLD} and {@link\n     * #DEFAULT_ABSOLUTE_POSITIVITY_THRESHOLD}\n     * \u003c/p\u003e\n     * @param matrix the matrix to decompose\n     * @exception NonSquareMatrixException if matrix is not square\n     * @exception NotSymmetricMatrixException if matrix is not symmetric\n     * @exception NotPositiveDefiniteMatrixException if the matrix is not\n     * strictly positive definite\n     * @see #CholeskyDecompositionImpl(RealMatrix, double, double)\n     * @see #DEFAULT_RELATIVE_SYMMETRY_THRESHOLD\n     * @see #DEFAULT_ABSOLUTE_POSITIVITY_THRESHOLD\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 84,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.decomposition.CholeskyDecompositionImpl.CholeskyDecompositionImpl(org.apache.commons.math.linear.RealMatrix, double, double)",
      "begin_line": 102,
      "end_line": 159,
      "comment": "\n     * Calculates the Cholesky decomposition of the given matrix.\n     * @param matrix the matrix to decompose\n     * @param relativeSymmetryThreshold threshold above which off-diagonal\n     * elements are considered too different and matrix not symmetric\n     * @param absolutePositivityThreshold threshold below which diagonal\n     * elements are considered null and matrix not positive definite\n     * @exception NonSquareMatrixException if matrix is not square\n     * @exception NotSymmetricMatrixException if matrix is not symmetric\n     * @exception NotPositiveDefiniteMatrixException if the matrix is not\n     * strictly positive definite\n     * @see #CholeskyDecompositionImpl(RealMatrix)\n     * @see #DEFAULT_RELATIVE_SYMMETRY_THRESHOLD\n     * @see #DEFAULT_ABSOLUTE_POSITIVITY_THRESHOLD\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 111,col 9)",
        "(line 113,col 9)-(line 113,col 51)",
        "(line 114,col 9)-(line 114,col 36)",
        "(line 115,col 9)-(line 115,col 24)",
        "(line 116,col 9)-(line 116,col 24)",
        "(line 119,col 9)-(line 140,col 9)",
        "(line 143,col 9)-(line 157,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.CholeskyDecompositionImpl.getL()",
      "begin_line": 162,
      "end_line": 167,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 163,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 166,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.CholeskyDecompositionImpl.getLT()",
      "begin_line": 170,
      "end_line": 179,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 172,col 9)-(line 174,col 9)",
        "(line 177,col 9)-(line 177,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.CholeskyDecompositionImpl.getDeterminant()",
      "begin_line": 182,
      "end_line": 189,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 33)",
        "(line 184,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 188,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.CholeskyDecompositionImpl.getSolver()",
      "begin_line": 192,
      "end_line": 194,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.decomposition.DecompositionSolver"
      ],
      "begin_line": 197,
      "end_line": 363,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "lTData"
      ],
      "begin_line": 203,
      "end_line": 203,
      "comment": " Row-oriented storage for L\u003csup\u003eT\u003c/sup\u003e matrix data. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.decomposition.CholeskyDecompositionImpl.Solver.Solver(double[][])",
      "begin_line": 209,
      "end_line": 211,
      "comment": "\n         * Build a solver from decomposed matrix.\n         * @param lTData row-oriented storage for L\u003csup\u003eT\u003c/sup\u003e matrix data\n         ",
      "child_ranges": [
        "(line 210,col 13)-(line 210,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.CholeskyDecompositionImpl.Solver.isNonSingular()",
      "begin_line": 214,
      "end_line": 217,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 216,col 13)-(line 216,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.CholeskyDecompositionImpl.Solver.solve(double[])",
      "begin_line": 220,
      "end_line": 253,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 223,col 13)-(line 223,col 40)",
        "(line 224,col 13)-(line 228,col 13)",
        "(line 230,col 13)-(line 230,col 41)",
        "(line 233,col 13)-(line 240,col 13)",
        "(line 243,col 13)-(line 249,col 13)",
        "(line 251,col 13)-(line 251,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.CholeskyDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 256,
      "end_line": 293,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 258,col 13)-(line 292,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.CholeskyDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealVectorImpl)",
      "begin_line": 302,
      "end_line": 305,
      "comment": " Solve the linear equation A \u0026times; X \u003d B.\n         * \u003cp\u003eThe A matrix is implicit here. It is \u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X such that A \u0026times; X \u003d B\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 304,col 13)-(line 304,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.CholeskyDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 308,
      "end_line": 356,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 311,col 13)-(line 311,col 40)",
        "(line 312,col 13)-(line 316,col 13)",
        "(line 318,col 13)-(line 318,col 53)",
        "(line 319,col 13)-(line 319,col 39)",
        "(line 322,col 13)-(line 336,col 13)",
        "(line 339,col 13)-(line 352,col 13)",
        "(line 354,col 13)-(line 354,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.CholeskyDecompositionImpl.Solver.getInverse()",
      "begin_line": 359,
      "end_line": 361,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 360,col 13)-(line 360,col 78)"
      ]
    }
  ]
}