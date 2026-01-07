{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ml/clustering/Cluster.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Cluster",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 30,
      "end_line": 61,
      "comment": "\n * Cluster holding a set of {@link Clusterable} points.\n * @param \u003cT\u003e the type of points that can be clustered\n * @version $Id$\n * @since 3.2\n "
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
        "points"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " The points contained in this cluster. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ml.clustering.Cluster.Cluster()",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Build a cluster centered at a specified point.\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.Cluster.addPoint(T)",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * Add a point to this cluster.\n     * @param point point to add\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.Cluster.getPoints()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Get the points contained in the cluster.\n     * @return points contained in the cluster\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 22)"
      ]
    }
  ]
}