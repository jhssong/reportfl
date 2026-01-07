{
  "filepath": "/tmp/Math-33b/src/main/java/org/apache/commons/math3/optimization/PointValuePair.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PointValuePair",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.util.Pair\u003cdouble[], java.lang.Double\u003e"
      ],
      "begin_line": 31,
      "end_line": 79,
      "comment": "\n * This class holds a point and the value of an objective function at\n * that point.\n *\n * @see PointVectorValuePair\n * @see org.apache.commons.math3.analysis.MultivariateFunction\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.PointValuePair.PointValuePair(double[], double)",
      "begin_line": 39,
      "end_line": 42,
      "comment": "\n     * Builds a point/objective function value pair.\n     *\n     * @param point Point coordinates. This instance will store\n     * a copy of the array, not the array passed as argument.\n     * @param value Value of the objective function at the point.\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.PointValuePair.PointValuePair(double[], double, boolean)",
      "begin_line": 52,
      "end_line": 59,
      "comment": "\n     * Builds a point/objective function value pair.\n     *\n     * @param point Point coordinates.\n     * @param value Value of the objective function at the point.\n     * @param copyArray if {@code true}, the input array will be copied,\n     * otherwise it will be referenced.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 58,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.PointValuePair.getPoint()",
      "begin_line": 66,
      "end_line": 69,
      "comment": "\n     * Gets the point.\n     *\n     * @return a copy of the stored point.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 36)",
        "(line 68,col 9)-(line 68,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.PointValuePair.getPointRef()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Gets a reference to the point.\n     *\n     * @return a reference to the internal array storing the point.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 24)"
      ]
    }
  ]
}