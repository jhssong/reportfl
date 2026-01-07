{
  "filepath": "/tmp/Math-91b/src/java/org/apache/commons/math/linear/decomposition/TriDiagonalTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TriDiagonalTransformer",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 42,
      "end_line": 275,
      "comment": "\n * Class transforming a symmetrical matrix to tridiagonal shape.\n * \u003cp\u003eA symmetrical m \u0026times; m matrix A can be written as the product of three matrices:\n * A \u003d Q \u0026times; T \u0026times; Q\u003csup\u003eT\u003c/sup\u003e with Q an orthogonal matrix and T a symmetrical\n * tridiagonal matrix. Both Q and T are m \u0026times; m matrices.\u003c/p\u003e\n * \u003cp\u003eThis implementation only uses the upper part of the matrix, the part below the\n * diagonal is not accessed at all.\u003c/p\u003e\n * \u003cp\u003eTransformation to tridiagonal shape is often not a goal by itself, but it is\n * an intermediate step in more general decomposition algorithms like {@link\n * EigenDecomposition eigen decomposition}. This class is therefore intended for internal\n * use by the library and is not public. As a consequence of this explicitly limited scope,\n * many methods directly returns references to internal arrays, not copies.\u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "householderVectors"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Householder vectors. "
    },
    {
      "type": "field",
      "varNames": [
        "main"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Main diagonal. "
    },
    {
      "type": "field",
      "varNames": [
        "secondary"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Secondary diagonal. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedQ"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Cached value of Q. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedQt"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Cached value of Qt. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedT"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Cached value of T. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.decomposition.TriDiagonalTransformer.TriDiagonalTransformer(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 72,
      "end_line": 89,
      "comment": "\n     * Build the transformation to tridiagonal shape of a symmetrical matrix.\n     * \u003cp\u003eThe specified matrix is assumed to be symmetrical without any check.\n     * Only the upper triangular part of the matrix is used.\u003c/p\u003e\n     * @param matrix the symmetrical matrix to transform.\n     * @exception InvalidMatrixException if matrix is not square\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 76,col 9)",
        "(line 78,col 9)-(line 78,col 47)",
        "(line 79,col 9)-(line 79,col 46)",
        "(line 80,col 9)-(line 80,col 34)",
        "(line 81,col 9)-(line 81,col 38)",
        "(line 82,col 9)-(line 82,col 25)",
        "(line 83,col 9)-(line 83,col 25)",
        "(line 84,col 9)-(line 84,col 25)",
        "(line 87,col 9)-(line 87,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.TriDiagonalTransformer.getQ()",
      "begin_line": 96,
      "end_line": 101,
      "comment": "\n     * Returns the matrix Q of the transform. \n     * \u003cp\u003eQ is an orthogonal matrix, i.e. its transpose is also its inverse.\u003c/p\u003e\n     * @return the Q matrix\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 100,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.TriDiagonalTransformer.getQT()",
      "begin_line": 108,
      "end_line": 146,
      "comment": "\n     * Returns the transpose of the matrix Q of the transform. \n     * \u003cp\u003eQ is an orthogonal matrix, i.e. its transpose is also its inverse.\u003c/p\u003e\n     * @return the Q matrix\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 141,col 9)",
        "(line 144,col 9)-(line 144,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.TriDiagonalTransformer.getT()",
      "begin_line": 152,
      "end_line": 173,
      "comment": "\n     * Returns the tridiagonal matrix T of the transform. \n     * @return the T matrix\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 168,col 9)",
        "(line 171,col 9)-(line 171,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.TriDiagonalTransformer.getHouseholderVectorsRef()",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * Get the Householder vectors of the transform.\n     * \u003cp\u003eNote that since this class is only intended for internal use,\n     * it returns directly a reference to its internal arrays, not a copy.\u003c/p\u003e\n     * @return the main diagonal elements of the B matrix\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.TriDiagonalTransformer.getMainDiagonalRef()",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\n     * Get the main diagonal elements of the matrix T of the transform.\n     * \u003cp\u003eNote that since this class is only intended for internal use,\n     * it returns directly a reference to its internal arrays, not a copy.\u003c/p\u003e\n     * @return the main diagonal elements of the T matrix\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.TriDiagonalTransformer.getSecondaryDiagonalRef()",
      "begin_line": 201,
      "end_line": 203,
      "comment": "\n     * Get the secondary diagonal elements of the matrix T of the transform.\n     * \u003cp\u003eNote that since this class is only intended for internal use,\n     * it returns directly a reference to its internal arrays, not a copy.\u003c/p\u003e\n     * @return the secondary diagonal elements of the T matrix\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.TriDiagonalTransformer.transform()",
      "begin_line": 209,
      "end_line": 273,
      "comment": "\n     * Transform original matrix to tridiagonal form.\n     * \u003cp\u003eTransformation is done using Householder transforms.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 48)",
        "(line 212,col 9)-(line 212,col 41)",
        "(line 213,col 9)-(line 271,col 9)",
        "(line 272,col 9)-(line 272,col 55)"
      ]
    }
  ]
}