{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/NonPositiveDefiniteOperatorException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NonPositiveDefiniteOperatorException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.exception.MathIllegalArgumentException"
      ],
      "begin_line": 35,
      "end_line": 44,
      "comment": "\n * Exception to be thrown when a symmetric, definite positive\n * {@link RealLinearOperator} is expected.\n * Since the coefficients of the matrix are not accessible, the most\n * general definition is used to check that {@code A} is not positive\n * definite, i.e.  there exists {@code x} such that {@code x\u0027 A x \u003c\u003d 0}.\n * In the terminology of this exception, {@code A} is the \"offending\"\n * linear operator and {@code x} the \"offending\" vector.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Serializable version Id. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.NonPositiveDefiniteOperatorException.NonPositiveDefiniteOperatorException()",
      "begin_line": 41,
      "end_line": 43,
      "comment": " Creates a new instance of this class. ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 63)"
      ]
    }
  ]
}