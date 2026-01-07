{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ml/clustering/MultiKMeansPlusPlusClusterer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiKMeansPlusPlusClusterer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ml.clustering.Clusterer\u003cT\u003e"
      ],
      "begin_line": 34,
      "end_line": 122,
      "comment": "\n * A wrapper around a k-means++ clustering algorithm which performs multiple trials\n * and returns the best solution.\n * @param \u003cT\u003e type of the points to cluster\n * @version $Id$\n * @since 3.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "clusterer"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " The underlying k-means clusterer. "
    },
    {
      "type": "field",
      "varNames": [
        "numTrials"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " The number of trial runs. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ml.clustering.MultiKMeansPlusPlusClusterer.MultiKMeansPlusPlusClusterer(org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer\u003cT\u003e, int)",
      "begin_line": 46,
      "end_line": 51,
      "comment": " Build a clusterer.\n     * @param clusterer the k-means clusterer to use\n     * @param numTrials number of trial runs\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 46)",
        "(line 49,col 9)-(line 49,col 35)",
        "(line 50,col 9)-(line 50,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.MultiKMeansPlusPlusClusterer.getClusterer()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Returns the embedded k-means clusterer used by this instance.\n     * @return the embedded clusterer\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.MultiKMeansPlusPlusClusterer.getNumTrials()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Returns the number of trials this instance will do.\n     * @return the number of trials\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.MultiKMeansPlusPlusClusterer.cluster(java.util.Collection\u003cT\u003e)",
      "begin_line": 80,
      "end_line": 120,
      "comment": "\n     * Runs the K-means++ clustering algorithm.\n     *\n     * @param points the points to cluster\n     * @return a list of clusters containing the points\n     * @throws MathIllegalArgumentException if the data points are null or the number\n     *   of clusters is larger than the number of data points\n     * @throws ConvergenceException if an empty cluster is encountered and the\n     *   underlying {@link KMeansPlusPlusClusterer} has its\n     *   {@link KMeansPlusPlusClusterer.EmptyClusterStrategy} is set to {@code ERROR}.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 45)",
        "(line 85,col 9)-(line 85,col 58)",
        "(line 88,col 9)-(line 115,col 9)",
        "(line 118,col 9)-(line 118,col 20)"
      ]
    }
  ]
}