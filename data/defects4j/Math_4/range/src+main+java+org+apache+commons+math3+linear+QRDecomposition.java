{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/QRDecomposition.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "QRDecomposition",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 51,
      "end_line": 466,
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
      "begin_line": 111,
      "end_line": 115,
      "comment": " Decompose matrix.\n     * @param matrix transposed matrix\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 114,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.QRDecomposition.performHouseholderReflection(int, double[][])",
      "begin_line": 122,
      "end_line": 179,
      "comment": " Perform Householder reflection for a minor A(minor, minor) of A.\n     * @param minor minor index\n     * @param matrix transposed matrix\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 45)",
        "(line 133,col 9)-(line 133,col 28)",
        "(line 134,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 100)",
        "(line 139,col 9)-(line 139,col 25)",
        "(line 141,col 9)-(line 178,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.QRDecomposition.getR()",
      "begin_line": 187,
      "end_line": 207,
      "comment": "\n     * Returns the matrix R of the decomposition.\n     * \u003cp\u003eR is an upper-triangular matrix\u003c/p\u003e\n     * @return the R matrix\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 203,col 9)",
        "(line 206,col 9)-(line 206,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.QRDecomposition.getQ()",
      "begin_line": 214,
      "end_line": 219,
      "comment": "\n     * Returns the matrix Q of the decomposition.\n     * \u003cp\u003eQ is an orthogonal matrix\u003c/p\u003e\n     * @return the Q matrix\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 218,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.QRDecomposition.getQT()",
      "begin_line": 226,
      "end_line": 265,
      "comment": "\n     * Returns the transpose of the matrix Q of the decomposition.\n     * \u003cp\u003eQ is an orthogonal matrix\u003c/p\u003e\n     * @return the transpose of the Q matrix, Q\u003csup\u003eT\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 261,col 9)",
        "(line 264,col 9)-(line 264,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.QRDecomposition.getH()",
      "begin_line": 274,
      "end_line": 290,
      "comment": "\n     * Returns the Householder reflector vectors.\n     * \u003cp\u003eH is a lower trapezoidal matrix whose columns represent\n     * each successive Householder reflector vector. This matrix is used\n     * to compute Q.\u003c/p\u003e\n     * @return a matrix containing the Householder reflector vectors\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 286,col 9)",
        "(line 289,col 9)-(line 289,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.QRDecomposition.getSolver()",
      "begin_line": 296,
      "end_line": 298,
      "comment": "\n     * Get a solver for finding the A \u0026times; X \u003d B solution in least square sense.\n     * @return a solver\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 49)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.DecompositionSolver"
      ],
      "begin_line": 301,
      "end_line": 465,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "qrt"
      ],
      "begin_line": 308,
      "end_line": 308,
      "comment": "\n         * A packed TRANSPOSED representation of the QR decomposition.\n         * \u003cp\u003eThe elements BELOW the diagonal are the elements of the UPPER triangular\n         * matrix R, and the rows ABOVE the diagonal are the Householder reflector vectors\n         * from which an explicit form of Q can be recomputed if desired.\u003c/p\u003e\n         "
    },
    {
      "type": "field",
      "varNames": [
        "rDiag"
      ],
      "begin_line": 310,
      "end_line": 310,
      "comment": " The diagonal elements of R. "
    },
    {
      "type": "field",
      "varNames": [
        "threshold"
      ],
      "begin_line": 312,
      "end_line": 312,
      "comment": " Singularity threshold. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.QRDecomposition.Solver.Solver(double[][], double[], double)",
      "begin_line": 321,
      "end_line": 327,
      "comment": "\n         * Build a solver from decomposed matrix.\n         *\n         * @param qrt Packed TRANSPOSED representation of the QR decomposition.\n         * @param rDiag Diagonal elements of R.\n         * @param threshold Singularity threshold.\n         ",
      "child_ranges": [
        "(line 324,col 13)-(line 324,col 29)",
        "(line 325,col 13)-(line 325,col 31)",
        "(line 326,col 13)-(line 326,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.QRDecomposition.Solver.isNonSingular()",
      "begin_line": 330,
      "end_line": 337,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 331,col 13)-(line 335,col 13)",
        "(line 336,col 13)-(line 336,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.QRDecomposition.Solver.solve(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 340,
      "end_line": 380,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 341,col 13)-(line 341,col 37)",
        "(line 342,col 13)-(line 342,col 40)",
        "(line 343,col 13)-(line 345,col 13)",
        "(line 346,col 13)-(line 348,col 13)",
        "(line 350,col 13)-(line 350,col 45)",
        "(line 351,col 13)-(line 351,col 43)",
        "(line 354,col 13)-(line 366,col 13)",
        "(line 369,col 13)-(line 377,col 13)",
        "(line 379,col 13)-(line 379,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.QRDecomposition.Solver.solve(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 383,
      "end_line": 459,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 384,col 13)-(line 384,col 37)",
        "(line 385,col 13)-(line 385,col 40)",
        "(line 386,col 13)-(line 388,col 13)",
        "(line 389,col 13)-(line 391,col 13)",
        "(line 393,col 13)-(line 393,col 62)",
        "(line 394,col 13)-(line 394,col 66)",
        "(line 395,col 13)-(line 395,col 77)",
        "(line 396,col 13)-(line 396,col 86)",
        "(line 397,col 13)-(line 397,col 82)",
        "(line 398,col 13)-(line 398,col 61)",
        "(line 400,col 13)-(line 456,col 13)",
        "(line 458,col 13)-(line 458,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.QRDecomposition.Solver.getInverse()",
      "begin_line": 462,
      "end_line": 464,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 463,col 13)-(line 463,col 77)"
      ]
    }
  ]
}