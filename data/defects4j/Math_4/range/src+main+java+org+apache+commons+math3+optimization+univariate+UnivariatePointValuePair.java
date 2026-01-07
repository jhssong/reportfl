{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optimization/univariate/UnivariatePointValuePair.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariatePointValuePair",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 31,
      "end_line": 69,
      "comment": "\n * This class holds a point and the value of an objective function at this\n * point.\n * This is a simple immutable container.\n *\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "point"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Point. "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Value of the objective function at the point. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair.UnivariatePointValuePair(double, double)",
      "begin_line": 46,
      "end_line": 50,
      "comment": "\n     * Build a point/objective function value pair.\n     *\n     * @param point Point.\n     * @param value Value of an objective function at the point\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 27)",
        "(line 49,col 9)-(line 49,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair.getPoint()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Get the point.\n     *\n     * @return the point.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair.getValue()",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * Get the value of the objective function.\n     *\n     * @return the stored value of the objective function.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 21)"
      ]
    }
  ]
}