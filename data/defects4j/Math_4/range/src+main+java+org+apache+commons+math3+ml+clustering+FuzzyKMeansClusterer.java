{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ml/clustering/FuzzyKMeansClusterer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FuzzyKMeansClusterer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ml.clustering.Clusterer\u003cT\u003e"
      ],
      "begin_line": 69,
      "end_line": 412,
      "comment": "\n * Fuzzy K-Means clustering algorithm.\n * \u003cp\u003e\n * The Fuzzy K-Means algorithm is a variation of the classical K-Means algorithm, with the\n * major difference that a single data point is not uniquely assigned to a single cluster.\n * Instead, each point i has a set of weights u\u003csub\u003eij\u003c/sub\u003e which indicate the degree of membership\n * to the cluster j.\n * \u003cp\u003e\n * The algorithm then tries to minimize the objective function:\n * \u003cpre\u003e\n * J \u003d \u0026#8721;\u003csub\u003ei\u003d1..C\u003c/sub\u003e\u0026#8721;\u003csub\u003ek\u003d1..N\u003c/sub\u003e u\u003csub\u003eik\u003c/sub\u003e\u003csup\u003em\u003c/sup\u003ed\u003csub\u003eik\u003c/sub\u003e\u003csup\u003e2\u003c/sup\u003e\n * \u003c/pre\u003e\n * with d\u003csub\u003eik\u003c/sub\u003e being the distance between data point i and the cluster center k.\n * \u003cp\u003e\n * The algorithm requires two parameters:\n * \u003cul\u003e\n *   \u003cli\u003ek: the number of clusters\n *   \u003cli\u003efuzziness: determines the level of cluster fuzziness, larger values lead to fuzzier clusters\n * \u003c/ul\u003e\n * Additional, optional parameters:\n * \u003cul\u003e\n *   \u003cli\u003emaxIterations: the maximum number of iterations\n *   \u003cli\u003eepsilon: the convergence criteria, default is 1e-3\n * \u003c/ul\u003e\n * \u003cp\u003e\n * The fuzzy variant of the K-Means algorithm is more robust with regard to the selection\n * of the initial cluster centers.\n *\n * @param \u003cT\u003e type of the points to cluster\n * @version $Id$\n * @since 4.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EPSILON"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " The default value for the convergence criteria. "
    },
    {
      "type": "field",
      "varNames": [
        "k"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " The number of clusters. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " The maximum number of iterations. "
    },
    {
      "type": "field",
      "varNames": [
        "fuzziness"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " The fuzziness factor. "
    },
    {
      "type": "field",
      "varNames": [
        "epsilon"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " The convergence criteria. "
    },
    {
      "type": "field",
      "varNames": [
        "random"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Random generator for choosing initial centers. "
    },
    {
      "type": "field",
      "varNames": [
        "membershipMatrix"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " The membership matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "points"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " The list of points used in the last call to {@link #cluster(Collection)}. "
    },
    {
      "type": "field",
      "varNames": [
        "clusters"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " The list of clusters resulting from the last call to {@link #cluster(Collection)}. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer.FuzzyKMeansClusterer(int, double)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Creates a new instance of a FuzzyKMeansClusterer.\n     * \u003cp\u003e\n     * The euclidean distance will be used as default distance measure.\n     *\n     * @param k the number of clusters to split the data into\n     * @param fuzziness the fuzziness factor, must be \u0026gt; 1.0\n     * @throws NumberIsTooSmallException if {@code fuzziness \u003c\u003d 1.0}\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer.FuzzyKMeansClusterer(int, double, int, org.apache.commons.math3.ml.distance.DistanceMeasure)",
      "begin_line": 121,
      "end_line": 125,
      "comment": "\n     * Creates a new instance of a FuzzyKMeansClusterer.\n     *\n     * @param k the number of clusters to split the data into\n     * @param fuzziness the fuzziness factor, must be \u0026gt; 1.0\n     * @param maxIterations the maximum number of iterations to run the algorithm for.\n     *   If negative, no maximum will be used.\n     * @param measure the distance measure to use\n     * @throws NumberIsTooSmallException if {@code fuzziness \u003c\u003d 1.0}\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 94)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer.FuzzyKMeansClusterer(int, double, int, org.apache.commons.math3.ml.distance.DistanceMeasure, double, org.apache.commons.math3.random.RandomGenerator)",
      "begin_line": 139,
      "end_line": 158,
      "comment": "\n     * Creates a new instance of a FuzzyKMeansClusterer.\n     *\n     * @param k the number of clusters to split the data into\n     * @param fuzziness the fuzziness factor, must be \u0026gt; 1.0\n     * @param maxIterations the maximum number of iterations to run the algorithm for.\n     *   If negative, no maximum will be used.\n     * @param measure the distance measure to use\n     * @param epsilon the convergence criteria (default is 1e-3)\n     * @param random random generator to use for choosing initial centers\n     * @throws NumberIsTooSmallException if {@code fuzziness \u003c\u003d 1.0}\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 23)",
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 19)",
        "(line 150,col 9)-(line 150,col 35)",
        "(line 151,col 9)-(line 151,col 43)",
        "(line 152,col 9)-(line 152,col 31)",
        "(line 153,col 9)-(line 153,col 29)",
        "(line 155,col 9)-(line 155,col 37)",
        "(line 156,col 9)-(line 156,col 27)",
        "(line 157,col 9)-(line 157,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer.getK()",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\n     * Return the number of clusters this instance will use.\n     * @return the number of clusters\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer.getFuzziness()",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\n     * Returns the fuzziness factor used by this instance.\n     * @return the fuzziness factor\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer.getMaxIterations()",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\n     * Returns the maximum number of iterations this instance will use.\n     * @return the maximum number of iterations, or -1 if no maximum is set\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer.getEpsilon()",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\n     * Returns the convergence criteria used by this instance.\n     * @return the convergence criteria\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer.getRandomGenerator()",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\n     * Returns the random generator this instance will use.\n     * @return the random generator\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer.getMembershipMatrix()",
      "begin_line": 210,
      "end_line": 215,
      "comment": "\n     * Returns the {@code nxk} membership matrix, where {@code n} is the number\n     * of data points and {@code k} the number of clusters.\n     * \u003cp\u003e\n     * The element U\u003csub\u003ei,j\u003c/sub\u003e represents the membership value for data point {@code i}\n     * to cluster {@code j}.\n     *\n     * @return the membership matrix\n     * @throws MathIllegalStateException if {@link #cluster(Collection)} has not been called before\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 214,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer.getDataPoints()",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\n     * Returns an unmodifiable list of the data points used in the last\n     * call to {@link #cluster(Collection)}.\n     * @return the list of data points, or {@code null} if {@link #cluster(Collection)} has\n     *   not been called before.\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer.getClusters()",
      "begin_line": 232,
      "end_line": 234,
      "comment": "\n     * Returns the list of clusters resulting from the last call to {@link #cluster(Collection)}.\n     * @return the list of clusters, or {@code null} if {@link #cluster(Collection)} has\n     *   not been called before.\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer.getObjectiveFunctionValue()",
      "begin_line": 241,
      "end_line": 258,
      "comment": "\n     * Get the value of the objective function.\n     * @return the objective function evaluation as double value\n     * @throws MathIllegalStateException if {@link #cluster(Collection)} has not been called before\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 244,col 9)",
        "(line 246,col 9)-(line 246,col 18)",
        "(line 247,col 9)-(line 247,col 33)",
        "(line 248,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 257,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer.cluster(java.util.Collection\u003cT\u003e)",
      "begin_line": 268,
      "end_line": 312,
      "comment": "\n     * Performs Fuzzy K-Means cluster analysis.\n     *\n     * @param dataPoints the points to cluster\n     * @return the list of clusters\n     * @throws MathIllegalArgumentException if the data points are null or the number\n     *     of clusters is larger than the number of data points\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 43)",
        "(line 274,col 9)-(line 274,col 43)",
        "(line 277,col 9)-(line 279,col 9)",
        "(line 282,col 9)-(line 282,col 76)",
        "(line 283,col 9)-(line 283,col 55)",
        "(line 284,col 9)-(line 284,col 47)",
        "(line 285,col 9)-(line 285,col 57)",
        "(line 288,col 9)-(line 290,col 9)",
        "(line 292,col 9)-(line 292,col 37)",
        "(line 295,col 9)-(line 295,col 67)",
        "(line 296,col 9)-(line 298,col 9)",
        "(line 300,col 9)-(line 300,col 26)",
        "(line 301,col 9)-(line 301,col 80)",
        "(line 302,col 9)-(line 302,col 32)",
        "(line 304,col 9)-(line 309,col 60)",
        "(line 311,col 9)-(line 311,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer.updateClusterCenters()",
      "begin_line": 317,
      "end_line": 340,
      "comment": "\n     * Update the cluster centers.\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 18)",
        "(line 319,col 9)-(line 319,col 90)",
        "(line 320,col 9)-(line 337,col 9)",
        "(line 338,col 9)-(line 338,col 25)",
        "(line 339,col 9)-(line 339,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer.updateMembershipMatrix()",
      "begin_line": 346,
      "end_line": 369,
      "comment": "\n     * Updates the membership matrix and assigns the points to the cluster with\n     * the highest membership.\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 368,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer.initializeMembershipMatrix()",
      "begin_line": 374,
      "end_line": 381,
      "comment": "\n     * Initialize the membership matrix with random values.\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 380,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer.calculateMaxMembershipChange(double[][])",
      "begin_line": 390,
      "end_line": 399,
      "comment": "\n     * Calculate the maximum element-by-element change of the membership matrix\n     * for the current iteration.\n     *\n     * @param matrix the membership matrix of the previous iteration\n     * @return the maximum membership matrix change\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 35)",
        "(line 392,col 9)-(line 397,col 9)",
        "(line 398,col 9)-(line 398,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer.saveMembershipMatrix(double[][])",
      "begin_line": 406,
      "end_line": 410,
      "comment": "\n     * Copy the membership matrix into the provided matrix.\n     *\n     * @param matrix the place to store the membership matrix\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 409,col 9)"
      ]
    }
  ]
}