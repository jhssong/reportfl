{
  "filepath": "/tmp/Math-50b/src/main/java/org/apache/commons/math/linear/RealLinearOperator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealLinearOperator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 53,
      "end_line": 93,
      "comment": "\n * This class defines a linear operator operating on real ({@code double})\n * vector spaces.\n * No direct access to the coefficients of the underlying matrix is provided.\n *\n * The motivation for such an interface is well stated by\n * \u003ca href\u003d\"#BARR1994\"\u003eBarrett et al. (1994)\u003c/a\u003e:\n * \u003cblockquote\u003e\n *  We restrict ourselves to iterative methods, which work by repeatedly\n *  improving an approximate solution until it is accurate enough. These\n *  methods access the coefficient matrix {@code A} of the linear system\n *  only via the matrix-vector product {@code y \u003d A x} (and perhaps\n *  {@code z} \u003d {@code A}\u003csup\u003eT\u003c/sup\u003e {@code x}). Thus the user need only\n *  supply a subroutine for computing {@code y} (and perhaps {@code z})\n *  given {@code x}, which permits full exploitation of the sparsity or\n *  other special structure of A.\n * \u003c/blockquote\u003e\n * \u003cbr/\u003e\n *\n * \u003cdl\u003e\n *  \u003cdt\u003e\u003ca name\u003d\"BARR1994\"\u003eBarret et al. (1994)\u003c/a\u003e\u003c/dt\u003e\n *  \u003cdd\u003e\n *   R. Barrett, M. Berry, T. F. Chan, J. Demmel, J. M. Donato, J. Dongarra,\n *   V. Eijkhout, R. Pozo, C. Romine and H. Van der Vorst,\n *   \u003cem\u003eTemplates for the Solution of Linear Systems: Building Blocks for\n *   Iterative Methods\u003c/em\u003e, SIAM\n *  \u003c/dd\u003e\n * \u003c/dl\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealLinearOperator.getRowDimension()",
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Returns the dimension of the codomain of this operator.\n     *\n     * @return the number of rows of the underlying matrix.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealLinearOperator.getColumnDimension()",
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * Returns the dimension of the domain of this operator.\n     *\n     * @return the number of columns of the underlying matrix.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealLinearOperator.operate(double[])",
      "begin_line": 74,
      "end_line": 84,
      "comment": "\n     * Returns the result of multiplying {@code this} by the vector {@code x}.\n     *\n     * @param x Vector to operate on.\n     * @return the product of {@code this} instance with {@code x}.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 77,col 9)",
        "(line 78,col 9)-(line 78,col 68)",
        "(line 79,col 9)-(line 83,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealLinearOperator.operate(org.apache.commons.math.linear.RealVector)",
      "begin_line": 92,
      "end_line": 92,
      "comment": "\n     * Returns the result of multiplying {@code this} by the vector {@code x}.\n     *\n     * @param x Vector to operate on.\n     * @return the product of {@code this} instance with {@code x}.\n     ",
      "child_ranges": []
    }
  ]
}