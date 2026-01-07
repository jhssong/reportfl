{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/SchurTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SchurTransformer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 45,
      "end_line": 456,
      "comment": "\n * Class transforming a general real matrix to Schur form.\n * \u003cp\u003eA m \u0026times; m matrix A can be written as the product of three matrices: A \u003d P\n * \u0026times; T \u0026times; P\u003csup\u003eT\u003c/sup\u003e with P an orthogonal matrix and T an quasi-triangular\n * matrix. Both P and T are m \u0026times; m matrices.\u003c/p\u003e\n * \u003cp\u003eTransformation to Schur form is often not a goal by itself, but it is an\n * intermediate step in more general decomposition algorithms like\n * {@link EigenDecomposition eigen decomposition}. This class is therefore\n * intended for internal use by the library and is not public. As a consequence\n * of this explicitly limited scope, many methods directly returns references to\n * internal arrays, not copies.\u003c/p\u003e\n * \u003cp\u003eThis class is based on the method hqr2 in class EigenvalueDecomposition\n * from the \u003ca href\u003d\"http://math.nist.gov/javanumerics/jama/\"\u003eJAMA\u003c/a\u003e library.\u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/SchurDecomposition.html\"\u003eSchur Decomposition - MathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Schur_decomposition\"\u003eSchur Decomposition - Wikipedia\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Householder_transformation\"\u003eHouseholder Transformations\u003c/a\u003e\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_ITERATIONS"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Maximum allowed iterations for convergence of the transformation. "
    },
    {
      "type": "field",
      "varNames": [
        "matrixP"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " P matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "matrixT"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " T matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedP"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Cached value of P. "
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
      "type": "field",
      "varNames": [
        "cachedPt"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Cached value of PT. "
    },
    {
      "type": "field",
      "varNames": [
        "epsilon"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Epsilon criteria taken from JAMA code (originally was 2^-52). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.SchurTransformer.SchurTransformer(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 69,
      "end_line": 84,
      "comment": "\n     * Build the transformation to Schur form of a general real matrix.\n     *\n     * @param matrix matrix to transform\n     * @throws NonSquareMatrixException if the matrix is not square\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 73,col 9)",
        "(line 75,col 9)-(line 75,col 78)",
        "(line 76,col 9)-(line 76,col 47)",
        "(line 77,col 9)-(line 77,col 47)",
        "(line 78,col 9)-(line 78,col 23)",
        "(line 79,col 9)-(line 79,col 23)",
        "(line 80,col 9)-(line 80,col 24)",
        "(line 83,col 9)-(line 83,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SchurTransformer.getP()",
      "begin_line": 92,
      "end_line": 97,
      "comment": "\n     * Returns the matrix P of the transform.\n     * \u003cp\u003eP is an orthogonal matrix, i.e. its inverse is also its transpose.\u003c/p\u003e\n     *\n     * @return the P matrix\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 96,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SchurTransformer.getPT()",
      "begin_line": 105,
      "end_line": 112,
      "comment": "\n     * Returns the transpose of the matrix P of the transform.\n     * \u003cp\u003eP is an orthogonal matrix, i.e. its inverse is also its transpose.\u003c/p\u003e\n     *\n     * @return the transpose of the P matrix\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 108,col 9)",
        "(line 111,col 9)-(line 111,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SchurTransformer.getT()",
      "begin_line": 119,
      "end_line": 126,
      "comment": "\n     * Returns the quasi-triangular Schur matrix T of the transform.\n     *\n     * @return the T matrix\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 122,col 9)",
        "(line 125,col 9)-(line 125,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SchurTransformer.transform()",
      "begin_line": 132,
      "end_line": 217,
      "comment": "\n     * Transform original matrix to Schur form.\n     * @throws MaxCountExceededException if the transformation does not converge\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 37)",
        "(line 136,col 9)-(line 136,col 38)",
        "(line 139,col 9)-(line 139,col 48)",
        "(line 142,col 9)-(line 142,col 26)",
        "(line 143,col 9)-(line 143,col 23)",
        "(line 144,col 9)-(line 216,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SchurTransformer.getNorm()",
      "begin_line": 224,
      "end_line": 233,
      "comment": "\n     * Computes the L1 norm of the (quasi-)triangular matrix T.\n     *\n     * @return the L1 norm of matrix T\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 26)",
        "(line 226,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 232,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SchurTransformer.findSmallSubDiagonalElement(int, double)",
      "begin_line": 242,
      "end_line": 255,
      "comment": "\n     * Find the first small sub-diagonal element and returns its index.\n     *\n     * @param startIdx the starting index for the search\n     * @param norm the L1 norm of the matrix\n     * @return the index of the first small sub-diagonal element\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 25)",
        "(line 244,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 254,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SchurTransformer.computeShift(int, int, int, org.apache.commons.math3.linear.SchurTransformer.ShiftInfo)",
      "begin_line": 265,
      "end_line": 303,
      "comment": "\n     * Compute the shift for the current iteration.\n     *\n     * @param l the index of the small sub-diagonal element\n     * @param idx the current eigenvalue index\n     * @param iteration the current iteration\n     * @param shift holder for shift information\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 36)",
        "(line 268,col 9)-(line 268,col 32)",
        "(line 269,col 9)-(line 272,col 9)",
        "(line 275,col 9)-(line 284,col 9)",
        "(line 287,col 9)-(line 302,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SchurTransformer.initQRStep(int, int, org.apache.commons.math3.linear.SchurTransformer.ShiftInfo, double[])",
      "begin_line": 314,
      "end_line": 341,
      "comment": "\n     * Initialize the householder vectors for the QR step.\n     *\n     * @param il the index of the small sub-diagonal element\n     * @param iu the current eigenvalue index\n     * @param shift shift information holder\n     * @param hVec the initial houseHolder vector\n     * @return the start index for the QR step\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 24)",
        "(line 317,col 9)-(line 338,col 9)",
        "(line 340,col 9)-(line 340,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SchurTransformer.performDoubleQRStep(int, int, int, org.apache.commons.math3.linear.SchurTransformer.ShiftInfo, double[])",
      "begin_line": 352,
      "end_line": 436,
      "comment": "\n     * Perform a double QR step involving rows l:idx and columns m:n\n     *\n     * @param il the index of the small sub-diagonal element\n     * @param im the start index for the QR step\n     * @param iu the current eigenvalue index\n     * @param shift shift information holder\n     * @param hVec the initial houseHolder vector\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 37)",
        "(line 356,col 9)-(line 356,col 27)",
        "(line 357,col 9)-(line 357,col 27)",
        "(line 358,col 9)-(line 358,col 27)",
        "(line 360,col 9)-(line 427,col 9)",
        "(line 430,col 9)-(line 435,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ShiftInfo",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 442,
      "end_line": 455,
      "comment": "\n     * Internal data structure holding the current shift information.\n     * Contains variable names as present in the original JAMA code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 446,
      "end_line": 446,
      "comment": " x shift info "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 448,
      "end_line": 448,
      "comment": " y shift info "
    },
    {
      "type": "field",
      "varNames": [
        "w"
      ],
      "begin_line": 450,
      "end_line": 450,
      "comment": " w shift info "
    },
    {
      "type": "field",
      "varNames": [
        "exShift"
      ],
      "begin_line": 452,
      "end_line": 452,
      "comment": " Indicates an exceptional shift. "
    }
  ]
}