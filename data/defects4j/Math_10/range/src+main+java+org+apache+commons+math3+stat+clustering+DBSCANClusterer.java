{
  "filepath": "/tmp/Math-10b/src/main/java/org/apache/commons/math3/stat/clustering/DBSCANClusterer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DBSCANClusterer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 61,
      "end_line": 224,
      "comment": "\n * DBSCAN (density-based spatial clustering of applications with noise) algorithm.\n * \u003cp\u003e\n * The DBSCAN algorithm forms clusters based on the idea of density connectivity, i.e.\n * a point p is density connected to another point q, if there exists a chain of\n * points p\u003csub\u003ei\u003c/sub\u003e, with i \u003d 1 .. n and p\u003csub\u003e1\u003c/sub\u003e \u003d p and p\u003csub\u003en\u003c/sub\u003e \u003d q,\n * such that each pair \u0026lt;p\u003csub\u003ei\u003c/sub\u003e, p\u003csub\u003ei+1\u003c/sub\u003e\u0026gt; is directly density-reachable.\n * A point q is directly density-reachable from point p if it is in the \u0026epsilon;-neighborhood\n * of this point.\n * \u003cp\u003e\n * Any point that is not density-reachable from a formed cluster is treated as noise, and\n * will thus not be present in the result.\n * \u003cp\u003e\n * The algorithm requires two parameters:\n * \u003cul\u003e\n *   \u003cli\u003eeps: the distance that defines the \u0026epsilon;-neighborhood of a point\n *   \u003cli\u003eminPoints: the minimum number of density-connected points required to form a cluster\n * \u003c/ul\u003e\n * \u003cp\u003e\n * \u003cb\u003eNote:\u003c/b\u003e as DBSCAN is not a centroid-based clustering algorithm, the resulting\n * {@link Cluster} objects will have no defined center, i.e. {@link Cluster#getCenter()} will\n * return {@code null}.\n *\n * @param \u003cT\u003e type of the points to cluster\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/DBSCAN\"\u003eDBSCAN (wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://www.dbs.ifi.lmu.de/Publikationen/Papers/KDD-96.final.frame.pdf\"\u003e\n * A Density-Based Algorithm for Discovering Clusters in Large Spatial Databases with Noise\u003c/a\u003e\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "eps"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Maximum radius of the neighborhood to be considered. "
    },
    {
      "type": "field",
      "varNames": [
        "minPts"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Minimum number of points needed for a cluster. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.clustering.DBSCANClusterer.DBSCANClusterer(double, int)",
      "begin_line": 84,
      "end_line": 94,
      "comment": "\n     * Creates a new instance of a DBSCANClusterer.\n     *\n     * @param eps maximum radius of the neighborhood to be considered\n     * @param minPts minimum number of points needed for a cluster\n     * @throws NotPositiveException if {@code eps \u003c 0.0} or {@code minPts \u003c 0}\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 92,col 23)",
        "(line 93,col 9)-(line 93,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.DBSCANClusterer.getEps()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Returns the maximum radius of the neighborhood to be considered.\n     *\n     * @return maximum radius of the neighborhood\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.DBSCANClusterer.getMinPts()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * Returns the minimum number of points needed for a cluster.\n     *\n     * @return minimum number of points needed for a cluster\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.DBSCANClusterer.cluster(java.util.Collection\u003cT\u003e)",
      "begin_line": 125,
      "end_line": 148,
      "comment": "\n     * Performs DBSCAN cluster analysis.\n     * \u003cp\u003e\n     * \u003cb\u003eNote:\u003c/b\u003e as DBSCAN is not a centroid-based clustering algorithm, the resulting\n     * {@link Cluster} objects will have no defined center, i.e. {@link Cluster#getCenter()} will\n     * return {@code null}.\n     *\n     * @param points the points to cluster\n     * @return the list of clusters\n     * @throws NullArgumentException if the data points are null\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 39)",
        "(line 130,col 9)-(line 130,col 70)",
        "(line 131,col 9)-(line 131,col 100)",
        "(line 133,col 9)-(line 145,col 9)",
        "(line 147,col 9)-(line 147,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.DBSCANClusterer.expandCluster(org.apache.commons.math3.stat.clustering.Cluster\u003cT\u003e, T, java.util.List\u003cT\u003e, java.util.Collection\u003cT\u003e, java.util.Map\u003corg.apache.commons.math3.stat.clustering.Clusterable\u003cT\u003e, org.apache.commons.math3.stat.clustering.DBSCANClusterer.PointStatus\u003e)",
      "begin_line": 160,
      "end_line": 189,
      "comment": "\n     * Expands the cluster to include density-reachable items.\n     *\n     * @param cluster Cluster to expand\n     * @param point Point to add to cluster\n     * @param neighbors List of neighbors\n     * @param points the data set\n     * @param visited the set of already visited points\n     * @return the expanded cluster\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 32)",
        "(line 166,col 9)-(line 166,col 56)",
        "(line 168,col 9)-(line 168,col 52)",
        "(line 169,col 9)-(line 169,col 22)",
        "(line 170,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 188,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.DBSCANClusterer.getNeighbors(T, java.util.Collection\u003cT\u003e)",
      "begin_line": 198,
      "end_line": 206,
      "comment": "\n     * Returns a list of density-reachable neighbors of a {@code point}.\n     *\n     * @param point the point to look for\n     * @param points possible neighbors\n     * @return the List of neighbors\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 53)",
        "(line 200,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 205,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.DBSCANClusterer.merge(java.util.List\u003cT\u003e, java.util.List\u003cT\u003e)",
      "begin_line": 215,
      "end_line": 223,
      "comment": "\n     * Merges two lists together.\n     *\n     * @param one first list\n     * @param two second list\n     * @return merged lists\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 50)",
        "(line 217,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 222,col 19)"
      ]
    }
  ]
}