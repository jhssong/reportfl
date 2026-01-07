{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optim/univariate/UnivariatePointValuePair.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariatePointValuePair",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 30,
      "end_line": 67,
      "comment": "\n * This class holds a point and the value of an objective function at this\n * point.\n * This is a simple immutable container.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "point"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Point. "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Value of the objective function at the point. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.univariate.UnivariatePointValuePair.UnivariatePointValuePair(double, double)",
      "begin_line": 44,
      "end_line": 48,
      "comment": "\n     * Build a point/objective function value pair.\n     *\n     * @param point Point.\n     * @param value Value of an objective function at the point\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 27)",
        "(line 47,col 9)-(line 47,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.univariate.UnivariatePointValuePair.getPoint()",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Get the point.\n     *\n     * @return the point.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.univariate.UnivariatePointValuePair.getValue()",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Get the value of the objective function.\n     *\n     * @return the stored value of the objective function.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 21)"
      ]
    }
  ]
}