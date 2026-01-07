{
  "filepath": "/tmp/Math-36b/src/main/java/org/apache/commons/math/linear/JacobiPreconditioner.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JacobiPreconditioner",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealLinearOperator"
      ],
      "begin_line": 30,
      "end_line": 101,
      "comment": "\n * This class implements the standard Jacobi (diagonal) preconditioner. For a\n * matrix A\u003csub\u003eij\u003c/sub\u003e, this preconditioner is\n * M \u003d diag(A\u003csub\u003e11\u003c/sub\u003e, A\u003csub\u003e22\u003c/sub\u003e, \u0026hellip;).\n * {@link #create(RealLinearOperator)} returns the \u003cem\u003einverse\u003c/em\u003e of this\n * preconditioner,\n * M\u003csup\u003e-1\u003c/sup\u003e \u003d diag(1 / A\u003csub\u003e11\u003c/sub\u003e, 1 / A\u003csub\u003e22\u003c/sub\u003e, \u0026hellip;)\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "diag"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " The diagonal coefficients of the preconditioner. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.JacobiPreconditioner.JacobiPreconditioner(double[], boolean)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Creates a new instance of this class.\n     *\n     * @param diag the diagonal coefficients of the linear operator to be\n     * preconditioned\n     * @param deep {@code true} if a deep copy of the above array should be\n     * performed\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.JacobiPreconditioner.create(org.apache.commons.math.linear.RealLinearOperator)",
      "begin_line": 60,
      "end_line": 81,
      "comment": "\n     * Creates a new instance of this class. This method extracts the diagonal\n     * coefficients of the specified linear operator. If {@code a} does not\n     * extend {@link AbstractRealMatrix}, then the coefficients of the\n     * underlying matrix are not accessible, coefficient extraction is made by\n     * matrix-vector products with the basis vectors (and might therefore take\n     * some time). With matrices, direct entry access is carried out.\n     *\n     * @param a the linear operator for which the preconditioner should be built\n     * @return the inverse of the preconditioner made of the inverse of the\n     * diagonal coefficients of the specified linear operator\n     * @throws NonSquareOperatorException if {@code a} is not square\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 45)",
        "(line 63,col 9)-(line 65,col 9)",
        "(line 66,col 9)-(line 66,col 44)",
        "(line 67,col 9)-(line 79,col 9)",
        "(line 80,col 9)-(line 80,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.JacobiPreconditioner.getColumnDimension()",
      "begin_line": 84,
      "end_line": 87,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.JacobiPreconditioner.getRowDimension()",
      "begin_line": 90,
      "end_line": 93,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.JacobiPreconditioner.operate(org.apache.commons.math.linear.RealVector)",
      "begin_line": 96,
      "end_line": 100,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 33)"
      ]
    }
  ]
}