{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/HessenbergTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HessenbergTransformer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 42,
      "end_line": 233,
      "comment": "\n * Class transforming a general real matrix to Hessenberg form.\n * \u003cp\u003eA m \u0026times; m matrix A can be written as the product of three matrices: A \u003d P\n * \u0026times; H \u0026times; P\u003csup\u003eT\u003c/sup\u003e with P an orthogonal matrix and H a Hessenberg\n * matrix. Both P and H are m \u0026times; m matrices.\u003c/p\u003e\n * \u003cp\u003eTransformation to Hessenberg form is often not a goal by itself, but it is an\n * intermediate step in more general decomposition algorithms like\n * {@link EigenDecomposition eigen decomposition}. This class is therefore\n * intended for internal use by the library and is not public. As a consequence\n * of this explicitly limited scope, many methods directly returns references to\n * internal arrays, not copies.\u003c/p\u003e\n * \u003cp\u003eThis class is based on the method orthes in class EigenvalueDecomposition\n * from the \u003ca href\u003d\"http://math.nist.gov/javanumerics/jama/\"\u003eJAMA\u003c/a\u003e library.\u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/HessenbergDecomposition.html\"\u003eMathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Householder_transformation\"\u003eHouseholder Transformations\u003c/a\u003e\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "householderVectors"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Householder vectors. "
    },
    {
      "type": "field",
      "varNames": [
        "ort"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Temporary storage vector. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedP"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Cached value of P. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedPt"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Cached value of Pt. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedH"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Cached value of H. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.HessenbergTransformer.HessenbergTransformer(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 60,
      "end_line": 75,
      "comment": "\n     * Build the transformation to Hessenberg form of a general matrix.\n     *\n     * @param matrix matrix to transform\n     * @throws NonSquareMatrixException if the matrix is not square\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 64,col 9)",
        "(line 66,col 9)-(line 66,col 47)",
        "(line 67,col 9)-(line 67,col 46)",
        "(line 68,col 9)-(line 68,col 28)",
        "(line 69,col 9)-(line 69,col 23)",
        "(line 70,col 9)-(line 70,col 24)",
        "(line 71,col 9)-(line 71,col 23)",
        "(line 74,col 9)-(line 74,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.HessenbergTransformer.getP()",
      "begin_line": 83,
      "end_line": 121,
      "comment": "\n     * Returns the matrix P of the transform.\n     * \u003cp\u003eP is an orthogonal matrix, i.e. its inverse is also its transpose.\u003c/p\u003e\n     *\n     * @return the P matrix\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.HessenbergTransformer.getPT()",
      "begin_line": 129,
      "end_line": 136,
      "comment": "\n     * Returns the transpose of the matrix P of the transform.\n     * \u003cp\u003eP is an orthogonal matrix, i.e. its inverse is also its transpose.\u003c/p\u003e\n     *\n     * @return the transpose of the P matrix\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 132,col 9)",
        "(line 135,col 9)-(line 135,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.HessenbergTransformer.getH()",
      "begin_line": 143,
      "end_line": 163,
      "comment": "\n     * Returns the Hessenberg matrix H of the transform.\n     *\n     * @return the H matrix\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 159,col 9)",
        "(line 162,col 9)-(line 162,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.HessenbergTransformer.getHouseholderVectorsRef()",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\n     * Get the Householder vectors of the transform.\n     * \u003cp\u003eNote that since this class is only intended for internal use, it returns\n     * directly a reference to its internal arrays, not a copy.\u003c/p\u003e\n     *\n     * @return the main diagonal elements of the B matrix\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.HessenbergTransformer.transform()",
      "begin_line": 180,
      "end_line": 232,
      "comment": "\n     * Transform original matrix to Hessenberg form.\n     * \u003cp\u003eTransformation is done using Householder transforms.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 48)",
        "(line 182,col 9)-(line 182,col 31)",
        "(line 184,col 9)-(line 231,col 9)"
      ]
    }
  ]
}