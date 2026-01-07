{
  "filepath": "/tmp/Math-39b/src/main/java/org/apache/commons/math/transform/RealTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealTransformer",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 84,
      "comment": "\n * \u003cp\u003eInterface for one-dimensional data sets transformations producing real\n * results.\u003c/p\u003e\n * \u003cp\u003eSuch transforms include {@link FastSineTransformer sine transform},\n * {@link FastCosineTransformer cosine transform} or {@link\n * FastHadamardTransformer Hadamard transform}. {@link FastFourierTransformer\n * Fourier transform} is of a different kind and does not implement this\n * interface since it produces {@link org.apache.commons.math.complex.Complex}\n * results instead of real ones.\u003c/p\u003e\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.RealTransformer.transform(double[])",
      "begin_line": 43,
      "end_line": 44,
      "comment": "\n     * Returns the forward transform of the specified real data set.\n     *\n     * @param f the real data array to be transformed (signal)\n     * @return the real transformed array (spectrum)\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.RealTransformer.transform(org.apache.commons.math.analysis.UnivariateFunction, double, double, int)",
      "begin_line": 57,
      "end_line": 58,
      "comment": "\n     * Returns the forward transform of the specified real function, sampled on\n     * the specified interval.\n     *\n     * @param f the function to be sampled and transformed\n     * @param min the (inclusive) lower bound for the interval\n     * @param max the (exclusive) upper bound for the interval\n     * @param n the number of sample points\n     * @return the real transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.RealTransformer.inverseTransform(double[])",
      "begin_line": 67,
      "end_line": 68,
      "comment": "\n     * Returns the inverse transform of the specified real data set.\n     *\n     * @param f the real data array to be inversely transformed\n     * @return the real inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.RealTransformer.inverseTransform(org.apache.commons.math.analysis.UnivariateFunction, double, double, int)",
      "begin_line": 81,
      "end_line": 82,
      "comment": "\n     * Returns the inverse transform of the specified real function, sampled\n     * on the given interval.\n     *\n     * @param f the function to be sampled and inversely transformed\n     * @param min the (inclusive) lower bound for the interval\n     * @param max the (exclusive) upper bound for the interval\n     * @param n the number of sample points\n     * @return the real inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": []
    }
  ]
}