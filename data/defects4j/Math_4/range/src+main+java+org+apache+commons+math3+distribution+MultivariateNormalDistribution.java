{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/distribution/MultivariateNormalDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultivariateNormalDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution"
      ],
      "begin_line": 41,
      "end_line": 240,
      "comment": "\n * Implementation of the multivariate normal (Gaussian) distribution.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Multivariate_normal_distribution\"\u003e\n * Multivariate normal distribution (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/MultivariateNormalDistribution.html\"\u003e\n * Multivariate normal distribution (MathWorld)\u003c/a\u003e\n *\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "means"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Vector of means. "
    },
    {
      "type": "field",
      "varNames": [
        "covarianceMatrix"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Covariance matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "covarianceMatrixInverse"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " The matrix inverse of the covariance matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "covarianceMatrixDeterminant"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " The determinant of the covariance matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "samplingMatrix"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Matrix used in computation of samples. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.MultivariateNormalDistribution.MultivariateNormalDistribution(double[], double[][])",
      "begin_line": 71,
      "end_line": 77,
      "comment": "\n     * Creates a multivariate normal distribution with the given mean vector and\n     * covariance matrix.\n     * \u003cbr/\u003e\n     * The number of dimensions is equal to the length of the mean vector\n     * and to the number of rows and columns of the covariance matrix.\n     * It is frequently written as \"p\" in formulae.\n     *\n     * @param means Vector of means.\n     * @param covariances Covariance matrix.\n     * @throws DimensionMismatchException if the arrays length are\n     * inconsistent.\n     * @throws SingularMatrixException if the eigenvalue decomposition cannot\n     * be performed on the provided covariance matrix.\n     * @throws NonPositiveDefiniteMatrixException if any of the eigenvalues is\n     * negative.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.MultivariateNormalDistribution.MultivariateNormalDistribution(org.apache.commons.math3.random.RandomGenerator, double[], double[][])",
      "begin_line": 97,
      "end_line": 156,
      "comment": "\n     * Creates a multivariate normal distribution with the given mean vector and\n     * covariance matrix.\n     * \u003cbr/\u003e\n     * The number of dimensions is equal to the length of the mean vector\n     * and to the number of rows and columns of the covariance matrix.\n     * It is frequently written as \"p\" in formulae.\n     *\n     * @param rng Random Number Generator.\n     * @param means Vector of means.\n     * @param covariances Covariance matrix.\n     * @throws DimensionMismatchException if the arrays length are\n     * inconsistent.\n     * @throws SingularMatrixException if the eigenvalue decomposition cannot\n     * be performed on the provided covariance matrix.\n     * @throws NonPositiveDefiniteMatrixException if any of the eigenvalues is\n     * negative.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 33)",
        "(line 105,col 9)-(line 105,col 37)",
        "(line 107,col 9)-(line 109,col 9)",
        "(line 111,col 9)-(line 115,col 9)",
        "(line 117,col 9)-(line 117,col 46)",
        "(line 119,col 9)-(line 119,col 65)",
        "(line 122,col 9)-(line 122,col 86)",
        "(line 125,col 9)-(line 125,col 69)",
        "(line 127,col 9)-(line 127,col 65)",
        "(line 130,col 9)-(line 130,col 74)",
        "(line 132,col 9)-(line 136,col 9)",
        "(line 139,col 9)-(line 139,col 91)",
        "(line 140,col 9)-(line 143,col 9)",
        "(line 145,col 9)-(line 145,col 68)",
        "(line 148,col 9)-(line 153,col 9)",
        "(line 155,col 9)-(line 155,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.MultivariateNormalDistribution.getMeans()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n     * Gets the mean vector.\n     *\n     * @return the mean vector.\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.MultivariateNormalDistribution.getCovariances()",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\n     * Gets the covariance matrix.\n     *\n     * @return the covariance matrix.\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.MultivariateNormalDistribution.density(double[])",
      "begin_line": 177,
      "end_line": 186,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 39)",
        "(line 179,col 9)-(line 181,col 9)",
        "(line 183,col 9)-(line 185,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations()",
      "begin_line": 194,
      "end_line": 202,
      "comment": "\n     * Gets the square root of each element on the diagonal of the covariance\n     * matrix.\n     *\n     * @return the standard deviations.\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 39)",
        "(line 196,col 9)-(line 196,col 45)",
        "(line 197,col 9)-(line 197,col 56)",
        "(line 198,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 201,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.MultivariateNormalDistribution.sample()",
      "begin_line": 205,
      "end_line": 220,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 39)",
        "(line 207,col 9)-(line 207,col 52)",
        "(line 209,col 9)-(line 211,col 9)",
        "(line 213,col 9)-(line 213,col 65)",
        "(line 215,col 9)-(line 217,col 9)",
        "(line 219,col 9)-(line 219,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.MultivariateNormalDistribution.getExponentTerm(double[])",
      "begin_line": 228,
      "end_line": 239,
      "comment": "\n     * Computes the term used in the exponent (see definition of the distribution).\n     *\n     * @param values Values at which to compute density.\n     * @return the multiplication factor of density calculations.\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 60)",
        "(line 230,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 233,col 85)",
        "(line 234,col 9)-(line 234,col 23)",
        "(line 235,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 238,col 40)"
      ]
    }
  ]
}