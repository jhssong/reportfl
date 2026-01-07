{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/TriDiagonalTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TriDiagonalTransformer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 254,
      "comment": "\n * Class transforming a symmetrical matrix to tridiagonal shape.\n * \u003cp\u003eA symmetrical m \u0026times; m matrix A can be written as the product of three matrices:\n * A \u003d Q \u0026times; T \u0026times; Q\u003csup\u003eT\u003c/sup\u003e with Q an orthogonal matrix and T a symmetrical\n * tridiagonal matrix. Both Q and T are m \u0026times; m matrices.\u003c/p\u003e\n * \u003cp\u003eThis implementation only uses the upper part of the matrix, the part below the\n * diagonal is not accessed at all.\u003c/p\u003e\n * \u003cp\u003eTransformation to tridiagonal shape is often not a goal by itself, but it is\n * an intermediate step in more general decomposition algorithms like {@link\n * EigenDecomposition eigen decomposition}. This class is therefore intended for internal\n * use by the library and is not public. As a consequence of this explicitly limited scope,\n * many methods directly returns references to internal arrays, not copies.\u003c/p\u003e\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "householderVectors"
      ],
      "begin_line": 42,
      "end_line": 42,
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
      "begin_line": 46,
      "end_line": 46,
      "comment": " Secondary diagonal. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedQ"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Cached value of Q. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedQt"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Cached value of Qt. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedT"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Cached value of T. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.TriDiagonalTransformer.TriDiagonalTransformer(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 62,
      "end_line": 78,
      "comment": "\n     * Build the transformation to tridiagonal shape of a symmetrical matrix.\n     * \u003cp\u003eThe specified matrix is assumed to be symmetrical without any check.\n     * Only the upper triangular part of the matrix is used.\u003c/p\u003e\n     *\n     * @param matrix Symmetrical matrix to transform.\n     * @throws NonSquareMatrixException if the matrix is not square.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 66,col 9)",
        "(line 68,col 9)-(line 68,col 47)",
        "(line 69,col 9)-(line 69,col 46)",
        "(line 70,col 9)-(line 70,col 34)",
        "(line 71,col 9)-(line 71,col 38)",
        "(line 72,col 9)-(line 72,col 25)",
        "(line 73,col 9)-(line 73,col 25)",
        "(line 74,col 9)-(line 74,col 25)",
        "(line 77,col 9)-(line 77,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.TriDiagonalTransformer.getQ()",
      "begin_line": 85,
      "end_line": 90,
      "comment": "\n     * Returns the matrix Q of the transform.\n     * \u003cp\u003eQ is an orthogonal matrix, i.e. its transpose is also its inverse.\u003c/p\u003e\n     * @return the Q matrix\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 89,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.TriDiagonalTransformer.getQT()",
      "begin_line": 97,
      "end_line": 132,
      "comment": "\n     * Returns the transpose of the matrix Q of the transform.\n     * \u003cp\u003eQ is an orthogonal matrix, i.e. its transpose is also its inverse.\u003c/p\u003e\n     * @return the Q matrix\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 128,col 9)",
        "(line 131,col 9)-(line 131,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.TriDiagonalTransformer.getT()",
      "begin_line": 138,
      "end_line": 156,
      "comment": "\n     * Returns the tridiagonal matrix T of the transform.\n     * @return the T matrix\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 152,col 9)",
        "(line 155,col 9)-(line 155,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.TriDiagonalTransformer.getHouseholderVectorsRef()",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\n     * Get the Householder vectors of the transform.\n     * \u003cp\u003eNote that since this class is only intended for internal use,\n     * it returns directly a reference to its internal arrays, not a copy.\u003c/p\u003e\n     * @return the main diagonal elements of the B matrix\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.TriDiagonalTransformer.getMainDiagonalRef()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\n     * Get the main diagonal elements of the matrix T of the transform.\n     * \u003cp\u003eNote that since this class is only intended for internal use,\n     * it returns directly a reference to its internal arrays, not a copy.\u003c/p\u003e\n     * @return the main diagonal elements of the T matrix\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.TriDiagonalTransformer.getSecondaryDiagonalRef()",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\n     * Get the secondary diagonal elements of the matrix T of the transform.\n     * \u003cp\u003eNote that since this class is only intended for internal use,\n     * it returns directly a reference to its internal arrays, not a copy.\u003c/p\u003e\n     * @return the secondary diagonal elements of the T matrix\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.TriDiagonalTransformer.transform()",
      "begin_line": 192,
      "end_line": 253,
      "comment": "\n     * Transform original matrix to tridiagonal form.\n     * \u003cp\u003eTransformation is done using Householder transforms.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 48)",
        "(line 194,col 9)-(line 194,col 41)",
        "(line 195,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 252,col 55)"
      ]
    }
  ]
}