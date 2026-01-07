{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optim/PointValuePair.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PointValuePair",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.util.Pair\u003cdouble[], java.lang.Double\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 31,
      "end_line": 122,
      "comment": "\n * This class holds a point and the value of an objective function at\n * that point.\n *\n * @see PointVectorValuePair\n * @see org.apache.commons.math3.analysis.MultivariateFunction\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Serializable UID. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.PointValuePair.PointValuePair(double[], double)",
      "begin_line": 42,
      "end_line": 45,
      "comment": "\n     * Builds a point/objective function value pair.\n     *\n     * @param point Point coordinates. This instance will store\n     * a copy of the array, not the array passed as argument.\n     * @param value Value of the objective function at the point.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.PointValuePair.PointValuePair(double[], double, boolean)",
      "begin_line": 55,
      "end_line": 62,
      "comment": "\n     * Builds a point/objective function value pair.\n     *\n     * @param point Point coordinates.\n     * @param value Value of the objective function at the point.\n     * @param copyArray if {@code true}, the input array will be copied,\n     * otherwise it will be referenced.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 61,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.PointValuePair.getPoint()",
      "begin_line": 69,
      "end_line": 72,
      "comment": "\n     * Gets the point.\n     *\n     * @return a copy of the stored point.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 36)",
        "(line 71,col 9)-(line 71,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.PointValuePair.getPointRef()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Gets a reference to the point.\n     *\n     * @return a reference to the internal array storing the point.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.PointValuePair.writeReplace()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Replace the instance with a data transfer object for serialization.\n     * @return data transfer object that will be serialized\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DataTransferObject",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 92,
      "end_line": 121,
      "comment": " Internal class used only for serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " Serializable UID. "
    },
    {
      "type": "field",
      "varNames": [
        "point"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": "\n         * Point coordinates.\n         * @Serial\n         "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": "\n         * Value of the objective function at the point.\n         * @Serial\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.PointValuePair.DataTransferObject.DataTransferObject(double[], double)",
      "begin_line": 110,
      "end_line": 113,
      "comment": " Simple constructor.\n         * @param point Point coordinates.\n         * @param value Value of the objective function at the point.\n         ",
      "child_ranges": [
        "(line 111,col 13)-(line 111,col 39)",
        "(line 112,col 13)-(line 112,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.PointValuePair.DataTransferObject.readResolve()",
      "begin_line": 118,
      "end_line": 120,
      "comment": " Replace the deserialized data transfer object with a {@link PointValuePair}.\n         * @return replacement {@link PointValuePair}\n         ",
      "child_ranges": [
        "(line 119,col 13)-(line 119,col 59)"
      ]
    }
  ]
}