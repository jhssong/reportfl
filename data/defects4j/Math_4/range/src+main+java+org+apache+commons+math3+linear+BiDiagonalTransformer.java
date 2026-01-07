{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/BiDiagonalTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BiDiagonalTransformer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 381,
      "comment": "\n * Class transforming any matrix to bi-diagonal shape.\n * \u003cp\u003eAny m \u0026times; n matrix A can be written as the product of three matrices:\n * A \u003d U \u0026times; B \u0026times; V\u003csup\u003eT\u003c/sup\u003e with U an m \u0026times; m orthogonal matrix,\n * B an m \u0026times; n bi-diagonal matrix (lower diagonal if m \u0026lt; n, upper diagonal\n * otherwise), and V an n \u0026times; n orthogonal matrix.\u003c/p\u003e\n * \u003cp\u003eTransformation to bi-diagonal shape is often not a goal by itself, but it is\n * an intermediate step in more general decomposition algorithms like {@link\n * SingularValueDecomposition Singular Value Decomposition}. This class is therefore\n * intended for internal use by the library and is not public. As a consequence of\n * this explicitly limited scope, many methods directly returns references to\n * internal arrays, not copies.\u003c/p\u003e\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "householderVectors"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Householder vectors. "
    },
    {
      "type": "field",
      "varNames": [
        "main"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Main diagonal. "
    },
    {
      "type": "field",
      "varNames": [
        "secondary"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Secondary diagonal. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedU"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Cached value of U. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedB"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Cached value of B. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedV"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Cached value of V. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.BiDiagonalTransformer.BiDiagonalTransformer(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 62,
      "end_line": 81,
      "comment": "\n     * Build the transformation to bi-diagonal shape of a matrix.\n     * @param matrix the matrix to transform.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 47)",
        "(line 65,col 9)-(line 65,col 50)",
        "(line 66,col 9)-(line 66,col 41)",
        "(line 67,col 9)-(line 67,col 46)",
        "(line 68,col 9)-(line 68,col 34)",
        "(line 69,col 9)-(line 69,col 38)",
        "(line 70,col 9)-(line 70,col 25)",
        "(line 71,col 9)-(line 71,col 25)",
        "(line 72,col 9)-(line 72,col 25)",
        "(line 75,col 9)-(line 79,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BiDiagonalTransformer.getU()",
      "begin_line": 88,
      "end_line": 131,
      "comment": "\n     * Returns the matrix U of the transform.\n     * \u003cp\u003eU is an orthogonal matrix, i.e. its transpose is also its inverse.\u003c/p\u003e\n     * @return the U matrix\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 126,col 9)",
        "(line 129,col 9)-(line 129,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BiDiagonalTransformer.getB()",
      "begin_line": 137,
      "end_line": 162,
      "comment": "\n     * Returns the bi-diagonal matrix B of the transform.\n     * @return the B matrix\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 157,col 9)",
        "(line 160,col 9)-(line 160,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BiDiagonalTransformer.getV()",
      "begin_line": 169,
      "end_line": 212,
      "comment": "\n     * Returns the matrix V of the transform.\n     * \u003cp\u003eV is an orthogonal matrix, i.e. its transpose is also its inverse.\u003c/p\u003e\n     * @return the V matrix\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 207,col 9)",
        "(line 210,col 9)-(line 210,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BiDiagonalTransformer.getHouseholderVectorsRef()",
      "begin_line": 220,
      "end_line": 222,
      "comment": "\n     * Get the Householder vectors of the transform.\n     * \u003cp\u003eNote that since this class is only intended for internal use,\n     * it returns directly a reference to its internal arrays, not a copy.\u003c/p\u003e\n     * @return the main diagonal elements of the B matrix\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BiDiagonalTransformer.getMainDiagonalRef()",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\n     * Get the main diagonal elements of the matrix B of the transform.\n     * \u003cp\u003eNote that since this class is only intended for internal use,\n     * it returns directly a reference to its internal arrays, not a copy.\u003c/p\u003e\n     * @return the main diagonal elements of the B matrix\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BiDiagonalTransformer.getSecondaryDiagonalRef()",
      "begin_line": 240,
      "end_line": 242,
      "comment": "\n     * Get the secondary diagonal elements of the matrix B of the transform.\n     * \u003cp\u003eNote that since this class is only intended for internal use,\n     * it returns directly a reference to its internal arrays, not a copy.\u003c/p\u003e\n     * @return the secondary diagonal elements of the B matrix\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BiDiagonalTransformer.isUpperBiDiagonal()",
      "begin_line": 248,
      "end_line": 250,
      "comment": "\n     * Check if the matrix is transformed to upper bi-diagonal.\n     * @return true if the matrix is transformed to upper bi-diagonal\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BiDiagonalTransformer.transformToUpperBiDiagonal()",
      "begin_line": 257,
      "end_line": 314,
      "comment": "\n     * Transform original matrix to upper bi-diagonal form.\n     * \u003cp\u003eTransformation is done using alternate Householder transforms\n     * on columns and rows.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 48)",
        "(line 260,col 9)-(line 260,col 51)",
        "(line 261,col 9)-(line 313,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BiDiagonalTransformer.transformToLowerBiDiagonal()",
      "begin_line": 321,
      "end_line": 379,
      "comment": "\n     * Transform original matrix to lower bi-diagonal form.\n     * \u003cp\u003eTransformation is done using alternate Householder transforms\n     * on rows and columns.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 48)",
        "(line 324,col 9)-(line 324,col 51)",
        "(line 325,col 9)-(line 378,col 9)"
      ]
    }
  ]
}