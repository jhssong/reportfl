{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/stat/clustering/EuclideanIntegerPoint.java",
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
      "end_line": 117,
      "comment": "\n * A simple implementation of {@link Clusterable} for points with integer coordinates.\n * @version $Revision$ $Date$\n * @since 2.0\n "
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
      "type": "field",
      "varNames": [
        "point"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Point coordinates. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.clustering.EuclideanIntegerPoint.EuclideanIntegerPoint(int[])",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Build an instance wrapping an integer array.\n     * \u003cp\u003eThe wrapped array is referenced, it is \u003cem\u003enot\u003c/em\u003e copied.\u003c/p\u003e\n     * @param point the n-dimensional point in integer space\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.EuclideanIntegerPoint.getPoint()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Get the n-dimensional point in integer space.\n     * @return a reference (not a copy!) to the wrapped array\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.EuclideanIntegerPoint.distanceFrom(org.apache.commons.math.stat.clustering.EuclideanIntegerPoint)",
      "begin_line": 56,
      "end_line": 58,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.EuclideanIntegerPoint.centroidOf(java.util.Collection\u003corg.apache.commons.math.stat.clustering.EuclideanIntegerPoint\u003e)",
      "begin_line": 61,
      "end_line": 72,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 52)",
        "(line 63,col 9)-(line 67,col 9)",
        "(line 68,col 9)-(line 70,col 9)",
        "(line 71,col 9)-(line 71,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.EuclideanIntegerPoint.equals(java.lang.Object)",
      "begin_line": 75,
      "end_line": 90,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 77,col 9)-(line 79,col 9)",
        "(line 80,col 9)-(line 80,col 76)",
        "(line 81,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 89,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.EuclideanIntegerPoint.hashCode()",
      "begin_line": 93,
      "end_line": 100,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 25)",
        "(line 96,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 99,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.EuclideanIntegerPoint.toString()",
      "begin_line": 103,
      "end_line": 115,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 56)",
        "(line 106,col 9)-(line 106,col 45)",
        "(line 107,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 113,col 25)",
        "(line 114,col 9)-(line 114,col 31)"
      ]
    }
  ]
}