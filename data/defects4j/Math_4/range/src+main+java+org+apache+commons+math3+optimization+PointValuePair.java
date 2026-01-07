{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optimization/PointValuePair.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PointValuePair",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.util.Pair\u003cdouble[], java.lang.Double\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 34,
      "end_line": 129,
      "comment": "\n * This class holds a point and the value of an objective function at\n * that point.\n *\n * @see PointVectorValuePair\n * @see org.apache.commons.math3.analysis.MultivariateFunction\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Serializable UID. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.PointValuePair.PointValuePair(double[], double)",
      "begin_line": 47,
      "end_line": 50,
      "comment": "\n     * Builds a point/objective function value pair.\n     *\n     * @param point Point coordinates. This instance will store\n     * a copy of the array, not the array passed as argument.\n     * @param value Value of the objective function at the point.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.PointValuePair.PointValuePair(double[], double, boolean)",
      "begin_line": 60,
      "end_line": 67,
      "comment": "\n     * Builds a point/objective function value pair.\n     *\n     * @param point Point coordinates.\n     * @param value Value of the objective function at the point.\n     * @param copyArray if {@code true}, the input array will be copied,\n     * otherwise it will be referenced.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 66,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.PointValuePair.getPoint()",
      "begin_line": 74,
      "end_line": 77,
      "comment": "\n     * Gets the point.\n     *\n     * @return a copy of the stored point.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 36)",
        "(line 76,col 9)-(line 76,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.PointValuePair.getPointRef()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Gets a reference to the point.\n     *\n     * @return a reference to the internal array storing the point.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.PointValuePair.writeReplace()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Replace the instance with a data transfer object for serialization.\n     * @return data transfer object that will be serialized\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DataTransferObject",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 97,
      "end_line": 127,
      "comment": " Internal class used only for serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " Serializable UID. "
    },
    {
      "type": "field",
      "varNames": [
        "point"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": "\n         * Point coordinates.\n         * @Serial\n         "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": "\n         * Value of the objective function at the point.\n         * @Serial\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.PointValuePair.DataTransferObject.DataTransferObject(double[], double)",
      "begin_line": 115,
      "end_line": 118,
      "comment": " Simple constructor.\n         * @param point Point coordinates.\n         * @param value Value of the objective function at the point.\n         ",
      "child_ranges": [
        "(line 116,col 13)-(line 116,col 39)",
        "(line 117,col 13)-(line 117,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.PointValuePair.DataTransferObject.readResolve()",
      "begin_line": 123,
      "end_line": 125,
      "comment": " Replace the deserialized data transfer object with a {@link PointValuePair}.\n         * @return replacement {@link PointValuePair}\n         ",
      "child_ranges": [
        "(line 124,col 13)-(line 124,col 59)"
      ]
    }
  ]
}