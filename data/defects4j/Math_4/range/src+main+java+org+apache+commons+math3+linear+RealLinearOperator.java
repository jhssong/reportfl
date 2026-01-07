{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/RealLinearOperator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealLinearOperator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 53,
      "end_line": 110,
      "comment": "\n * This class defines a linear operator operating on real ({@code double})\n * vector spaces. No direct access to the coefficients of the underlying matrix\n * is provided.\n *\n * The motivation for such an interface is well stated by\n * \u003ca href\u003d\"#BARR1994\"\u003eBarrett et al. (1994)\u003c/a\u003e:\n * \u003cblockquote\u003e\n *  We restrict ourselves to iterative methods, which work by repeatedly\n *  improving an approximate solution until it is accurate enough. These\n *  methods access the coefficient matrix A of the linear system only via the\n *  matrix-vector product y \u003d A \u0026middot; x\n *  (and perhaps z \u003d A\u003csup\u003eT\u003c/sup\u003e \u0026middot; x). Thus the user need only\n *  supply a subroutine for computing y (and perhaps z) given x, which permits\n *  full exploitation of the sparsity or other special structure of A.\n * \u003c/blockquote\u003e\n * \u003cbr/\u003e\n *\n * \u003cdl\u003e\n *  \u003cdt\u003e\u003ca name\u003d\"BARR1994\"\u003eBarret et al. (1994)\u003c/a\u003e\u003c/dt\u003e\n *  \u003cdd\u003e\n *   R. Barrett, M. Berry, T. F. Chan, J. Demmel, J. M. Donato, J. Dongarra,\n *   V. Eijkhout, R. Pozo, C. Romine and H. Van der Vorst,\n *   \u003cem\u003eTemplates for the Solution of Linear Systems: Building Blocks for\n *   Iterative Methods\u003c/em\u003e, SIAM\n *  \u003c/dd\u003e\n * \u003c/dl\u003e\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealLinearOperator.getRowDimension()",
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Returns the dimension of the codomain of this operator.\n     *\n     * @return the number of rows of the underlying matrix\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealLinearOperator.getColumnDimension()",
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * Returns the dimension of the domain of this operator.\n     *\n     * @return the number of columns of the underlying matrix\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealLinearOperator.operate(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 76,
      "end_line": 77,
      "comment": "\n     * Returns the result of multiplying {@code this} by the vector {@code x}.\n     *\n     * @param x the vector to operate on\n     * @return the product of {@code this} instance with {@code x}\n     * @throws DimensionMismatchException if the column dimension does not match\n     * the size of {@code x}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealLinearOperator.operateTranspose(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 93,
      "end_line": 96,
      "comment": "\n     * Returns the result of multiplying the transpose of {@code this} operator\n     * by the vector {@code x} (optional operation). The default implementation\n     * throws an {@link UnsupportedOperationException}. Users overriding this\n     * method must also override {@link #isTransposable()}.\n     *\n     * @param x the vector to operate on\n     * @return the product of the transpose of {@code this} instance with\n     * {@code x}\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if the row dimension does not match the size of {@code x}\n     * @throws UnsupportedOperationException if this operation is not supported\n     * by {@code this} operator\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealLinearOperator.isTransposable()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Returns {@code true} if this operator supports\n     * {@link #operateTranspose(RealVector)}. If {@code true} is returned,\n     * {@link #operateTranspose(RealVector)} should not throw\n     * {@code UnsupportedOperationException}. The default implementation returns\n     * {@code false}.\n     *\n     * @return {@code false}\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 21)"
      ]
    }
  ]
}