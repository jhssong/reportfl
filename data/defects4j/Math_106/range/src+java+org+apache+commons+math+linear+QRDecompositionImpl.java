{
  "filepath": "/tmp/Math-106b/src/java/org/apache/commons/math/linear/QRDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "QRDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.QRDecomposition"
      ],
      "begin_line": 31,
      "end_line": 185,
      "comment": "\n * Calculates the QR-decomposition of a matrix. In the QR-decomposition of\n * a matrix A consists of two matrices Q and R that satisfy: A \u003d QR, Q is\n * orthogonal (Q\u003csup\u003eT\u003c/sup\u003eQ \u003d I), and R is upper triangular. If A is\n * m\u0026times;n, Q is m\u0026times;m and R m\u0026times;n. \n * \u003cp\u003e\n * Implemented using Householder reflectors.\n *\n *\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/QRDecomposition.html\"\u003eMathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/QR_decomposition\"\u003eWikipedia\u003c/a\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "qr"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * A packed representation of the QR decomposition. The elements above the \n     * diagonal are the elements of R, and the columns of the lower triangle \n     * are the Householder reflector vectors of which an explicit form of Q can\n     * be calculated. \n     "
    },
    {
      "type": "field",
      "varNames": [
        "rDiag"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * The diagonal elements of R.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "m"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * The row dimension of the given matrix. The size of Q will be m x m, the \n     * size of R will be m x n. \n     "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * The column dimension of the given matrix. The size of R will be m x n. \n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.QRDecompositionImpl(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 62,
      "end_line": 127,
      "comment": "\n     * Calculates the QR decomposition of the given matrix. \n     * \n     * @param matrix The matrix to factorize.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 37)",
        "(line 64,col 9)-(line 64,col 40)",
        "(line 65,col 9)-(line 65,col 30)",
        "(line 66,col 9)-(line 66,col 30)",
        "(line 73,col 9)-(line 126,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.getR()",
      "begin_line": 132,
      "end_line": 146,
      "comment": "\n     * Returns the matrix R of the QR-decomposition. \n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 53)",
        "(line 136,col 9)-(line 136,col 40)",
        "(line 139,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 145,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.getQ()",
      "begin_line": 151,
      "end_line": 184,
      "comment": "\n     * Returns the matrix Q of the QR-decomposition.\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 53)",
        "(line 155,col 9)-(line 155,col 40)",
        "(line 162,col 9)-(line 164,col 9)",
        "(line 166,col 9)-(line 181,col 9)",
        "(line 183,col 9)-(line 183,col 19)"
      ]
    }
  ]
}