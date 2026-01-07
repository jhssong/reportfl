{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/stat/descriptive/moment/VectorialMean.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VectorialMean",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 29,
      "end_line": 103,
      "comment": "\n * Returns the arithmetic mean of the available vectors.\n * @since 1.2\n * @version $Revision$ $Date$\n "
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
        "means"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Means for each component. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VectorialMean.VectorialMean(int)",
      "begin_line": 40,
      "end_line": 45,
      "comment": " Constructs a VectorialMean.\n     * @param dimension vectors dimension\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 36)",
        "(line 42,col 9)-(line 44,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VectorialMean.increment(double[])",
      "begin_line": 52,
      "end_line": 59,
      "comment": "\n     * Add a new vector to the sample.\n     * @param v vector to add\n     * @exception DimensionMismatchException if the vector does not have the right dimension\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 55,col 9)",
        "(line 56,col 9)-(line 58,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VectorialMean.getResult()",
      "begin_line": 65,
      "end_line": 71,
      "comment": "\n     * Get the mean vector.\n     * @return mean vector\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 51)",
        "(line 67,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 70,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VectorialMean.getN()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Get the number of vectors in the sample.\n     * @return number of vectors in the sample\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VectorialMean.hashCode()",
      "begin_line": 82,
      "end_line": 88,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 29)",
        "(line 85,col 9)-(line 85,col 23)",
        "(line 86,col 9)-(line 86,col 57)",
        "(line 87,col 9)-(line 87,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VectorialMean.equals(java.lang.Object)",
      "begin_line": 91,
      "end_line": 101,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 93,col 9)-(line 94,col 24)",
        "(line 95,col 9)-(line 96,col 25)",
        "(line 97,col 9)-(line 97,col 50)",
        "(line 98,col 9)-(line 99,col 25)",
        "(line 100,col 9)-(line 100,col 20)"
      ]
    }
  ]
}