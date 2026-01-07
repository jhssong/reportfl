{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/CholeskyDecomposition.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CholeskyDecomposition",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 48,
      "end_line": 307,
      "comment": "\n * Calculates the Cholesky decomposition of a matrix.\n * \u003cp\u003eThe Cholesky decomposition of a real symmetric positive-definite\n * matrix A consists of a lower triangular matrix L with same size such\n * that: A \u003d LL\u003csup\u003eT\u003c/sup\u003e. In a sense, this is the square root of A.\u003c/p\u003e\n * \u003cp\u003eThis class is based on the class with similar name from the\n * \u003ca href\u003d\"http://math.nist.gov/javanumerics/jama/\"\u003eJAMA\u003c/a\u003e library, with the\n * following changes:\u003c/p\u003e\n * \u003cul\u003e\n *   \u003cli\u003ea {@link #getLT() getLT} method has been added,\u003c/li\u003e\n *   \u003cli\u003ethe {@code isspd} method has been removed, since the constructor of\n *   this class throws a {@link NonPositiveDefiniteMatrixException} when a\n *   matrix cannot be decomposed,\u003c/li\u003e\n *   \u003cli\u003ea {@link #getDeterminant() getDeterminant} method has been added,\u003c/li\u003e\n *   \u003cli\u003ethe {@code solve} method has been replaced by a {@link #getSolver()\n *   getSolver} method and the equivalent method provided by the returned\n *   {@link DecompositionSolver}.\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/CholeskyDecomposition.html\"\u003eMathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Cholesky_decomposition\"\u003eWikipedia\u003c/a\u003e\n * @version $Id$\n * @since 2.0 (changed to concrete class in 3.0)\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RELATIVE_SYMMETRY_THRESHOLD"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Default threshold above which off-diagonal elements are considered too different\n     * and matrix not symmetric.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ABSOLUTE_POSITIVITY_THRESHOLD"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * Default threshold below which diagonal elements are considered null\n     * and matrix not positive definite.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lTData"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Row-oriented storage for L\u003csup\u003eT\u003c/sup\u003e matrix data. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedL"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Cached value of L. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedLT"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Cached value of LT. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.CholeskyDecomposition.CholeskyDecomposition(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 84,
      "end_line": 87,
      "comment": "\n     * Calculates the Cholesky decomposition of the given matrix.\n     * \u003cp\u003e\n     * Calling this constructor is equivalent to call {@link\n     * #CholeskyDecomposition(RealMatrix, double, double)} with the\n     * thresholds set to the default values {@link\n     * #DEFAULT_RELATIVE_SYMMETRY_THRESHOLD} and {@link\n     * #DEFAULT_ABSOLUTE_POSITIVITY_THRESHOLD}\n     * \u003c/p\u003e\n     * @param matrix the matrix to decompose\n     * @throws NonSquareMatrixException if the matrix is not square.\n     * @throws NonSymmetricMatrixException if the matrix is not symmetric.\n     * @throws NonPositiveDefiniteMatrixException if the matrix is not\n     * strictly positive definite.\n     * @see #CholeskyDecomposition(RealMatrix, double, double)\n     * @see #DEFAULT_RELATIVE_SYMMETRY_THRESHOLD\n     * @see #DEFAULT_ABSOLUTE_POSITIVITY_THRESHOLD\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 86,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.CholeskyDecomposition.CholeskyDecomposition(org.apache.commons.math3.linear.RealMatrix, double, double)",
      "begin_line": 104,
      "end_line": 156,
      "comment": "\n     * Calculates the Cholesky decomposition of the given matrix.\n     * @param matrix the matrix to decompose\n     * @param relativeSymmetryThreshold threshold above which off-diagonal\n     * elements are considered too different and matrix not symmetric\n     * @param absolutePositivityThreshold threshold below which diagonal\n     * elements are considered null and matrix not positive definite\n     * @throws NonSquareMatrixException if the matrix is not square.\n     * @throws NonSymmetricMatrixException if the matrix is not symmetric.\n     * @throws NonPositiveDefiniteMatrixException if the matrix is not\n     * strictly positive definite.\n     * @see #CholeskyDecomposition(RealMatrix)\n     * @see #DEFAULT_RELATIVE_SYMMETRY_THRESHOLD\n     * @see #DEFAULT_ABSOLUTE_POSITIVITY_THRESHOLD\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 110,col 9)",
        "(line 112,col 9)-(line 112,col 51)",
        "(line 113,col 9)-(line 113,col 36)",
        "(line 114,col 9)-(line 114,col 24)",
        "(line 115,col 9)-(line 115,col 24)",
        "(line 118,col 9)-(line 133,col 9)",
        "(line 136,col 9)-(line 155,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.CholeskyDecomposition.getL()",
      "begin_line": 163,
      "end_line": 168,
      "comment": "\n     * Returns the matrix L of the decomposition.\n     * \u003cp\u003eL is an lower-triangular matrix\u003c/p\u003e\n     * @return the L matrix\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.CholeskyDecomposition.getLT()",
      "begin_line": 175,
      "end_line": 183,
      "comment": "\n     * Returns the transpose of the matrix L of the decomposition.\n     * \u003cp\u003eL\u003csup\u003eT\u003c/sup\u003e is an upper-triangular matrix\u003c/p\u003e\n     * @return the transpose of the matrix L of the decomposition\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 179,col 9)",
        "(line 182,col 9)-(line 182,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.CholeskyDecomposition.getDeterminant()",
      "begin_line": 189,
      "end_line": 196,
      "comment": "\n     * Return the determinant of the matrix\n     * @return determinant of the matrix\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 33)",
        "(line 191,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 195,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.CholeskyDecomposition.getSolver()",
      "begin_line": 202,
      "end_line": 204,
      "comment": "\n     * Get a solver for finding the A \u0026times; X \u003d B solution in least square sense.\n     * @return a solver\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.DecompositionSolver"
      ],
      "begin_line": 207,
      "end_line": 306,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "lTData"
      ],
      "begin_line": 209,
      "end_line": 209,
      "comment": " Row-oriented storage for L\u003csup\u003eT\u003c/sup\u003e matrix data. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.CholeskyDecomposition.Solver.Solver(double[][])",
      "begin_line": 215,
      "end_line": 217,
      "comment": "\n         * Build a solver from decomposed matrix.\n         * @param lTData row-oriented storage for L\u003csup\u003eT\u003c/sup\u003e matrix data\n         ",
      "child_ranges": [
        "(line 216,col 13)-(line 216,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.CholeskyDecomposition.Solver.isNonSingular()",
      "begin_line": 220,
      "end_line": 223,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 222,col 13)-(line 222,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.CholeskyDecomposition.Solver.solve(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 226,
      "end_line": 254,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 227,col 13)-(line 227,col 40)",
        "(line 228,col 13)-(line 230,col 13)",
        "(line 232,col 13)-(line 232,col 43)",
        "(line 235,col 13)-(line 242,col 13)",
        "(line 245,col 13)-(line 251,col 13)",
        "(line 253,col 13)-(line 253,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.CholeskyDecomposition.Solver.solve(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 257,
      "end_line": 300,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 258,col 13)-(line 258,col 40)",
        "(line 259,col 13)-(line 261,col 13)",
        "(line 263,col 13)-(line 263,col 53)",
        "(line 264,col 13)-(line 264,col 45)",
        "(line 267,col 13)-(line 281,col 13)",
        "(line 284,col 13)-(line 297,col 13)",
        "(line 299,col 13)-(line 299,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.CholeskyDecomposition.Solver.getInverse()",
      "begin_line": 303,
      "end_line": 305,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 304,col 13)-(line 304,col 78)"
      ]
    }
  ]
}