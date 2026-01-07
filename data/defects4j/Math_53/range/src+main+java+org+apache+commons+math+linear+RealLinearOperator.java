{
  "filepath": "/tmp/Math-53b/src/main/java/org/apache/commons/math/linear/RealLinearOperator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealLinearOperator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 52,
      "end_line": 113,
      "comment": "\n * This class defines a linear operator operating on real ({@code double})\n * vector spaces.\n * No direct access to the coefficients of the underlying matrix is provided.\n *\n * The motivation for such an interface is well stated by\n * \u003ca href\u003d\"#BARR1994\"\u003eBarrett et al. (1994)\u003c/a\u003e:\n * \u003cblockquote\u003e\n *  We restrict ourselves to iterative methods, which work by repeatedly\n *  improving an approximate solution until it is accurate enough. These\n *  methods access the coefficient matrix {@code A} of the linear system\n *  only via the matrix-vector product {@code y \u003d A x} (and perhaps\n *  {@code z} \u003d {@code A}\u003csup\u003eT\u003c/sup\u003e {@code x}). Thus the user need only\n *  supply a subroutine for computing {@code y} (and perhaps {@code z})\n *  given {@code x}, which permits full exploitation of the sparsity or\n *  other special structure of A.\n * \u003c/blockquote\u003e\n * \u003cbr/\u003e\n *\n * \u003cdl\u003e\n *  \u003cdt\u003e\u003ca name\u003d\"BARR1994\"\u003eBarret et al. (1994)\u003c/a\u003e\u003c/dt\u003e\n *  \u003cdd\u003e\n *   R. Barrett, M. Berry, T. F. Chan, J. Demmel, J. M. Donato, J. Dongarra, V.\n *   Eijkhout, R. Pozo, C. Romine and H. Van der Vorst,\n *   \u003cem\u003eTemplates for the Solution of Linear Systems: Building Blocks for\n *   Iterative Methods\u003c/em\u003e, SIAM\u003c/dd\u003e\n * \u003c/dl\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "rowDimension"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " The dimension of the codomain. "
    },
    {
      "type": "field",
      "varNames": [
        "columnDimension"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " The dimension of the domain. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealLinearOperator.RealLinearOperator(int, int)",
      "begin_line": 65,
      "end_line": 68,
      "comment": "\n     * Creates a new instance of this class, with specified dimensions\n     * of the domain and codomain.\n     *\n     * @param rowDimension Dimension of the codomain (number of rows).\n     * @param columnDimension Dimension of the domain (number of columns).\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 47)",
        "(line 67,col 9)-(line 67,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealLinearOperator.getRowDimension()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Returns the dimension of the codomain of this operator.\n     *\n     * @return the number of rows of the underlying matrix.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealLinearOperator.getColumnDimension()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Returns the dimension of the domain of this operator.\n     *\n     * @return the number of columns of the underlying matrix.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealLinearOperator.operate(double[])",
      "begin_line": 94,
      "end_line": 104,
      "comment": "\n     * Returns the result of multiplying {@code this} by the vector {@code x}.\n     *\n     * @param x Vector to operate on.\n     * @return the product of {@code this} instance with {@code x}.\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 98,col 68)",
        "(line 99,col 9)-(line 103,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealLinearOperator.operate(org.apache.commons.math.linear.RealVector)",
      "begin_line": 112,
      "end_line": 112,
      "comment": "\n     * Returns the result of multiplying {@code this} by the vector {@code x}.\n     *\n     * @param x Vector to operate on.\n     * @return the product of {@code this} instance with {@code x}.\n     ",
      "child_ranges": []
    }
  ]
}