{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/geometry/euclidean/oned/Euclidean1D.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Euclidean1D",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable",
        "org.apache.commons.math3.geometry.Space"
      ],
      "begin_line": 31,
      "end_line": 83,
      "comment": "\n * This class implements a one-dimensional space.\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D.Euclidean1D()",
      "begin_line": 38,
      "end_line": 39,
      "comment": " Private constructor for the singleton.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D.getInstance()",
      "begin_line": 44,
      "end_line": 46,
      "comment": " Get the unique instance.\n     * @return the unique instance\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D.getDimension()",
      "begin_line": 49,
      "end_line": 51,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D.getSubSpace()",
      "begin_line": 61,
      "end_line": 63,
      "comment": " {@inheritDoc}\n     * \u003cp\u003e\n     * As the 1-dimension Euclidean space does not have proper sub-spaces,\n     * this method always throws a {@link MathUnsupportedOperationException}\n     * \u003c/p\u003e\n     * @return nothing\n     * @throws MathUnsupportedOperationException in all cases\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 102)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LazyHolder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 69,
      "end_line": 72,
      "comment": " Holder for the instance.\n     * \u003cp\u003eWe use here the Initialization On Demand Holder Idiom.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Cached field instance. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D.readResolve()",
      "begin_line": 78,
      "end_line": 81,
      "comment": " Handle deserialization of the singleton.\n     * @return the singleton instance\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 35)"
      ]
    }
  ]
}