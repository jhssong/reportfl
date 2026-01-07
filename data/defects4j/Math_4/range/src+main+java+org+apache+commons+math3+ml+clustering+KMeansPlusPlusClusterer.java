{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ml/clustering/KMeansPlusPlusClusterer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "KMeansPlusPlusClusterer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ml.clustering.Clusterer\u003cT\u003e"
      ],
      "begin_line": 43,
      "end_line": 565,
      "comment": "\n * Clustering algorithm based on David Arthur and Sergei Vassilvitski k-means++ algorithm.\n * @param \u003cT\u003e type of the points to cluster\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/K-means%2B%2B\"\u003eK-means++ (wikipedia)\u003c/a\u003e\n * @version $Id$\n * @since 3.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "k"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " The number of clusters. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " The maximum number of iterations. "
    },
    {
      "type": "field",
      "varNames": [
        "random"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Random generator for choosing initial centers. "
    },
    {
      "type": "field",
      "varNames": [
        "emptyStrategy"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Selected strategy for empty clusters. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer.KMeansPlusPlusClusterer(int)",
      "begin_line": 83,
      "end_line": 85,
      "comment": " Build a clusterer.\n     * \u003cp\u003e\n     * The default strategy for handling empty clusters that may appear during\n     * algorithm iterations is to split the cluster with largest distance variance.\n     * \u003cp\u003e\n     * The euclidean distance will be used as default distance measure.\n     *\n     * @param k the number of clusters to split the data into\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer.KMeansPlusPlusClusterer(int, int)",
      "begin_line": 98,
      "end_line": 100,
      "comment": " Build a clusterer.\n     * \u003cp\u003e\n     * The default strategy for handling empty clusters that may appear during\n     * algorithm iterations is to split the cluster with largest distance variance.\n     * \u003cp\u003e\n     * The euclidean distance will be used as default distance measure.\n     *\n     * @param k the number of clusters to split the data into\n     * @param maxIterations the maximum number of iterations to run the algorithm for.\n     *   If negative, no maximum will be used.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer.KMeansPlusPlusClusterer(int, int, org.apache.commons.math3.ml.distance.DistanceMeasure)",
      "begin_line": 112,
      "end_line": 114,
      "comment": " Build a clusterer.\n     * \u003cp\u003e\n     * The default strategy for handling empty clusters that may appear during\n     * algorithm iterations is to split the cluster with largest distance variance.\n     *\n     * @param k the number of clusters to split the data into\n     * @param maxIterations the maximum number of iterations to run the algorithm for.\n     *   If negative, no maximum will be used.\n     * @param measure the distance measure to use\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer.KMeansPlusPlusClusterer(int, int, org.apache.commons.math3.ml.distance.DistanceMeasure, org.apache.commons.math3.random.RandomGenerator)",
      "begin_line": 127,
      "end_line": 131,
      "comment": " Build a clusterer.\n     * \u003cp\u003e\n     * The default strategy for handling empty clusters that may appear during\n     * algorithm iterations is to split the cluster with largest distance variance.\n     *\n     * @param k the number of clusters to split the data into\n     * @param maxIterations the maximum number of iterations to run the algorithm for.\n     *   If negative, no maximum will be used.\n     * @param measure the distance measure to use\n     * @param random random generator to use for choosing initial centers\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 87)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer.KMeansPlusPlusClusterer(int, int, org.apache.commons.math3.ml.distance.DistanceMeasure, org.apache.commons.math3.random.RandomGenerator, org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer.EmptyClusterStrategy)",
      "begin_line": 143,
      "end_line": 152,
      "comment": " Build a clusterer.\n     *\n     * @param k the number of clusters to split the data into\n     * @param maxIterations the maximum number of iterations to run the algorithm for.\n     *   If negative, no maximum will be used.\n     * @param measure the distance measure to use\n     * @param random random generator to use for choosing initial centers\n     * @param emptyStrategy strategy to use for handling empty clusters that\n     * may appear during algorithm iterations\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 23)",
        "(line 148,col 9)-(line 148,col 31)",
        "(line 149,col 9)-(line 149,col 43)",
        "(line 150,col 9)-(line 150,col 36)",
        "(line 151,col 9)-(line 151,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer.getK()",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n     * Return the number of clusters this instance will use.\n     * @return the number of clusters\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer.getMaxIterations()",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n     * Returns the maximum number of iterations this instance will use.\n     * @return the maximum number of iterations, or -1 if no maximum is set\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer.getRandomGenerator()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\n     * Returns the random generator this instance will use.\n     * @return the random generator\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer.getEmptyClusterStrategy()",
      "begin_line": 182,
      "end_line": 184,
      "comment": "\n     * Returns the {@link EmptyClusterStrategy} used by this instance.\n     * @return the {@link EmptyClusterStrategy}\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer.cluster(java.util.Collection\u003cT\u003e)",
      "begin_line": 196,
      "end_line": 252,
      "comment": "\n     * Runs the K-means++ clustering algorithm.\n     *\n     * @param points the points to cluster\n     * @return a list of clusters containing the points\n     * @throws MathIllegalArgumentException if the data points are null or the number\n     *     of clusters is larger than the number of data points\n     * @throws ConvergenceException if an empty cluster is encountered and the\n     * {@link #emptyStrategy} is set to {@code ERROR}\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 39)",
        "(line 203,col 9)-(line 205,col 9)",
        "(line 208,col 9)-(line 208,col 73)",
        "(line 212,col 9)-(line 212,col 51)",
        "(line 213,col 9)-(line 213,col 62)",
        "(line 216,col 9)-(line 216,col 80)",
        "(line 217,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer.assignPointsToClusters(java.util.List\u003corg.apache.commons.math3.ml.clustering.CentroidCluster\u003cT\u003e\u003e, java.util.Collection\u003cT\u003e, int[])",
      "begin_line": 262,
      "end_line": 279,
      "comment": "\n     * Adds the given points to the closest {@link Cluster}.\n     *\n     * @param clusters the {@link Cluster}s to add the points to\n     * @param points the points to add to the given {@link Cluster}s\n     * @param assignments points assignments to clusters\n     * @return the number of points assigned to different clusters as the iteration before\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 36)",
        "(line 266,col 9)-(line 266,col 27)",
        "(line 267,col 9)-(line 276,col 9)",
        "(line 278,col 9)-(line 278,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(java.util.Collection\u003cT\u003e)",
      "begin_line": 287,
      "end_line": 404,
      "comment": "\n     * Use K-means++ to choose the initial centers.\n     *\n     * @param points the points to choose the initial centers from\n     * @return the initial centers\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 90)",
        "(line 294,col 9)-(line 294,col 47)",
        "(line 298,col 9)-(line 298,col 55)",
        "(line 301,col 9)-(line 301,col 87)",
        "(line 304,col 9)-(line 304,col 62)",
        "(line 306,col 9)-(line 306,col 60)",
        "(line 308,col 9)-(line 308,col 58)",
        "(line 311,col 9)-(line 311,col 38)",
        "(line 315,col 9)-(line 315,col 62)",
        "(line 319,col 9)-(line 324,col 9)",
        "(line 326,col 9)-(line 401,col 9)",
        "(line 403,col 9)-(line 403,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer.getPointFromLargestVarianceCluster(java.util.Collection\u003corg.apache.commons.math3.ml.clustering.CentroidCluster\u003cT\u003e\u003e)",
      "begin_line": 413,
      "end_line": 447,
      "comment": "\n     * Get a random point from the {@link Cluster} with the largest distance variance.\n     *\n     * @param clusters the {@link Cluster}s to search\n     * @return a random point from the selected cluster\n     * @throws ConvergenceException if clusters are all empty\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 54)",
        "(line 417,col 9)-(line 417,col 35)",
        "(line 418,col 9)-(line 436,col 9)",
        "(line 439,col 9)-(line 441,col 9)",
        "(line 444,col 9)-(line 444,col 60)",
        "(line 445,col 9)-(line 445,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer.getPointFromLargestNumberCluster(java.util.Collection\u003c? extends org.apache.commons.math3.ml.clustering.Cluster\u003cT\u003e\u003e)",
      "begin_line": 456,
      "end_line": 483,
      "comment": "\n     * Get a random point from the {@link Cluster} with the largest number of points\n     *\n     * @param clusters the {@link Cluster}s to search\n     * @return a random point from the selected cluster\n     * @throws ConvergenceException if clusters are all empty\n     ",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 26)",
        "(line 460,col 9)-(line 460,col 35)",
        "(line 461,col 9)-(line 472,col 9)",
        "(line 475,col 9)-(line 477,col 9)",
        "(line 480,col 9)-(line 480,col 60)",
        "(line 481,col 9)-(line 481,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer.getFarthestPoint(java.util.Collection\u003corg.apache.commons.math3.ml.clustering.CentroidCluster\u003cT\u003e\u003e)",
      "begin_line": 492,
      "end_line": 520,
      "comment": "\n     * Get the point farthest to its cluster center\n     *\n     * @param clusters the {@link Cluster}s to search\n     * @return point farthest to its cluster center\n     * @throws ConvergenceException if clusters are all empty\n     ",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 54)",
        "(line 495,col 9)-(line 495,col 42)",
        "(line 496,col 9)-(line 496,col 31)",
        "(line 497,col 9)-(line 511,col 9)",
        "(line 514,col 9)-(line 516,col 9)",
        "(line 518,col 9)-(line 518,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer.getNearestCluster(java.util.Collection\u003corg.apache.commons.math3.ml.clustering.CentroidCluster\u003cT\u003e\u003e, T)",
      "begin_line": 529,
      "end_line": 542,
      "comment": "\n     * Returns the nearest {@link Cluster} to the given point\n     *\n     * @param clusters the {@link Cluster}s to search\n     * @param point the point to find the nearest {@link Cluster} for\n     * @return the index of the nearest {@link Cluster} to the given point\n     ",
      "child_ranges": [
        "(line 530,col 9)-(line 530,col 46)",
        "(line 531,col 9)-(line 531,col 29)",
        "(line 532,col 9)-(line 532,col 27)",
        "(line 533,col 9)-(line 540,col 9)",
        "(line 541,col 9)-(line 541,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer.centroidOf(java.util.Collection\u003cT\u003e, int)",
      "begin_line": 551,
      "end_line": 563,
      "comment": "\n     * Computes the centroid for a set of points.\n     *\n     * @param points the set of points\n     * @param dimension the point dimension\n     * @return the computed centroid for the set of points\n     ",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 56)",
        "(line 553,col 9)-(line 558,col 9)",
        "(line 559,col 9)-(line 561,col 9)",
        "(line 562,col 9)-(line 562,col 41)"
      ]
    }
  ]
}