{
  "filepath": "/tmp/Math-102b/src/java/org/apache/commons/math/stat/descriptive/moment/VectorialMean.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VectorialMean",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 27,
      "end_line": 79,
      "comment": "\n * Returns the arithmetic mean of the available vectors.\n * @version $Revision:$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "means"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Means for each component. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VectorialMean.VectorialMean(int)",
      "begin_line": 38,
      "end_line": 43,
      "comment": " Constructs a VectorialMean.\n     * @param dimension vectors dimension\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 36)",
        "(line 40,col 9)-(line 42,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VectorialMean.increment(double[])",
      "begin_line": 50,
      "end_line": 57,
      "comment": "\n     * Add a new vector to the sample.\n     * @param v vector to add\n     * @exception DimensionMismatchException if the vector does not have the right dimension\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 53,col 9)",
        "(line 54,col 9)-(line 56,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VectorialMean.getResult()",
      "begin_line": 63,
      "end_line": 69,
      "comment": "\n     * Get the mean vector.\n     * @return mean vector\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 51)",
        "(line 65,col 9)-(line 67,col 9)",
        "(line 68,col 9)-(line 68,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VectorialMean.getN()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Get the number of vectors in the sample.\n     * @return number of vectors in the sample\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 57)"
      ]
    }
  ]
}