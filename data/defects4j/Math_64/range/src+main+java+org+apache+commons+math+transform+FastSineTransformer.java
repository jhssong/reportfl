{
  "filepath": "/tmp/Math-64b/src/main/java/org/apache/commons/math/transform/FastSineTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastSineTransformer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.transform.RealTransformer"
      ],
      "begin_line": 42,
      "end_line": 253,
      "comment": "\n * Implements the \u003ca href\u003d\"http://documents.wolfram.com/v5/Add-onsLinks/\n * StandardPackages/LinearAlgebra/FourierTrig.html\"\u003eFast Sine Transform\u003c/a\u003e\n * for transformation of one-dimensional data sets. For reference, see\n * \u003cb\u003eFast Fourier Transforms\u003c/b\u003e, ISBN 0849371635, chapter 3.\n * \u003cp\u003e\n * FST is its own inverse, up to a multiplier depending on conventions.\n * The equations are listed in the comments of the corresponding methods.\u003c/p\u003e\n * \u003cp\u003e\n * Similar to FFT, we also require the length of data set to be power of 2.\n * In addition, the first element must be 0 and it\u0027s enforced in function\n * transformation after sampling.\u003c/p\u003e\n * \u003cp\u003eAs of version 2.0 this no longer implements Serializable\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
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
      "begin_line": 81,
      "end_line": 88,
      "comment": "\n     * Transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is F\u003csub\u003en\u003c/sub\u003e \u003d \u0026sum;\u003csub\u003ek\u003d0\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e f\u003csub\u003ek\u003c/sub\u003e sin(\u0026pi; nk/N)\n     * \u003c/p\u003e\n     *\n     * @param f the function to be sampled and transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real transformed array\n     * @throws FunctionEvaluationException if function cannot be evaluated\n     * at some point\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 70)",
        "(line 86,col 9)-(line 86,col 22)",
        "(line 87,col 9)-(line 87,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.transform2(double[])",
      "begin_line": 100,
      "end_line": 104,
      "comment": "\n     * Transform the given real data set.\n     * \u003cp\u003e\n     * The formula is F\u003csub\u003en\u003c/sub\u003e \u003d \u0026radic;(2/N) \u0026sum;\u003csub\u003ek\u003d0\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e f\u003csub\u003ek\u003c/sub\u003e sin(\u0026pi; nk/N)\n     * \u003c/p\u003e\n     *\n     * @param f the real data array to be transformed\n     * @return the real transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 63)",
        "(line 103,col 9)-(line 103,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.transform2(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 121,
      "end_line": 129,
      "comment": "\n     * Transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is F\u003csub\u003en\u003c/sub\u003e \u003d \u0026radic;(2/N) \u0026sum;\u003csub\u003ek\u003d0\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e f\u003csub\u003ek\u003c/sub\u003e sin(\u0026pi; nk/N)\n     * \u003c/p\u003e\n     *\n     * @param f the function to be sampled and transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real transformed array\n     * @throws FunctionEvaluationException if function cannot be evaluated\n     * at some point\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 70)",
        "(line 126,col 9)-(line 126,col 22)",
        "(line 127,col 9)-(line 127,col 56)",
        "(line 128,col 9)-(line 128,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.inversetransform(double[])",
      "begin_line": 141,
      "end_line": 145,
      "comment": "\n     * Inversely transform the given real data set.\n     * \u003cp\u003e\n     * The formula is f\u003csub\u003ek\u003c/sub\u003e \u003d (2/N) \u0026sum;\u003csub\u003en\u003d0\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e F\u003csub\u003en\u003c/sub\u003e sin(\u0026pi; nk/N)\n     * \u003c/p\u003e\n     *\n     * @param f the real data array to be inversely transformed\n     * @return the real inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 52)",
        "(line 144,col 9)-(line 144,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.inversetransform(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 162,
      "end_line": 169,
      "comment": "\n     * Inversely transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is f\u003csub\u003ek\u003c/sub\u003e \u003d (2/N) \u0026sum;\u003csub\u003en\u003d0\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e F\u003csub\u003en\u003c/sub\u003e sin(\u0026pi; nk/N)\n     * \u003c/p\u003e\n     *\n     * @param f the function to be sampled and inversely transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real inversely transformed array\n     * @throws FunctionEvaluationException if function cannot be evaluated\n     * at some point\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
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
      "begin_line": 201,
      "end_line": 205,
      "comment": "\n     * Inversely transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is f\u003csub\u003ek\u003c/sub\u003e \u003d \u0026radic;(2/N) \u0026sum;\u003csub\u003en\u003d0\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e F\u003csub\u003en\u003c/sub\u003e sin(\u0026pi; nk/N)\n     * \u003c/p\u003e\n     *\n     * @param f the function to be sampled and inversely transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real inversely transformed array\n     * @throws FunctionEvaluationException if function cannot be evaluated\n     * at some point\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.fst(double[])",
      "begin_line": 214,
      "end_line": 252,
      "comment": "\n     * Perform the FST algorithm (including inverse).\n     *\n     * @param f the real data array to be transformed\n     * @return the real transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 58)",
        "(line 218,col 9)-(line 218,col 48)",
        "(line 219,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 31)",
        "(line 225,col 9)-(line 228,col 9)",
        "(line 231,col 9)-(line 231,col 41)",
        "(line 232,col 9)-(line 232,col 19)",
        "(line 233,col 9)-(line 233,col 36)",
        "(line 234,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 240,col 74)",
        "(line 241,col 9)-(line 241,col 47)",
        "(line 244,col 9)-(line 244,col 29)",
        "(line 245,col 9)-(line 245,col 46)",
        "(line 246,col 9)-(line 249,col 9)",
        "(line 251,col 9)-(line 251,col 27)"
      ]
    }
  ]
}