{
  "filepath": "/tmp/Math-45b/src/main/java/org/apache/commons/math/transform/FastSineTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastSineTransformer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.transform.RealTransformer"
      ],
      "begin_line": 42,
      "end_line": 245,
      "comment": "\n * Implements the \u003ca href\u003d\"http://documents.wolfram.com/v5/Add-onsLinks/\n * StandardPackages/LinearAlgebra/FourierTrig.html\"\u003eFast Sine Transform\u003c/a\u003e\n * for transformation of one-dimensional data sets. For reference, see\n * \u003cb\u003eFast Fourier Transforms\u003c/b\u003e, ISBN 0849371635, chapter 3.\n * \u003cp\u003e\n * FST is its own inverse, up to a multiplier depending on conventions.\n * The equations are listed in the comments of the corresponding methods.\u003c/p\u003e\n * \u003cp\u003e\n * Similar to FFT, we also require the length of data set to be power of 2.\n * In addition, the first element must be 0 and it\u0027s enforced in function\n * transformation after sampling.\u003c/p\u003e\n * \u003cp\u003eAs of version 2.0 this no longer implements Serializable\u003c/p\u003e\n *\n * @version $Id$\n * @since 1.2\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.FastSineTransformer()",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Construct a default transformer.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.transform(double[])",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     * Transform the given real data set.\n     * \u003cp\u003e\n     * The formula is F\u003csub\u003en\u003c/sub\u003e \u003d \u0026sum;\u003csub\u003ek\u003d0\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e f\u003csub\u003ek\u003c/sub\u003e sin(\u0026pi; nk/N)\n     * \u003c/p\u003e\n     *\n     * @param f the real data array to be transformed\n     * @return the real transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.transform(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 79,
      "end_line": 86,
      "comment": "\n     * Transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is F\u003csub\u003en\u003c/sub\u003e \u003d \u0026sum;\u003csub\u003ek\u003d0\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e f\u003csub\u003ek\u003c/sub\u003e sin(\u0026pi; nk/N)\n     * \u003c/p\u003e\n     *\n     * @param f the function to be sampled and transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 70)",
        "(line 84,col 9)-(line 84,col 22)",
        "(line 85,col 9)-(line 85,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.transform2(double[])",
      "begin_line": 98,
      "end_line": 102,
      "comment": "\n     * Transform the given real data set.\n     * \u003cp\u003e\n     * The formula is F\u003csub\u003en\u003c/sub\u003e \u003d \u0026radic;(2/N) \u0026sum;\u003csub\u003ek\u003d0\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e f\u003csub\u003ek\u003c/sub\u003e sin(\u0026pi; nk/N)\n     * \u003c/p\u003e\n     *\n     * @param f the real data array to be transformed\n     * @return the real transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 67)",
        "(line 101,col 9)-(line 101,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.transform2(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 117,
      "end_line": 125,
      "comment": "\n     * Transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is F\u003csub\u003en\u003c/sub\u003e \u003d \u0026radic;(2/N) \u0026sum;\u003csub\u003ek\u003d0\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e f\u003csub\u003ek\u003c/sub\u003e sin(\u0026pi; nk/N)\n     * \u003c/p\u003e\n     *\n     * @param f the function to be sampled and transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 70)",
        "(line 122,col 9)-(line 122,col 22)",
        "(line 123,col 9)-(line 123,col 60)",
        "(line 124,col 9)-(line 124,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.inversetransform(double[])",
      "begin_line": 137,
      "end_line": 141,
      "comment": "\n     * Inversely transform the given real data set.\n     * \u003cp\u003e\n     * The formula is f\u003csub\u003ek\u003c/sub\u003e \u003d (2/N) \u0026sum;\u003csub\u003en\u003d0\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e F\u003csub\u003en\u003c/sub\u003e sin(\u0026pi; nk/N)\n     * \u003c/p\u003e\n     *\n     * @param f the real data array to be inversely transformed\n     * @return the real inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 52)",
        "(line 140,col 9)-(line 140,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.inversetransform(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 156,
      "end_line": 163,
      "comment": "\n     * Inversely transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is f\u003csub\u003ek\u003c/sub\u003e \u003d (2/N) \u0026sum;\u003csub\u003en\u003d0\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e F\u003csub\u003en\u003c/sub\u003e sin(\u0026pi; nk/N)\n     * \u003c/p\u003e\n     *\n     * @param f the function to be sampled and inversely transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 70)",
        "(line 160,col 9)-(line 160,col 22)",
        "(line 161,col 9)-(line 161,col 45)",
        "(line 162,col 9)-(line 162,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.inversetransform2(double[])",
      "begin_line": 175,
      "end_line": 178,
      "comment": "\n     * Inversely transform the given real data set.\n     * \u003cp\u003e\n     * The formula is f\u003csub\u003ek\u003c/sub\u003e \u003d \u0026radic;(2/N) \u0026sum;\u003csub\u003en\u003d0\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e F\u003csub\u003en\u003c/sub\u003e sin(\u0026pi; nk/N)\n     * \u003c/p\u003e\n     *\n     * @param f the real data array to be inversely transformed\n     * @return the real inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.inversetransform2(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 193,
      "end_line": 197,
      "comment": "\n     * Inversely transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is f\u003csub\u003ek\u003c/sub\u003e \u003d \u0026radic;(2/N) \u0026sum;\u003csub\u003en\u003d0\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e F\u003csub\u003en\u003c/sub\u003e sin(\u0026pi; nk/N)\n     * \u003c/p\u003e\n     *\n     * @param f the function to be sampled and inversely transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.fst(double[])",
      "begin_line": 206,
      "end_line": 244,
      "comment": "\n     * Perform the FST algorithm (including inverse).\n     *\n     * @param f the real data array to be transformed\n     * @return the real transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 58)",
        "(line 210,col 9)-(line 210,col 48)",
        "(line 211,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 216,col 31)",
        "(line 217,col 9)-(line 220,col 9)",
        "(line 223,col 9)-(line 223,col 41)",
        "(line 224,col 9)-(line 224,col 19)",
        "(line 225,col 9)-(line 225,col 36)",
        "(line 226,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 232,col 74)",
        "(line 233,col 9)-(line 233,col 47)",
        "(line 236,col 9)-(line 236,col 29)",
        "(line 237,col 9)-(line 237,col 46)",
        "(line 238,col 9)-(line 241,col 9)",
        "(line 243,col 9)-(line 243,col 27)"
      ]
    }
  ]
}