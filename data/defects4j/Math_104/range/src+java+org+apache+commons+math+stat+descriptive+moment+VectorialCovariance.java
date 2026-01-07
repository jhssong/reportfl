{
  "filepath": "/tmp/Math-104b/src/java/org/apache/commons/math/stat/descriptive/moment/VectorialCovariance.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VectorialCovariance",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 29,
      "end_line": 105,
      "comment": "\n * Returns the covariance matrix of the available vectors.\n * @version $Revision:$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "sums"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Sums for each component. "
    },
    {
      "type": "field",
      "varNames": [
        "productsSums"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Sums of products for each component. "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Number of vectors in the sample. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VectorialCovariance.VectorialCovariance(int)",
      "begin_line": 46,
      "end_line": 50,
      "comment": " Constructs a VectorialMean.\n     * @param dimension vectors dimension\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 45)",
        "(line 48,col 9)-(line 48,col 67)",
        "(line 49,col 9)-(line 49,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VectorialCovariance.increment(double[])",
      "begin_line": 57,
      "end_line": 69,
      "comment": "\n     * Add a new vector to the sample.\n     * @param v vector to add\n     * @exception DimensionMismatchException if the vector does not have the right dimension\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 60,col 9)",
        "(line 61,col 9)-(line 61,col 18)",
        "(line 62,col 9)-(line 67,col 9)",
        "(line 68,col 9)-(line 68,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VectorialCovariance.getResult()",
      "begin_line": 75,
      "end_line": 95,
      "comment": "\n     * Get the covariance matrix.\n     * @return covariance matrix\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 36)",
        "(line 78,col 9)-(line 78,col 73)",
        "(line 80,col 9)-(line 91,col 9)",
        "(line 93,col 9)-(line 93,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VectorialCovariance.getN()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Get the number of vectors in the sample.\n     * @return number of vectors in the sample\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 17)"
      ]
    }
  ]
}