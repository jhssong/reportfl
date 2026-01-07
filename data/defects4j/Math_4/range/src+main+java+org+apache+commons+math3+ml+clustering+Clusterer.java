{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ml/clustering/Clusterer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Clusterer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 81,
      "comment": "\n * Base class for clustering algorithms.\n *\n * @param \u003cT\u003e the type of points that can be clustered\n * @version $Id $\n * @since 3.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "measure"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " The distance measure to use. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ml.clustering.Clusterer.Clusterer(org.apache.commons.math3.ml.distance.DistanceMeasure)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Build a new clusterer with the given {@link DistanceMeasure}.\n     *\n     * @param measure the distance measure to use\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.Clusterer.cluster(java.util.Collection\u003cT\u003e)",
      "begin_line": 57,
      "end_line": 58,
      "comment": "\n     * Perform a cluster analysis on the given set of {@link Clusterable} instances.\n     *\n     * @param points the set of {@link Clusterable} instances\n     * @return a {@link List} of clusters\n     * @throws MathIllegalArgumentException if points are null or the number of\n     *   data points is not compatible with this clusterer\n     * @throws ConvergenceException if the algorithm has not yet converged after\n     *   the maximum number of iterations has been exceeded\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.Clusterer.getDistanceMeasure()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Returns the {@link DistanceMeasure} instance used by this clusterer.\n     *\n     * @return the distance measure\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.Clusterer.distance(org.apache.commons.math3.ml.clustering.Clusterable, org.apache.commons.math3.ml.clustering.Clusterable)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Calculates the distance between two {@link Clusterable} instances\n     * with the configured {@link DistanceMeasure}.\n     *\n     * @param p1 the first clusterable\n     * @param p2 the second clusterable\n     * @return the distance between the two clusterables\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 61)"
      ]
    }
  ]
}