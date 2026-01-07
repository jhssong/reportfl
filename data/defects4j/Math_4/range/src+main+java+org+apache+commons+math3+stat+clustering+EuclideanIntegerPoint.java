{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/clustering/EuclideanIntegerPoint.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EuclideanIntegerPoint",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.clustering.Clusterable\u003corg.apache.commons.math3.stat.clustering.EuclideanIntegerPoint\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 33,
      "end_line": 102,
      "comment": "\n * A simple implementation of {@link Clusterable} for points with integer coordinates.\n * @version $Id$\n * @since 2.0\n * @deprecated As of 3.2 (to be removed in 4.0),\n * use {@link org.apache.commons.math3.ml.clustering.DoublePoint} instead\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "point"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Point coordinates. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.clustering.EuclideanIntegerPoint.EuclideanIntegerPoint(int[])",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Build an instance wrapping an integer array.\n     * \u003cp\u003eThe wrapped array is referenced, it is \u003cem\u003enot\u003c/em\u003e copied.\u003c/p\u003e\n     * @param point the n-dimensional point in integer space\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.EuclideanIntegerPoint.getPoint()",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Get the n-dimensional point in integer space.\n     * @return a reference (not a copy!) to the wrapped array\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.EuclideanIntegerPoint.distanceFrom(org.apache.commons.math3.stat.clustering.EuclideanIntegerPoint)",
      "begin_line": 60,
      "end_line": 62,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.EuclideanIntegerPoint.centroidOf(java.util.Collection\u003corg.apache.commons.math3.stat.clustering.EuclideanIntegerPoint\u003e)",
      "begin_line": 65,
      "end_line": 76,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 52)",
        "(line 67,col 9)-(line 71,col 9)",
        "(line 72,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 75,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.EuclideanIntegerPoint.equals(java.lang.Object)",
      "begin_line": 79,
      "end_line": 85,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 81,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.EuclideanIntegerPoint.hashCode()",
      "begin_line": 88,
      "end_line": 91,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.EuclideanIntegerPoint.toString()",
      "begin_line": 97,
      "end_line": 100,
      "comment": "\n     * {@inheritDoc}\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 38)"
      ]
    }
  ]
}