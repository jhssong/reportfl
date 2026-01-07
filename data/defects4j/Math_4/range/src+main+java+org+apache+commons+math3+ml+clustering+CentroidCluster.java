{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ml/clustering/CentroidCluster.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CentroidCluster",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ml.clustering.Cluster\u003cT\u003e"
      ],
      "begin_line": 29,
      "end_line": 54,
      "comment": "\n * A Cluster used by centroid-based clustering algorithms.\n * \u003cp\u003e\n * Defines additionally a cluster center which may not necessarily be a member\n * of the original data set.\n *\n * @param \u003cT\u003e the type of points that can be clustered\n * @version $Id $\n * @since 3.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "center"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Center of the cluster. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ml.clustering.CentroidCluster.CentroidCluster(org.apache.commons.math3.ml.clustering.Clusterable)",
      "begin_line": 41,
      "end_line": 44,
      "comment": "\n     * Build a cluster centered at a specified point.\n     * @param center the point which is to be the center of this cluster\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 16)",
        "(line 43,col 9)-(line 43,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.CentroidCluster.getCenter()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * Get the point chosen to be the center of this cluster.\n     * @return chosen cluster center\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 22)"
      ]
    }
  ]
}