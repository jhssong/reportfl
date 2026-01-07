{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/stat/clustering/Cluster.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Cluster",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 30,
      "end_line": 74,
      "comment": "\n * Cluster holding a set of {@link Clusterable} points.\n * @param \u003cT\u003e the type of points that can be clustered\n * @version $Revision$ $Date$\n * @since 2.0\n "
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
      "type": "field",
      "varNames": [
        "center"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Center of the cluster. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.clustering.Cluster.Cluster(T)",
      "begin_line": 45,
      "end_line": 48,
      "comment": "\n     * Build a cluster centered at a specified point.\n     * @param center the point which is to be the center of this cluster\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 29)",
        "(line 47,col 9)-(line 47,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.Cluster.addPoint(T)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Add a point to this cluster.\n     * @param point point to add\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.Cluster.getPoints()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Get the points contained in the cluster.\n     * @return points contained in the cluster\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.Cluster.getCenter()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Get the point chosen to be the center of this cluster.\n     * @return chosen cluster center\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 22)"
      ]
    }
  ]
}