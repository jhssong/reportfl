{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ml/clustering/DBSCANClusterer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DBSCANClusterer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ml.clustering.Clusterer\u003cT\u003e"
      ],
      "begin_line": 59,
      "end_line": 233,
      "comment": "\n * DBSCAN (density-based spatial clustering of applications with noise) algorithm.\n * \u003cp\u003e\n * The DBSCAN algorithm forms clusters based on the idea of density connectivity, i.e.\n * a point p is density connected to another point q, if there exists a chain of\n * points p\u003csub\u003ei\u003c/sub\u003e, with i \u003d 1 .. n and p\u003csub\u003e1\u003c/sub\u003e \u003d p and p\u003csub\u003en\u003c/sub\u003e \u003d q,\n * such that each pair \u0026lt;p\u003csub\u003ei\u003c/sub\u003e, p\u003csub\u003ei+1\u003c/sub\u003e\u0026gt; is directly density-reachable.\n * A point q is directly density-reachable from point p if it is in the \u0026epsilon;-neighborhood\n * of this point.\n * \u003cp\u003e\n * Any point that is not density-reachable from a formed cluster is treated as noise, and\n * will thus not be present in the result.\n * \u003cp\u003e\n * The algorithm requires two parameters:\n * \u003cul\u003e\n *   \u003cli\u003eeps: the distance that defines the \u0026epsilon;-neighborhood of a point\n *   \u003cli\u003eminPoints: the minimum number of density-connected points required to form a cluster\n * \u003c/ul\u003e\n *\n * @param \u003cT\u003e type of the points to cluster\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/DBSCAN\"\u003eDBSCAN (wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://www.dbs.ifi.lmu.de/Publikationen/Papers/KDD-96.final.frame.pdf\"\u003e\n * A Density-Based Algorithm for Discovering Clusters in Large Spatial Databases with Noise\u003c/a\u003e\n * @version $Id$\n * @since 3.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "eps"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Maximum radius of the neighborhood to be considered. "
    },
    {
      "type": "field",
      "varNames": [
        "minPts"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Minimum number of points needed for a cluster. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ml.clustering.DBSCANClusterer.DBSCANClusterer(double, int)",
      "begin_line": 84,
      "end_line": 87,
      "comment": "\n     * Creates a new instance of a DBSCANClusterer.\n     * \u003cp\u003e\n     * The euclidean distance will be used as default distance measure.\n     *\n     * @param eps maximum radius of the neighborhood to be considered\n     * @param minPts minimum number of points needed for a cluster\n     * @throws NotPositiveException if {@code eps \u003c 0.0} or {@code minPts \u003c 0}\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ml.clustering.DBSCANClusterer.DBSCANClusterer(double, int, org.apache.commons.math3.ml.distance.DistanceMeasure)",
      "begin_line": 97,
      "end_line": 109,
      "comment": "\n     * Creates a new instance of a DBSCANClusterer.\n     *\n     * @param eps maximum radius of the neighborhood to be considered\n     * @param minPts minimum number of points needed for a cluster\n     * @param measure the distance measure to use\n     * @throws NotPositiveException if {@code eps \u003c 0.0} or {@code minPts \u003c 0}\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 23)",
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 23)",
        "(line 108,col 9)-(line 108,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.DBSCANClusterer.getEps()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n     * Returns the maximum radius of the neighborhood to be considered.\n     * @return maximum radius of the neighborhood\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.DBSCANClusterer.getMinPts()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     * Returns the minimum number of points needed for a cluster.\n     * @return minimum number of points needed for a cluster\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.DBSCANClusterer.cluster(java.util.Collection\u003cT\u003e)",
      "begin_line": 134,
      "end_line": 157,
      "comment": "\n     * Performs DBSCAN cluster analysis.\n     *\n     * @param points the points to cluster\n     * @return the list of clusters\n     * @throws NullArgumentException if the data points are null\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 39)",
        "(line 139,col 9)-(line 139,col 70)",
        "(line 140,col 9)-(line 140,col 94)",
        "(line 142,col 9)-(line 154,col 9)",
        "(line 156,col 9)-(line 156,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.DBSCANClusterer.expandCluster(org.apache.commons.math3.ml.clustering.Cluster\u003cT\u003e, T, java.util.List\u003cT\u003e, java.util.Collection\u003cT\u003e, java.util.Map\u003corg.apache.commons.math3.ml.clustering.Clusterable, org.apache.commons.math3.ml.clustering.DBSCANClusterer.PointStatus\u003e)",
      "begin_line": 169,
      "end_line": 198,
      "comment": "\n     * Expands the cluster to include density-reachable items.\n     *\n     * @param cluster Cluster to expand\n     * @param point Point to add to cluster\n     * @param neighbors List of neighbors\n     * @param points the data set\n     * @param visited the set of already visited points\n     * @return the expanded cluster\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 32)",
        "(line 175,col 9)-(line 175,col 56)",
        "(line 177,col 9)-(line 177,col 52)",
        "(line 178,col 9)-(line 178,col 22)",
        "(line 179,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 197,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.DBSCANClusterer.getNeighbors(T, java.util.Collection\u003cT\u003e)",
      "begin_line": 207,
      "end_line": 215,
      "comment": "\n     * Returns a list of density-reachable neighbors of a {@code point}.\n     *\n     * @param point the point to look for\n     * @param points possible neighbors\n     * @return the List of neighbors\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 53)",
        "(line 209,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 214,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.DBSCANClusterer.merge(java.util.List\u003cT\u003e, java.util.List\u003cT\u003e)",
      "begin_line": 224,
      "end_line": 232,
      "comment": "\n     * Merges two lists together.\n     *\n     * @param one first list\n     * @param two second list\n     * @return merged lists\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 50)",
        "(line 226,col 9)-(line 230,col 9)",
        "(line 231,col 9)-(line 231,col 19)"
      ]
    }
  ]
}