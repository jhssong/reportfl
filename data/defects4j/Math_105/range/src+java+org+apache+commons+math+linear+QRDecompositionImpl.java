{
  "filepath": "/tmp/Math-105b/src/java/org/apache/commons/math/linear/QRDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "QRDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.QRDecomposition"
      ],
      "begin_line": 33,
      "end_line": 191,
      "comment": "\n * Calculates the QR-decomposition of a matrix. In the QR-decomposition of\n * a matrix A consists of two matrices Q and R that satisfy: A \u003d QR, Q is\n * orthogonal (Q\u003csup\u003eT\u003c/sup\u003eQ \u003d I), and R is upper triangular. If A is\n * m\u0026times;n, Q is m\u0026times;m and R m\u0026times;n. \n * \u003cp\u003e\n * Implemented using Householder reflectors.\n *\n *\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/QRDecomposition.html\"\u003eMathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/QR_decomposition\"\u003eWikipedia\u003c/a\u003e\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "qr"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * A packed representation of the QR decomposition. The elements above the \n     * diagonal are the elements of R, and the columns of the lower triangle \n     * are the Householder reflector vectors of which an explicit form of Q can\n     * be calculated. \n     "
    },
    {
      "type": "field",
      "varNames": [
        "rDiag"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * The diagonal elements of R.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "m"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * The row dimension of the given matrix. The size of Q will be m x m, the \n     * size of R will be m x n. \n     "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * The column dimension of the given matrix. The size of R will be m x n. \n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.QRDecompositionImpl(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 64,
      "end_line": 129,
      "comment": "\n     * Calculates the QR decomposition of the given matrix. \n     * \n     * @param matrix The matrix to decompose.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 37)",
        "(line 66,col 9)-(line 66,col 40)",
        "(line 67,col 9)-(line 67,col 30)",
        "(line 68,col 9)-(line 68,col 30)",
        "(line 75,col 9)-(line 128,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.getR()",
      "begin_line": 136,
      "end_line": 150,
      "comment": "\n     * Returns the matrix R of the QR-decomposition. \n     * \n     * @return the R matrix\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 53)",
        "(line 140,col 9)-(line 140,col 40)",
        "(line 143,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.getQ()",
      "begin_line": 157,
      "end_line": 190,
      "comment": "\n     * Returns the matrix Q of the QR-decomposition.\n     * \n     * @return the Q matrix\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 53)",
        "(line 161,col 9)-(line 161,col 40)",
        "(line 168,col 9)-(line 170,col 9)",
        "(line 172,col 9)-(line 187,col 9)",
        "(line 189,col 9)-(line 189,col 19)"
      ]
    }
  ]
}