{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ml/clustering/DoublePoint.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DoublePoint",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ml.clustering.Clusterable",
        "java.io.Serializable"
      ],
      "begin_line": 28,
      "end_line": 87,
      "comment": "\n * A simple implementation of {@link Clusterable} for points with double coordinates.\n * @version $Id$\n * @since 3.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "point"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Point coordinates. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ml.clustering.DoublePoint.DoublePoint(double[])",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Build an instance wrapping an double array.\n     * \u003cp\u003e\n     * The wrapped array is referenced, it is \u003cem\u003enot\u003c/em\u003e copied.\n     *\n     * @param point the n-dimensional point in double space\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ml.clustering.DoublePoint.DoublePoint(int[])",
      "begin_line": 54,
      "end_line": 59,
      "comment": "\n     * Build an instance wrapping an integer array.\n     * \u003cp\u003e\n     * The wrapped array is copied to an internal double array.\n     *\n     * @param point the n-dimensional point in integer space\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 46)",
        "(line 56,col 9)-(line 58,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.DoublePoint.getPoint()",
      "begin_line": 62,
      "end_line": 64,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.DoublePoint.equals(java.lang.Object)",
      "begin_line": 67,
      "end_line": 73,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 69,col 9)-(line 71,col 9)",
        "(line 72,col 9)-(line 72,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.DoublePoint.hashCode()",
      "begin_line": 76,
      "end_line": 79,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.DoublePoint.toString()",
      "begin_line": 82,
      "end_line": 85,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 38)"
      ]
    }
  ]
}