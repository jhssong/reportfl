{
  "filepath": "/tmp/Math-9b/src/main/java/org/apache/commons/math3/linear/QRDecomposition.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "QRDecomposition",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 51,
      "end_line": 452,
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
      "end_line": 166,
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
        "(line 108,col 9)-(line 165,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.QRDecomposition.getR()",
      "begin_line": 173,
      "end_line": 193,
      "comment": "\n     * Returns the matrix R of the decomposition.\n     * \u003cp\u003eR is an upper-triangular matrix\u003c/p\u003e\n     * @return the R matrix\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 189,col 9)",
        "(line 192,col 9)-(line 192,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.QRDecomposition.getQ()",
      "begin_line": 200,
      "end_line": 205,
      "comment": "\n     * Returns the matrix Q of the decomposition.\n     * \u003cp\u003eQ is an orthogonal matrix\u003c/p\u003e\n     * @return the Q matrix\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 204,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.QRDecomposition.getQT()",
      "begin_line": 212,
      "end_line": 251,
      "comment": "\n     * Returns the transpose of the matrix Q of the decomposition.\n     * \u003cp\u003eQ is an orthogonal matrix\u003c/p\u003e\n     * @return the transpose of the Q matrix, Q\u003csup\u003eT\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 247,col 9)",
        "(line 250,col 9)-(line 250,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.QRDecomposition.getH()",
      "begin_line": 260,
      "end_line": 276,
      "comment": "\n     * Returns the Householder reflector vectors.\n     * \u003cp\u003eH is a lower trapezoidal matrix whose columns represent\n     * each successive Householder reflector vector. This matrix is used\n     * to compute Q.\u003c/p\u003e\n     * @return a matrix containing the Householder reflector vectors\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 272,col 9)",
        "(line 275,col 9)-(line 275,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.QRDecomposition.getSolver()",
      "begin_line": 282,
      "end_line": 284,
      "comment": "\n     * Get a solver for finding the A \u0026times; X \u003d B solution in least square sense.\n     * @return a solver\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 49)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.DecompositionSolver"
      ],
      "begin_line": 287,
      "end_line": 451,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "qrt"
      ],
      "begin_line": 294,
      "end_line": 294,
      "comment": "\n         * A packed TRANSPOSED representation of the QR decomposition.\n         * \u003cp\u003eThe elements BELOW the diagonal are the elements of the UPPER triangular\n         * matrix R, and the rows ABOVE the diagonal are the Householder reflector vectors\n         * from which an explicit form of Q can be recomputed if desired.\u003c/p\u003e\n         "
    },
    {
      "type": "field",
      "varNames": [
        "rDiag"
      ],
      "begin_line": 296,
      "end_line": 296,
      "comment": " The diagonal elements of R. "
    },
    {
      "type": "field",
      "varNames": [
        "threshold"
      ],
      "begin_line": 298,
      "end_line": 298,
      "comment": " Singularity threshold. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.QRDecomposition.Solver.Solver(double[][], double[], double)",
      "begin_line": 307,
      "end_line": 313,
      "comment": "\n         * Build a solver from decomposed matrix.\n         *\n         * @param qrt Packed TRANSPOSED representation of the QR decomposition.\n         * @param rDiag Diagonal elements of R.\n         * @param threshold Singularity threshold.\n         ",
      "child_ranges": [
        "(line 310,col 13)-(line 310,col 29)",
        "(line 311,col 13)-(line 311,col 31)",
        "(line 312,col 13)-(line 312,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.QRDecomposition.Solver.isNonSingular()",
      "begin_line": 316,
      "end_line": 323,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 317,col 13)-(line 321,col 13)",
        "(line 322,col 13)-(line 322,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.QRDecomposition.Solver.solve(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 326,
      "end_line": 366,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 327,col 13)-(line 327,col 37)",
        "(line 328,col 13)-(line 328,col 40)",
        "(line 329,col 13)-(line 331,col 13)",
        "(line 332,col 13)-(line 334,col 13)",
        "(line 336,col 13)-(line 336,col 45)",
        "(line 337,col 13)-(line 337,col 43)",
        "(line 340,col 13)-(line 352,col 13)",
        "(line 355,col 13)-(line 363,col 13)",
        "(line 365,col 13)-(line 365,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.QRDecomposition.Solver.solve(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 369,
      "end_line": 445,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 370,col 13)-(line 370,col 37)",
        "(line 371,col 13)-(line 371,col 40)",
        "(line 372,col 13)-(line 374,col 13)",
        "(line 375,col 13)-(line 377,col 13)",
        "(line 379,col 13)-(line 379,col 62)",
        "(line 380,col 13)-(line 380,col 66)",
        "(line 381,col 13)-(line 381,col 77)",
        "(line 382,col 13)-(line 382,col 86)",
        "(line 383,col 13)-(line 383,col 82)",
        "(line 384,col 13)-(line 384,col 61)",
        "(line 386,col 13)-(line 442,col 13)",
        "(line 444,col 13)-(line 444,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.QRDecomposition.Solver.getInverse()",
      "begin_line": 448,
      "end_line": 450,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 449,col 13)-(line 449,col 77)"
      ]
    }
  ]
}