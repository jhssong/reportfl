{
  "filepath": "/tmp/Math-95b/src/java/org/apache/commons/math/linear/BiDiagonalTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BiDiagonalTransformer",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 37,
      "end_line": 390,
      "comment": "\n * Class transforming any matrix to bi-diagonal shape.\n * \u003cp\u003eAny m \u0026times; n matrix A can be written as the product of three matrices:\n * A \u003d U \u0026times; B \u0026times; V\u003csup\u003eT\u003c/sup\u003e with U an m \u0026times; m orthogonal matrix,\n * B an m \u0026times; n bi-diagonal matrix (lower diagonal if m \u0026lt; n, upper diagonal\n * otherwise), and V an n \u0026times; n orthogonal matrix.\u003c/p\u003e\n * \u003cp\u003eTransformation to bi-diagonal shape is often not a goal by itself, but it is\n * an intermediate step in more general decomposition algorithms like {@link\n * SingularValueDecomposition Singular Value Decomposition}. This class is therefore\n * intended for internal use by the library and is not public. As a consequence of\n * this explicitly limited scope, many methods directly returns references to\n * internal arrays, not copies.\u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "householderVectors"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Householder vectors. "
    },
    {
      "type": "field",
      "varNames": [
        "main"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Main diagonal. "
    },
    {
      "type": "field",
      "varNames": [
        "secondary"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Secondary diagonal. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedU"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Cached value of U. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedB"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Cached value of B. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedV"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Cached value of V. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BiDiagonalTransformer.BiDiagonalTransformer(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 64,
      "end_line": 84,
      "comment": "\n     * Build the transformation to bi-diagonal shape of a matrix. \n     * @param matrix The matrix to transform.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 47)",
        "(line 68,col 9)-(line 68,col 50)",
        "(line 69,col 9)-(line 69,col 37)",
        "(line 70,col 9)-(line 70,col 46)",
        "(line 71,col 9)-(line 71,col 34)",
        "(line 72,col 9)-(line 72,col 38)",
        "(line 73,col 9)-(line 73,col 25)",
        "(line 74,col 9)-(line 74,col 25)",
        "(line 75,col 9)-(line 75,col 25)",
        "(line 78,col 9)-(line 82,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BiDiagonalTransformer.getU()",
      "begin_line": 91,
      "end_line": 137,
      "comment": "\n     * Returns the matrix U of the transform. \n     * \u003cp\u003eU is an orthogonal matrix, i.e. its transpose is also its inverse.\u003c/p\u003e\n     * @return the U matrix\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 132,col 9)",
        "(line 135,col 9)-(line 135,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BiDiagonalTransformer.getB()",
      "begin_line": 143,
      "end_line": 169,
      "comment": "\n     * Returns the bi-diagonal matrix B of the transform. \n     * @return the B matrix\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 164,col 9)",
        "(line 167,col 9)-(line 167,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BiDiagonalTransformer.getV()",
      "begin_line": 176,
      "end_line": 222,
      "comment": "\n     * Returns the matrix V of the transform. \n     * \u003cp\u003eV is an orthogonal matrix, i.e. its transpose is also its inverse.\u003c/p\u003e\n     * @return the V matrix\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 217,col 9)",
        "(line 220,col 9)-(line 220,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BiDiagonalTransformer.getHouseholderVectorsRef()",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\n     * Get the Householder vectors of the transform.\n     * \u003cp\u003eNote that since this class is only intended for internal use,\n     * it returns directly a reference to its internal arrays, not a copy.\u003c/p\u003e\n     * @return the main diagonal elements of the B matrix\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BiDiagonalTransformer.getMainDiagonalRef()",
      "begin_line": 240,
      "end_line": 242,
      "comment": "\n     * Get the main diagonal elements of the matrix B of the transform.\n     * \u003cp\u003eNote that since this class is only intended for internal use,\n     * it returns directly a reference to its internal arrays, not a copy.\u003c/p\u003e\n     * @return the main diagonal elements of the B matrix\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BiDiagonalTransformer.getSecondaryDiagonalRef()",
      "begin_line": 250,
      "end_line": 252,
      "comment": "\n     * Get the secondary diagonal elements of the matrix B of the transform.\n     * \u003cp\u003eNote that since this class is only intended for internal use,\n     * it returns directly a reference to its internal arrays, not a copy.\u003c/p\u003e\n     * @return the secondary diagonal elements of the B matrix\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BiDiagonalTransformer.isUpperBiDiagonal()",
      "begin_line": 258,
      "end_line": 260,
      "comment": "\n     * Check if the matrix is transformed to upper bi-diagonal.\n     * @return true if the matrix is transformed to upper bi-diagonal\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BiDiagonalTransformer.transformToUpperBiDiagonal()",
      "begin_line": 267,
      "end_line": 324,
      "comment": "\n     * Transform original matrix to upper bi-diagonal form.\n     * \u003cp\u003eTransformation is done using alternate Householder transforms\n     * on columns and rows.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 48)",
        "(line 270,col 9)-(line 270,col 51)",
        "(line 271,col 9)-(line 323,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BiDiagonalTransformer.transformToLowerBiDiagonal()",
      "begin_line": 331,
      "end_line": 388,
      "comment": "\n     * Transform original matrix to lower bi-diagonal form.\n     * \u003cp\u003eTransformation is done using alternate Householder transforms\n     * on rows and columns.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 48)",
        "(line 334,col 9)-(line 334,col 51)",
        "(line 335,col 9)-(line 387,col 9)"
      ]
    }
  ]
}