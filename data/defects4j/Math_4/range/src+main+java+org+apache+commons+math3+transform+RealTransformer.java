{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/transform/RealTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealTransformer",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 37,
      "end_line": 71,
      "comment": "\n * Interface for one-dimensional data sets transformations producing real results.\n * \u003cp\u003e\n * Such transforms include {@link FastSineTransformer sine transform},\n * {@link FastCosineTransformer cosine transform} or {@link\n * FastHadamardTransformer Hadamard transform}. {@link FastFourierTransformer\n * Fourier transform} is of a different kind and does not implement this\n * interface since it produces {@link org.apache.commons.math3.complex.Complex}\n * results instead of real ones.\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.RealTransformer.transform(double[], org.apache.commons.math3.transform.TransformType)",
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * Returns the (forward, inverse) transform of the specified real data set.\n     *\n     * @param f the real data array to be transformed (signal)\n     * @param type the type of transform (forward, inverse) to be performed\n     * @return the real transformed array (spectrum)\n     * @throws MathIllegalArgumentException if the array cannot be transformed\n     *   with the given type (this may be for example due to array size, which is\n     *   constrained in some transforms)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.RealTransformer.transform(org.apache.commons.math3.analysis.UnivariateFunction, double, double, int, org.apache.commons.math3.transform.TransformType)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * Returns the (forward, inverse) transform of the specified real function,\n     * sampled on the specified interval.\n     *\n     * @param f the function to be sampled and transformed\n     * @param min the (inclusive) lower bound for the interval\n     * @param max the (exclusive) upper bound for the interval\n     * @param n the number of sample points\n     * @param type the type of transform (forward, inverse) to be performed\n     * @return the real transformed array\n     * @throws NonMonotonicSequenceException if the lower bound is greater than, or equal to the upper bound\n     * @throws NotStrictlyPositiveException if the number of sample points is negative\n     * @throws MathIllegalArgumentException if the sample cannot be transformed\n     *   with the given type (this may be for example due to sample size, which is\n     *   constrained in some transforms)\n     ",
      "child_ranges": []
    }
  ]
}