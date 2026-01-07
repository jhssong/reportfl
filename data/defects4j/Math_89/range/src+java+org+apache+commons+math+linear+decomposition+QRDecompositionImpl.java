{
  "filepath": "/tmp/Math-89b/src/java/org/apache/commons/math/linear/decomposition/QRDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "QRDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.decomposition.QRDecomposition"
      ],
      "begin_line": 47,
      "end_line": 462,
      "comment": "\n * Calculates the QR-decomposition of a matrix.\n * \u003cp\u003eThe QR-decomposition of a matrix A consists of two matrices Q and R\n * that satisfy: A \u003d QR, Q is orthogonal (Q\u003csup\u003eT\u003c/sup\u003eQ \u003d I), and R is\n * upper triangular. If A is m\u0026times;n, Q is m\u0026times;m and R m\u0026times;n.\u003c/p\u003e\n * \u003cp\u003eThis class compute the decomposition using Householder reflectors.\u003c/p\u003e\n * \u003cp\u003eFor efficiency purposes, the decomposition in packed form is transposed.\n * This allows inner loop to iterate inside rows, which is much more cache-efficient\n * in Java.\u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/QRDecomposition.html\"\u003eMathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/QR_decomposition\"\u003eWikipedia\u003c/a\u003e\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Serializable version identifier. "
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
      "begin_line": 61,
      "end_line": 61,
      "comment": " The diagonal elements of R. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedQ"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Cached value of Q. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedQT"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Cached value of QT. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedR"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Cached value of R. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedH"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Cached value of H. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.decomposition.QRDecompositionImpl.QRDecompositionImpl(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 79,
      "end_line": 153,
      "comment": "\n     * Calculates the QR-decomposition of the given matrix. \n     * @param matrix The matrix to decompose.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 47)",
        "(line 82,col 9)-(line 82,col 50)",
        "(line 83,col 9)-(line 83,col 43)",
        "(line 84,col 9)-(line 84,col 43)",
        "(line 85,col 9)-(line 85,col 24)",
        "(line 86,col 9)-(line 86,col 24)",
        "(line 87,col 9)-(line 87,col 24)",
        "(line 88,col 9)-(line 88,col 24)",
        "(line 95,col 9)-(line 152,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.QRDecompositionImpl.getR()",
      "begin_line": 156,
      "end_line": 178,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 158,col 9)-(line 173,col 9)",
        "(line 176,col 9)-(line 176,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.QRDecompositionImpl.getQ()",
      "begin_line": 181,
      "end_line": 186,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 182,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 185,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.QRDecompositionImpl.getQT()",
      "begin_line": 189,
      "end_line": 230,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 191,col 9)-(line 225,col 9)",
        "(line 228,col 9)-(line 228,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.QRDecompositionImpl.getH()",
      "begin_line": 233,
      "end_line": 251,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 235,col 9)-(line 246,col 9)",
        "(line 249,col 9)-(line 249,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.QRDecompositionImpl.getSolver()",
      "begin_line": 254,
      "end_line": 256,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 38)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.decomposition.DecompositionSolver"
      ],
      "begin_line": 259,
      "end_line": 460,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 262,
      "end_line": 262,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "qrt"
      ],
      "begin_line": 270,
      "end_line": 270,
      "comment": "\n         * A packed TRANSPOSED representation of the QR decomposition.\n         * \u003cp\u003eThe elements BELOW the diagonal are the elements of the UPPER triangular\n         * matrix R, and the rows ABOVE the diagonal are the Householder reflector vectors\n         * from which an explicit form of Q can be recomputed if desired.\u003c/p\u003e\n         "
    },
    {
      "type": "field",
      "varNames": [
        "rDiag"
      ],
      "begin_line": 273,
      "end_line": 273,
      "comment": " The diagonal elements of R. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.decomposition.QRDecompositionImpl.Solver.Solver(double[][], double[])",
      "begin_line": 280,
      "end_line": 283,
      "comment": "\n         * Build a solver from decomposed matrix.\n         * @param qrt packed TRANSPOSED representation of the QR decomposition\n         * @param rDiag diagonal elements of R\n         ",
      "child_ranges": [
        "(line 281,col 13)-(line 281,col 29)",
        "(line 282,col 13)-(line 282,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.QRDecompositionImpl.Solver.isNonSingular()",
      "begin_line": 286,
      "end_line": 295,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 288,col 13)-(line 292,col 13)",
        "(line 293,col 13)-(line 293,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.QRDecompositionImpl.Solver.solve(double[])",
      "begin_line": 298,
      "end_line": 344,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 301,col 13)-(line 301,col 37)",
        "(line 302,col 13)-(line 302,col 40)",
        "(line 303,col 13)-(line 307,col 13)",
        "(line 308,col 13)-(line 310,col 13)",
        "(line 312,col 13)-(line 312,col 45)",
        "(line 313,col 13)-(line 313,col 41)",
        "(line 316,col 13)-(line 329,col 13)",
        "(line 332,col 13)-(line 340,col 13)",
        "(line 342,col 13)-(line 342,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.QRDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 347,
      "end_line": 354,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 349,col 13)-(line 353,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.QRDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealVectorImpl)",
      "begin_line": 363,
      "end_line": 366,
      "comment": " Solve the linear equation A \u0026times; X \u003d B.\n         * \u003cp\u003eThe A matrix is implicit here. It is \u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X that minimizes the two norm of A \u0026times; X - B\n         * @throws IllegalArgumentException if matrices dimensions don\u0027t match\n         * @throws InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 365,col 13)-(line 365,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.QRDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 369,
      "end_line": 452,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 372,col 13)-(line 372,col 37)",
        "(line 373,col 13)-(line 373,col 40)",
        "(line 374,col 13)-(line 378,col 13)",
        "(line 379,col 13)-(line 381,col 13)",
        "(line 383,col 13)-(line 383,col 62)",
        "(line 384,col 13)-(line 384,col 66)",
        "(line 385,col 13)-(line 385,col 77)",
        "(line 386,col 13)-(line 386,col 86)",
        "(line 387,col 13)-(line 387,col 82)",
        "(line 388,col 13)-(line 388,col 61)",
        "(line 390,col 13)-(line 448,col 13)",
        "(line 450,col 13)-(line 450,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.QRDecompositionImpl.Solver.getInverse()",
      "begin_line": 455,
      "end_line": 458,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 457,col 13)-(line 457,col 77)"
      ]
    }
  ]
}