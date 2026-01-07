{
  "filepath": "/tmp/Math-48b/src/main/java/org/apache/commons/math/transform/FastSineTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastSineTransformer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.transform.RealTransformer"
      ],
      "begin_line": 43,
      "end_line": 252,
      "comment": "\n * Implements the \u003ca href\u003d\"http://documents.wolfram.com/v5/Add-onsLinks/\n * StandardPackages/LinearAlgebra/FourierTrig.html\"\u003eFast Sine Transform\u003c/a\u003e\n * for transformation of one-dimensional data sets. For reference, see\n * \u003cb\u003eFast Fourier Transforms\u003c/b\u003e, ISBN 0849371635, chapter 3.\n * \u003cp\u003e\n * FST is its own inverse, up to a multiplier depending on conventions.\n * The equations are listed in the comments of the corresponding methods.\u003c/p\u003e\n * \u003cp\u003e\n * Similar to FFT, we also require the length of data set to be power of 2.\n * In addition, the first element must be 0 and it\u0027s enforced in function\n * transformation after sampling.\u003c/p\u003e\n * \u003cp\u003eAs of version 2.0 this no longer implements Serializable\u003c/p\u003e\n *\n * @version $Id$\n * @since 1.2\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.FastSineTransformer()",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Construct a default transformer.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.transform(double[])",
      "begin_line": 62,
      "end_line": 65,
      "comment": "\n     * Transform the given real data set.\n     * \u003cp\u003e\n     * The formula is F\u003csub\u003en\u003c/sub\u003e \u003d \u0026sum;\u003csub\u003ek\u003d0\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e f\u003csub\u003ek\u003c/sub\u003e sin(\u0026pi; nk/N)\n     * \u003c/p\u003e\n     *\n     * @param f the real data array to be transformed\n     * @return the real transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.transform(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 82,
      "end_line": 89,
      "comment": "\n     * Transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is F\u003csub\u003en\u003c/sub\u003e \u003d \u0026sum;\u003csub\u003ek\u003d0\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e f\u003csub\u003ek\u003c/sub\u003e sin(\u0026pi; nk/N)\n     * \u003c/p\u003e\n     *\n     * @param f the function to be sampled and transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real transformed array\n     * @throws MathUserException if function cannot be evaluated\n     * at some point\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 70)",
        "(line 87,col 9)-(line 87,col 22)",
        "(line 88,col 9)-(line 88,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.transform2(double[])",
      "begin_line": 101,
      "end_line": 105,
      "comment": "\n     * Transform the given real data set.\n     * \u003cp\u003e\n     * The formula is F\u003csub\u003en\u003c/sub\u003e \u003d \u0026radic;(2/N) \u0026sum;\u003csub\u003ek\u003d0\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e f\u003csub\u003ek\u003c/sub\u003e sin(\u0026pi; nk/N)\n     * \u003c/p\u003e\n     *\n     * @param f the real data array to be transformed\n     * @return the real transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 67)",
        "(line 104,col 9)-(line 104,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.transform2(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 122,
      "end_line": 130,
      "comment": "\n     * Transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is F\u003csub\u003en\u003c/sub\u003e \u003d \u0026radic;(2/N) \u0026sum;\u003csub\u003ek\u003d0\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e f\u003csub\u003ek\u003c/sub\u003e sin(\u0026pi; nk/N)\n     * \u003c/p\u003e\n     *\n     * @param f the function to be sampled and transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real transformed array\n     * @throws MathUserException if function cannot be evaluated\n     * at some point\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 70)",
        "(line 127,col 9)-(line 127,col 22)",
        "(line 128,col 9)-(line 128,col 60)",
        "(line 129,col 9)-(line 129,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.inversetransform(double[])",
      "begin_line": 142,
      "end_line": 146,
      "comment": "\n     * Inversely transform the given real data set.\n     * \u003cp\u003e\n     * The formula is f\u003csub\u003ek\u003c/sub\u003e \u003d (2/N) \u0026sum;\u003csub\u003en\u003d0\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e F\u003csub\u003en\u003c/sub\u003e sin(\u0026pi; nk/N)\n     * \u003c/p\u003e\n     *\n     * @param f the real data array to be inversely transformed\n     * @return the real inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 52)",
        "(line 145,col 9)-(line 145,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.inversetransform(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 162,
      "end_line": 169,
      "comment": "\n     * Inversely transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is f\u003csub\u003ek\u003c/sub\u003e \u003d (2/N) \u0026sum;\u003csub\u003en\u003d0\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e F\u003csub\u003en\u003c/sub\u003e sin(\u0026pi; nk/N)\n     * \u003c/p\u003e\n     *\n     * @param f the function to be sampled and inversely transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real inversely transformed array\n     * @throws MathUserException if function cannot be evaluated at some point\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 70)",
        "(line 166,col 9)-(line 166,col 22)",
        "(line 167,col 9)-(line 167,col 45)",
        "(line 168,col 9)-(line 168,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.inversetransform2(double[])",
      "begin_line": 181,
      "end_line": 184,
      "comment": "\n     * Inversely transform the given real data set.\n     * \u003cp\u003e\n     * The formula is f\u003csub\u003ek\u003c/sub\u003e \u003d \u0026radic;(2/N) \u0026sum;\u003csub\u003en\u003d0\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e F\u003csub\u003en\u003c/sub\u003e sin(\u0026pi; nk/N)\n     * \u003c/p\u003e\n     *\n     * @param f the real data array to be inversely transformed\n     * @return the real inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.inversetransform2(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 200,
      "end_line": 204,
      "comment": "\n     * Inversely transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is f\u003csub\u003ek\u003c/sub\u003e \u003d \u0026radic;(2/N) \u0026sum;\u003csub\u003en\u003d0\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e F\u003csub\u003en\u003c/sub\u003e sin(\u0026pi; nk/N)\n     * \u003c/p\u003e\n     *\n     * @param f the function to be sampled and inversely transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real inversely transformed array\n     * @throws MathUserException if function cannot be evaluated at some point\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.fst(double[])",
      "begin_line": 213,
      "end_line": 251,
      "comment": "\n     * Perform the FST algorithm (including inverse).\n     *\n     * @param f the real data array to be transformed\n     * @return the real transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 58)",
        "(line 217,col 9)-(line 217,col 48)",
        "(line 218,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 223,col 31)",
        "(line 224,col 9)-(line 227,col 9)",
        "(line 230,col 9)-(line 230,col 41)",
        "(line 231,col 9)-(line 231,col 19)",
        "(line 232,col 9)-(line 232,col 36)",
        "(line 233,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 239,col 74)",
        "(line 240,col 9)-(line 240,col 47)",
        "(line 243,col 9)-(line 243,col 29)",
        "(line 244,col 9)-(line 244,col 46)",
        "(line 245,col 9)-(line 248,col 9)",
        "(line 250,col 9)-(line 250,col 27)"
      ]
    }
  ]
}