{
  "filepath": "/tmp/Math-50b/src/main/java/org/apache/commons/math/linear/NonSelfAdjointLinearOperatorException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NonSelfAdjointLinearOperatorException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MathIllegalArgumentException"
      ],
      "begin_line": 37,
      "end_line": 44,
      "comment": "\n * Exception to be thrown when a self-adjoint {@link RealLinearOperator}\n * is expected.\n * Since the coefficients of the matrix are not accessible, the most\n * general definition is used to check that A is not self-adjoint, i.e.\n * there exist x and y such as {@code | x\u0027 A y - y\u0027 A x | \u003e\u003d eps},\n * where {@code eps} is a user-specified tolerance, and {@code x\u0027}\n * denotes the transpose of {@code x}.\n * In the terminology of this exception, {@code A} is the \"offending\"\n * linear operator, {@code x} and {@code y} are the first and second\n * \"offending\" vectors, respectively.\n *\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.NonSelfAdjointLinearOperatorException.NonSelfAdjointLinearOperatorException()",
      "begin_line": 41,
      "end_line": 43,
      "comment": " Creates a new instance of this class. ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 65)"
      ]
    }
  ]
}