{
  "filepath": "/tmp/Math-52b/src/main/java/org/apache/commons/math/linear/RectangularCholeskyDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RectangularCholeskyDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RectangularCholeskyDecomposition"
      ],
      "begin_line": 34,
      "end_line": 152,
      "comment": "\n * Calculates the rectangular Cholesky decomposition of a matrix.\n * \u003cp\u003eThe rectangular Cholesky decomposition of a real symmetric positive\n * semidefinite matrix A consists of a rectangular matrix B with the same\n * number of rows such that: A is almost equal to BB\u003csup\u003eT\u003c/sup\u003e, depending\n * on a user-defined tolerance. In a sense, this is the square root of A.\u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/CholeskyDecomposition.html\"\u003eMathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Cholesky_decomposition\"\u003eWikipedia\u003c/a\u003e\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "root"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Permutated Cholesky root of the symmetric positive semidefinite matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "rank"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Rank of the symmetric positive semidefinite matrix. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RectangularCholeskyDecompositionImpl.RectangularCholeskyDecompositionImpl(org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 51,
      "end_line": 140,
      "comment": "\n     * Decompose a symmetric positive semidefinite matrix.\n     *\n     * @param matrix Symmetric positive semidefinite matrix.\n     * @param small Diagonal elements threshold under which  column are\n     * considered to be dependent on previous ones and are discarded.\n     * @exception NonPositiveDefiniteMatrixException if the matrix is not\n     * positive semidefinite.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 45)",
        "(line 55,col 9)-(line 55,col 40)",
        "(line 56,col 9)-(line 56,col 48)",
        "(line 58,col 9)-(line 58,col 37)",
        "(line 59,col 9)-(line 59,col 37)",
        "(line 60,col 9)-(line 62,col 9)",
        "(line 64,col 9)-(line 64,col 18)",
        "(line 65,col 9)-(line 129,col 9)",
        "(line 132,col 9)-(line 132,col 17)",
        "(line 133,col 9)-(line 133,col 54)",
        "(line 134,col 9)-(line 138,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RectangularCholeskyDecompositionImpl.getRootMatrix()",
      "begin_line": 143,
      "end_line": 145,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RectangularCholeskyDecompositionImpl.getRank()",
      "begin_line": 148,
      "end_line": 150,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 20)"
      ]
    }
  ]
}