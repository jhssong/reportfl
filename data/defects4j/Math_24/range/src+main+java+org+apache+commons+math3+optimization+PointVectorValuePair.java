{
  "filepath": "/tmp/Math-24b/src/main/java/org/apache/commons/math3/optimization/PointVectorValuePair.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PointVectorValuePair",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.util.Pair\u003cdouble[], double[]\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 33,
      "end_line": 150,
      "comment": "\n * This class holds a point and the vectorial value of an objective function at\n * that point.\n *\n * @see PointValuePair\n * @see org.apache.commons.math3.analysis.MultivariateVectorFunction\n * @version $Id$\n * @since 3.0\n "
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
      "signature": "org.apache.commons.math3.optimization.PointVectorValuePair.PointVectorValuePair(double[], double[])",
      "begin_line": 45,
      "end_line": 48,
      "comment": "\n     * Builds a point/objective function value pair.\n     *\n     * @param point Point coordinates. This instance will store\n     * a copy of the array, not the array passed as argument.\n     * @param value Value of the objective function at the point.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.PointVectorValuePair.PointVectorValuePair(double[], double[], boolean)",
      "begin_line": 58,
      "end_line": 69,
      "comment": "\n     * Build a point/objective function value pair.\n     *\n     * @param point Point coordinates.\n     * @param value Value of the objective function at the point.\n     * @param copyArray if {@code true}, the input arrays will be copied,\n     * otherwise they will be referenced.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 68,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.PointVectorValuePair.getPoint()",
      "begin_line": 76,
      "end_line": 79,
      "comment": "\n     * Gets the point.\n     *\n     * @return a copy of the stored point.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 36)",
        "(line 78,col 9)-(line 78,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.PointVectorValuePair.getPointRef()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Gets a reference to the point.\n     *\n     * @return a reference to the internal array storing the point.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.PointVectorValuePair.getValue()",
      "begin_line": 95,
      "end_line": 99,
      "comment": "\n     * Gets the value of the objective function.\n     *\n     * @return a copy of the stored value of the objective function.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 44)",
        "(line 98,col 9)-(line 98,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.PointVectorValuePair.getValueRef()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Gets a reference to the value of the objective function.\n     *\n     * @return a reference to the internal array storing the value of\n     * the objective function.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.PointVectorValuePair.writeReplace()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n     * Replace the instance with a data transfer object for serialization.\n     * @return data transfer object that will be serialized\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DataTransferObject",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 120,
      "end_line": 149,
      "comment": " Internal class used only for serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": " Serializable UID. "
    },
    {
      "type": "field",
      "varNames": [
        "point"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": "\n         * Point coordinates.\n         * @Serial\n         "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": "\n         * Value of the objective function at the point.\n         * @Serial\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.PointVectorValuePair.DataTransferObject.DataTransferObject(double[], double[])",
      "begin_line": 138,
      "end_line": 141,
      "comment": " Simple constructor.\n         * @param point Point coordinates.\n         * @param value Value of the objective function at the point.\n         ",
      "child_ranges": [
        "(line 139,col 13)-(line 139,col 39)",
        "(line 140,col 13)-(line 140,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.PointVectorValuePair.DataTransferObject.readResolve()",
      "begin_line": 146,
      "end_line": 148,
      "comment": " Replace the deserialized data transfer object with a {@link PointValuePair}.\n         * @return replacement {@link PointValuePair}\n         ",
      "child_ranges": [
        "(line 147,col 13)-(line 147,col 65)"
      ]
    }
  ]
}