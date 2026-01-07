{
  "filepath": "/tmp/Math-1b/src/main/java/org/apache/commons/math3/ml/clustering/KMeansPlusPlusClusterer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "KMeansPlusPlusClusterer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ml.clustering.Clusterer\u003cT\u003e"
      ],
      "begin_line": 43,
      "end_line": 566,
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
      "end_line": 253,
      "comment": "\n     * Runs the K-means++ clustering algorithm.\n     *\n     * @param points the points to cluster\n     * @return a list of clusters containing the points\n     * @throws MathIllegalArgumentException if the data points are null or the number\n     *     of clusters is larger than the number of data points\n     * @throws ConvergenceException if an empty cluster is encountered and the\n     * {@link #emptyStrategy} is set to {@code ERROR}\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 39)",
        "(line 204,col 9)-(line 206,col 9)",
        "(line 209,col 9)-(line 209,col 73)",
        "(line 213,col 9)-(line 213,col 51)",
        "(line 214,col 9)-(line 214,col 62)",
        "(line 217,col 9)-(line 217,col 80)",
        "(line 218,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 252,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer.assignPointsToClusters(java.util.List\u003corg.apache.commons.math3.ml.clustering.CentroidCluster\u003cT\u003e\u003e, java.util.Collection\u003cT\u003e, int[])",
      "begin_line": 263,
      "end_line": 280,
      "comment": "\n     * Adds the given points to the closest {@link Cluster}.\n     *\n     * @param clusters the {@link Cluster}s to add the points to\n     * @param points the points to add to the given {@link Cluster}s\n     * @param assignments points assignments to clusters\n     * @return the number of points assigned to different clusters as the iteration before\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 36)",
        "(line 267,col 9)-(line 267,col 27)",
        "(line 268,col 9)-(line 277,col 9)",
        "(line 279,col 9)-(line 279,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(java.util.Collection\u003cT\u003e)",
      "begin_line": 288,
      "end_line": 405,
      "comment": "\n     * Use K-means++ to choose the initial centers.\n     *\n     * @param points the points to choose the initial centers from\n     * @return the initial centers\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 90)",
        "(line 295,col 9)-(line 295,col 47)",
        "(line 299,col 9)-(line 299,col 55)",
        "(line 302,col 9)-(line 302,col 87)",
        "(line 305,col 9)-(line 305,col 62)",
        "(line 307,col 9)-(line 307,col 60)",
        "(line 309,col 9)-(line 309,col 58)",
        "(line 312,col 9)-(line 312,col 38)",
        "(line 316,col 9)-(line 316,col 62)",
        "(line 320,col 9)-(line 325,col 9)",
        "(line 327,col 9)-(line 402,col 9)",
        "(line 404,col 9)-(line 404,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer.getPointFromLargestVarianceCluster(java.util.Collection\u003corg.apache.commons.math3.ml.clustering.CentroidCluster\u003cT\u003e\u003e)",
      "begin_line": 414,
      "end_line": 448,
      "comment": "\n     * Get a random point from the {@link Cluster} with the largest distance variance.\n     *\n     * @param clusters the {@link Cluster}s to search\n     * @return a random point from the selected cluster\n     * @throws ConvergenceException if clusters are all empty\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 54)",
        "(line 418,col 9)-(line 418,col 35)",
        "(line 419,col 9)-(line 437,col 9)",
        "(line 440,col 9)-(line 442,col 9)",
        "(line 445,col 9)-(line 445,col 60)",
        "(line 446,col 9)-(line 446,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer.getPointFromLargestNumberCluster(java.util.Collection\u003c? extends org.apache.commons.math3.ml.clustering.Cluster\u003cT\u003e\u003e)",
      "begin_line": 457,
      "end_line": 484,
      "comment": "\n     * Get a random point from the {@link Cluster} with the largest number of points\n     *\n     * @param clusters the {@link Cluster}s to search\n     * @return a random point from the selected cluster\n     * @throws ConvergenceException if clusters are all empty\n     ",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 26)",
        "(line 461,col 9)-(line 461,col 35)",
        "(line 462,col 9)-(line 473,col 9)",
        "(line 476,col 9)-(line 478,col 9)",
        "(line 481,col 9)-(line 481,col 60)",
        "(line 482,col 9)-(line 482,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer.getFarthestPoint(java.util.Collection\u003corg.apache.commons.math3.ml.clustering.CentroidCluster\u003cT\u003e\u003e)",
      "begin_line": 493,
      "end_line": 521,
      "comment": "\n     * Get the point farthest to its cluster center\n     *\n     * @param clusters the {@link Cluster}s to search\n     * @return point farthest to its cluster center\n     * @throws ConvergenceException if clusters are all empty\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 54)",
        "(line 496,col 9)-(line 496,col 42)",
        "(line 497,col 9)-(line 497,col 31)",
        "(line 498,col 9)-(line 512,col 9)",
        "(line 515,col 9)-(line 517,col 9)",
        "(line 519,col 9)-(line 519,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer.getNearestCluster(java.util.Collection\u003corg.apache.commons.math3.ml.clustering.CentroidCluster\u003cT\u003e\u003e, T)",
      "begin_line": 530,
      "end_line": 543,
      "comment": "\n     * Returns the nearest {@link Cluster} to the given point\n     *\n     * @param clusters the {@link Cluster}s to search\n     * @param point the point to find the nearest {@link Cluster} for\n     * @return the index of the nearest {@link Cluster} to the given point\n     ",
      "child_ranges": [
        "(line 531,col 9)-(line 531,col 46)",
        "(line 532,col 9)-(line 532,col 29)",
        "(line 533,col 9)-(line 533,col 27)",
        "(line 534,col 9)-(line 541,col 9)",
        "(line 542,col 9)-(line 542,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer.centroidOf(java.util.Collection\u003cT\u003e, int)",
      "begin_line": 552,
      "end_line": 564,
      "comment": "\n     * Computes the centroid for a set of points.\n     *\n     * @param points the set of points\n     * @param dimension the point dimension\n     * @return the computed centroid for the set of points\n     ",
      "child_ranges": [
        "(line 553,col 9)-(line 553,col 56)",
        "(line 554,col 9)-(line 559,col 9)",
        "(line 560,col 9)-(line 562,col 9)",
        "(line 563,col 9)-(line 563,col 41)"
      ]
    }
  ]
}