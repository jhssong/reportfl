{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/IllConditionedOperatorException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IllConditionedOperatorException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.exception.MathIllegalArgumentException"
      ],
      "begin_line": 29,
      "end_line": 43,
      "comment": "\n * An exception to be thrown when the condition number of a\n * {@link RealLinearOperator} is too high.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Serializable version Id. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.IllConditionedOperatorException.IllConditionedOperatorException(double)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "\n     * Creates a new instance of this class.\n     *\n     * @param cond An estimate of the condition number of the offending linear\n     * operator.\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 63)"
      ]
    }
  ]
}