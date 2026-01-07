{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/optimization/VectorialPointValuePair.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VectorialPointValuePair",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 30,
      "end_line": 96,
      "comment": "\n * This class holds a point and the vectorial value of an objective function at this point.\n * \u003cp\u003eThis is a simple immutable container.\u003c/p\u003e\n * @see RealPointValuePair\n * @see org.apache.commons.math.analysis.MultivariateVectorialFunction\n * @version $Revision$ $Date$\n * @since 2.0\n "
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
      "begin_line": 36,
      "end_line": 36,
      "comment": " Point coordinates. "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Vectorial value of the objective function at the point. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.VectorialPointValuePair.VectorialPointValuePair(double[], double[])",
      "begin_line": 46,
      "end_line": 49,
      "comment": " Build a point/objective function value pair.\n     * @param point point coordinates (the built instance will store\n     * a copy of the array, not the array passed as argument)\n     * @param value value of an objective function at the point\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 35)",
        "(line 48,col 9)-(line 48,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.VectorialPointValuePair.VectorialPointValuePair(double[], double[], boolean)",
      "begin_line": 58,
      "end_line": 62,
      "comment": " Build a point/objective function value pair.\n     * @param point point coordinates (the built instance will store\n     * a copy of the array, not the array passed as argument)\n     * @param value value of an objective function at the point\n     * @param copyArray if true, the input arrays will be copied, otherwise\n     * they will be referenced\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 55)",
        "(line 61,col 9)-(line 61,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.VectorialPointValuePair.getPoint()",
      "begin_line": 67,
      "end_line": 69,
      "comment": " Get the point.\n     * @return a copy of the stored point\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.VectorialPointValuePair.getPointRef()",
      "begin_line": 76,
      "end_line": 78,
      "comment": " Get a reference to the point.\n     * \u003cp\u003eThis method is provided as a convenience to avoid copying\n     * the array, the elements of the array should \u003cem\u003enot\u003c/em\u003e be modified.\u003c/p\u003e\n     * @return a reference to the internal array storing the point\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.VectorialPointValuePair.getValue()",
      "begin_line": 83,
      "end_line": 85,
      "comment": " Get the value of the objective function.\n     * @return a copy of the stored value of the objective function\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.VectorialPointValuePair.getValueRef()",
      "begin_line": 92,
      "end_line": 94,
      "comment": " Get a reference to the value of the objective function.\n     * \u003cp\u003eThis method is provided as a convenience to avoid copying\n     * the array, the elements of the array should \u003cem\u003enot\u003c/em\u003e be modified.\u003c/p\u003e\n     * @return a reference to the internal array storing the value of the objective function\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 21)"
      ]
    }
  ]
}