{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optim/PointVectorValuePair.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PointVectorValuePair",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.util.Pair\u003cdouble[], double[]\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 31,
      "end_line": 147,
      "comment": "\n * This class holds a point and the vectorial value of an objective function at\n * that point.\n *\n * @see PointValuePair\n * @see org.apache.commons.math3.analysis.MultivariateVectorFunction\n * @version $Id$\n * @since 3.0\n "
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
      "signature": "org.apache.commons.math3.optim.PointVectorValuePair.PointVectorValuePair(double[], double[])",
      "begin_line": 42,
      "end_line": 45,
      "comment": "\n     * Builds a point/objective function value pair.\n     *\n     * @param point Point coordinates. This instance will store\n     * a copy of the array, not the array passed as argument.\n     * @param value Value of the objective function at the point.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.PointVectorValuePair.PointVectorValuePair(double[], double[], boolean)",
      "begin_line": 55,
      "end_line": 66,
      "comment": "\n     * Build a point/objective function value pair.\n     *\n     * @param point Point coordinates.\n     * @param value Value of the objective function at the point.\n     * @param copyArray if {@code true}, the input arrays will be copied,\n     * otherwise they will be referenced.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 65,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.PointVectorValuePair.getPoint()",
      "begin_line": 73,
      "end_line": 76,
      "comment": "\n     * Gets the point.\n     *\n     * @return a copy of the stored point.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 36)",
        "(line 75,col 9)-(line 75,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.PointVectorValuePair.getPointRef()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Gets a reference to the point.\n     *\n     * @return a reference to the internal array storing the point.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.PointVectorValuePair.getValue()",
      "begin_line": 92,
      "end_line": 96,
      "comment": "\n     * Gets the value of the objective function.\n     *\n     * @return a copy of the stored value of the objective function.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 44)",
        "(line 95,col 9)-(line 95,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.PointVectorValuePair.getValueRef()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Gets a reference to the value of the objective function.\n     *\n     * @return a reference to the internal array storing the value of\n     * the objective function.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.PointVectorValuePair.writeReplace()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * Replace the instance with a data transfer object for serialization.\n     * @return data transfer object that will be serialized\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DataTransferObject",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 117,
      "end_line": 146,
      "comment": " Internal class used only for serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " Serializable UID. "
    },
    {
      "type": "field",
      "varNames": [
        "point"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": "\n         * Point coordinates.\n         * @Serial\n         "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": "\n         * Value of the objective function at the point.\n         * @Serial\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.PointVectorValuePair.DataTransferObject.DataTransferObject(double[], double[])",
      "begin_line": 135,
      "end_line": 138,
      "comment": " Simple constructor.\n         * @param point Point coordinates.\n         * @param value Value of the objective function at the point.\n         ",
      "child_ranges": [
        "(line 136,col 13)-(line 136,col 39)",
        "(line 137,col 13)-(line 137,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.PointVectorValuePair.DataTransferObject.readResolve()",
      "begin_line": 143,
      "end_line": 145,
      "comment": " Replace the deserialized data transfer object with a {@link PointValuePair}.\n         * @return replacement {@link PointValuePair}\n         ",
      "child_ranges": [
        "(line 144,col 13)-(line 144,col 65)"
      ]
    }
  ]
}