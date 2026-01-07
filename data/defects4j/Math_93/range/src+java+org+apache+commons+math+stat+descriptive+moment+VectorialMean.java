{
  "filepath": "/tmp/Math-93b/src/java/org/apache/commons/math/stat/descriptive/moment/VectorialMean.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VectorialMean",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 28,
      "end_line": 80,
      "comment": "\n * Returns the arithmetic mean of the available vectors.\n * @since 1.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "means"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Means for each component. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VectorialMean.VectorialMean(int)",
      "begin_line": 39,
      "end_line": 44,
      "comment": " Constructs a VectorialMean.\n     * @param dimension vectors dimension\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 36)",
        "(line 41,col 9)-(line 43,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VectorialMean.increment(double[])",
      "begin_line": 51,
      "end_line": 58,
      "comment": "\n     * Add a new vector to the sample.\n     * @param v vector to add\n     * @exception DimensionMismatchException if the vector does not have the right dimension\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 54,col 9)",
        "(line 55,col 9)-(line 57,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VectorialMean.getResult()",
      "begin_line": 64,
      "end_line": 70,
      "comment": "\n     * Get the mean vector.\n     * @return mean vector\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 51)",
        "(line 66,col 9)-(line 68,col 9)",
        "(line 69,col 9)-(line 69,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VectorialMean.getN()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Get the number of vectors in the sample.\n     * @return number of vectors in the sample\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 57)"
      ]
    }
  ]
}