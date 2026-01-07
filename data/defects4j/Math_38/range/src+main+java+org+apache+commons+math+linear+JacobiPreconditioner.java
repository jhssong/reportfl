{
  "filepath": "/tmp/Math-38b/src/main/java/org/apache/commons/math/linear/JacobiPreconditioner.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JacobiPreconditioner",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.InvertibleRealLinearOperator"
      ],
      "begin_line": 25,
      "end_line": 103,
      "comment": "\n * This class implements the standard Jacobi (diagonal) preconditioner.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "diag"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": " The diagonal coefficients of the preconditioner. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.JacobiPreconditioner.JacobiPreconditioner(double[], boolean)",
      "begin_line": 38,
      "end_line": 40,
      "comment": "\n     * Creates a new instance of this class.\n     *\n     * @param diag Diagonal coefficients of the preconditioner.\n     * @param deep {@code true} if a deep copy of the above array should be\n     *        performed.\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.JacobiPreconditioner.create(org.apache.commons.math.linear.RealLinearOperator)",
      "begin_line": 55,
      "end_line": 76,
      "comment": "\n     * Creates a new instance of this class. This method extracts the diagonal\n     * coefficients of the specified linear operator. If {@code a} does not\n     * extend {@link AbstractRealMatrix}, then the coefficients of the\n     * underlying matrix are not accessible, coefficient extraction is made by\n     * matrix-vector products with the basis vectors (and might therefore take\n     * some time). With matrices, direct entry access is carried out.\n     *\n     * @param a Linear operator for which the preconditioner should be built.\n     * @return Preconditioner made of the diagonal coefficients of the specified\n     *         linear operator.\n     * @throws NonSquareOperatorException if {@code a} is not square.\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 45)",
        "(line 58,col 9)-(line 60,col 9)",
        "(line 61,col 9)-(line 61,col 44)",
        "(line 62,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 75,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.JacobiPreconditioner.getColumnDimension()",
      "begin_line": 79,
      "end_line": 82,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.JacobiPreconditioner.getRowDimension()",
      "begin_line": 85,
      "end_line": 88,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.JacobiPreconditioner.operate(org.apache.commons.math.linear.RealVector)",
      "begin_line": 91,
      "end_line": 95,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.JacobiPreconditioner.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 98,
      "end_line": 102,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 33)"
      ]
    }
  ]
}