{
  "filepath": "/tmp/Math-40b/src/main/java/org/apache/commons/math/transform/FastCosineTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastCosineTransformer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.transform.RealTransformer"
      ],
      "begin_line": 42,
      "end_line": 258,
      "comment": "\n * Implements the \u003ca href\u003d\"http://documents.wolfram.com/v5/Add-onsLinks/\n * StandardPackages/LinearAlgebra/FourierTrig.html\"\u003eFast Cosine Transform\u003c/a\u003e\n * for transformation of one-dimensional data sets. For reference, see\n * \u003cb\u003eFast Fourier Transforms\u003c/b\u003e, ISBN 0849371635, chapter 3.\n * \u003cp\u003e\n * FCT is its own inverse, up to a multiplier depending on conventions.\n * The equations are listed in the comments of the corresponding methods.\u003c/p\u003e\n * \u003cp\u003e\n * Different from FFT and FST, FCT requires the length of data set to be\n * power of 2 plus one. Users should especially pay attention to the\n * function transformation on how this affects the sampling.\u003c/p\u003e\n * \u003cp\u003eAs of version 2.0 this no longer implements Serializable\u003c/p\u003e\n *\n * @version $Id$\n * @since 1.2\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.FastCosineTransformer()",
      "begin_line": 45,
      "end_line": 47,
      "comment": " Construct a default transformer. ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.transform(double[])",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Transform the given real data set.\n     * \u003cp\u003e\n     * The formula is F\u003csub\u003en\u003c/sub\u003e \u003d (1/2) [f\u003csub\u003e0\u003c/sub\u003e + (-1)\u003csup\u003en\u003c/sup\u003e f\u003csub\u003eN\u003c/sub\u003e] +\n     *                        \u0026sum;\u003csub\u003ek\u003d1\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e f\u003csub\u003ek\u003c/sub\u003e cos(\u0026pi; nk/N)\n     * \u003c/p\u003e\n     *\n     * @param f the real data array to be transformed\n     * @return the real transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.transform(org.apache.commons.math.analysis.UnivariateFunction, double, double, int)",
      "begin_line": 78,
      "end_line": 83,
      "comment": "\n     * Transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is F\u003csub\u003en\u003c/sub\u003e \u003d (1/2) [f\u003csub\u003e0\u003c/sub\u003e + (-1)\u003csup\u003en\u003c/sup\u003e f\u003csub\u003eN\u003c/sub\u003e] +\n     *                        \u0026sum;\u003csub\u003ek\u003d1\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e f\u003csub\u003ek\u003c/sub\u003e cos(\u0026pi; nk/N)\n     * \u003c/p\u003e\n     *\n     * @param f the function to be sampled and transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 70)",
        "(line 82,col 9)-(line 82,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.transform2(double[])",
      "begin_line": 96,
      "end_line": 100,
      "comment": "\n     * Transform the given real data set.\n     * \u003cp\u003e\n     * The formula is F\u003csub\u003en\u003c/sub\u003e \u003d \u0026radic;(1/2N) [f\u003csub\u003e0\u003c/sub\u003e + (-1)\u003csup\u003en\u003c/sup\u003e f\u003csub\u003eN\u003c/sub\u003e] +\n     *                        \u0026radic;(2/N) \u0026sum;\u003csub\u003ek\u003d1\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e f\u003csub\u003ek\u003c/sub\u003e cos(\u0026pi; nk/N)\n     * \u003c/p\u003e\n     *\n     * @param f the real data array to be transformed\n     * @return the real transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 72)",
        "(line 99,col 9)-(line 99,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.transform2(org.apache.commons.math.analysis.UnivariateFunction, double, double, int)",
      "begin_line": 117,
      "end_line": 124,
      "comment": "\n     * Transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is F\u003csub\u003en\u003c/sub\u003e \u003d \u0026radic;(1/2N) [f\u003csub\u003e0\u003c/sub\u003e + (-1)\u003csup\u003en\u003c/sup\u003e f\u003csub\u003eN\u003c/sub\u003e] +\n     *                        \u0026radic;(2/N) \u0026sum;\u003csub\u003ek\u003d1\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e f\u003csub\u003ek\u003c/sub\u003e cos(\u0026pi; nk/N)\n     *\n     * \u003c/p\u003e\n     *\n     * @param f the function to be sampled and transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 70)",
        "(line 122,col 9)-(line 122,col 65)",
        "(line 123,col 9)-(line 123,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.inverseTransform(double[])",
      "begin_line": 137,
      "end_line": 142,
      "comment": "\n     * Inversely transform the given real data set.\n     * \u003cp\u003e\n     * The formula is f\u003csub\u003ek\u003c/sub\u003e \u003d (1/N) [F\u003csub\u003e0\u003c/sub\u003e + (-1)\u003csup\u003ek\u003c/sup\u003e F\u003csub\u003eN\u003c/sub\u003e] +\n     *                        (2/N) \u0026sum;\u003csub\u003en\u003d1\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e F\u003csub\u003en\u003c/sub\u003e cos(\u0026pi; nk/N)\n     * \u003c/p\u003e\n     *\n     * @param f the real data array to be inversely transformed\n     * @return the real inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 57)",
        "(line 141,col 9)-(line 141,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.inverseTransform(org.apache.commons.math.analysis.UnivariateFunction, double, double, int)",
      "begin_line": 159,
      "end_line": 166,
      "comment": "\n     * Inversely transform the given real function, sampled on the given\n     * interval.\n     * \u003cp\u003e\n     * The formula is f\u003csub\u003ek\u003c/sub\u003e \u003d (1/N) [F\u003csub\u003e0\u003c/sub\u003e + (-1)\u003csup\u003ek\u003c/sup\u003e F\u003csub\u003eN\u003c/sub\u003e] +\n     *                        (2/N) \u0026sum;\u003csub\u003en\u003d1\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e F\u003csub\u003en\u003c/sub\u003e cos(\u0026pi; nk/N)\n     * \u003c/p\u003e\n     *\n     * @param f the function to be sampled and inversely transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 70)",
        "(line 164,col 9)-(line 164,col 50)",
        "(line 165,col 9)-(line 165,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.inverseTransform2(double[])",
      "begin_line": 179,
      "end_line": 182,
      "comment": "\n     * Inversely transform the given real data set.\n     * \u003cp\u003e\n     * The formula is f\u003csub\u003ek\u003c/sub\u003e \u003d \u0026radic;(1/2N) [F\u003csub\u003e0\u003c/sub\u003e + (-1)\u003csup\u003ek\u003c/sup\u003e F\u003csub\u003eN\u003c/sub\u003e] +\n     *                        \u0026radic;(2/N) \u0026sum;\u003csub\u003en\u003d1\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e F\u003csub\u003en\u003c/sub\u003e cos(\u0026pi; nk/N)\n     * \u003c/p\u003e\n     *\n     * @param f the real data array to be inversely transformed\n     * @return the real inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.inverseTransform2(org.apache.commons.math.analysis.UnivariateFunction, double, double, int)",
      "begin_line": 199,
      "end_line": 204,
      "comment": "\n     * Inversely transform the given real function, sampled on the given\n     * interval.\n     * \u003cp\u003e\n     * The formula is f\u003csub\u003ek\u003c/sub\u003e \u003d \u0026radic;(1/2N) [F\u003csub\u003e0\u003c/sub\u003e + (-1)\u003csup\u003ek\u003c/sup\u003e F\u003csub\u003eN\u003c/sub\u003e] +\n     *                        \u0026radic;(2/N) \u0026sum;\u003csub\u003en\u003d1\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e F\u003csub\u003en\u003c/sub\u003e cos(\u0026pi; nk/N)\n     * \u003c/p\u003e\n     *\n     * @param f the function to be sampled and inversely transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.fct(double[])",
      "begin_line": 213,
      "end_line": 257,
      "comment": "\n     * Perform the FCT algorithm (including inverse).\n     *\n     * @param f the real data array to be transformed\n     * @return the real transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 58)",
        "(line 218,col 9)-(line 218,col 35)",
        "(line 219,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 228,col 9)",
        "(line 231,col 9)-(line 231,col 41)",
        "(line 232,col 9)-(line 232,col 35)",
        "(line 233,col 9)-(line 233,col 30)",
        "(line 235,col 9)-(line 235,col 40)",
        "(line 236,col 9)-(line 243,col 9)",
        "(line 244,col 9)-(line 244,col 74)",
        "(line 245,col 9)-(line 245,col 47)",
        "(line 248,col 9)-(line 248,col 40)",
        "(line 249,col 9)-(line 249,col 28)",
        "(line 250,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 254,col 45)",
        "(line 256,col 9)-(line 256,col 27)"
      ]
    }
  ]
}