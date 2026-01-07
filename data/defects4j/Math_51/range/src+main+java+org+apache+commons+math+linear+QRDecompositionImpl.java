{
  "filepath": "/tmp/Math-51b/src/main/java/org/apache/commons/math/linear/QRDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "QRDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.QRDecomposition"
      ],
      "begin_line": 42,
      "end_line": 429,
      "comment": "\n * Calculates the QR-decomposition of a matrix.\n * \u003cp\u003eThe QR-decomposition of a matrix A consists of two matrices Q and R\n * that satisfy: A \u003d QR, Q is orthogonal (Q\u003csup\u003eT\u003c/sup\u003eQ \u003d I), and R is\n * upper triangular. If A is m\u0026times;n, Q is m\u0026times;m and R m\u0026times;n.\u003c/p\u003e\n * \u003cp\u003eThis class compute the decomposition using Householder reflectors.\u003c/p\u003e\n * \u003cp\u003eFor efficiency purposes, the decomposition in packed form is transposed.\n * This allows inner loop to iterate inside rows, which is much more cache-efficient\n * in Java.\u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/QRDecomposition.html\"\u003eMathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/QR_decomposition\"\u003eWikipedia\u003c/a\u003e\n *\n * @version $Id$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "qrt"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * A packed TRANSPOSED representation of the QR decomposition.\n     * \u003cp\u003eThe elements BELOW the diagonal are the elements of the UPPER triangular\n     * matrix R, and the rows ABOVE the diagonal are the Householder reflector vectors\n     * from which an explicit form of Q can be recomputed if desired.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rDiag"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " The diagonal elements of R. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedQ"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Cached value of Q. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedQT"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Cached value of QT. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedR"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Cached value of R. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedH"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Cached value of H. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.QRDecompositionImpl(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 71,
      "end_line": 145,
      "comment": "\n     * Calculates the QR-decomposition of the given matrix.\n     * @param matrix The matrix to decompose.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 47)",
        "(line 74,col 9)-(line 74,col 50)",
        "(line 75,col 9)-(line 75,col 43)",
        "(line 76,col 9)-(line 76,col 47)",
        "(line 77,col 9)-(line 77,col 24)",
        "(line 78,col 9)-(line 78,col 24)",
        "(line 79,col 9)-(line 79,col 24)",
        "(line 80,col 9)-(line 80,col 24)",
        "(line 87,col 9)-(line 144,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.getR()",
      "begin_line": 148,
      "end_line": 168,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 150,col 9)-(line 164,col 9)",
        "(line 167,col 9)-(line 167,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.getQ()",
      "begin_line": 171,
      "end_line": 176,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 172,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.getQT()",
      "begin_line": 179,
      "end_line": 217,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 180,col 9)-(line 213,col 9)",
        "(line 216,col 9)-(line 216,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.getH()",
      "begin_line": 220,
      "end_line": 235,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 221,col 9)-(line 231,col 9)",
        "(line 234,col 9)-(line 234,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.getSolver()",
      "begin_line": 238,
      "end_line": 240,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 38)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DecompositionSolver"
      ],
      "begin_line": 243,
      "end_line": 428,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "qrt"
      ],
      "begin_line": 251,
      "end_line": 251,
      "comment": "\n         * A packed TRANSPOSED representation of the QR decomposition.\n         * \u003cp\u003eThe elements BELOW the diagonal are the elements of the UPPER triangular\n         * matrix R, and the rows ABOVE the diagonal are the Householder reflector vectors\n         * from which an explicit form of Q can be recomputed if desired.\u003c/p\u003e\n         "
    },
    {
      "type": "field",
      "varNames": [
        "rDiag"
      ],
      "begin_line": 254,
      "end_line": 254,
      "comment": " The diagonal elements of R. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.Solver.Solver(double[][], double[])",
      "begin_line": 261,
      "end_line": 264,
      "comment": "\n         * Build a solver from decomposed matrix.\n         * @param qrt packed TRANSPOSED representation of the QR decomposition\n         * @param rDiag diagonal elements of R\n         ",
      "child_ranges": [
        "(line 262,col 13)-(line 262,col 29)",
        "(line 263,col 13)-(line 263,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.Solver.isNonSingular()",
      "begin_line": 267,
      "end_line": 275,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 269,col 13)-(line 273,col 13)",
        "(line 274,col 13)-(line 274,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.Solver.solve(double[])",
      "begin_line": 278,
      "end_line": 318,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 279,col 13)-(line 279,col 37)",
        "(line 280,col 13)-(line 280,col 40)",
        "(line 281,col 13)-(line 283,col 13)",
        "(line 284,col 13)-(line 286,col 13)",
        "(line 288,col 13)-(line 288,col 45)",
        "(line 289,col 13)-(line 289,col 41)",
        "(line 292,col 13)-(line 304,col 13)",
        "(line 307,col 13)-(line 315,col 13)",
        "(line 317,col 13)-(line 317,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 321,
      "end_line": 327,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 322,col 13)-(line 326,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.Solver.solve(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 336,
      "end_line": 338,
      "comment": " Solve the linear equation A \u0026times; X \u003d B.\n         * \u003cp\u003eThe A matrix is implicit here. It is \u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X that minimizes the two norm of A \u0026times; X - B\n         * @throws DimensionMismatchException if the matrices dimensions do not match.\n         * @throws SingularMatrixException if the decomposed matrix is singular.\n         ",
      "child_ranges": [
        "(line 337,col 13)-(line 337,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.Solver.solve(double[][])",
      "begin_line": 341,
      "end_line": 343,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 342,col 13)-(line 342,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 346,
      "end_line": 422,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 347,col 13)-(line 347,col 37)",
        "(line 348,col 13)-(line 348,col 40)",
        "(line 349,col 13)-(line 351,col 13)",
        "(line 352,col 13)-(line 354,col 13)",
        "(line 356,col 13)-(line 356,col 62)",
        "(line 357,col 13)-(line 357,col 66)",
        "(line 358,col 13)-(line 358,col 77)",
        "(line 359,col 13)-(line 359,col 86)",
        "(line 360,col 13)-(line 360,col 82)",
        "(line 361,col 13)-(line 361,col 61)",
        "(line 363,col 13)-(line 419,col 13)",
        "(line 421,col 13)-(line 421,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.Solver.getInverse()",
      "begin_line": 425,
      "end_line": 427,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 426,col 13)-(line 426,col 77)"
      ]
    }
  ]
}