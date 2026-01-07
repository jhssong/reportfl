{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/distribution/ContinuousDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ContinuousDistribution",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math.distribution.Distribution"
      ],
      "begin_line": 33,
      "end_line": 43,
      "comment": "\n * \u003cp\u003eBase interface for continuous distributions.\u003c/p\u003e\n *\n * \u003cp\u003eNote: this interface will be extended in version 3.0 to include\n * \u003cbr/\u003e\u003ccode\u003epublic double density(double x)\u003c/code\u003e\u003cbr/\u003e\n * that is, from version 3.0 forward, continuous distributions \u003cstrong\u003emust\u003c/strong\u003e\n * include implementations of probability density functions. As of version\n * 2.1, all continuous distribution implementations included in commons-math\n * provide implementations of this method.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistribution.inverseCumulativeProbability(double)",
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * For this distribution, X, this method returns x such that P(X \u0026lt; x) \u003d p.\n     * @param p the cumulative probability.\n     * @return x.\n     * @throws MathException if the inverse cumulative probability can not be\n     *            computed due to convergence or other numerical errors.\n     ",
      "child_ranges": []
    }
  ]
}