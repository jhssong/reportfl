{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/geometry/euclidean/twod/Euclidean2D.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Euclidean2D",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable",
        "org.apache.commons.math3.geometry.Space"
      ],
      "begin_line": 30,
      "end_line": 75,
      "comment": "\n * This class implements a three-dimensional space.\n * @version $Id$\n * @since 3.0\n "
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
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D.Euclidean2D()",
      "begin_line": 37,
      "end_line": 38,
      "comment": " Private constructor for the singleton.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D.getInstance()",
      "begin_line": 43,
      "end_line": 45,
      "comment": " Get the unique instance.\n     * @return the unique instance\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D.getDimension()",
      "begin_line": 48,
      "end_line": 50,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D.getSubSpace()",
      "begin_line": 53,
      "end_line": 55,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LazyHolder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 61,
      "end_line": 64,
      "comment": " Holder for the instance.\n     * \u003cp\u003eWe use here the Initialization On Demand Holder Idiom.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Cached field instance. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D.readResolve()",
      "begin_line": 70,
      "end_line": 73,
      "comment": " Handle deserialization of the singleton.\n     * @return the singleton instance\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 35)"
      ]
    }
  ]
}