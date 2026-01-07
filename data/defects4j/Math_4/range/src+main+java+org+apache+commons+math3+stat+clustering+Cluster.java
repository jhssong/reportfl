{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/clustering/Cluster.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Cluster",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 32,
      "end_line": 77,
      "comment": "\n * Cluster holding a set of {@link Clusterable} points.\n * @param \u003cT\u003e the type of points that can be clustered\n * @version $Id$\n * @since 2.0\n * @deprecated As of 3.2 (to be removed in 4.0),\n * use {@link org.apache.commons.math3.ml.clustering.Cluster} instead\n "
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
        "points"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " The points contained in this cluster. "
    },
    {
      "type": "field",
      "varNames": [
        "center"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Center of the cluster. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.clustering.Cluster.Cluster(T)",
      "begin_line": 48,
      "end_line": 51,
      "comment": "\n     * Build a cluster centered at a specified point.\n     * @param center the point which is to be the center of this cluster\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 29)",
        "(line 50,col 9)-(line 50,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.Cluster.addPoint(T)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Add a point to this cluster.\n     * @param point point to add\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.Cluster.getPoints()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Get the points contained in the cluster.\n     * @return points contained in the cluster\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.Cluster.getCenter()",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * Get the point chosen to be the center of this cluster.\n     * @return chosen cluster center\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 22)"
      ]
    }
  ]
}