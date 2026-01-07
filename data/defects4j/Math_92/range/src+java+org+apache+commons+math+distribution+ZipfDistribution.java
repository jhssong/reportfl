{
  "filepath": "/tmp/Math-92b/src/java/org/apache/commons/math/distribution/ZipfDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipfDistribution",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math.distribution.IntegerDistribution"
      ],
      "begin_line": 32,
      "end_line": 66,
      "comment": "\n * The Zipf (or zeta) Distribution.\n * \u003cp\u003e\n * References:\n * \u003cul\u003e\n * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/ZipfDistribution.html\"\u003eZipf \n * Distribution\u003c/a\u003e\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistribution.getNumberOfElements()",
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * Get the number of elements (e.g. corpus size) for the distribution.\n     * \n     * @return the number of elements\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistribution.setNumberOfElements(int)",
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * Set the number of elements (e.g. corpus size) for the distribution.\n     * The parameter value must be positive; otherwise an \n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\n     * \n     * @param n the number of elements\n     * @throws IllegalArgumentException if n \u0026le; 0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistribution.getExponent()",
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * Get the exponent characterising the distribution.\n     * \n     * @return the exponent\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistribution.setExponent(double)",
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * Set the exponent characterising the distribution.\n     * The parameter value must be positive; otherwise an \n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\n     * \n     * @param s the exponent\n     * @throws IllegalArgumentException if s \u0026le; 0.0\n     ",
      "child_ranges": []
    }
  ]
}