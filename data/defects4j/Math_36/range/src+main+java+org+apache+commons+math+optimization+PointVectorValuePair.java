{
  "filepath": "/tmp/Math-36b/src/main/java/org/apache/commons/math/optimization/PointVectorValuePair.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PointVectorValuePair",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.util.Pair\u003cdouble[], double[]\u003e"
      ],
      "begin_line": 31,
      "end_line": 104,
      "comment": "\n * This class holds a point and the vectorial value of an objective function at\n * that point.\n *\n * @see PointValuePair\n * @see org.apache.commons.math.analysis.MultivariateVectorFunction\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.PointVectorValuePair.PointVectorValuePair(double[], double[])",
      "begin_line": 39,
      "end_line": 42,
      "comment": "\n     * Builds a point/objective function value pair.\n     *\n     * @param point Point coordinates. This instance will store\n     * a copy of the array, not the array passed as argument.\n     * @param value Value of the objective function at the point.\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.PointVectorValuePair.PointVectorValuePair(double[], double[], boolean)",
      "begin_line": 52,
      "end_line": 63,
      "comment": "\n     * Build a point/objective function value pair.\n     *\n     * @param point Point coordinates.\n     * @param value Value of the objective function at the point.\n     * @param copyArray if {@code true}, the input arrays will be copied,\n     * otherwise they will be referenced.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 62,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.PointVectorValuePair.getPoint()",
      "begin_line": 70,
      "end_line": 73,
      "comment": "\n     * Gets the point.\n     *\n     * @return a copy of the stored point.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 36)",
        "(line 72,col 9)-(line 72,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.PointVectorValuePair.getPointRef()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Gets a reference to the point.\n     *\n     * @return a reference to the internal array storing the point.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.PointVectorValuePair.getValue()",
      "begin_line": 89,
      "end_line": 93,
      "comment": "\n     * Gets the value of the objective function.\n     *\n     * @return a copy of the stored value of the objective function.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 44)",
        "(line 92,col 9)-(line 92,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.PointVectorValuePair.getValueRef()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Gets a reference to the value of the objective function.\n     *\n     * @return a reference to the internal array storing the value of\n     * the objective function.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 32)"
      ]
    }
  ]
}