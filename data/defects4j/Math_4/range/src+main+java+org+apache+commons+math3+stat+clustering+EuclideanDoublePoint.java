{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/clustering/EuclideanDoublePoint.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EuclideanDoublePoint",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.clustering.Clusterable\u003corg.apache.commons.math3.stat.clustering.EuclideanDoublePoint\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 32,
      "end_line": 101,
      "comment": "\n * A simple implementation of {@link Clusterable} for points with double coordinates.\n * @version $Id$\n * @since 3.1\n * @deprecated As of 3.2 (to be removed in 4.0),\n * use {@link org.apache.commons.math3.ml.clustering.DoublePoint} instead\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "point"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Point coordinates. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.clustering.EuclideanDoublePoint.EuclideanDoublePoint(double[])",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Build an instance wrapping an integer array.\n     * \u003cp\u003e\n     * The wrapped array is referenced, it is \u003cem\u003enot\u003c/em\u003e copied.\n     *\n     * @param point the n-dimensional point in integer space\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.EuclideanDoublePoint.centroidOf(java.util.Collection\u003corg.apache.commons.math3.stat.clustering.EuclideanDoublePoint\u003e)",
      "begin_line": 53,
      "end_line": 64,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 64)",
        "(line 55,col 9)-(line 59,col 9)",
        "(line 60,col 9)-(line 62,col 9)",
        "(line 63,col 9)-(line 63,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.EuclideanDoublePoint.distanceFrom(org.apache.commons.math3.stat.clustering.EuclideanDoublePoint)",
      "begin_line": 67,
      "end_line": 69,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.EuclideanDoublePoint.equals(java.lang.Object)",
      "begin_line": 72,
      "end_line": 78,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 74,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 77,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.EuclideanDoublePoint.getPoint()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Get the n-dimensional point in integer space.\n     *\n     * @return a reference (not a copy!) to the wrapped array\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.EuclideanDoublePoint.hashCode()",
      "begin_line": 90,
      "end_line": 93,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.EuclideanDoublePoint.toString()",
      "begin_line": 96,
      "end_line": 99,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 38)"
      ]
    }
  ]
}