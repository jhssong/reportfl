{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optimization/PointVectorValuePair.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PointVectorValuePair",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.util.Pair\u003cdouble[], double[]\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 34,
      "end_line": 152,
      "comment": "\n * This class holds a point and the vectorial value of an objective function at\n * that point.\n *\n * @see PointValuePair\n * @see org.apache.commons.math3.analysis.MultivariateVectorFunction\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 3.0\n "
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
      "signature": "org.apache.commons.math3.optimization.PointVectorValuePair.PointVectorValuePair(double[], double[])",
      "begin_line": 47,
      "end_line": 50,
      "comment": "\n     * Builds a point/objective function value pair.\n     *\n     * @param point Point coordinates. This instance will store\n     * a copy of the array, not the array passed as argument.\n     * @param value Value of the objective function at the point.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.PointVectorValuePair.PointVectorValuePair(double[], double[], boolean)",
      "begin_line": 60,
      "end_line": 71,
      "comment": "\n     * Build a point/objective function value pair.\n     *\n     * @param point Point coordinates.\n     * @param value Value of the objective function at the point.\n     * @param copyArray if {@code true}, the input arrays will be copied,\n     * otherwise they will be referenced.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 70,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.PointVectorValuePair.getPoint()",
      "begin_line": 78,
      "end_line": 81,
      "comment": "\n     * Gets the point.\n     *\n     * @return a copy of the stored point.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 36)",
        "(line 80,col 9)-(line 80,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.PointVectorValuePair.getPointRef()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Gets a reference to the point.\n     *\n     * @return a reference to the internal array storing the point.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.PointVectorValuePair.getValue()",
      "begin_line": 97,
      "end_line": 101,
      "comment": "\n     * Gets the value of the objective function.\n     *\n     * @return a copy of the stored value of the objective function.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 44)",
        "(line 100,col 9)-(line 100,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.PointVectorValuePair.getValueRef()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Gets a reference to the value of the objective function.\n     *\n     * @return a reference to the internal array storing the value of\n     * the objective function.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.PointVectorValuePair.writeReplace()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n     * Replace the instance with a data transfer object for serialization.\n     * @return data transfer object that will be serialized\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DataTransferObject",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 122,
      "end_line": 151,
      "comment": " Internal class used only for serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " Serializable UID. "
    },
    {
      "type": "field",
      "varNames": [
        "point"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": "\n         * Point coordinates.\n         * @Serial\n         "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": "\n         * Value of the objective function at the point.\n         * @Serial\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.PointVectorValuePair.DataTransferObject.DataTransferObject(double[], double[])",
      "begin_line": 140,
      "end_line": 143,
      "comment": " Simple constructor.\n         * @param point Point coordinates.\n         * @param value Value of the objective function at the point.\n         ",
      "child_ranges": [
        "(line 141,col 13)-(line 141,col 39)",
        "(line 142,col 13)-(line 142,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.PointVectorValuePair.DataTransferObject.readResolve()",
      "begin_line": 148,
      "end_line": 150,
      "comment": " Replace the deserialized data transfer object with a {@link PointValuePair}.\n         * @return replacement {@link PointValuePair}\n         ",
      "child_ranges": [
        "(line 149,col 13)-(line 149,col 65)"
      ]
    }
  ]
}