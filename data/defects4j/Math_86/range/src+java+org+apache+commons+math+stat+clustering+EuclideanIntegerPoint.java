{
  "filepath": "/tmp/Math-86b/src/java/org/apache/commons/math/stat/clustering/EuclideanIntegerPoint.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EuclideanIntegerPoint",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.clustering.Clusterable\u003corg.apache.commons.math.stat.clustering.EuclideanIntegerPoint\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 30,
      "end_line": 104,
      "comment": "\n * A simple implementation of {@link Clusterable} for points with integer coordinates.\n * @version $Revision$ $Date$\n * @since 2.0\n "
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
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.clustering.EuclideanIntegerPoint.EuclideanIntegerPoint(int[])",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Build an instance wrapping an integer array.\n     * \u003cp\u003eThe wrapped array is referenced, it is \u003cem\u003enot\u003c/em\u003e copied.\u003c/p\u003e\n     * @param point the n-dimensional point in integer space\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.EuclideanIntegerPoint.getPoint()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Get the n-dimensional point in integer space.\n     * @return a reference (not a copy!) to the wrapped array\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.EuclideanIntegerPoint.distanceFrom(org.apache.commons.math.stat.clustering.EuclideanIntegerPoint)",
      "begin_line": 58,
      "end_line": 60,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.EuclideanIntegerPoint.centroidOf(java.util.Collection\u003corg.apache.commons.math.stat.clustering.EuclideanIntegerPoint\u003e)",
      "begin_line": 63,
      "end_line": 74,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 52)",
        "(line 65,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 72,col 9)",
        "(line 73,col 9)-(line 73,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.EuclideanIntegerPoint.equals(java.lang.Object)",
      "begin_line": 77,
      "end_line": 92,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 79,col 9)-(line 81,col 9)",
        "(line 82,col 9)-(line 82,col 76)",
        "(line 83,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 91,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.EuclideanIntegerPoint.hashCode()",
      "begin_line": 95,
      "end_line": 102,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 25)",
        "(line 98,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 101,col 24)"
      ]
    }
  ]
}