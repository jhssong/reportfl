{
  "filepath": "/tmp/Math-8b/src/main/java/org/apache/commons/math3/stat/clustering/KMeansPlusPlusClusterer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "KMeansPlusPlusClusterer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 512,
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
      "signature": "org.apache.commons.math3.stat.clustering.KMeansPlusPlusClusterer.KMeansPlusPlusClusterer(java.util.Random)",
      "begin_line": 72,
      "end_line": 74,
      "comment": " Build a clusterer.\n     * \u003cp\u003e\n     * The default strategy for handling empty clusters that may appear during\n     * algorithm iterations is to split the cluster with largest distance variance.\n     * \u003c/p\u003e\n     * @param random random generator to use for choosing initial centers\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.clustering.KMeansPlusPlusClusterer.KMeansPlusPlusClusterer(java.util.Random, org.apache.commons.math3.stat.clustering.KMeansPlusPlusClusterer.EmptyClusterStrategy)",
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
      "signature": "org.apache.commons.math3.stat.clustering.KMeansPlusPlusClusterer.cluster(java.util.Collection\u003cT\u003e, int, int, int)",
      "begin_line": 101,
      "end_line": 142,
      "comment": "\n     * Runs the K-means++ clustering algorithm.\n     *\n     * @param points the points to cluster\n     * @param k the number of clusters to split the data into\n     * @param numTrials number of trial runs\n     * @param maxIterationsPerTrial the maximum number of iterations to run the algorithm\n     *     for at each trial run.  If negative, no maximum will be used\n     * @return a list of clusters containing the points\n     * @throws MathIllegalArgumentException if the data points are null or the number\n     *     of clusters is larger than the number of data points\n     * @throws ConvergenceException if an empty cluster is encountered and the\n     * {@link #emptyStrategy} is set to {@code ERROR}\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 37)",
        "(line 107,col 9)-(line 107,col 58)",
        "(line 110,col 9)-(line 137,col 9)",
        "(line 140,col 9)-(line 140,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.KMeansPlusPlusClusterer.cluster(java.util.Collection\u003cT\u003e, int, int)",
      "begin_line": 157,
      "end_line": 214,
      "comment": "\n     * Runs the K-means++ clustering algorithm.\n     *\n     * @param points the points to cluster\n     * @param k the number of clusters to split the data into\n     * @param maxIterations the maximum number of iterations to run the algorithm\n     *     for.  If negative, no maximum will be used\n     * @return a list of clusters containing the points\n     * @throws MathIllegalArgumentException if the data points are null or the number\n     *     of clusters is larger than the number of data points\n     * @throws ConvergenceException if an empty cluster is encountered and the\n     * {@link #emptyStrategy} is set to {@code ERROR}\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 39)",
        "(line 165,col 9)-(line 167,col 9)",
        "(line 170,col 9)-(line 170,col 76)",
        "(line 174,col 9)-(line 174,col 51)",
        "(line 175,col 9)-(line 175,col 62)",
        "(line 178,col 9)-(line 178,col 80)",
        "(line 179,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 213,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters(java.util.List\u003corg.apache.commons.math3.stat.clustering.Cluster\u003cT\u003e\u003e, java.util.Collection\u003cT\u003e, int[])",
      "begin_line": 225,
      "end_line": 242,
      "comment": "\n     * Adds the given points to the closest {@link Cluster}.\n     *\n     * @param \u003cT\u003e type of the points to cluster\n     * @param clusters the {@link Cluster}s to add the points to\n     * @param points the points to add to the given {@link Cluster}s\n     * @param assignments points assignments to clusters\n     * @return the number of points assigned to different clusters as the iteration before\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 36)",
        "(line 229,col 9)-(line 229,col 27)",
        "(line 230,col 9)-(line 239,col 9)",
        "(line 241,col 9)-(line 241,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(java.util.Collection\u003cT\u003e, int, java.util.Random)",
      "begin_line": 253,
      "end_line": 371,
      "comment": "\n     * Use K-means++ to choose the initial centers.\n     *\n     * @param \u003cT\u003e type of the points to cluster\n     * @param points the points to choose the initial centers from\n     * @param k the number of centers to choose\n     * @param random random generator to use\n     * @return the initial centers\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 90)",
        "(line 261,col 9)-(line 261,col 47)",
        "(line 265,col 9)-(line 265,col 55)",
        "(line 268,col 9)-(line 268,col 71)",
        "(line 271,col 9)-(line 271,col 62)",
        "(line 273,col 9)-(line 273,col 60)",
        "(line 275,col 9)-(line 275,col 50)",
        "(line 278,col 9)-(line 278,col 38)",
        "(line 282,col 9)-(line 282,col 62)",
        "(line 286,col 9)-(line 291,col 9)",
        "(line 293,col 9)-(line 368,col 9)",
        "(line 370,col 9)-(line 370,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestVarianceCluster(java.util.Collection\u003corg.apache.commons.math3.stat.clustering.Cluster\u003cT\u003e\u003e)",
      "begin_line": 380,
      "end_line": 414,
      "comment": "\n     * Get a random point from the {@link Cluster} with the largest distance variance.\n     *\n     * @param clusters the {@link Cluster}s to search\n     * @return a random point from the selected cluster\n     * @throws ConvergenceException if clusters are all empty\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 54)",
        "(line 384,col 9)-(line 384,col 35)",
        "(line 385,col 9)-(line 403,col 9)",
        "(line 406,col 9)-(line 408,col 9)",
        "(line 411,col 9)-(line 411,col 60)",
        "(line 412,col 9)-(line 412,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestNumberCluster(java.util.Collection\u003corg.apache.commons.math3.stat.clustering.Cluster\u003cT\u003e\u003e)",
      "begin_line": 423,
      "end_line": 449,
      "comment": "\n     * Get a random point from the {@link Cluster} with the largest number of points\n     *\n     * @param clusters the {@link Cluster}s to search\n     * @return a random point from the selected cluster\n     * @throws ConvergenceException if clusters are all empty\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 26)",
        "(line 426,col 9)-(line 426,col 35)",
        "(line 427,col 9)-(line 438,col 9)",
        "(line 441,col 9)-(line 443,col 9)",
        "(line 446,col 9)-(line 446,col 60)",
        "(line 447,col 9)-(line 447,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.KMeansPlusPlusClusterer.getFarthestPoint(java.util.Collection\u003corg.apache.commons.math3.stat.clustering.Cluster\u003cT\u003e\u003e)",
      "begin_line": 458,
      "end_line": 486,
      "comment": "\n     * Get the point farthest to its cluster center\n     *\n     * @param clusters the {@link Cluster}s to search\n     * @return point farthest to its cluster center\n     * @throws ConvergenceException if clusters are all empty\n     ",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 54)",
        "(line 461,col 9)-(line 461,col 42)",
        "(line 462,col 9)-(line 462,col 31)",
        "(line 463,col 9)-(line 477,col 9)",
        "(line 480,col 9)-(line 482,col 9)",
        "(line 484,col 9)-(line 484,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.KMeansPlusPlusClusterer.getNearestCluster(java.util.Collection\u003corg.apache.commons.math3.stat.clustering.Cluster\u003cT\u003e\u003e, T)",
      "begin_line": 496,
      "end_line": 510,
      "comment": "\n     * Returns the nearest {@link Cluster} to the given point\n     *\n     * @param \u003cT\u003e type of the points to cluster\n     * @param clusters the {@link Cluster}s to search\n     * @param point the point to find the nearest {@link Cluster} for\n     * @return the index of the nearest {@link Cluster} to the given point\n     ",
      "child_ranges": [
        "(line 498,col 9)-(line 498,col 46)",
        "(line 499,col 9)-(line 499,col 29)",
        "(line 500,col 9)-(line 500,col 27)",
        "(line 501,col 9)-(line 508,col 9)",
        "(line 509,col 9)-(line 509,col 26)"
      ]
    }
  ]
}