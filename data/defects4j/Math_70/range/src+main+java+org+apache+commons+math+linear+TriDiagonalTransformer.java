{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/linear/TriDiagonalTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TriDiagonalTransformer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 268,
      "comment": "\n * Class transforming a symmetrical matrix to tridiagonal shape.\n * \u003cp\u003eA symmetrical m \u0026times; m matrix A can be written as the product of three matrices:\n * A \u003d Q \u0026times; T \u0026times; Q\u003csup\u003eT\u003c/sup\u003e with Q an orthogonal matrix and T a symmetrical\n * tridiagonal matrix. Both Q and T are m \u0026times; m matrices.\u003c/p\u003e\n * \u003cp\u003eThis implementation only uses the upper part of the matrix, the part below the\n * diagonal is not accessed at all.\u003c/p\u003e\n * \u003cp\u003eTransformation to tridiagonal shape is often not a goal by itself, but it is\n * an intermediate step in more general decomposition algorithms like {@link\n * EigenDecomposition eigen decomposition}. This class is therefore intended for internal\n * use by the library and is not public. As a consequence of this explicitly limited scope,\n * many methods directly returns references to internal arrays, not copies.\u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
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
        "cachedQ"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Cached value of Q. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedQt"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Cached value of Qt. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedT"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Cached value of T. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.TriDiagonalTransformer.TriDiagonalTransformer(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 65,
      "end_line": 82,
      "comment": "\n     * Build the transformation to tridiagonal shape of a symmetrical matrix.\n     * \u003cp\u003eThe specified matrix is assumed to be symmetrical without any check.\n     * Only the upper triangular part of the matrix is used.\u003c/p\u003e\n     * @param matrix the symmetrical matrix to transform.\n     * @exception InvalidMatrixException if matrix is not square\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 69,col 9)",
        "(line 71,col 9)-(line 71,col 47)",
        "(line 72,col 9)-(line 72,col 46)",
        "(line 73,col 9)-(line 73,col 34)",
        "(line 74,col 9)-(line 74,col 38)",
        "(line 75,col 9)-(line 75,col 25)",
        "(line 76,col 9)-(line 76,col 25)",
        "(line 77,col 9)-(line 77,col 25)",
        "(line 80,col 9)-(line 80,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.TriDiagonalTransformer.getQ()",
      "begin_line": 89,
      "end_line": 94,
      "comment": "\n     * Returns the matrix Q of the transform.\n     * \u003cp\u003eQ is an orthogonal matrix, i.e. its transpose is also its inverse.\u003c/p\u003e\n     * @return the Q matrix\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.TriDiagonalTransformer.getQT()",
      "begin_line": 101,
      "end_line": 139,
      "comment": "\n     * Returns the transpose of the matrix Q of the transform.\n     * \u003cp\u003eQ is an orthogonal matrix, i.e. its transpose is also its inverse.\u003c/p\u003e\n     * @return the Q matrix\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 134,col 9)",
        "(line 137,col 9)-(line 137,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.TriDiagonalTransformer.getT()",
      "begin_line": 145,
      "end_line": 166,
      "comment": "\n     * Returns the tridiagonal matrix T of the transform.\n     * @return the T matrix\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 161,col 9)",
        "(line 164,col 9)-(line 164,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.TriDiagonalTransformer.getHouseholderVectorsRef()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\n     * Get the Householder vectors of the transform.\n     * \u003cp\u003eNote that since this class is only intended for internal use,\n     * it returns directly a reference to its internal arrays, not a copy.\u003c/p\u003e\n     * @return the main diagonal elements of the B matrix\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.TriDiagonalTransformer.getMainDiagonalRef()",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\n     * Get the main diagonal elements of the matrix T of the transform.\n     * \u003cp\u003eNote that since this class is only intended for internal use,\n     * it returns directly a reference to its internal arrays, not a copy.\u003c/p\u003e\n     * @return the main diagonal elements of the T matrix\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.TriDiagonalTransformer.getSecondaryDiagonalRef()",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\n     * Get the secondary diagonal elements of the matrix T of the transform.\n     * \u003cp\u003eNote that since this class is only intended for internal use,\n     * it returns directly a reference to its internal arrays, not a copy.\u003c/p\u003e\n     * @return the secondary diagonal elements of the T matrix\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.TriDiagonalTransformer.transform()",
      "begin_line": 202,
      "end_line": 266,
      "comment": "\n     * Transform original matrix to tridiagonal form.\n     * \u003cp\u003eTransformation is done using Householder transforms.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 48)",
        "(line 205,col 9)-(line 205,col 41)",
        "(line 206,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 265,col 55)"
      ]
    }
  ]
}