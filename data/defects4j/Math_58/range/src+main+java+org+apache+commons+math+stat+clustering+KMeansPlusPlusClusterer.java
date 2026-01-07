{
  "filepath": "/tmp/Math-58b/src/main/java/org/apache/commons/math/stat/clustering/KMeansPlusPlusClusterer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "KMeansPlusPlusClusterer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 333,
      "comment": "\n * Clustering algorithm based on David Arthur and Sergei Vassilvitski k-means++ algorithm.\n * @param \u003cT\u003e type of the points to cluster\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/K-means%2B%2B\"\u003eK-means++ (wikipedia)\u003c/a\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "random"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Random generator for choosing initial centers. "
    },
    {
      "type": "field",
      "varNames": [
        "emptyStrategy"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Selected strategy for empty clusters. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.KMeansPlusPlusClusterer(java.util.Random)",
      "begin_line": 68,
      "end_line": 70,
      "comment": " Build a clusterer.\n     * \u003cp\u003e\n     * The default strategy for handling empty clusters that may appear during\n     * algorithm iterations is to split the cluster with largest distance variance.\n     * \u003c/p\u003e\n     * @param random random generator to use for choosing initial centers\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.KMeansPlusPlusClusterer(java.util.Random, org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.EmptyClusterStrategy)",
      "begin_line": 78,
      "end_line": 81,
      "comment": " Build a clusterer.\n     * @param random random generator to use for choosing initial centers\n     * @param emptyStrategy strategy to use for handling empty clusters that\n     * may appear during algorithm iterations\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 36)",
        "(line 80,col 9)-(line 80,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster(java.util.Collection\u003cT\u003e, int, int)",
      "begin_line": 92,
      "end_line": 135,
      "comment": "\n     * Runs the K-means++ clustering algorithm.\n     *\n     * @param points the points to cluster\n     * @param k the number of clusters to split the data into\n     * @param maxIterations the maximum number of iterations to run the algorithm\n     *     for.  If negative, no maximum will be used\n     * @return a list of clusters containing the points\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 76)",
        "(line 96,col 9)-(line 96,col 49)",
        "(line 99,col 9)-(line 99,col 80)",
        "(line 100,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters(java.util.Collection\u003corg.apache.commons.math.stat.clustering.Cluster\u003cT\u003e\u003e, java.util.Collection\u003cT\u003e)",
      "begin_line": 144,
      "end_line": 150,
      "comment": "\n     * Adds the given points to the closest {@link Cluster}.\n     *\n     * @param \u003cT\u003e type of the points to cluster\n     * @param clusters the {@link Cluster}s to add the points to\n     * @param points the points to add to the given {@link Cluster}s\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 149,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(java.util.Collection\u003cT\u003e, int, java.util.Random)",
      "begin_line": 161,
      "end_line": 198,
      "comment": "\n     * Use K-means++ to choose the initial centers.\n     *\n     * @param \u003cT\u003e type of the points to cluster\n     * @param points the points to choose the initial centers from\n     * @param k the number of centers to choose\n     * @param random random generator to use\n     * @return the initial centers\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 58)",
        "(line 165,col 9)-(line 165,col 71)",
        "(line 168,col 9)-(line 168,col 78)",
        "(line 169,col 9)-(line 169,col 50)",
        "(line 171,col 9)-(line 171,col 57)",
        "(line 172,col 9)-(line 194,col 9)",
        "(line 196,col 9)-(line 196,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestVarianceCluster(java.util.Collection\u003corg.apache.commons.math.stat.clustering.Cluster\u003cT\u003e\u003e)",
      "begin_line": 206,
      "end_line": 239,
      "comment": "\n     * Get a random point from the {@link Cluster} with the largest distance variance.\n     *\n     * @param clusters the {@link Cluster}s to search\n     * @return a random point from the selected cluster\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 54)",
        "(line 209,col 9)-(line 209,col 35)",
        "(line 210,col 9)-(line 228,col 9)",
        "(line 231,col 9)-(line 233,col 9)",
        "(line 236,col 9)-(line 236,col 60)",
        "(line 237,col 9)-(line 237,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestNumberCluster(java.util.Collection\u003corg.apache.commons.math.stat.clustering.Cluster\u003cT\u003e\u003e)",
      "begin_line": 247,
      "end_line": 273,
      "comment": "\n     * Get a random point from the {@link Cluster} with the largest number of points\n     *\n     * @param clusters the {@link Cluster}s to search\n     * @return a random point from the selected cluster\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 26)",
        "(line 250,col 9)-(line 250,col 35)",
        "(line 251,col 9)-(line 262,col 9)",
        "(line 265,col 9)-(line 267,col 9)",
        "(line 270,col 9)-(line 270,col 60)",
        "(line 271,col 9)-(line 271,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getFarthestPoint(java.util.Collection\u003corg.apache.commons.math.stat.clustering.Cluster\u003cT\u003e\u003e)",
      "begin_line": 281,
      "end_line": 309,
      "comment": "\n     * Get the point farthest to its cluster center\n     *\n     * @param clusters the {@link Cluster}s to search\n     * @return point farthest to its cluster center\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 54)",
        "(line 284,col 9)-(line 284,col 42)",
        "(line 285,col 9)-(line 285,col 31)",
        "(line 286,col 9)-(line 300,col 9)",
        "(line 303,col 9)-(line 305,col 9)",
        "(line 307,col 9)-(line 307,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getNearestCluster(java.util.Collection\u003corg.apache.commons.math.stat.clustering.Cluster\u003cT\u003e\u003e, T)",
      "begin_line": 319,
      "end_line": 331,
      "comment": "\n     * Returns the nearest {@link Cluster} to the given point\n     *\n     * @param \u003cT\u003e type of the points to cluster\n     * @param clusters the {@link Cluster}s to search\n     * @param point the point to find the nearest {@link Cluster} for\n     * @return the nearest {@link Cluster} to the given point\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 46)",
        "(line 322,col 9)-(line 322,col 37)",
        "(line 323,col 9)-(line 329,col 9)",
        "(line 330,col 9)-(line 330,col 26)"
      ]
    }
  ]
}