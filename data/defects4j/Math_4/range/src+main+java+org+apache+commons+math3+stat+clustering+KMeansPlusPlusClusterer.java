{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/clustering/KMeansPlusPlusClusterer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "KMeansPlusPlusClusterer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 42,
      "end_line": 515,
      "comment": "\n * Clustering algorithm based on David Arthur and Sergei Vassilvitski k-means++ algorithm.\n * @param \u003cT\u003e type of the points to cluster\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/K-means%2B%2B\"\u003eK-means++ (wikipedia)\u003c/a\u003e\n * @version $Id$\n * @since 2.0\n * @deprecated As of 3.2 (to be removed in 4.0),\n * use {@link org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer} instead\n "
    },
    {
      "type": "field",
      "varNames": [
        "random"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Random generator for choosing initial centers. "
    },
    {
      "type": "field",
      "varNames": [
        "emptyStrategy"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Selected strategy for empty clusters. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.clustering.KMeansPlusPlusClusterer.KMeansPlusPlusClusterer(java.util.Random)",
      "begin_line": 75,
      "end_line": 77,
      "comment": " Build a clusterer.\n     * \u003cp\u003e\n     * The default strategy for handling empty clusters that may appear during\n     * algorithm iterations is to split the cluster with largest distance variance.\n     * \u003c/p\u003e\n     * @param random random generator to use for choosing initial centers\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.clustering.KMeansPlusPlusClusterer.KMeansPlusPlusClusterer(java.util.Random, org.apache.commons.math3.stat.clustering.KMeansPlusPlusClusterer.EmptyClusterStrategy)",
      "begin_line": 85,
      "end_line": 88,
      "comment": " Build a clusterer.\n     * @param random random generator to use for choosing initial centers\n     * @param emptyStrategy strategy to use for handling empty clusters that\n     * may appear during algorithm iterations\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 36)",
        "(line 87,col 9)-(line 87,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.KMeansPlusPlusClusterer.cluster(java.util.Collection\u003cT\u003e, int, int, int)",
      "begin_line": 104,
      "end_line": 145,
      "comment": "\n     * Runs the K-means++ clustering algorithm.\n     *\n     * @param points the points to cluster\n     * @param k the number of clusters to split the data into\n     * @param numTrials number of trial runs\n     * @param maxIterationsPerTrial the maximum number of iterations to run the algorithm\n     *     for at each trial run.  If negative, no maximum will be used\n     * @return a list of clusters containing the points\n     * @throws MathIllegalArgumentException if the data points are null or the number\n     *     of clusters is larger than the number of data points\n     * @throws ConvergenceException if an empty cluster is encountered and the\n     * {@link #emptyStrategy} is set to {@code ERROR}\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 37)",
        "(line 110,col 9)-(line 110,col 58)",
        "(line 113,col 9)-(line 140,col 9)",
        "(line 143,col 9)-(line 143,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.KMeansPlusPlusClusterer.cluster(java.util.Collection\u003cT\u003e, int, int)",
      "begin_line": 160,
      "end_line": 217,
      "comment": "\n     * Runs the K-means++ clustering algorithm.\n     *\n     * @param points the points to cluster\n     * @param k the number of clusters to split the data into\n     * @param maxIterations the maximum number of iterations to run the algorithm\n     *     for.  If negative, no maximum will be used\n     * @return a list of clusters containing the points\n     * @throws MathIllegalArgumentException if the data points are null or the number\n     *     of clusters is larger than the number of data points\n     * @throws ConvergenceException if an empty cluster is encountered and the\n     * {@link #emptyStrategy} is set to {@code ERROR}\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 39)",
        "(line 168,col 9)-(line 170,col 9)",
        "(line 173,col 9)-(line 173,col 76)",
        "(line 177,col 9)-(line 177,col 51)",
        "(line 178,col 9)-(line 178,col 62)",
        "(line 181,col 9)-(line 181,col 80)",
        "(line 182,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 216,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters(java.util.List\u003corg.apache.commons.math3.stat.clustering.Cluster\u003cT\u003e\u003e, java.util.Collection\u003cT\u003e, int[])",
      "begin_line": 228,
      "end_line": 245,
      "comment": "\n     * Adds the given points to the closest {@link Cluster}.\n     *\n     * @param \u003cT\u003e type of the points to cluster\n     * @param clusters the {@link Cluster}s to add the points to\n     * @param points the points to add to the given {@link Cluster}s\n     * @param assignments points assignments to clusters\n     * @return the number of points assigned to different clusters as the iteration before\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 36)",
        "(line 232,col 9)-(line 232,col 27)",
        "(line 233,col 9)-(line 242,col 9)",
        "(line 244,col 9)-(line 244,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(java.util.Collection\u003cT\u003e, int, java.util.Random)",
      "begin_line": 256,
      "end_line": 374,
      "comment": "\n     * Use K-means++ to choose the initial centers.\n     *\n     * @param \u003cT\u003e type of the points to cluster\n     * @param points the points to choose the initial centers from\n     * @param k the number of centers to choose\n     * @param random random generator to use\n     * @return the initial centers\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 90)",
        "(line 264,col 9)-(line 264,col 47)",
        "(line 268,col 9)-(line 268,col 55)",
        "(line 271,col 9)-(line 271,col 71)",
        "(line 274,col 9)-(line 274,col 62)",
        "(line 276,col 9)-(line 276,col 60)",
        "(line 278,col 9)-(line 278,col 50)",
        "(line 281,col 9)-(line 281,col 38)",
        "(line 285,col 9)-(line 285,col 62)",
        "(line 289,col 9)-(line 294,col 9)",
        "(line 296,col 9)-(line 371,col 9)",
        "(line 373,col 9)-(line 373,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestVarianceCluster(java.util.Collection\u003corg.apache.commons.math3.stat.clustering.Cluster\u003cT\u003e\u003e)",
      "begin_line": 383,
      "end_line": 417,
      "comment": "\n     * Get a random point from the {@link Cluster} with the largest distance variance.\n     *\n     * @param clusters the {@link Cluster}s to search\n     * @return a random point from the selected cluster\n     * @throws ConvergenceException if clusters are all empty\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 54)",
        "(line 387,col 9)-(line 387,col 35)",
        "(line 388,col 9)-(line 406,col 9)",
        "(line 409,col 9)-(line 411,col 9)",
        "(line 414,col 9)-(line 414,col 60)",
        "(line 415,col 9)-(line 415,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestNumberCluster(java.util.Collection\u003corg.apache.commons.math3.stat.clustering.Cluster\u003cT\u003e\u003e)",
      "begin_line": 426,
      "end_line": 452,
      "comment": "\n     * Get a random point from the {@link Cluster} with the largest number of points\n     *\n     * @param clusters the {@link Cluster}s to search\n     * @return a random point from the selected cluster\n     * @throws ConvergenceException if clusters are all empty\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 26)",
        "(line 429,col 9)-(line 429,col 35)",
        "(line 430,col 9)-(line 441,col 9)",
        "(line 444,col 9)-(line 446,col 9)",
        "(line 449,col 9)-(line 449,col 60)",
        "(line 450,col 9)-(line 450,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.KMeansPlusPlusClusterer.getFarthestPoint(java.util.Collection\u003corg.apache.commons.math3.stat.clustering.Cluster\u003cT\u003e\u003e)",
      "begin_line": 461,
      "end_line": 489,
      "comment": "\n     * Get the point farthest to its cluster center\n     *\n     * @param clusters the {@link Cluster}s to search\n     * @return point farthest to its cluster center\n     * @throws ConvergenceException if clusters are all empty\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 54)",
        "(line 464,col 9)-(line 464,col 42)",
        "(line 465,col 9)-(line 465,col 31)",
        "(line 466,col 9)-(line 480,col 9)",
        "(line 483,col 9)-(line 485,col 9)",
        "(line 487,col 9)-(line 487,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.KMeansPlusPlusClusterer.getNearestCluster(java.util.Collection\u003corg.apache.commons.math3.stat.clustering.Cluster\u003cT\u003e\u003e, T)",
      "begin_line": 499,
      "end_line": 513,
      "comment": "\n     * Returns the nearest {@link Cluster} to the given point\n     *\n     * @param \u003cT\u003e type of the points to cluster\n     * @param clusters the {@link Cluster}s to search\n     * @param point the point to find the nearest {@link Cluster} for\n     * @return the index of the nearest {@link Cluster} to the given point\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 46)",
        "(line 502,col 9)-(line 502,col 29)",
        "(line 503,col 9)-(line 503,col 27)",
        "(line 504,col 9)-(line 511,col 9)",
        "(line 512,col 9)-(line 512,col 26)"
      ]
    }
  ]
}