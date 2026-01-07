{
  "filepath": "/tmp/Math-42b/src/main/java/org/apache/commons/math/optimization/RealPointValuePair.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealPointValuePair",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 31,
      "end_line": 86,
      "comment": "\n * This class holds a point and the value of an objective function at this point.\n * \u003cp\u003eThis is a simple immutable container.\u003c/p\u003e\n * @see VectorialPointValuePair\n * @see org.apache.commons.math.analysis.MultivariateFunction\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "point"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Point coordinates. "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Value of the objective function at the point. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.RealPointValuePair.RealPointValuePair(double[], double)",
      "begin_line": 44,
      "end_line": 47,
      "comment": " Build a point/objective function value pair.\n     * @param point point coordinates (the built instance will store\n     * a copy of the array, not the array passed as argument)\n     * @param value value of an objective function at the point\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 60)",
        "(line 46,col 9)-(line 46,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.RealPointValuePair.RealPointValuePair(double[], double, boolean)",
      "begin_line": 56,
      "end_line": 62,
      "comment": " Build a point/objective function value pair.\n     * @param point point coordinates (the built instance will store\n     * a copy of the array, not the array passed as argument)\n     * @param value value of an objective function at the point\n     * @param copyArray if true, the input array will be copied, otherwise\n     * it will be referenced\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 60,col 27)",
        "(line 61,col 9)-(line 61,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.RealPointValuePair.getPoint()",
      "begin_line": 67,
      "end_line": 69,
      "comment": " Get the point.\n     * @return a copy of the stored point\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.RealPointValuePair.getPointRef()",
      "begin_line": 76,
      "end_line": 78,
      "comment": " Get a reference to the point.\n     * \u003cp\u003eThis method is provided as a convenience to avoid copying\n     * the array, the elements of the array should \u003cem\u003enot\u003c/em\u003e be modified.\u003c/p\u003e\n     * @return a reference to the internal array storing the point\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.RealPointValuePair.getValue()",
      "begin_line": 83,
      "end_line": 85,
      "comment": " Get the value of the objective function.\n     * @return the stored value of the objective function\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 21)"
      ]
    }
  ]
}