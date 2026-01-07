{
  "filepath": "/tmp/Math-87b/src/java/org/apache/commons/math/optimization/VectorialPointValuePair.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VectorialPointValuePair",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 32,
      "end_line": 98,
      "comment": " \n * This class holds a point and the vectorial value of an objective function at this point.\n * \u003cp\u003eThis is a simple immutable container.\u003c/p\u003e\n * @see RealPointValuePair\n * @see MultivariateVectorialFunction\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "point"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Point coordinates. "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Vectorial value of the objective function at the point. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.VectorialPointValuePair.VectorialPointValuePair(double[], double[])",
      "begin_line": 48,
      "end_line": 51,
      "comment": " Build a point/objective function value pair.\n     * @param point point coordinates (the built instance will store\n     * a copy of the array, not the array passed as argument)\n     * @param value value of an objective function at the point\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 35)",
        "(line 50,col 9)-(line 50,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.VectorialPointValuePair.VectorialPointValuePair(double[], double[], boolean)",
      "begin_line": 60,
      "end_line": 64,
      "comment": " Build a point/objective function value pair.\n     * @param point point coordinates (the built instance will store\n     * a copy of the array, not the array passed as argument)\n     * @param value value of an objective function at the point\n     * @param copyArray if true, the input arrays will be copied, otherwise\n     * they will be referenced\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 55)",
        "(line 63,col 9)-(line 63,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.VectorialPointValuePair.getPoint()",
      "begin_line": 69,
      "end_line": 71,
      "comment": " Get the point.\n     * @return a copy of the stored point\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.VectorialPointValuePair.getPointRef()",
      "begin_line": 78,
      "end_line": 80,
      "comment": " Get a reference to the point.\n     * \u003cp\u003eThis method is provided as a convenience to avoid copying\n     * the array, the elements of the array should \u003cem\u003enot\u003c/em\u003e be modified.\u003c/p\u003e\n     * @return a reference to the internal array storing the point\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.VectorialPointValuePair.getValue()",
      "begin_line": 85,
      "end_line": 87,
      "comment": " Get the value of the objective function.\n     * @return a copy of the stored value of the objective function\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.VectorialPointValuePair.getValueRef()",
      "begin_line": 94,
      "end_line": 96,
      "comment": " Get a reference to the value of the objective function.\n     * \u003cp\u003eThis method is provided as a convenience to avoid copying\n     * the array, the elements of the array should \u003cem\u003enot\u003c/em\u003e be modified.\u003c/p\u003e\n     * @return a reference to the internal array storing the value of the objective function\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 21)"
      ]
    }
  ]
}