{
  "filepath": "/tmp/Math-91b/src/java/org/apache/commons/math/linear/decomposition/BiDiagonalTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BiDiagonalTransformer",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 40,
      "end_line": 386,
      "comment": "\n * Class transforming any matrix to bi-diagonal shape.\n * \u003cp\u003eAny m \u0026times; n matrix A can be written as the product of three matrices:\n * A \u003d U \u0026times; B \u0026times; V\u003csup\u003eT\u003c/sup\u003e with U an m \u0026times; m orthogonal matrix,\n * B an m \u0026times; n bi-diagonal matrix (lower diagonal if m \u0026lt; n, upper diagonal\n * otherwise), and V an n \u0026times; n orthogonal matrix.\u003c/p\u003e\n * \u003cp\u003eTransformation to bi-diagonal shape is often not a goal by itself, but it is\n * an intermediate step in more general decomposition algorithms like {@link\n * SingularValueDecomposition Singular Value Decomposition}. This class is therefore\n * intended for internal use by the library and is not public. As a consequence of\n * this explicitly limited scope, many methods directly returns references to\n * internal arrays, not copies.\u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "householderVectors"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Householder vectors. "
    },
    {
      "type": "field",
      "varNames": [
        "main"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Main diagonal. "
    },
    {
      "type": "field",
      "varNames": [
        "secondary"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Secondary diagonal. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedU"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Cached value of U. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedB"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Cached value of B. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedV"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Cached value of V. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.decomposition.BiDiagonalTransformer.BiDiagonalTransformer(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 67,
      "end_line": 86,
      "comment": "\n     * Build the transformation to bi-diagonal shape of a matrix. \n     * @param matrix the matrix to transform.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 47)",
        "(line 70,col 9)-(line 70,col 50)",
        "(line 71,col 9)-(line 71,col 37)",
        "(line 72,col 9)-(line 72,col 46)",
        "(line 73,col 9)-(line 73,col 34)",
        "(line 74,col 9)-(line 74,col 38)",
        "(line 75,col 9)-(line 75,col 25)",
        "(line 76,col 9)-(line 76,col 25)",
        "(line 77,col 9)-(line 77,col 25)",
        "(line 80,col 9)-(line 84,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.BiDiagonalTransformer.getU()",
      "begin_line": 93,
      "end_line": 136,
      "comment": "\n     * Returns the matrix U of the transform. \n     * \u003cp\u003eU is an orthogonal matrix, i.e. its transpose is also its inverse.\u003c/p\u003e\n     * @return the U matrix\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 131,col 9)",
        "(line 134,col 9)-(line 134,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.BiDiagonalTransformer.getB()",
      "begin_line": 142,
      "end_line": 167,
      "comment": "\n     * Returns the bi-diagonal matrix B of the transform. \n     * @return the B matrix\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 162,col 9)",
        "(line 165,col 9)-(line 165,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.BiDiagonalTransformer.getV()",
      "begin_line": 174,
      "end_line": 217,
      "comment": "\n     * Returns the matrix V of the transform. \n     * \u003cp\u003eV is an orthogonal matrix, i.e. its transpose is also its inverse.\u003c/p\u003e\n     * @return the V matrix\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 212,col 9)",
        "(line 215,col 9)-(line 215,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.BiDiagonalTransformer.getHouseholderVectorsRef()",
      "begin_line": 225,
      "end_line": 227,
      "comment": "\n     * Get the Householder vectors of the transform.\n     * \u003cp\u003eNote that since this class is only intended for internal use,\n     * it returns directly a reference to its internal arrays, not a copy.\u003c/p\u003e\n     * @return the main diagonal elements of the B matrix\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.BiDiagonalTransformer.getMainDiagonalRef()",
      "begin_line": 235,
      "end_line": 237,
      "comment": "\n     * Get the main diagonal elements of the matrix B of the transform.\n     * \u003cp\u003eNote that since this class is only intended for internal use,\n     * it returns directly a reference to its internal arrays, not a copy.\u003c/p\u003e\n     * @return the main diagonal elements of the B matrix\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.BiDiagonalTransformer.getSecondaryDiagonalRef()",
      "begin_line": 245,
      "end_line": 247,
      "comment": "\n     * Get the secondary diagonal elements of the matrix B of the transform.\n     * \u003cp\u003eNote that since this class is only intended for internal use,\n     * it returns directly a reference to its internal arrays, not a copy.\u003c/p\u003e\n     * @return the secondary diagonal elements of the B matrix\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.BiDiagonalTransformer.isUpperBiDiagonal()",
      "begin_line": 253,
      "end_line": 255,
      "comment": "\n     * Check if the matrix is transformed to upper bi-diagonal.\n     * @return true if the matrix is transformed to upper bi-diagonal\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.BiDiagonalTransformer.transformToUpperBiDiagonal()",
      "begin_line": 262,
      "end_line": 319,
      "comment": "\n     * Transform original matrix to upper bi-diagonal form.\n     * \u003cp\u003eTransformation is done using alternate Householder transforms\n     * on columns and rows.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 48)",
        "(line 265,col 9)-(line 265,col 51)",
        "(line 266,col 9)-(line 318,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.BiDiagonalTransformer.transformToLowerBiDiagonal()",
      "begin_line": 326,
      "end_line": 384,
      "comment": "\n     * Transform original matrix to lower bi-diagonal form.\n     * \u003cp\u003eTransformation is done using alternate Householder transforms\n     * on rows and columns.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 48)",
        "(line 329,col 9)-(line 329,col 51)",
        "(line 330,col 9)-(line 383,col 9)"
      ]
    }
  ]
}