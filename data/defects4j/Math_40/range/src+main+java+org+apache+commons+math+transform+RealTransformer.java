{
  "filepath": "/tmp/Math-40b/src/main/java/org/apache/commons/math/transform/RealTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealTransformer",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 77,
      "comment": "\n * Interface for one-dimensional data sets transformations producing real results.\n * \u003cp\u003eSuch transforms include {@link FastSineTransformer sine transform},\n * {@link FastCosineTransformer cosine transform} or {@link\n * FastHadamardTransformer Hadamard transform}. {@link FastFourierTransformer\n * Fourier transform} is of a different kind and does not implement this\n * interface since it produces {@link org.apache.commons.math.complex.Complex complex}\n * results instead of real ones.\n * \u003c/p\u003e\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.RealTransformer.transform(double[])",
      "begin_line": 41,
      "end_line": 42,
      "comment": "\n     * Transform the given real data set.\n     * @param f the real data array to be transformed (signal)\n     * @return the real transformed array (spectrum)\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.RealTransformer.transform(org.apache.commons.math.analysis.UnivariateFunction, double, double, int)",
      "begin_line": 53,
      "end_line": 54,
      "comment": "\n     * Transform the given real function, sampled on the given interval.\n     * @param f the function to be sampled and transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.RealTransformer.inverseTransform(double[])",
      "begin_line": 62,
      "end_line": 63,
      "comment": "\n     * Inversely transform the given real data set.\n     * @param f the real data array to be inversely transformed (spectrum)\n     * @return the real inversely transformed array (signal)\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.RealTransformer.inverseTransform(org.apache.commons.math.analysis.UnivariateFunction, double, double, int)",
      "begin_line": 74,
      "end_line": 75,
      "comment": "\n     * Inversely transform the given real function, sampled on the given interval.\n     * @param f the function to be sampled and inversely transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": []
    }
  ]
}