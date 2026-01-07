{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/linear/BiDiagonalTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BiDiagonalTransformer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 379,
      "comment": "\n * Class transforming any matrix to bi-diagonal shape.\n * \u003cp\u003eAny m \u0026times; n matrix A can be written as the product of three matrices:\n * A \u003d U \u0026times; B \u0026times; V\u003csup\u003eT\u003c/sup\u003e with U an m \u0026times; m orthogonal matrix,\n * B an m \u0026times; n bi-diagonal matrix (lower diagonal if m \u0026lt; n, upper diagonal\n * otherwise), and V an n \u0026times; n orthogonal matrix.\u003c/p\u003e\n * \u003cp\u003eTransformation to bi-diagonal shape is often not a goal by itself, but it is\n * an intermediate step in more general decomposition algorithms like {@link\n * SingularValueDecomposition Singular Value Decomposition}. This class is therefore\n * intended for internal use by the library and is not public. As a consequence of\n * this explicitly limited scope, many methods directly returns references to\n * internal arrays, not copies.\u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "householderVectors"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Householder vectors. "
    },
    {
      "type": "field",
      "varNames": [
        "main"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Main diagonal. "
    },
    {
      "type": "field",
      "varNames": [
        "secondary"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Secondary diagonal. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedU"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Cached value of U. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedB"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Cached value of B. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedV"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Cached value of V. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BiDiagonalTransformer.BiDiagonalTransformer(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 60,
      "end_line": 79,
      "comment": "\n     * Build the transformation to bi-diagonal shape of a matrix.\n     * @param matrix the matrix to transform.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 47)",
        "(line 63,col 9)-(line 63,col 50)",
        "(line 64,col 9)-(line 64,col 37)",
        "(line 65,col 9)-(line 65,col 46)",
        "(line 66,col 9)-(line 66,col 34)",
        "(line 67,col 9)-(line 67,col 38)",
        "(line 68,col 9)-(line 68,col 25)",
        "(line 69,col 9)-(line 69,col 25)",
        "(line 70,col 9)-(line 70,col 25)",
        "(line 73,col 9)-(line 77,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BiDiagonalTransformer.getU()",
      "begin_line": 86,
      "end_line": 129,
      "comment": "\n     * Returns the matrix U of the transform.\n     * \u003cp\u003eU is an orthogonal matrix, i.e. its transpose is also its inverse.\u003c/p\u003e\n     * @return the U matrix\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 124,col 9)",
        "(line 127,col 9)-(line 127,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BiDiagonalTransformer.getB()",
      "begin_line": 135,
      "end_line": 160,
      "comment": "\n     * Returns the bi-diagonal matrix B of the transform.\n     * @return the B matrix\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 155,col 9)",
        "(line 158,col 9)-(line 158,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BiDiagonalTransformer.getV()",
      "begin_line": 167,
      "end_line": 210,
      "comment": "\n     * Returns the matrix V of the transform.\n     * \u003cp\u003eV is an orthogonal matrix, i.e. its transpose is also its inverse.\u003c/p\u003e\n     * @return the V matrix\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 205,col 9)",
        "(line 208,col 9)-(line 208,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BiDiagonalTransformer.getHouseholderVectorsRef()",
      "begin_line": 218,
      "end_line": 220,
      "comment": "\n     * Get the Householder vectors of the transform.\n     * \u003cp\u003eNote that since this class is only intended for internal use,\n     * it returns directly a reference to its internal arrays, not a copy.\u003c/p\u003e\n     * @return the main diagonal elements of the B matrix\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BiDiagonalTransformer.getMainDiagonalRef()",
      "begin_line": 228,
      "end_line": 230,
      "comment": "\n     * Get the main diagonal elements of the matrix B of the transform.\n     * \u003cp\u003eNote that since this class is only intended for internal use,\n     * it returns directly a reference to its internal arrays, not a copy.\u003c/p\u003e\n     * @return the main diagonal elements of the B matrix\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BiDiagonalTransformer.getSecondaryDiagonalRef()",
      "begin_line": 238,
      "end_line": 240,
      "comment": "\n     * Get the secondary diagonal elements of the matrix B of the transform.\n     * \u003cp\u003eNote that since this class is only intended for internal use,\n     * it returns directly a reference to its internal arrays, not a copy.\u003c/p\u003e\n     * @return the secondary diagonal elements of the B matrix\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BiDiagonalTransformer.isUpperBiDiagonal()",
      "begin_line": 246,
      "end_line": 248,
      "comment": "\n     * Check if the matrix is transformed to upper bi-diagonal.\n     * @return true if the matrix is transformed to upper bi-diagonal\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BiDiagonalTransformer.transformToUpperBiDiagonal()",
      "begin_line": 255,
      "end_line": 312,
      "comment": "\n     * Transform original matrix to upper bi-diagonal form.\n     * \u003cp\u003eTransformation is done using alternate Householder transforms\n     * on columns and rows.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 48)",
        "(line 258,col 9)-(line 258,col 51)",
        "(line 259,col 9)-(line 311,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BiDiagonalTransformer.transformToLowerBiDiagonal()",
      "begin_line": 319,
      "end_line": 377,
      "comment": "\n     * Transform original matrix to lower bi-diagonal form.\n     * \u003cp\u003eTransformation is done using alternate Householder transforms\n     * on rows and columns.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 48)",
        "(line 322,col 9)-(line 322,col 51)",
        "(line 323,col 9)-(line 376,col 9)"
      ]
    }
  ]
}