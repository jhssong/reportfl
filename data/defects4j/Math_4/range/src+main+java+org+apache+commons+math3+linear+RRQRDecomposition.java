{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/RRQRDecomposition.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RRQRDecomposition",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.QRDecomposition"
      ],
      "begin_line": 51,
      "end_line": 231,
      "comment": "\n * Calculates the rank-revealing QR-decomposition of a matrix, with column pivoting.\n * \u003cp\u003eThe rank-revealing QR-decomposition of a matrix A consists of three matrices Q,\n * R and P such that AP\u003dQR.  Q is orthogonal (Q\u003csup\u003eT\u003c/sup\u003eQ \u003d I), and R is upper triangular.\n * If A is m\u0026times;n, Q is m\u0026times;m and R is m\u0026times;n and P is n\u0026times;n.\u003c/p\u003e\n * \u003cp\u003eQR decomposition with column pivoting produces a rank-revealing QR\n * decomposition and the {@link #getRank(double)} method may be used to return the rank of the\n * input matrix A.\u003c/p\u003e\n * \u003cp\u003eThis class compute the decomposition using Householder reflectors.\u003c/p\u003e\n * \u003cp\u003eFor efficiency purposes, the decomposition in packed form is transposed.\n * This allows inner loop to iterate inside rows, which is much more cache-efficient\n * in Java.\u003c/p\u003e\n * \u003cp\u003eThis class is based on the class with similar name from the\n * \u003ca href\u003d\"http://math.nist.gov/javanumerics/jama/\"\u003eJAMA\u003c/a\u003e library, with the\n * following changes:\u003c/p\u003e\n * \u003cul\u003e\n *   \u003cli\u003ea {@link #getQT() getQT} method has been added,\u003c/li\u003e\n *   \u003cli\u003ethe {@code solve} and {@code isFullRank} methods have been replaced\n *   by a {@link #getSolver() getSolver} method and the equivalent methods\n *   provided by the returned {@link DecompositionSolver}.\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/QRDecomposition.html\"\u003eMathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/QR_decomposition\"\u003eWikipedia\u003c/a\u003e\n *\n * @version $Id$\n * @since 3.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "p"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " An array to record the column pivoting for later creation of P. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedP"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Cached value of P. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.RRQRDecomposition.RRQRDecomposition(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Calculates the QR-decomposition of the given matrix.\n     * The singularity threshold defaults to zero.\n     *\n     * @param matrix The matrix to decompose.\n     *\n     * @see #RRQRDecomposition(RealMatrix, double)\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.RRQRDecomposition.RRQRDecomposition(org.apache.commons.math3.linear.RealMatrix, double)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Calculates the QR-decomposition of the given matrix.\n     *\n     * @param matrix The matrix to decompose.\n     * @param threshold Singularity threshold.\n     * @see #RRQRDecomposition(RealMatrix)\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RRQRDecomposition.decompose(double[][])",
      "begin_line": 86,
      "end_line": 92,
      "comment": " Decompose matrix.\n     * @param qrt transposed matrix\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 32)",
        "(line 88,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 91,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RRQRDecomposition.performHouseholderReflection(int, double[][])",
      "begin_line": 98,
      "end_line": 125,
      "comment": " Perform Householder reflection for a minor A(minor, minor) of A.\n     * @param minor minor index\n     * @param qrt transposed matrix\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 36)",
        "(line 102,col 9)-(line 102,col 42)",
        "(line 103,col 9)-(line 112,col 9)",
        "(line 114,col 9)-(line 121,col 9)",
        "(line 123,col 9)-(line 123,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RRQRDecomposition.getP()",
      "begin_line": 135,
      "end_line": 144,
      "comment": "\n     * Returns the pivot matrix, P, used in the QR Decomposition of matrix A such that AP \u003d QR.\n     *\n     * If no pivoting is used in this decomposition then P is equal to the identity matrix.\n     *\n     * @return a permutation matrix.\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RRQRDecomposition.getRank(double)",
      "begin_line": 165,
      "end_line": 181,
      "comment": "\n     * Return the effective numerical matrix rank.\n     * \u003cp\u003eThe effective numerical rank is the number of non-negligible\n     * singular values.\u003c/p\u003e\n     * \u003cp\u003eThis implementation looks at Frobenius norms of the sequence of\n     * bottom right submatrices.  When a large fall in norm is seen,\n     * the rank is returned. The drop is computed as:\u003c/p\u003e\n     * \u003cpre\u003e\n     *   (thisNorm/lastNorm) * rNorm \u003c dropThreshold\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * where thisNorm is the Frobenius norm of the current submatrix,\n     * lastNorm is the Frobenius norm of the previous submatrix,\n     * rNorm is is the Frobenius norm of the complete matrix\n     * \u003c/p\u003e\n     *\n     * @param dropThreshold threshold triggering rank computation\n     * @return effective numerical matrix rank\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 33)",
        "(line 167,col 9)-(line 167,col 46)",
        "(line 168,col 9)-(line 168,col 49)",
        "(line 169,col 9)-(line 169,col 28)",
        "(line 170,col 9)-(line 170,col 47)",
        "(line 171,col 9)-(line 171,col 35)",
        "(line 172,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RRQRDecomposition.getSolver()",
      "begin_line": 187,
      "end_line": 189,
      "comment": "\n     * Get a solver for finding the A \u0026times; X \u003d B solution in least square sense.\n     * @return a solver\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 58)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.DecompositionSolver"
      ],
      "begin_line": 192,
      "end_line": 230,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "upper"
      ],
      "begin_line": 195,
      "end_line": 195,
      "comment": " Upper level solver. "
    },
    {
      "type": "field",
      "varNames": [
        "p"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": " A permutation matrix for the pivots used in the QR decomposition "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.RRQRDecomposition.Solver.Solver(org.apache.commons.math3.linear.DecompositionSolver, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 206,
      "end_line": 209,
      "comment": "\n         * Build a solver from decomposed matrix.\n         *\n         * @param upper upper level solver.\n         * @param p permutation matrix\n         ",
      "child_ranges": [
        "(line 207,col 13)-(line 207,col 31)",
        "(line 208,col 13)-(line 208,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RRQRDecomposition.Solver.isNonSingular()",
      "begin_line": 212,
      "end_line": 214,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 213,col 13)-(line 213,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RRQRDecomposition.Solver.solve(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 217,
      "end_line": 219,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 218,col 13)-(line 218,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RRQRDecomposition.Solver.solve(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 222,
      "end_line": 224,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 223,col 13)-(line 223,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RRQRDecomposition.Solver.getInverse()",
      "begin_line": 227,
      "end_line": 229,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 228,col 13)-(line 228,col 84)"
      ]
    }
  ]
}