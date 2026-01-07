{
  "filepath": "/tmp/Math-96b/src/java/org/apache/commons/math/linear/QRDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "QRDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.QRDecomposition"
      ],
      "begin_line": 34,
      "end_line": 367,
      "comment": "\n * Calculates the QR-decomposition of a matrix. In the QR-decomposition of\n * a matrix A consists of two matrices Q and R that satisfy: A \u003d QR, Q is\n * orthogonal (Q\u003csup\u003eT\u003c/sup\u003eQ \u003d I), and R is upper triangular. If A is\n * m\u0026times;n, Q is m\u0026times;m and R m\u0026times;n. \n * \u003cp\u003e\n * Implemented using Householder reflectors.\u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/QRDecomposition.html\"\u003eMathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/QR_decomposition\"\u003eWikipedia\u003c/a\u003e\n * \n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "qr"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * A packed representation of the QR decomposition. The elements above the \n     * diagonal are the elements of R, and the columns of the lower triangle \n     * are the Householder reflector vectors of which an explicit form of Q can\n     * be calculated. \n     "
    },
    {
      "type": "field",
      "varNames": [
        "rDiag"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * The diagonal elements of R.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cachedQ"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Cached value of Q. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedR"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Cached value of R. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedH"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Cached value of H. "
    },
    {
      "type": "field",
      "varNames": [
        "m"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * The row dimension of the given matrix. The size of Q will be m x m, the \n     * size of R will be m x n. \n     "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * The column dimension of the given matrix. The size of R will be m x n. \n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.QRDecompositionImpl(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 77,
      "end_line": 147,
      "comment": "\n     * Calculates the QR decomposition of the given matrix. \n     * \n     * @param matrix The matrix to decompose.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 37)",
        "(line 79,col 9)-(line 79,col 40)",
        "(line 80,col 9)-(line 80,col 30)",
        "(line 81,col 9)-(line 81,col 30)",
        "(line 82,col 9)-(line 82,col 23)",
        "(line 83,col 9)-(line 83,col 23)",
        "(line 84,col 9)-(line 84,col 23)",
        "(line 91,col 9)-(line 146,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.getR()",
      "begin_line": 150,
      "end_line": 172,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 152,col 9)-(line 167,col 9)",
        "(line 170,col 9)-(line 170,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.getQ()",
      "begin_line": 175,
      "end_line": 216,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 177,col 9)-(line 211,col 9)",
        "(line 214,col 9)-(line 214,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.getH()",
      "begin_line": 219,
      "end_line": 237,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 220,col 9)-(line 232,col 9)",
        "(line 235,col 9)-(line 235,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.isFullRank()",
      "begin_line": 240,
      "end_line": 247,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 241,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 246,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.solve(double[])",
      "begin_line": 250,
      "end_line": 290,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 253,col 13)-(line 255,col 13)",
        "(line 256,col 13)-(line 258,col 13)",
        "(line 260,col 13)-(line 260,col 45)",
        "(line 261,col 13)-(line 261,col 41)",
        "(line 264,col 13)-(line 276,col 13)",
        "(line 279,col 13)-(line 286,col 13)",
        "(line 288,col 13)-(line 288,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 293,
      "end_line": 300,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 295,col 9)-(line 299,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.solve(org.apache.commons.math.linear.RealVectorImpl)",
      "begin_line": 309,
      "end_line": 312,
      "comment": " Solve the linear equation A \u0026times; X \u003d B.\n     * \u003cp\u003eThe A matrix is implicit here. It is \u003c/p\u003e\n     * @param b right-hand side of the equation A \u0026times; X \u003d B\n     * @return a vector X that minimizes the two norm of A \u0026times; X - B\n     * @throws IllegalArgumentException if matrices dimensions don\u0027t match\n     * @throws InvalidMatrixException if decomposed matrix is singular\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 315,
      "end_line": 365,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 318,col 9)-(line 320,col 9)",
        "(line 321,col 9)-(line 323,col 9)",
        "(line 325,col 9)-(line 325,col 48)",
        "(line 326,col 9)-(line 326,col 53)",
        "(line 327,col 9)-(line 327,col 59)",
        "(line 329,col 9)-(line 361,col 9)",
        "(line 363,col 9)-(line 363,col 48)"
      ]
    }
  ]
}