{
  "filepath": "/tmp/Math-53b/src/main/java/org/apache/commons/math/linear/NonPositiveDefiniteLinearOperatorException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NonPositiveDefiniteLinearOperatorException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MathIllegalArgumentException"
      ],
      "begin_line": 34,
      "end_line": 86,
      "comment": "\n * Exception to be thrown when a symmetric, definite positive\n * {@link RealLinearOperator} is expected.\n * Since the coefficients of the matrix are not accessible, the most\n * general definition is used to check that {@code A} is not positive\n * definite, i.e.  there exists {@code x} such that {@code x\u0027 A x \u003c\u003d 0}.\n * In the terminology of this exception, {@code A} is the \"offending\"\n * linear operator and {@code x} the \"offending\" vector.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " The offending linear operator."
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " A reference to the offending vector. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.NonPositiveDefiniteLinearOperatorException.NonPositiveDefiniteLinearOperatorException(org.apache.commons.math.linear.RealLinearOperator, double[])",
      "begin_line": 47,
      "end_line": 50,
      "comment": "\n     * Creates a new instance of this class.\n     *\n     * @param a Offending linear operator.\n     * @param x Offending vector.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.NonPositiveDefiniteLinearOperatorException.NonPositiveDefiniteLinearOperatorException(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealVector)",
      "begin_line": 58,
      "end_line": 63,
      "comment": "\n     * Creates a new instance of this class.\n     *\n     * @param a Offending linear operator.\n     * @param x Offending vector.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 73)",
        "(line 61,col 9)-(line 61,col 19)",
        "(line 62,col 9)-(line 62,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.NonPositiveDefiniteLinearOperatorException.copyOffendingVector()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Returns a reference to the offending vector.\n     * If the exception was raised by a call to\n     * {@link #NonPositiveDefiniteLinearOperatorException(RealLinearOperator,\n     * double[])}, then a new {@link ArrayRealVector} holding a reference to\n     * the actual {@code double[]} is returned.\n     *\n     * @return the offending vector.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.NonPositiveDefiniteLinearOperatorException.getOffendingLinearOperator()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Returns a reference to the offending linear operator.\n     *\n     * @return the offending linear operator.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 17)"
      ]
    }
  ]
}