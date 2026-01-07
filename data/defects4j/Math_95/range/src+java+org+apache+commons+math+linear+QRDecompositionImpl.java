{
  "filepath": "/tmp/Math-95b/src/java/org/apache/commons/math/linear/QRDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "QRDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.QRDecomposition"
      ],
      "begin_line": 36,
      "end_line": 429,
      "comment": "\n * Calculates the QR-decomposition of a matrix.\n * \u003cp\u003eThe QR-decomposition of a matrix A consists of two matrices Q and R\n * that satisfy: A \u003d QR, Q is orthogonal (Q\u003csup\u003eT\u003c/sup\u003eQ \u003d I), and R is\n * upper triangular. If A is m\u0026times;n, Q is m\u0026times;m and R m\u0026times;n.\u003c/p\u003e\n * \u003cp\u003eThis class compute the decomposition using Householder reflectors.\u003c/p\u003e\n * \u003cp\u003eFor efficiency purposes, the decomposition in packed form is transposed.\n * This allows inner loop to iterate inside rows, which is much more cache-efficient\n * in Java.\u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/QRDecomposition.html\"\u003eMathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/QR_decomposition\"\u003eWikipedia\u003c/a\u003e\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "qrt"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * A packed TRANSPOSED representation of the QR decomposition.\n     * \u003cp\u003eThe elements BELOW the diagonal are the elements of the UPPER triangular\n     * matrix R, and the rows ABOVE the diagonal are the Householder reflector vectors\n     * from which an explicit form of Q can be recomputed if desired.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rDiag"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " The diagonal elements of R. "
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
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.QRDecompositionImpl()",
      "begin_line": 70,
      "end_line": 71,
      "comment": "\n     * Build a new instance.\n     * \u003cp\u003eNote that {@link #decompose(RealMatrix)} \u003cstrong\u003emust\u003c/strong\u003e be called\n     * before any of the {@link #getQ()}, {@link #getR()}, {@link #getH()},\n     * {@link #isFullRank()}, {@link #solve(double[])}, {@link #solve(RealMatrix)},\n     * {@link #solve(RealVector)} or {@link #solve(RealVectorImpl)} methods can be\n     * called.\u003c/p\u003e\n     * @see #decompose(RealMatrix)\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.QRDecompositionImpl(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Calculates the QR-decomposition of the given matrix. \n     * \u003cp\u003eCalling this constructor is equivalent to first call the no-arguments\n     * constructor and then call {@link #decompose(RealMatrix)}.\u003c/p\u003e\n     * @param matrix The matrix to decompose.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.decompose(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 84,
      "end_line": 157,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 47)",
        "(line 87,col 9)-(line 87,col 50)",
        "(line 88,col 9)-(line 88,col 43)",
        "(line 89,col 9)-(line 89,col 30)",
        "(line 90,col 9)-(line 90,col 23)",
        "(line 91,col 9)-(line 91,col 23)",
        "(line 92,col 9)-(line 92,col 23)",
        "(line 99,col 9)-(line 156,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.getR()",
      "begin_line": 160,
      "end_line": 189,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 163,col 9)-(line 184,col 9)",
        "(line 187,col 9)-(line 187,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.getQ()",
      "begin_line": 192,
      "end_line": 239,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 195,col 9)-(line 234,col 9)",
        "(line 237,col 9)-(line 237,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.getH()",
      "begin_line": 242,
      "end_line": 267,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 245,col 9)-(line 262,col 9)",
        "(line 265,col 9)-(line 265,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.isFullRank()",
      "begin_line": 270,
      "end_line": 282,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 26)",
        "(line 275,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 280,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.solve(double[])",
      "begin_line": 285,
      "end_line": 331,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 26)",
        "(line 290,col 9)-(line 290,col 33)",
        "(line 291,col 9)-(line 291,col 36)",
        "(line 292,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 297,col 9)",
        "(line 299,col 9)-(line 299,col 41)",
        "(line 300,col 9)-(line 300,col 37)",
        "(line 303,col 9)-(line 316,col 9)",
        "(line 319,col 9)-(line 327,col 9)",
        "(line 329,col 9)-(line 329,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 334,
      "end_line": 342,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 336,col 9)-(line 341,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.solve(org.apache.commons.math.linear.RealVectorImpl)",
      "begin_line": 353,
      "end_line": 356,
      "comment": " Solve the linear equation A \u0026times; X \u003d B.\n     * \u003cp\u003eThe A matrix is implicit here. It is \u003c/p\u003e\n     * @param b right-hand side of the equation A \u0026times; X \u003d B\n     * @return a vector X that minimizes the two norm of A \u0026times; X - B\n     * @exception IllegalStateException if {@link #decompose(RealMatrix) decompose}\n     * has not been called\n     * @throws IllegalArgumentException if matrices dimensions don\u0027t match\n     * @throws InvalidMatrixException if decomposed matrix is singular\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 359,
      "end_line": 415,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 26)",
        "(line 364,col 9)-(line 364,col 33)",
        "(line 365,col 9)-(line 365,col 36)",
        "(line 366,col 9)-(line 368,col 9)",
        "(line 369,col 9)-(line 371,col 9)",
        "(line 373,col 9)-(line 373,col 48)",
        "(line 374,col 9)-(line 374,col 53)",
        "(line 375,col 9)-(line 375,col 59)",
        "(line 377,col 9)-(line 411,col 9)",
        "(line 413,col 9)-(line 413,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImpl.checkDecomposed()",
      "begin_line": 422,
      "end_line": 427,
      "comment": "\n     * Check if {@link #decompose(RealMatrix)} has been called.\n     * @exception IllegalStateException if {@link #decompose(RealMatrix) decompose}\n     * has not been called\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 426,col 9)"
      ]
    }
  ]
}