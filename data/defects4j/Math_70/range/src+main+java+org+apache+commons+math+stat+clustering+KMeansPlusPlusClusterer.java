{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/stat/clustering/KMeansPlusPlusClusterer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "KMeansPlusPlusClusterer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 165,
      "comment": "\n * Clustering algorithm based on David Arthur and Sergei Vassilvitski k-means++ algorithm.\n * @param \u003cT\u003e type of the points to cluster\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/K-means%2B%2B\"\u003eK-means++ (wikipedia)\u003c/a\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "random"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Random generator for choosing initial centers. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.KMeansPlusPlusClusterer(java.util.Random)",
      "begin_line": 40,
      "end_line": 42,
      "comment": " Build a clusterer.\n     * @param random random generator to use for choosing initial centers\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster(java.util.Collection\u003cT\u003e, int, int)",
      "begin_line": 53,
      "end_line": 78,
      "comment": "\n     * Runs the K-means++ clustering algorithm.\n     *\n     * @param points the points to cluster\n     * @param k the number of clusters to split the data into\n     * @param maxIterations the maximum number of iterations to run the algorithm\n     *     for.  If negative, no maximum will be used\n     * @return a list of clusters containing the points\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 76)",
        "(line 57,col 9)-(line 57,col 49)",
        "(line 60,col 9)-(line 60,col 80)",
        "(line 61,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 77,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters(java.util.Collection\u003corg.apache.commons.math.stat.clustering.Cluster\u003cT\u003e\u003e, java.util.Collection\u003cT\u003e)",
      "begin_line": 87,
      "end_line": 93,
      "comment": "\n     * Adds the given points to the closest {@link Cluster}.\n     *\n     * @param \u003cT\u003e type of the points to cluster\n     * @param clusters the {@link Cluster}s to add the points to\n     * @param points the points to add to the given {@link Cluster}s\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 92,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(java.util.Collection\u003cT\u003e, int, java.util.Random)",
      "begin_line": 104,
      "end_line": 141,
      "comment": "\n     * Use K-means++ to choose the initial centers.\n     *\n     * @param \u003cT\u003e type of the points to cluster\n     * @param points the points to choose the initial centers from\n     * @param k the number of centers to choose\n     * @param random random generator to use\n     * @return the initial centers\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 58)",
        "(line 108,col 9)-(line 108,col 71)",
        "(line 111,col 9)-(line 111,col 78)",
        "(line 112,col 9)-(line 112,col 50)",
        "(line 114,col 9)-(line 114,col 57)",
        "(line 115,col 9)-(line 137,col 9)",
        "(line 139,col 9)-(line 139,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getNearestCluster(java.util.Collection\u003corg.apache.commons.math.stat.clustering.Cluster\u003cT\u003e\u003e, T)",
      "begin_line": 151,
      "end_line": 163,
      "comment": "\n     * Returns the nearest {@link Cluster} to the given point\n     *\n     * @param \u003cT\u003e type of the points to cluster\n     * @param clusters the {@link Cluster}s to search\n     * @param point the point to find the nearest {@link Cluster} for\n     * @return the nearest {@link Cluster} to the given point\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 46)",
        "(line 154,col 9)-(line 154,col 37)",
        "(line 155,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 162,col 26)"
      ]
    }
  ]
}