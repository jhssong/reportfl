{
  "filepath": "/tmp/Math-93b/src/java/org/apache/commons/math/linear/QRDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "QRDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.QRDecomposition"
      ],
      "begin_line": 41,
      "end_line": 458,
      "comment": "\n * Calculates the QR-decomposition of a matrix.\n * \u003cp\u003eThe QR-decomposition of a matrix A consists of two matrices Q and R\n * that satisfy: A \u003d QR, Q is orthogonal (Q\u003csup\u003eT\u003c/sup\u003eQ \u003d I), and R is\n * upper triangular. If A is m\u0026times;n, Q is m\u0026times;m and R m\u0026times;n.\u003c/p\u003e\n * \u003cp\u003eThis class compute the decomposition using Householder reflectors.\u003c/p\u003e\n * \u003cp\u003eFor efficiency purposes, the decomposition in packed form is transposed.\n * This allows inner loop to iterate inside rows, which is much more cache-efficient\n * in Java.\u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/QRDecomposition.html\"\u003eMathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/QR_decomposition\"\u003eWikipedia\u003c/a\u003e\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "qrt"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * A packed TRANSPOSED representation of the QR decomposition.\n     * \u003cp\u003eThe elements BELOW the diagonal are the elements of the UPPER triangular\n     * matrix R, and the rows ABOVE the diagonal are the Householder reflector vectors\n     * from which an explicit form of Q can be recomputed if desired.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rDiag"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " The diagonal elements of R. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedQ"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Cached value of Q. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedQT"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Cached value of QT. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedR"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Cached value of R. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedH"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Cached value of H. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.QRDecompositionImpl(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 75,
      "end_line": 149,
      "comment": "\n     * Calculates the QR-decomposition of the given matrix. \n     * \u003cp\u003eCalling this constructor is equivalent to first call the no-arguments\n     * constructor and then call {@link #decompose(RealMatrix)}.\u003c/p\u003e\n     * @param matrix The matrix to decompose.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 47)",
        "(line 78,col 9)-(line 78,col 50)",
        "(line 79,col 9)-(line 79,col 43)",
        "(line 80,col 9)-(line 80,col 43)",
        "(line 81,col 9)-(line 81,col 24)",
        "(line 82,col 9)-(line 82,col 24)",
        "(line 83,col 9)-(line 83,col 24)",
        "(line 84,col 9)-(line 84,col 24)",
        "(line 91,col 9)-(line 148,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.getR()",
      "begin_line": 152,
      "end_line": 174,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 154,col 9)-(line 169,col 9)",
        "(line 172,col 9)-(line 172,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.getQ()",
      "begin_line": 177,
      "end_line": 182,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 178,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 181,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.getQT()",
      "begin_line": 185,
      "end_line": 226,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 187,col 9)-(line 221,col 9)",
        "(line 224,col 9)-(line 224,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.getH()",
      "begin_line": 229,
      "end_line": 247,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 231,col 9)-(line 242,col 9)",
        "(line 245,col 9)-(line 245,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.getSolver()",
      "begin_line": 250,
      "end_line": 252,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 38)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DecompositionSolver"
      ],
      "begin_line": 255,
      "end_line": 456,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 258,
      "end_line": 258,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "qrt"
      ],
      "begin_line": 266,
      "end_line": 266,
      "comment": "\n         * A packed TRANSPOSED representation of the QR decomposition.\n         * \u003cp\u003eThe elements BELOW the diagonal are the elements of the UPPER triangular\n         * matrix R, and the rows ABOVE the diagonal are the Householder reflector vectors\n         * from which an explicit form of Q can be recomputed if desired.\u003c/p\u003e\n         "
    },
    {
      "type": "field",
      "varNames": [
        "rDiag"
      ],
      "begin_line": 269,
      "end_line": 269,
      "comment": " The diagonal elements of R. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.Solver.Solver(double[][], double[])",
      "begin_line": 276,
      "end_line": 279,
      "comment": "\n         * Build a solver from decomposed matrix.\n         * @param qrt packed TRANSPOSED representation of the QR decomposition\n         * @param rDiag diagonal elements of R\n         ",
      "child_ranges": [
        "(line 277,col 13)-(line 277,col 29)",
        "(line 278,col 13)-(line 278,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.Solver.isNonSingular()",
      "begin_line": 282,
      "end_line": 291,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 284,col 13)-(line 288,col 13)",
        "(line 289,col 13)-(line 289,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.Solver.solve(double[])",
      "begin_line": 294,
      "end_line": 340,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 297,col 13)-(line 297,col 37)",
        "(line 298,col 13)-(line 298,col 40)",
        "(line 299,col 13)-(line 303,col 13)",
        "(line 304,col 13)-(line 306,col 13)",
        "(line 308,col 13)-(line 308,col 45)",
        "(line 309,col 13)-(line 309,col 41)",
        "(line 312,col 13)-(line 325,col 13)",
        "(line 328,col 13)-(line 336,col 13)",
        "(line 338,col 13)-(line 338,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 343,
      "end_line": 350,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 345,col 13)-(line 349,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealVectorImpl)",
      "begin_line": 359,
      "end_line": 362,
      "comment": " Solve the linear equation A \u0026times; X \u003d B.\n         * \u003cp\u003eThe A matrix is implicit here. It is \u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X that minimizes the two norm of A \u0026times; X - B\n         * @throws IllegalArgumentException if matrices dimensions don\u0027t match\n         * @throws InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 361,col 13)-(line 361,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 365,
      "end_line": 448,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 368,col 13)-(line 368,col 37)",
        "(line 369,col 13)-(line 369,col 40)",
        "(line 370,col 13)-(line 374,col 13)",
        "(line 375,col 13)-(line 377,col 13)",
        "(line 379,col 13)-(line 379,col 62)",
        "(line 380,col 13)-(line 380,col 66)",
        "(line 381,col 13)-(line 381,col 77)",
        "(line 382,col 13)-(line 382,col 86)",
        "(line 383,col 13)-(line 383,col 82)",
        "(line 384,col 13)-(line 384,col 61)",
        "(line 386,col 13)-(line 444,col 13)",
        "(line 446,col 13)-(line 446,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.Solver.getInverse()",
      "begin_line": 451,
      "end_line": 454,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 453,col 13)-(line 453,col 77)"
      ]
    }
  ]
}