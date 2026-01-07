{
  "filepath": "/tmp/Math-18b/src/main/java/org/apache/commons/math3/optimization/PointValuePair.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PointValuePair",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.util.Pair\u003cdouble[], java.lang.Double\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 33,
      "end_line": 127,
      "comment": "\n * This class holds a point and the value of an objective function at\n * that point.\n *\n * @see PointVectorValuePair\n * @see org.apache.commons.math3.analysis.MultivariateFunction\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Serializable UID. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.PointValuePair.PointValuePair(double[], double)",
      "begin_line": 45,
      "end_line": 48,
      "comment": "\n     * Builds a point/objective function value pair.\n     *\n     * @param point Point coordinates. This instance will store\n     * a copy of the array, not the array passed as argument.\n     * @param value Value of the objective function at the point.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.PointValuePair.PointValuePair(double[], double, boolean)",
      "begin_line": 58,
      "end_line": 65,
      "comment": "\n     * Builds a point/objective function value pair.\n     *\n     * @param point Point coordinates.\n     * @param value Value of the objective function at the point.\n     * @param copyArray if {@code true}, the input array will be copied,\n     * otherwise it will be referenced.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 64,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.PointValuePair.getPoint()",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\n     * Gets the point.\n     *\n     * @return a copy of the stored point.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 36)",
        "(line 74,col 9)-(line 74,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.PointValuePair.getPointRef()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * Gets a reference to the point.\n     *\n     * @return a reference to the internal array storing the point.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.PointValuePair.writeReplace()",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * Replace the instance with a data transfer object for serialization.\n     * @return data transfer object that will be serialized\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DataTransferObject",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 95,
      "end_line": 125,
      "comment": " Internal class used only for serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " Serializable UID. "
    },
    {
      "type": "field",
      "varNames": [
        "point"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n         * Point coordinates.\n         * @Serial\n         "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": "\n         * Value of the objective function at the point.\n         * @Serial\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.PointValuePair.DataTransferObject.DataTransferObject(double[], double)",
      "begin_line": 113,
      "end_line": 116,
      "comment": " Simple constructor.\n         * @param point Point coordinates.\n         * @param value Value of the objective function at the point.\n         ",
      "child_ranges": [
        "(line 114,col 13)-(line 114,col 39)",
        "(line 115,col 13)-(line 115,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.PointValuePair.DataTransferObject.readResolve()",
      "begin_line": 121,
      "end_line": 123,
      "comment": " Replace the deserialized data transfer object with a {@link PointValuePair}.\n         * @return replacement {@link PointValuePair}\n         ",
      "child_ranges": [
        "(line 122,col 13)-(line 122,col 59)"
      ]
    }
  ]
}