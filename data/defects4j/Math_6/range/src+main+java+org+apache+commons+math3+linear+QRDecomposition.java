{
  "filepath": "/tmp/Math-6b/src/main/java/org/apache/commons/math3/linear/QRDecomposition.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "QRDecomposition",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 51,
      "end_line": 464,
      "comment": "\n * Calculates the QR-decomposition of a matrix.\n * \u003cp\u003eThe QR-decomposition of a matrix A consists of two matrices Q and R\n * that satisfy: A \u003d QR, Q is orthogonal (Q\u003csup\u003eT\u003c/sup\u003eQ \u003d I), and R is\n * upper triangular. If A is m\u0026times;n, Q is m\u0026times;m and R m\u0026times;n.\u003c/p\u003e\n * \u003cp\u003eThis class compute the decomposition using Householder reflectors.\u003c/p\u003e\n * \u003cp\u003eFor efficiency purposes, the decomposition in packed form is transposed.\n * This allows inner loop to iterate inside rows, which is much more cache-efficient\n * in Java.\u003c/p\u003e\n * \u003cp\u003eThis class is based on the class with similar name from the\n * \u003ca href\u003d\"http://math.nist.gov/javanumerics/jama/\"\u003eJAMA\u003c/a\u003e library, with the\n * following changes:\u003c/p\u003e\n * \u003cul\u003e\n *   \u003cli\u003ea {@link #getQT() getQT} method has been added,\u003c/li\u003e\n *   \u003cli\u003ethe {@code solve} and {@code isFullRank} methods have been replaced\n *   by a {@link #getSolver() getSolver} method and the equivalent methods\n *   provided by the returned {@link DecompositionSolver}.\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/QRDecomposition.html\"\u003eMathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/QR_decomposition\"\u003eWikipedia\u003c/a\u003e\n *\n * @version $Id$\n * @since 1.2 (changed to concrete class in 3.0)\n "
    },
    {
      "type": "field",
      "varNames": [
        "qrt"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * A packed TRANSPOSED representation of the QR decomposition.\n     * \u003cp\u003eThe elements BELOW the diagonal are the elements of the UPPER triangular\n     * matrix R, and the rows ABOVE the diagonal are the Householder reflector vectors\n     * from which an explicit form of Q can be recomputed if desired.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rDiag"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " The diagonal elements of R. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedQ"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Cached value of Q. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedQT"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Cached value of QT. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedR"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Cached value of R. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedH"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Cached value of H. "
    },
    {
      "type": "field",
      "varNames": [
        "threshold"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Singularity threshold. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.QRDecomposition.QRDecomposition(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Calculates the QR-decomposition of the given matrix.\n     * The singularity threshold defaults to zero.\n     *\n     * @param matrix The matrix to decompose.\n     *\n     * @see #QRDecomposition(RealMatrix,double)\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.QRDecomposition.QRDecomposition(org.apache.commons.math3.linear.RealMatrix, double)",
      "begin_line": 90,
      "end_line": 105,
      "comment": "\n     * Calculates the QR-decomposition of the given matrix.\n     *\n     * @param matrix The matrix to decompose.\n     * @param threshold Singularity threshold.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 35)",
        "(line 94,col 9)-(line 94,col 47)",
        "(line 95,col 9)-(line 95,col 50)",
        "(line 96,col 9)-(line 96,col 43)",
        "(line 97,col 9)-(line 97,col 47)",
        "(line 98,col 9)-(line 98,col 24)",
        "(line 99,col 9)-(line 99,col 24)",
        "(line 100,col 9)-(line 100,col 24)",
        "(line 101,col 9)-(line 101,col 24)",
        "(line 103,col 9)-(line 103,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.QRDecomposition.decompose(double[][])",
      "begin_line": 110,
      "end_line": 114,
      "comment": " Decompose matrix.\n     * @param matrix transposed matrix\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 113,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.QRDecomposition.performHouseholderReflection(int, double[][])",
      "begin_line": 120,
      "end_line": 177,
      "comment": " Perform Householder reflection for a minor A(minor, minor) of A.\n     * @param minor minor index\n     * @param matrix transposed matrix\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 45)",
        "(line 131,col 9)-(line 131,col 28)",
        "(line 132,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 100)",
        "(line 137,col 9)-(line 137,col 25)",
        "(line 139,col 9)-(line 176,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.QRDecomposition.getR()",
      "begin_line": 185,
      "end_line": 205,
      "comment": "\n     * Returns the matrix R of the decomposition.\n     * \u003cp\u003eR is an upper-triangular matrix\u003c/p\u003e\n     * @return the R matrix\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 201,col 9)",
        "(line 204,col 9)-(line 204,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.QRDecomposition.getQ()",
      "begin_line": 212,
      "end_line": 217,
      "comment": "\n     * Returns the matrix Q of the decomposition.\n     * \u003cp\u003eQ is an orthogonal matrix\u003c/p\u003e\n     * @return the Q matrix\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 216,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.QRDecomposition.getQT()",
      "begin_line": 224,
      "end_line": 263,
      "comment": "\n     * Returns the transpose of the matrix Q of the decomposition.\n     * \u003cp\u003eQ is an orthogonal matrix\u003c/p\u003e\n     * @return the transpose of the Q matrix, Q\u003csup\u003eT\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 259,col 9)",
        "(line 262,col 9)-(line 262,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.QRDecomposition.getH()",
      "begin_line": 272,
      "end_line": 288,
      "comment": "\n     * Returns the Householder reflector vectors.\n     * \u003cp\u003eH is a lower trapezoidal matrix whose columns represent\n     * each successive Householder reflector vector. This matrix is used\n     * to compute Q.\u003c/p\u003e\n     * @return a matrix containing the Householder reflector vectors\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 284,col 9)",
        "(line 287,col 9)-(line 287,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.QRDecomposition.getSolver()",
      "begin_line": 294,
      "end_line": 296,
      "comment": "\n     * Get a solver for finding the A \u0026times; X \u003d B solution in least square sense.\n     * @return a solver\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 49)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.DecompositionSolver"
      ],
      "begin_line": 299,
      "end_line": 463,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "qrt"
      ],
      "begin_line": 306,
      "end_line": 306,
      "comment": "\n         * A packed TRANSPOSED representation of the QR decomposition.\n         * \u003cp\u003eThe elements BELOW the diagonal are the elements of the UPPER triangular\n         * matrix R, and the rows ABOVE the diagonal are the Householder reflector vectors\n         * from which an explicit form of Q can be recomputed if desired.\u003c/p\u003e\n         "
    },
    {
      "type": "field",
      "varNames": [
        "rDiag"
      ],
      "begin_line": 308,
      "end_line": 308,
      "comment": " The diagonal elements of R. "
    },
    {
      "type": "field",
      "varNames": [
        "threshold"
      ],
      "begin_line": 310,
      "end_line": 310,
      "comment": " Singularity threshold. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.QRDecomposition.Solver.Solver(double[][], double[], double)",
      "begin_line": 319,
      "end_line": 325,
      "comment": "\n         * Build a solver from decomposed matrix.\n         *\n         * @param qrt Packed TRANSPOSED representation of the QR decomposition.\n         * @param rDiag Diagonal elements of R.\n         * @param threshold Singularity threshold.\n         ",
      "child_ranges": [
        "(line 322,col 13)-(line 322,col 29)",
        "(line 323,col 13)-(line 323,col 31)",
        "(line 324,col 13)-(line 324,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.QRDecomposition.Solver.isNonSingular()",
      "begin_line": 328,
      "end_line": 335,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 329,col 13)-(line 333,col 13)",
        "(line 334,col 13)-(line 334,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.QRDecomposition.Solver.solve(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 338,
      "end_line": 378,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 339,col 13)-(line 339,col 37)",
        "(line 340,col 13)-(line 340,col 40)",
        "(line 341,col 13)-(line 343,col 13)",
        "(line 344,col 13)-(line 346,col 13)",
        "(line 348,col 13)-(line 348,col 45)",
        "(line 349,col 13)-(line 349,col 43)",
        "(line 352,col 13)-(line 364,col 13)",
        "(line 367,col 13)-(line 375,col 13)",
        "(line 377,col 13)-(line 377,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.QRDecomposition.Solver.solve(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 381,
      "end_line": 457,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 382,col 13)-(line 382,col 37)",
        "(line 383,col 13)-(line 383,col 40)",
        "(line 384,col 13)-(line 386,col 13)",
        "(line 387,col 13)-(line 389,col 13)",
        "(line 391,col 13)-(line 391,col 62)",
        "(line 392,col 13)-(line 392,col 66)",
        "(line 393,col 13)-(line 393,col 77)",
        "(line 394,col 13)-(line 394,col 86)",
        "(line 395,col 13)-(line 395,col 82)",
        "(line 396,col 13)-(line 396,col 61)",
        "(line 398,col 13)-(line 454,col 13)",
        "(line 456,col 13)-(line 456,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.QRDecomposition.Solver.getInverse()",
      "begin_line": 460,
      "end_line": 462,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 461,col 13)-(line 461,col 77)"
      ]
    }
  ]
}