{
  "filepath": "/tmp/Math-54b/src/main/java/org/apache/commons/math/stat/clustering/KMeansPlusPlusClusterer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "KMeansPlusPlusClusterer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 367,
      "comment": "\n * Clustering algorithm based on David Arthur and Sergei Vassilvitski k-means++ algorithm.\n * @param \u003cT\u003e type of the points to cluster\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/K-means%2B%2B\"\u003eK-means++ (wikipedia)\u003c/a\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "random"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Random generator for choosing initial centers. "
    },
    {
      "type": "field",
      "varNames": [
        "emptyStrategy"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Selected strategy for empty clusters. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.KMeansPlusPlusClusterer(java.util.Random)",
      "begin_line": 71,
      "end_line": 73,
      "comment": " Build a clusterer.\n     * \u003cp\u003e\n     * The default strategy for handling empty clusters that may appear during\n     * algorithm iterations is to split the cluster with largest distance variance.\n     * \u003c/p\u003e\n     * @param random random generator to use for choosing initial centers\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.KMeansPlusPlusClusterer(java.util.Random, org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.EmptyClusterStrategy)",
      "begin_line": 81,
      "end_line": 84,
      "comment": " Build a clusterer.\n     * @param random random generator to use for choosing initial centers\n     * @param emptyStrategy strategy to use for handling empty clusters that\n     * may appear during algorithm iterations\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 36)",
        "(line 83,col 9)-(line 83,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster(java.util.Collection\u003cT\u003e, int, int)",
      "begin_line": 97,
      "end_line": 154,
      "comment": "\n     * Runs the K-means++ clustering algorithm.\n     *\n     * @param points the points to cluster\n     * @param k the number of clusters to split the data into\n     * @param maxIterations the maximum number of iterations to run the algorithm\n     *     for.  If negative, no maximum will be used\n     * @return a list of clusters containing the points\n     * @throws MathIllegalArgumentException if the data points are null or the number\n     *     of clusters is larger than the number of data points\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 39)",
        "(line 105,col 9)-(line 107,col 9)",
        "(line 110,col 9)-(line 110,col 76)",
        "(line 114,col 9)-(line 114,col 51)",
        "(line 115,col 9)-(line 115,col 62)",
        "(line 118,col 9)-(line 118,col 80)",
        "(line 119,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 153,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters(java.util.List\u003corg.apache.commons.math.stat.clustering.Cluster\u003cT\u003e\u003e, java.util.Collection\u003cT\u003e, int[])",
      "begin_line": 164,
      "end_line": 181,
      "comment": "\n     * Adds the given points to the closest {@link Cluster}.\n     *\n     * @param \u003cT\u003e type of the points to cluster\n     * @param clusters the {@link Cluster}s to add the points to\n     * @param points the points to add to the given {@link Cluster}s\n     * @return the number of points assigned to different clusters as the iteration before\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 36)",
        "(line 168,col 9)-(line 168,col 27)",
        "(line 169,col 9)-(line 178,col 9)",
        "(line 180,col 9)-(line 180,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(java.util.Collection\u003cT\u003e, int, java.util.Random)",
      "begin_line": 192,
      "end_line": 230,
      "comment": "\n     * Use K-means++ to choose the initial centers.\n     *\n     * @param \u003cT\u003e type of the points to cluster\n     * @param points the points to choose the initial centers from\n     * @param k the number of centers to choose\n     * @param random random generator to use\n     * @return the initial centers\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 58)",
        "(line 196,col 9)-(line 196,col 71)",
        "(line 199,col 9)-(line 199,col 78)",
        "(line 200,col 9)-(line 200,col 50)",
        "(line 202,col 9)-(line 202,col 57)",
        "(line 203,col 9)-(line 226,col 9)",
        "(line 228,col 9)-(line 228,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestVarianceCluster(java.util.Collection\u003corg.apache.commons.math.stat.clustering.Cluster\u003cT\u003e\u003e)",
      "begin_line": 238,
      "end_line": 271,
      "comment": "\n     * Get a random point from the {@link Cluster} with the largest distance variance.\n     *\n     * @param clusters the {@link Cluster}s to search\n     * @return a random point from the selected cluster\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 54)",
        "(line 241,col 9)-(line 241,col 35)",
        "(line 242,col 9)-(line 260,col 9)",
        "(line 263,col 9)-(line 265,col 9)",
        "(line 268,col 9)-(line 268,col 60)",
        "(line 269,col 9)-(line 269,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestNumberCluster(java.util.Collection\u003corg.apache.commons.math.stat.clustering.Cluster\u003cT\u003e\u003e)",
      "begin_line": 279,
      "end_line": 305,
      "comment": "\n     * Get a random point from the {@link Cluster} with the largest number of points\n     *\n     * @param clusters the {@link Cluster}s to search\n     * @return a random point from the selected cluster\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 26)",
        "(line 282,col 9)-(line 282,col 35)",
        "(line 283,col 9)-(line 294,col 9)",
        "(line 297,col 9)-(line 299,col 9)",
        "(line 302,col 9)-(line 302,col 60)",
        "(line 303,col 9)-(line 303,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getFarthestPoint(java.util.Collection\u003corg.apache.commons.math.stat.clustering.Cluster\u003cT\u003e\u003e)",
      "begin_line": 313,
      "end_line": 341,
      "comment": "\n     * Get the point farthest to its cluster center\n     *\n     * @param clusters the {@link Cluster}s to search\n     * @return point farthest to its cluster center\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 54)",
        "(line 316,col 9)-(line 316,col 42)",
        "(line 317,col 9)-(line 317,col 31)",
        "(line 318,col 9)-(line 332,col 9)",
        "(line 335,col 9)-(line 337,col 9)",
        "(line 339,col 9)-(line 339,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getNearestCluster(java.util.Collection\u003corg.apache.commons.math.stat.clustering.Cluster\u003cT\u003e\u003e, T)",
      "begin_line": 351,
      "end_line": 365,
      "comment": "\n     * Returns the nearest {@link Cluster} to the given point\n     *\n     * @param \u003cT\u003e type of the points to cluster\n     * @param clusters the {@link Cluster}s to search\n     * @param point the point to find the nearest {@link Cluster} for\n     * @return the index of the nearest {@link Cluster} to the given point\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 46)",
        "(line 354,col 9)-(line 354,col 29)",
        "(line 355,col 9)-(line 355,col 27)",
        "(line 356,col 9)-(line 363,col 9)",
        "(line 364,col 9)-(line 364,col 26)"
      ]
    }
  ]
}