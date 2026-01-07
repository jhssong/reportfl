{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/stat/descriptive/moment/VectorialCovariance.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VectorialCovariance",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 31,
      "end_line": 152,
      "comment": "\n * Returns the covariance matrix of the available vectors.\n * @since 1.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "sums"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Sums for each component. "
    },
    {
      "type": "field",
      "varNames": [
        "productsSums"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Sums of products for each component. "
    },
    {
      "type": "field",
      "varNames": [
        "isBiasCorrected"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Indicator for bias correction. "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Number of vectors in the sample. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VectorialCovariance.VectorialCovariance(int, boolean)",
      "begin_line": 53,
      "end_line": 58,
      "comment": " Constructs a VectorialCovariance.\n     * @param dimension vectors dimension\n     * @param isBiasCorrected if true, computed the unbiased sample covariance,\n     * otherwise computes the biased population covariance\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 45)",
        "(line 55,col 9)-(line 55,col 67)",
        "(line 56,col 9)-(line 56,col 25)",
        "(line 57,col 9)-(line 57,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VectorialCovariance.increment(double[])",
      "begin_line": 65,
      "end_line": 77,
      "comment": "\n     * Add a new vector to the sample.\n     * @param v vector to add\n     * @exception DimensionMismatchException if the vector does not have the right dimension\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 68,col 9)",
        "(line 69,col 9)-(line 69,col 18)",
        "(line 70,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VectorialCovariance.getResult()",
      "begin_line": 83,
      "end_line": 102,
      "comment": "\n     * Get the covariance matrix.\n     * @return covariance matrix\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 36)",
        "(line 86,col 9)-(line 86,col 79)",
        "(line 88,col 9)-(line 98,col 9)",
        "(line 100,col 9)-(line 100,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VectorialCovariance.getN()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Get the number of vectors in the sample.\n     * @return number of vectors in the sample\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VectorialCovariance.clear()",
      "begin_line": 115,
      "end_line": 119,
      "comment": "\n     * Clears the internal state of the Statistic\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 14)",
        "(line 117,col 9)-(line 117,col 31)",
        "(line 118,col 9)-(line 118,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VectorialCovariance.hashCode()",
      "begin_line": 122,
      "end_line": 131,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 29)",
        "(line 125,col 9)-(line 125,col 23)",
        "(line 126,col 9)-(line 126,col 66)",
        "(line 127,col 9)-(line 127,col 57)",
        "(line 128,col 9)-(line 128,col 64)",
        "(line 129,col 9)-(line 129,col 56)",
        "(line 130,col 9)-(line 130,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VectorialCovariance.equals(java.lang.Object)",
      "begin_line": 134,
      "end_line": 150,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 136,col 9)-(line 137,col 24)",
        "(line 138,col 9)-(line 139,col 25)",
        "(line 140,col 9)-(line 140,col 62)",
        "(line 141,col 9)-(line 142,col 25)",
        "(line 143,col 9)-(line 144,col 25)",
        "(line 145,col 9)-(line 146,col 25)",
        "(line 147,col 9)-(line 148,col 25)",
        "(line 149,col 9)-(line 149,col 20)"
      ]
    }
  ]
}