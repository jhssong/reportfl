{
  "filepath": "/tmp/Math-47b/src/main/java/org/apache/commons/math/linear/NonPositiveDefiniteLinearOperatorException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NonPositiveDefiniteLinearOperatorException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MathIllegalArgumentException"
      ],
      "begin_line": 34,
      "end_line": 40,
      "comment": "\n * Exception to be thrown when a symmetric, definite positive\n * {@link RealLinearOperator} is expected.\n * Since the coefficients of the matrix are not accessible, the most\n * general definition is used to check that {@code A} is not positive\n * definite, i.e.  there exists {@code x} such that {@code x\u0027 A x \u003c\u003d 0}.\n * In the terminology of this exception, {@code A} is the \"offending\"\n * linear operator and {@code x} the \"offending\" vector.\n *\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.NonPositiveDefiniteLinearOperatorException.NonPositiveDefiniteLinearOperatorException()",
      "begin_line": 37,
      "end_line": 39,
      "comment": " Creates a new instance of this class. ",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 70)"
      ]
    }
  ]
}