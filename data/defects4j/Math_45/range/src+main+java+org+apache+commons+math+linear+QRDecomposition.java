{
  "filepath": "/tmp/Math-45b/src/main/java/org/apache/commons/math/linear/QRDecomposition.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "QRDecomposition",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 51,
      "end_line": 434,
      "comment": "\n * Calculates the QR-decomposition of a matrix.\n * \u003cp\u003eThe QR-decomposition of a matrix A consists of two matrices Q and R\n * that satisfy: A \u003d QR, Q is orthogonal (Q\u003csup\u003eT\u003c/sup\u003eQ \u003d I), and R is\n * upper triangular. If A is m\u0026times;n, Q is m\u0026times;m and R m\u0026times;n.\u003c/p\u003e\n * \u003cp\u003eThis class compute the decomposition using Householder reflectors.\u003c/p\u003e\n * \u003cp\u003eFor efficiency purposes, the decomposition in packed form is transposed.\n * This allows inner loop to iterate inside rows, which is much more cache-efficient\n * in Java.\u003c/p\u003e\n * \u003cp\u003eThis class is based on the class with similar name from the\n * \u003ca href\u003d\"http://math.nist.gov/javanumerics/jama/\"\u003eJAMA\u003c/a\u003e library, with the\n * following changes:\u003c/p\u003e\n * \u003cul\u003e\n *   \u003cli\u003ea {@link #getQT() getQT} method has been added,\u003c/li\u003e\n *   \u003cli\u003ethe {@code solve} and {@code isFullRank} methods have been replaced\n *   by a {@link #getSolver() getSolver} method and the equivalent methods\n *   provided by the returned {@link DecompositionSolver}.\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/QRDecomposition.html\"\u003eMathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/QR_decomposition\"\u003eWikipedia\u003c/a\u003e\n *\n * @version $Id$\n * @since 1.2 (changed to concrete class in 3.0)\n "
    },
    {
      "type": "field",
      "varNames": [
        "qrt"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * A packed TRANSPOSED representation of the QR decomposition.\n     * \u003cp\u003eThe elements BELOW the diagonal are the elements of the UPPER triangular\n     * matrix R, and the rows ABOVE the diagonal are the Householder reflector vectors\n     * from which an explicit form of Q can be recomputed if desired.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rDiag"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " The diagonal elements of R. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedQ"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Cached value of Q. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedQT"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Cached value of QT. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedR"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Cached value of R. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedH"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Cached value of H. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.QRDecomposition.QRDecomposition(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 80,
      "end_line": 154,
      "comment": "\n     * Calculates the QR-decomposition of the given matrix.\n     * @param matrix The matrix to decompose.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 47)",
        "(line 83,col 9)-(line 83,col 50)",
        "(line 84,col 9)-(line 84,col 43)",
        "(line 85,col 9)-(line 85,col 47)",
        "(line 86,col 9)-(line 86,col 24)",
        "(line 87,col 9)-(line 87,col 24)",
        "(line 88,col 9)-(line 88,col 24)",
        "(line 89,col 9)-(line 89,col 24)",
        "(line 96,col 9)-(line 153,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecomposition.getR()",
      "begin_line": 161,
      "end_line": 181,
      "comment": "\n     * Returns the matrix R of the decomposition.\n     * \u003cp\u003eR is an upper-triangular matrix\u003c/p\u003e\n     * @return the R matrix\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 177,col 9)",
        "(line 180,col 9)-(line 180,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecomposition.getQ()",
      "begin_line": 188,
      "end_line": 193,
      "comment": "\n     * Returns the matrix Q of the decomposition.\n     * \u003cp\u003eQ is an orthogonal matrix\u003c/p\u003e\n     * @return the Q matrix\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 192,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecomposition.getQT()",
      "begin_line": 200,
      "end_line": 238,
      "comment": "\n     * Returns the transpose of the matrix Q of the decomposition.\n     * \u003cp\u003eQ is an orthogonal matrix\u003c/p\u003e\n     * @return the Q matrix\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 234,col 9)",
        "(line 237,col 9)-(line 237,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecomposition.getH()",
      "begin_line": 247,
      "end_line": 262,
      "comment": "\n     * Returns the Householder reflector vectors.\n     * \u003cp\u003eH is a lower trapezoidal matrix whose columns represent\n     * each successive Householder reflector vector. This matrix is used\n     * to compute Q.\u003c/p\u003e\n     * @return a matrix containing the Householder reflector vectors\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 258,col 9)",
        "(line 261,col 9)-(line 261,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecomposition.getSolver()",
      "begin_line": 268,
      "end_line": 270,
      "comment": "\n     * Get a solver for finding the A \u0026times; X \u003d B solution in least square sense.\n     * @return a solver\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 38)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DecompositionSolver"
      ],
      "begin_line": 273,
      "end_line": 433,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "qrt"
      ],
      "begin_line": 281,
      "end_line": 281,
      "comment": "\n         * A packed TRANSPOSED representation of the QR decomposition.\n         * \u003cp\u003eThe elements BELOW the diagonal are the elements of the UPPER triangular\n         * matrix R, and the rows ABOVE the diagonal are the Householder reflector vectors\n         * from which an explicit form of Q can be recomputed if desired.\u003c/p\u003e\n         "
    },
    {
      "type": "field",
      "varNames": [
        "rDiag"
      ],
      "begin_line": 284,
      "end_line": 284,
      "comment": " The diagonal elements of R. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.QRDecomposition.Solver.Solver(double[][], double[])",
      "begin_line": 291,
      "end_line": 294,
      "comment": "\n         * Build a solver from decomposed matrix.\n         * @param qrt packed TRANSPOSED representation of the QR decomposition\n         * @param rDiag diagonal elements of R\n         ",
      "child_ranges": [
        "(line 292,col 13)-(line 292,col 29)",
        "(line 293,col 13)-(line 293,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecomposition.Solver.isNonSingular()",
      "begin_line": 297,
      "end_line": 305,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 299,col 13)-(line 303,col 13)",
        "(line 304,col 13)-(line 304,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecomposition.Solver.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 308,
      "end_line": 348,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 309,col 13)-(line 309,col 37)",
        "(line 310,col 13)-(line 310,col 40)",
        "(line 311,col 13)-(line 313,col 13)",
        "(line 314,col 13)-(line 316,col 13)",
        "(line 318,col 13)-(line 318,col 45)",
        "(line 319,col 13)-(line 319,col 43)",
        "(line 322,col 13)-(line 334,col 13)",
        "(line 337,col 13)-(line 345,col 13)",
        "(line 347,col 13)-(line 347,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecomposition.Solver.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 351,
      "end_line": 427,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 352,col 13)-(line 352,col 37)",
        "(line 353,col 13)-(line 353,col 40)",
        "(line 354,col 13)-(line 356,col 13)",
        "(line 357,col 13)-(line 359,col 13)",
        "(line 361,col 13)-(line 361,col 62)",
        "(line 362,col 13)-(line 362,col 66)",
        "(line 363,col 13)-(line 363,col 77)",
        "(line 364,col 13)-(line 364,col 86)",
        "(line 365,col 13)-(line 365,col 82)",
        "(line 366,col 13)-(line 366,col 61)",
        "(line 368,col 13)-(line 424,col 13)",
        "(line 426,col 13)-(line 426,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecomposition.Solver.getInverse()",
      "begin_line": 430,
      "end_line": 432,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 431,col 13)-(line 431,col 77)"
      ]
    }
  ]
}