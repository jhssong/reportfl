{
  "filepath": "/tmp/Math-52b/src/main/java/org/apache/commons/math/linear/NonSelfAdjointLinearOperatorException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NonSelfAdjointLinearOperatorException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MathIllegalArgumentException"
      ],
      "begin_line": 37,
      "end_line": 128,
      "comment": "\n * Exception to be thrown when a self-adjoint {@link RealLinearOperator}\n * is expected.\n * Since the coefficients of the matrix are not accessible, the most\n * general definition is used to check that A is not self-adjoint, i.e.\n * there exist x and y such as {@code | x\u0027 A y - y\u0027 A x | \u003e\u003d eps},\n * where {@code eps} is a user-specified tolerance, and {@code x\u0027}\n * denotes the transpose of {@code x}.\n * In the terminology of this exception, {@code A} is the \"offending\"\n * linear operator, {@code x} and {@code y} are the first and second\n * \"offending\" vectors, respectively.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " The offending linear operator, A. "
    },
    {
      "type": "field",
      "varNames": [
        "threshold"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The threshold. "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " A reference to the first offending vector"
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " A reference to the second offending vector"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.NonSelfAdjointLinearOperatorException.NonSelfAdjointLinearOperatorException(org.apache.commons.math.linear.RealLinearOperator, double[], double[], double)",
      "begin_line": 56,
      "end_line": 64,
      "comment": "\n     * Creates a new instance of this class.\n     *\n     * @param a Offending linear operator.\n     * @param x First offending vector.\n     * @param y Second offending vector.\n     * @param threshold Threshold.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 63,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.NonSelfAdjointLinearOperatorException.NonSelfAdjointLinearOperatorException(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.RealVector, double)",
      "begin_line": 74,
      "end_line": 83,
      "comment": "\n     * Creates a new instance of this class.\n     *\n     * @param a Offending linear operator.\n     * @param x First offending vector.\n     * @param y Second offending vector.\n     * @param threshold Threshold.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 82)",
        "(line 79,col 9)-(line 79,col 19)",
        "(line 80,col 9)-(line 80,col 19)",
        "(line 81,col 9)-(line 81,col 19)",
        "(line 82,col 9)-(line 82,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.NonSelfAdjointLinearOperatorException.getFirstOffendingVector()",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * Returns a reference to the first offending vector.\n     * If the exception was raised by a call to\n     * {@link #NonSelfAdjointLinearOperatorException(RealLinearOperator,\n     * double[], double[], double)}, then a new {@link ArrayRealVector}\n     * holding a reference to the actual {@code double[]} is returned.\n     *\n     * @return the first offending vector.\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.NonSelfAdjointLinearOperatorException.getOffendingLinearOperator()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * Returns a reference to the offending linear operator.\n     *\n     * @return the offending linear operator.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.NonSelfAdjointLinearOperatorException.getSecondOffendingVector()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * Returns a copy of the second offending vector.\n     * If the exception was raised by a call to\n     * {@link #NonSelfAdjointLinearOperatorException(RealLinearOperator,\n     * double[], double[], double)}, then a new {@link ArrayRealVector}\n     * holding a reference to the actual {@code double[]} is returned.\n     *\n     * @return the second offending vector.\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.NonSelfAdjointLinearOperatorException.getThreshold()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n     * Returns the threshold.\n     *\n     * @return the threshold.\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 25)"
      ]
    }
  ]
}