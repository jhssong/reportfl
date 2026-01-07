{
  "filepath": "/tmp/Math-31b/src/main/java/org/apache/commons/math3/linear/SchurTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SchurTransformer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 46,
      "end_line": 449,
      "comment": "\n * Class transforming a general real matrix to Schur form.\n * \u003cp\u003eA m \u0026times; m matrix A can be written as the product of three matrices: A \u003d P\n * \u0026times; T \u0026times; P\u003csup\u003eT\u003c/sup\u003e with P an orthogonal matrix and T an quasi-triangular\n * matrix. Both P and T are m \u0026times; m matrices.\u003c/p\u003e\n * \u003cp\u003eTransformation to Schur form is often not a goal by itself, but it is an\n * intermediate step in more general decomposition algorithms like\n * {@link EigenDecomposition eigen decomposition}. This class is therefore\n * intended for internal use by the library and is not public. As a consequence\n * of this explicitly limited scope, many methods directly returns references to\n * internal arrays, not copies.\u003c/p\u003e\n * \u003cp\u003eThis class is based on the method hqr2 in class EigenvalueDecomposition\n * from the \u003ca href\u003d\"http://math.nist.gov/javanumerics/jama/\"\u003eJAMA\u003c/a\u003e library.\u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/SchurDecomposition.html\"\u003eSchur Decomposition - MathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Schur_decomposition\"\u003eSchur Decomposition - Wikipedia\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Householder_transformation\"\u003eHouseholder Transformations\u003c/a\u003e\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "matrixP"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " P matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "matrixT"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " T matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedP"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Cached value of P. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedT"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Cached value of T. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedPt"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Cached value of PT. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Maximum allowed iterations for convergence of the transformation. "
    },
    {
      "type": "field",
      "varNames": [
        "epsilon"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Epsilon criteria taken from JAMA code (originally was 2^-52). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.SchurTransformer.SchurTransformer(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 70,
      "end_line": 85,
      "comment": "\n     * Build the transformation to Schur form of a general real matrix.\n     *\n     * @param matrix matrix to transform\n     * @throws NonSquareMatrixException if the matrix is not square\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 74,col 9)",
        "(line 76,col 9)-(line 76,col 78)",
        "(line 77,col 9)-(line 77,col 47)",
        "(line 78,col 9)-(line 78,col 47)",
        "(line 79,col 9)-(line 79,col 23)",
        "(line 80,col 9)-(line 80,col 23)",
        "(line 81,col 9)-(line 81,col 24)",
        "(line 84,col 9)-(line 84,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SchurTransformer.getP()",
      "begin_line": 93,
      "end_line": 98,
      "comment": "\n     * Returns the matrix P of the transform.\n     * \u003cp\u003eP is an orthogonal matrix, i.e. its inverse is also its transpose.\u003c/p\u003e\n     *\n     * @return the P matrix\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SchurTransformer.getPT()",
      "begin_line": 106,
      "end_line": 113,
      "comment": "\n     * Returns the transpose of the matrix P of the transform.\n     * \u003cp\u003eP is an orthogonal matrix, i.e. its inverse is also its transpose.\u003c/p\u003e\n     *\n     * @return the transpose of the P matrix\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 109,col 9)",
        "(line 112,col 9)-(line 112,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SchurTransformer.getT()",
      "begin_line": 120,
      "end_line": 127,
      "comment": "\n     * Returns the quasi-triangular Schur matrix T of the transform.\n     *\n     * @return the T matrix\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 123,col 9)",
        "(line 126,col 9)-(line 126,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SchurTransformer.transform()",
      "begin_line": 133,
      "end_line": 253,
      "comment": "\n     * Transform original matrix to Schur form.\n     * @throws MaxCountExceededException if the transformation does not converge\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 37)",
        "(line 137,col 9)-(line 137,col 38)",
        "(line 140,col 9)-(line 140,col 48)",
        "(line 143,col 9)-(line 143,col 26)",
        "(line 144,col 9)-(line 144,col 24)",
        "(line 145,col 9)-(line 252,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SchurTransformer.getNorm()",
      "begin_line": 260,
      "end_line": 269,
      "comment": "\n     * Computes the L1 norm of the (quasi-)triangular matrix T.\n     *\n     * @return the L1 norm of matrix T\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 26)",
        "(line 262,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 268,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SchurTransformer.findSmallSubDiagonalElement(int, double)",
      "begin_line": 278,
      "end_line": 291,
      "comment": "\n     * Find the first small sub-diagonal element and returns its index.\n     *\n     * @param startIdx the starting index for the search\n     * @param norm the L1 norm of the matrix\n     * @return the index of the first small sub-diagonal element\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 25)",
        "(line 280,col 9)-(line 289,col 9)",
        "(line 290,col 9)-(line 290,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SchurTransformer.computeShift(int, int, int, org.apache.commons.math3.linear.SchurTransformer.ShiftInfo)",
      "begin_line": 301,
      "end_line": 338,
      "comment": "\n     * Compute the shift for the current iteration.\n     *\n     * @param l the index of the small sub-diagonal element\n     * @param idx the current eigenvalue index\n     * @param iteration the current iteration\n     * @param shift holder for shift information\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 36)",
        "(line 304,col 9)-(line 304,col 32)",
        "(line 305,col 9)-(line 308,col 9)",
        "(line 311,col 9)-(line 319,col 9)",
        "(line 322,col 9)-(line 337,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SchurTransformer.performDoubleQRStep(int, int, int, org.apache.commons.math3.linear.SchurTransformer.ShiftInfo, double[])",
      "begin_line": 349,
      "end_line": 433,
      "comment": "\n     * Perform a double QR step involving rows l:idx and columns m:n\n     *\n     * @param l the index of the small sub-diagonal element\n     * @param m the start index for the QR step\n     * @param idx the current eigenvalue index\n     * @param shift shift information holder\n     * @param hVec the initial houseHolder vector\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 37)",
        "(line 353,col 9)-(line 353,col 27)",
        "(line 354,col 9)-(line 354,col 27)",
        "(line 355,col 9)-(line 355,col 27)",
        "(line 357,col 9)-(line 424,col 9)",
        "(line 427,col 9)-(line 432,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ShiftInfo",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 439,
      "end_line": 448,
      "comment": "\n     * Internal data structure holding the current shift information.\n     * Contains variable names as present in the original JAMA code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 441,
      "end_line": 441,
      "comment": " TODO: describe "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 443,
      "end_line": 443,
      "comment": " TODO: describe "
    },
    {
      "type": "field",
      "varNames": [
        "w"
      ],
      "begin_line": 445,
      "end_line": 445,
      "comment": " TODO: describe "
    },
    {
      "type": "field",
      "varNames": [
        "exShift"
      ],
      "begin_line": 447,
      "end_line": 447,
      "comment": " Indicates an exceptional shift. "
    }
  ]
}