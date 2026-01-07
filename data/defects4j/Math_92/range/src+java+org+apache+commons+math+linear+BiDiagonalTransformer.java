{
  "filepath": "/tmp/Math-92b/src/java/org/apache/commons/math/linear/BiDiagonalTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BiDiagonalTransformer",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 37,
      "end_line": 383,
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
      "end_line": 83,
      "comment": "\n     * Build the transformation to bi-diagonal shape of a matrix. \n     * @param matrix the matrix to transform.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 47)",
        "(line 67,col 9)-(line 67,col 50)",
        "(line 68,col 9)-(line 68,col 37)",
        "(line 69,col 9)-(line 69,col 46)",
        "(line 70,col 9)-(line 70,col 34)",
        "(line 71,col 9)-(line 71,col 38)",
        "(line 72,col 9)-(line 72,col 25)",
        "(line 73,col 9)-(line 73,col 25)",
        "(line 74,col 9)-(line 74,col 25)",
        "(line 77,col 9)-(line 81,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BiDiagonalTransformer.getU()",
      "begin_line": 90,
      "end_line": 133,
      "comment": "\n     * Returns the matrix U of the transform. \n     * \u003cp\u003eU is an orthogonal matrix, i.e. its transpose is also its inverse.\u003c/p\u003e\n     * @return the U matrix\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 128,col 9)",
        "(line 131,col 9)-(line 131,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BiDiagonalTransformer.getB()",
      "begin_line": 139,
      "end_line": 164,
      "comment": "\n     * Returns the bi-diagonal matrix B of the transform. \n     * @return the B matrix\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 159,col 9)",
        "(line 162,col 9)-(line 162,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BiDiagonalTransformer.getV()",
      "begin_line": 171,
      "end_line": 214,
      "comment": "\n     * Returns the matrix V of the transform. \n     * \u003cp\u003eV is an orthogonal matrix, i.e. its transpose is also its inverse.\u003c/p\u003e\n     * @return the V matrix\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 209,col 9)",
        "(line 212,col 9)-(line 212,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BiDiagonalTransformer.getHouseholderVectorsRef()",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\n     * Get the Householder vectors of the transform.\n     * \u003cp\u003eNote that since this class is only intended for internal use,\n     * it returns directly a reference to its internal arrays, not a copy.\u003c/p\u003e\n     * @return the main diagonal elements of the B matrix\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BiDiagonalTransformer.getMainDiagonalRef()",
      "begin_line": 232,
      "end_line": 234,
      "comment": "\n     * Get the main diagonal elements of the matrix B of the transform.\n     * \u003cp\u003eNote that since this class is only intended for internal use,\n     * it returns directly a reference to its internal arrays, not a copy.\u003c/p\u003e\n     * @return the main diagonal elements of the B matrix\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BiDiagonalTransformer.getSecondaryDiagonalRef()",
      "begin_line": 242,
      "end_line": 244,
      "comment": "\n     * Get the secondary diagonal elements of the matrix B of the transform.\n     * \u003cp\u003eNote that since this class is only intended for internal use,\n     * it returns directly a reference to its internal arrays, not a copy.\u003c/p\u003e\n     * @return the secondary diagonal elements of the B matrix\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BiDiagonalTransformer.isUpperBiDiagonal()",
      "begin_line": 250,
      "end_line": 252,
      "comment": "\n     * Check if the matrix is transformed to upper bi-diagonal.\n     * @return true if the matrix is transformed to upper bi-diagonal\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BiDiagonalTransformer.transformToUpperBiDiagonal()",
      "begin_line": 259,
      "end_line": 316,
      "comment": "\n     * Transform original matrix to upper bi-diagonal form.\n     * \u003cp\u003eTransformation is done using alternate Householder transforms\n     * on columns and rows.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 48)",
        "(line 262,col 9)-(line 262,col 51)",
        "(line 263,col 9)-(line 315,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BiDiagonalTransformer.transformToLowerBiDiagonal()",
      "begin_line": 323,
      "end_line": 381,
      "comment": "\n     * Transform original matrix to lower bi-diagonal form.\n     * \u003cp\u003eTransformation is done using alternate Householder transforms\n     * on rows and columns.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 48)",
        "(line 326,col 9)-(line 326,col 51)",
        "(line 327,col 9)-(line 380,col 9)"
      ]
    }
  ]
}