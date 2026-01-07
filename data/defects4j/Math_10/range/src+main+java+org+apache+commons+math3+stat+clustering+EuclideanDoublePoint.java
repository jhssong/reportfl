{
  "filepath": "/tmp/Math-10b/src/main/java/org/apache/commons/math3/stat/clustering/EuclideanDoublePoint.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EuclideanDoublePoint",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.clustering.Clusterable\u003corg.apache.commons.math3.stat.clustering.EuclideanDoublePoint\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 30,
      "end_line": 98,
      "comment": "\n * A simple implementation of {@link Clusterable} for points with double coordinates.\n * @version $Id$\n * @since 3.1\n "
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
      "signature": "org.apache.commons.math3.stat.clustering.EuclideanDoublePoint.EuclideanDoublePoint(double[])",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Build an instance wrapping an integer array.\n     * \u003cp\u003e\n     * The wrapped array is referenced, it is \u003cem\u003enot\u003c/em\u003e copied.\n     *\n     * @param point the n-dimensional point in integer space\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.EuclideanDoublePoint.centroidOf(java.util.Collection\u003corg.apache.commons.math3.stat.clustering.EuclideanDoublePoint\u003e)",
      "begin_line": 50,
      "end_line": 61,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 64)",
        "(line 52,col 9)-(line 56,col 9)",
        "(line 57,col 9)-(line 59,col 9)",
        "(line 60,col 9)-(line 60,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.EuclideanDoublePoint.distanceFrom(org.apache.commons.math3.stat.clustering.EuclideanDoublePoint)",
      "begin_line": 64,
      "end_line": 66,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.EuclideanDoublePoint.equals(java.lang.Object)",
      "begin_line": 69,
      "end_line": 75,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 71,col 9)-(line 73,col 9)",
        "(line 74,col 9)-(line 74,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.EuclideanDoublePoint.getPoint()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * Get the n-dimensional point in integer space.\n     *\n     * @return a reference (not a copy!) to the wrapped array\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.EuclideanDoublePoint.hashCode()",
      "begin_line": 87,
      "end_line": 90,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.EuclideanDoublePoint.toString()",
      "begin_line": 93,
      "end_line": 96,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 38)"
      ]
    }
  ]
}