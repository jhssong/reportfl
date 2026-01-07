{
  "filepath": "/tmp/Math-49b/src/main/java/org/apache/commons/math/stat/clustering/KMeansPlusPlusClusterer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "KMeansPlusPlusClusterer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 504,
      "comment": "\n * Clustering algorithm based on David Arthur and Sergei Vassilvitski k-means++ algorithm.\n * @param \u003cT\u003e type of the points to cluster\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/K-means%2B%2B\"\u003eK-means++ (wikipedia)\u003c/a\u003e\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "random"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Random generator for choosing initial centers. "
    },
    {
      "type": "field",
      "varNames": [
        "emptyStrategy"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Selected strategy for empty clusters. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.KMeansPlusPlusClusterer(java.util.Random)",
      "begin_line": 72,
      "end_line": 74,
      "comment": " Build a clusterer.\n     * \u003cp\u003e\n     * The default strategy for handling empty clusters that may appear during\n     * algorithm iterations is to split the cluster with largest distance variance.\n     * \u003c/p\u003e\n     * @param random random generator to use for choosing initial centers\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.KMeansPlusPlusClusterer(java.util.Random, org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.EmptyClusterStrategy)",
      "begin_line": 82,
      "end_line": 85,
      "comment": " Build a clusterer.\n     * @param random random generator to use for choosing initial centers\n     * @param emptyStrategy strategy to use for handling empty clusters that\n     * may appear during algorithm iterations\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 36)",
        "(line 84,col 9)-(line 84,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster(java.util.Collection\u003cT\u003e, int, int, int)",
      "begin_line": 99,
      "end_line": 140,
      "comment": "\n     * Runs the K-means++ clustering algorithm.\n     *\n     * @param points the points to cluster\n     * @param k the number of clusters to split the data into\n     * @param numTrials number of trial runs\n     * @param maxIterationsPerTrial the maximum number of iterations to run the algorithm\n     *     for at each trial run.  If negative, no maximum will be used\n     * @return a list of clusters containing the points\n     * @throws MathIllegalArgumentException if the data points are null or the number\n     *     of clusters is larger than the number of data points\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 37)",
        "(line 105,col 9)-(line 105,col 58)",
        "(line 108,col 9)-(line 135,col 9)",
        "(line 138,col 9)-(line 138,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster(java.util.Collection\u003cT\u003e, int, int)",
      "begin_line": 153,
      "end_line": 210,
      "comment": "\n     * Runs the K-means++ clustering algorithm.\n     *\n     * @param points the points to cluster\n     * @param k the number of clusters to split the data into\n     * @param maxIterations the maximum number of iterations to run the algorithm\n     *     for.  If negative, no maximum will be used\n     * @return a list of clusters containing the points\n     * @throws MathIllegalArgumentException if the data points are null or the number\n     *     of clusters is larger than the number of data points\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 39)",
        "(line 161,col 9)-(line 163,col 9)",
        "(line 166,col 9)-(line 166,col 76)",
        "(line 170,col 9)-(line 170,col 51)",
        "(line 171,col 9)-(line 171,col 62)",
        "(line 174,col 9)-(line 174,col 80)",
        "(line 175,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 209,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters(java.util.List\u003corg.apache.commons.math.stat.clustering.Cluster\u003cT\u003e\u003e, java.util.Collection\u003cT\u003e, int[])",
      "begin_line": 221,
      "end_line": 238,
      "comment": "\n     * Adds the given points to the closest {@link Cluster}.\n     *\n     * @param \u003cT\u003e type of the points to cluster\n     * @param clusters the {@link Cluster}s to add the points to\n     * @param points the points to add to the given {@link Cluster}s\n     * @param assignments points assignments to clusters\n     * @return the number of points assigned to different clusters as the iteration before\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 36)",
        "(line 225,col 9)-(line 225,col 27)",
        "(line 226,col 9)-(line 235,col 9)",
        "(line 237,col 9)-(line 237,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(java.util.Collection\u003cT\u003e, int, java.util.Random)",
      "begin_line": 249,
      "end_line": 367,
      "comment": "\n     * Use K-means++ to choose the initial centers.\n     *\n     * @param \u003cT\u003e type of the points to cluster\n     * @param points the points to choose the initial centers from\n     * @param k the number of centers to choose\n     * @param random random generator to use\n     * @return the initial centers\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 90)",
        "(line 257,col 9)-(line 257,col 47)",
        "(line 261,col 9)-(line 261,col 55)",
        "(line 264,col 9)-(line 264,col 71)",
        "(line 267,col 9)-(line 267,col 62)",
        "(line 269,col 9)-(line 269,col 60)",
        "(line 271,col 9)-(line 271,col 50)",
        "(line 274,col 9)-(line 274,col 38)",
        "(line 278,col 9)-(line 278,col 62)",
        "(line 282,col 9)-(line 287,col 9)",
        "(line 289,col 9)-(line 364,col 9)",
        "(line 366,col 9)-(line 366,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestVarianceCluster(java.util.Collection\u003corg.apache.commons.math.stat.clustering.Cluster\u003cT\u003e\u003e)",
      "begin_line": 375,
      "end_line": 408,
      "comment": "\n     * Get a random point from the {@link Cluster} with the largest distance variance.\n     *\n     * @param clusters the {@link Cluster}s to search\n     * @return a random point from the selected cluster\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 54)",
        "(line 378,col 9)-(line 378,col 35)",
        "(line 379,col 9)-(line 397,col 9)",
        "(line 400,col 9)-(line 402,col 9)",
        "(line 405,col 9)-(line 405,col 60)",
        "(line 406,col 9)-(line 406,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestNumberCluster(java.util.Collection\u003corg.apache.commons.math.stat.clustering.Cluster\u003cT\u003e\u003e)",
      "begin_line": 416,
      "end_line": 442,
      "comment": "\n     * Get a random point from the {@link Cluster} with the largest number of points\n     *\n     * @param clusters the {@link Cluster}s to search\n     * @return a random point from the selected cluster\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 26)",
        "(line 419,col 9)-(line 419,col 35)",
        "(line 420,col 9)-(line 431,col 9)",
        "(line 434,col 9)-(line 436,col 9)",
        "(line 439,col 9)-(line 439,col 60)",
        "(line 440,col 9)-(line 440,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getFarthestPoint(java.util.Collection\u003corg.apache.commons.math.stat.clustering.Cluster\u003cT\u003e\u003e)",
      "begin_line": 450,
      "end_line": 478,
      "comment": "\n     * Get the point farthest to its cluster center\n     *\n     * @param clusters the {@link Cluster}s to search\n     * @return point farthest to its cluster center\n     ",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 54)",
        "(line 453,col 9)-(line 453,col 42)",
        "(line 454,col 9)-(line 454,col 31)",
        "(line 455,col 9)-(line 469,col 9)",
        "(line 472,col 9)-(line 474,col 9)",
        "(line 476,col 9)-(line 476,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getNearestCluster(java.util.Collection\u003corg.apache.commons.math.stat.clustering.Cluster\u003cT\u003e\u003e, T)",
      "begin_line": 488,
      "end_line": 502,
      "comment": "\n     * Returns the nearest {@link Cluster} to the given point\n     *\n     * @param \u003cT\u003e type of the points to cluster\n     * @param clusters the {@link Cluster}s to search\n     * @param point the point to find the nearest {@link Cluster} for\n     * @return the index of the nearest {@link Cluster} to the given point\n     ",
      "child_ranges": [
        "(line 490,col 9)-(line 490,col 46)",
        "(line 491,col 9)-(line 491,col 29)",
        "(line 492,col 9)-(line 492,col 27)",
        "(line 493,col 9)-(line 500,col 9)",
        "(line 501,col 9)-(line 501,col 26)"
      ]
    }
  ]
}