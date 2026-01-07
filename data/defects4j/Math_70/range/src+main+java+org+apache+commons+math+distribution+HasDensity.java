{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/distribution/HasDensity.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HasDensity",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 44,
      "comment": "\n * \u003cp\u003eInterface that signals that a distribution can compute the probability density function\n * for a particular point.\n * @param \u003cP\u003e the type of the point at which density is to be computed, this\n * may be for example \u003ccode\u003eDouble.\u003c/code\u003e\u003c/p\u003e\n *\n * \u003cp\u003eThis interface is deprecated.  As of version 2.0, the {@link ContinuousDistribution}\n * interface will be extended to include a \u003ccode\u003edensity(double)\u003ccode\u003e method.\u003c/p\u003e\n *\n * @deprecated to be removed in math 3.0\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HasDensity.density(P)",
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Compute the probability density function.\n     * @param x point for which the probability density is requested\n     * @return probability density at point x\n     * @throws MathException if probability density cannot be computed at specifed point\n     ",
      "child_ranges": []
    }
  ]
}