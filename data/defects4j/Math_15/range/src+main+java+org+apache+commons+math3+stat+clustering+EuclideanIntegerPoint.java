{
  "filepath": "/tmp/Math-15b/src/main/java/org/apache/commons/math3/stat/clustering/EuclideanIntegerPoint.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EuclideanIntegerPoint",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.clustering.Clusterable\u003corg.apache.commons.math3.stat.clustering.EuclideanIntegerPoint\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 31,
      "end_line": 99,
      "comment": "\n * A simple implementation of {@link Clusterable} for points with integer coordinates.\n * @version $Id$\n * @since 2.0\n "
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
      "type": "field",
      "varNames": [
        "point"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Point coordinates. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.clustering.EuclideanIntegerPoint.EuclideanIntegerPoint(int[])",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Build an instance wrapping an integer array.\n     * \u003cp\u003eThe wrapped array is referenced, it is \u003cem\u003enot\u003c/em\u003e copied.\u003c/p\u003e\n     * @param point the n-dimensional point in integer space\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.EuclideanIntegerPoint.getPoint()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Get the n-dimensional point in integer space.\n     * @return a reference (not a copy!) to the wrapped array\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.EuclideanIntegerPoint.distanceFrom(org.apache.commons.math3.stat.clustering.EuclideanIntegerPoint)",
      "begin_line": 57,
      "end_line": 59,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.EuclideanIntegerPoint.centroidOf(java.util.Collection\u003corg.apache.commons.math3.stat.clustering.EuclideanIntegerPoint\u003e)",
      "begin_line": 62,
      "end_line": 73,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 52)",
        "(line 64,col 9)-(line 68,col 9)",
        "(line 69,col 9)-(line 71,col 9)",
        "(line 72,col 9)-(line 72,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.EuclideanIntegerPoint.equals(java.lang.Object)",
      "begin_line": 76,
      "end_line": 82,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 78,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.EuclideanIntegerPoint.hashCode()",
      "begin_line": 85,
      "end_line": 88,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.EuclideanIntegerPoint.toString()",
      "begin_line": 94,
      "end_line": 97,
      "comment": "\n     * {@inheritDoc}\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 38)"
      ]
    }
  ]
}