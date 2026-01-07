{
  "filepath": "/tmp/Math-64b/src/main/java/org/apache/commons/math/linear/QRDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "QRDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.QRDecomposition"
      ],
      "begin_line": 42,
      "end_line": 452,
      "comment": "\n * Calculates the QR-decomposition of a matrix.\n * \u003cp\u003eThe QR-decomposition of a matrix A consists of two matrices Q and R\n * that satisfy: A \u003d QR, Q is orthogonal (Q\u003csup\u003eT\u003c/sup\u003eQ \u003d I), and R is\n * upper triangular. If A is m\u0026times;n, Q is m\u0026times;m and R m\u0026times;n.\u003c/p\u003e\n * \u003cp\u003eThis class compute the decomposition using Householder reflectors.\u003c/p\u003e\n * \u003cp\u003eFor efficiency purposes, the decomposition in packed form is transposed.\n * This allows inner loop to iterate inside rows, which is much more cache-efficient\n * in Java.\u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/QRDecomposition.html\"\u003eMathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/QR_decomposition\"\u003eWikipedia\u003c/a\u003e\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
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
        "(line 76,col 9)-(line 76,col 43)",
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
      "end_line": 170,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 150,col 9)-(line 165,col 9)",
        "(line 168,col 9)-(line 168,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.getQ()",
      "begin_line": 173,
      "end_line": 178,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 174,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 177,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.getQT()",
      "begin_line": 181,
      "end_line": 222,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 183,col 9)-(line 217,col 9)",
        "(line 220,col 9)-(line 220,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.getH()",
      "begin_line": 225,
      "end_line": 243,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 227,col 9)-(line 238,col 9)",
        "(line 241,col 9)-(line 241,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.getSolver()",
      "begin_line": 246,
      "end_line": 248,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 38)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DecompositionSolver"
      ],
      "begin_line": 251,
      "end_line": 450,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "qrt"
      ],
      "begin_line": 259,
      "end_line": 259,
      "comment": "\n         * A packed TRANSPOSED representation of the QR decomposition.\n         * \u003cp\u003eThe elements BELOW the diagonal are the elements of the UPPER triangular\n         * matrix R, and the rows ABOVE the diagonal are the Householder reflector vectors\n         * from which an explicit form of Q can be recomputed if desired.\u003c/p\u003e\n         "
    },
    {
      "type": "field",
      "varNames": [
        "rDiag"
      ],
      "begin_line": 262,
      "end_line": 262,
      "comment": " The diagonal elements of R. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.Solver.Solver(double[][], double[])",
      "begin_line": 269,
      "end_line": 272,
      "comment": "\n         * Build a solver from decomposed matrix.\n         * @param qrt packed TRANSPOSED representation of the QR decomposition\n         * @param rDiag diagonal elements of R\n         ",
      "child_ranges": [
        "(line 270,col 13)-(line 270,col 29)",
        "(line 271,col 13)-(line 271,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.Solver.isNonSingular()",
      "begin_line": 275,
      "end_line": 284,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 277,col 13)-(line 281,col 13)",
        "(line 282,col 13)-(line 282,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.Solver.solve(double[])",
      "begin_line": 287,
      "end_line": 333,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 290,col 13)-(line 290,col 37)",
        "(line 291,col 13)-(line 291,col 40)",
        "(line 292,col 13)-(line 296,col 13)",
        "(line 297,col 13)-(line 299,col 13)",
        "(line 301,col 13)-(line 301,col 45)",
        "(line 302,col 13)-(line 302,col 41)",
        "(line 305,col 13)-(line 318,col 13)",
        "(line 321,col 13)-(line 329,col 13)",
        "(line 331,col 13)-(line 331,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 336,
      "end_line": 343,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 338,col 13)-(line 342,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.Solver.solve(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 352,
      "end_line": 355,
      "comment": " Solve the linear equation A \u0026times; X \u003d B.\n         * \u003cp\u003eThe A matrix is implicit here. It is \u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X that minimizes the two norm of A \u0026times; X - B\n         * @throws IllegalArgumentException if matrices dimensions don\u0027t match\n         * @throws InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 354,col 13)-(line 354,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 358,
      "end_line": 442,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 361,col 13)-(line 361,col 37)",
        "(line 362,col 13)-(line 362,col 40)",
        "(line 363,col 13)-(line 367,col 13)",
        "(line 368,col 13)-(line 370,col 13)",
        "(line 372,col 13)-(line 372,col 62)",
        "(line 373,col 13)-(line 373,col 66)",
        "(line 374,col 13)-(line 374,col 77)",
        "(line 375,col 13)-(line 375,col 86)",
        "(line 376,col 13)-(line 376,col 82)",
        "(line 377,col 13)-(line 377,col 61)",
        "(line 379,col 13)-(line 438,col 13)",
        "(line 440,col 13)-(line 440,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.Solver.getInverse()",
      "begin_line": 445,
      "end_line": 448,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 447,col 13)-(line 447,col 77)"
      ]
    }
  ]
}