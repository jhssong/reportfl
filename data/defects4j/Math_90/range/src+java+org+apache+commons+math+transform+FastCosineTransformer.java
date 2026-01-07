{
  "filepath": "/tmp/Math-90b/src/java/org/apache/commons/math/transform/FastCosineTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastCosineTransformer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.transform.RealTransformer"
      ],
      "begin_line": 40,
      "end_line": 264,
      "comment": "\n * Implements the \u003ca href\u003d\"http://documents.wolfram.com/v5/Add-onsLinks/\n * StandardPackages/LinearAlgebra/FourierTrig.html\"\u003eFast Cosine Transform\u003c/a\u003e\n * for transformation of one-dimensional data sets. For reference, see\n * \u003cb\u003eFast Fourier Transforms\u003c/b\u003e, ISBN 0849371635, chapter 3.\n * \u003cp\u003e\n * FCT is its own inverse, up to a multiplier depending on conventions.\n * The equations are listed in the comments of the corresponding methods.\u003c/p\u003e\n * \u003cp\u003e\n * Different from FFT and FST, FCT requires the length of data set to be\n * power of 2 plus one. Users should especially pay attention to the\n * function transformation on how this affects the sampling.\u003c/p\u003e\n *\n * @version $Revision:670469 $ $Date:2008-06-23 10:01:38 +0200 (lun., 23 juin 2008) $\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.FastCosineTransformer()",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Construct a default transformer.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.transform(double[])",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Transform the given real data set.\n     * \u003cp\u003e\n     * The formula is F\u003csub\u003en\u003c/sub\u003e \u003d (1/2) [f\u003csub\u003e0\u003c/sub\u003e + (-1)\u003csup\u003en\u003c/sup\u003e f\u003csub\u003eN\u003c/sub\u003e] +\n     *                        \u0026sum;\u003csub\u003ek\u003d1\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e f\u003csub\u003ek\u003c/sub\u003e cos(\u0026pi; nk/N)\n     * \u003c/p\u003e\n     * \n     * @param f the real data array to be transformed\n     * @return the real transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.transform(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 83,
      "end_line": 88,
      "comment": "\n     * Transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is F\u003csub\u003en\u003c/sub\u003e \u003d (1/2) [f\u003csub\u003e0\u003c/sub\u003e + (-1)\u003csup\u003en\u003c/sup\u003e f\u003csub\u003eN\u003c/sub\u003e] +\n     *                        \u0026sum;\u003csub\u003ek\u003d1\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e f\u003csub\u003ek\u003c/sub\u003e cos(\u0026pi; nk/N)\n     * \u003c/p\u003e\n     * \n     * @param f the function to be sampled and transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real transformed array\n     * @throws FunctionEvaluationException if function cannot be evaluated\n     * at some point\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 70)",
        "(line 87,col 9)-(line 87,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.transform2(double[])",
      "begin_line": 101,
      "end_line": 105,
      "comment": "\n     * Transform the given real data set.\n     * \u003cp\u003e\n     * The formula is F\u003csub\u003en\u003c/sub\u003e \u003d \u0026radic;(1/2N) [f\u003csub\u003e0\u003c/sub\u003e + (-1)\u003csup\u003en\u003c/sup\u003e f\u003csub\u003eN\u003c/sub\u003e] +\n     *                        \u0026radic;(2/N) \u0026sum;\u003csub\u003ek\u003d1\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e f\u003csub\u003ek\u003c/sub\u003e cos(\u0026pi; nk/N)\n     * \u003c/p\u003e\n     * \n     * @param f the real data array to be transformed\n     * @return the real transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 67)",
        "(line 104,col 9)-(line 104,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.transform2(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 124,
      "end_line": 131,
      "comment": "\n     * Transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is F\u003csub\u003en\u003c/sub\u003e \u003d \u0026radic;(1/2N) [f\u003csub\u003e0\u003c/sub\u003e + (-1)\u003csup\u003en\u003c/sup\u003e f\u003csub\u003eN\u003c/sub\u003e] +\n     *                        \u0026radic;(2/N) \u0026sum;\u003csub\u003ek\u003d1\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e f\u003csub\u003ek\u003c/sub\u003e cos(\u0026pi; nk/N)\n     *\n     * \u003c/p\u003e\n     * \n     * @param f the function to be sampled and transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real transformed array\n     * @throws FunctionEvaluationException if function cannot be evaluated\n     * at some point\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 70)",
        "(line 129,col 9)-(line 129,col 60)",
        "(line 130,col 9)-(line 130,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.inversetransform(double[])",
      "begin_line": 144,
      "end_line": 148,
      "comment": "\n     * Inversely transform the given real data set.\n     * \u003cp\u003e\n     * The formula is f\u003csub\u003ek\u003c/sub\u003e \u003d (1/N) [F\u003csub\u003e0\u003c/sub\u003e + (-1)\u003csup\u003ek\u003c/sup\u003e F\u003csub\u003eN\u003c/sub\u003e] +\n     *                        (2/N) \u0026sum;\u003csub\u003en\u003d1\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e F\u003csub\u003en\u003c/sub\u003e cos(\u0026pi; nk/N)\n     * \u003c/p\u003e\n     * \n     * @param f the real data array to be inversely transformed\n     * @return the real inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 58)",
        "(line 147,col 9)-(line 147,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.inversetransform(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 166,
      "end_line": 173,
      "comment": "\n     * Inversely transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is f\u003csub\u003ek\u003c/sub\u003e \u003d (1/N) [F\u003csub\u003e0\u003c/sub\u003e + (-1)\u003csup\u003ek\u003c/sup\u003e F\u003csub\u003eN\u003c/sub\u003e] +\n     *                        (2/N) \u0026sum;\u003csub\u003en\u003d1\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e F\u003csub\u003en\u003c/sub\u003e cos(\u0026pi; nk/N)\n     * \u003c/p\u003e\n     * \n     * @param f the function to be sampled and inversely transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real inversely transformed array\n     * @throws FunctionEvaluationException if function cannot be evaluated\n     * at some point\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 70)",
        "(line 171,col 9)-(line 171,col 51)",
        "(line 172,col 9)-(line 172,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.inversetransform2(double[])",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\n     * Inversely transform the given real data set.\n     * \u003cp\u003e\n     * The formula is f\u003csub\u003ek\u003c/sub\u003e \u003d \u0026radic;(1/2N) [F\u003csub\u003e0\u003c/sub\u003e + (-1)\u003csup\u003ek\u003c/sup\u003e F\u003csub\u003eN\u003c/sub\u003e] +\n     *                        \u0026radic;(2/N) \u0026sum;\u003csub\u003en\u003d1\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e F\u003csub\u003en\u003c/sub\u003e cos(\u0026pi; nk/N)\n     * \u003c/p\u003e\n     * \n     * @param f the real data array to be inversely transformed\n     * @return the real inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.inversetransform2(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 206,
      "end_line": 211,
      "comment": "\n     * Inversely transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is f\u003csub\u003ek\u003c/sub\u003e \u003d \u0026radic;(1/2N) [F\u003csub\u003e0\u003c/sub\u003e + (-1)\u003csup\u003ek\u003c/sup\u003e F\u003csub\u003eN\u003c/sub\u003e] +\n     *                        \u0026radic;(2/N) \u0026sum;\u003csub\u003en\u003d1\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e F\u003csub\u003en\u003c/sub\u003e cos(\u0026pi; nk/N)\n     * \u003c/p\u003e\n     * \n     * @param f the function to be sampled and inversely transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real inversely transformed array\n     * @throws FunctionEvaluationException if function cannot be evaluated\n     * at some point\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.fct(double[])",
      "begin_line": 220,
      "end_line": 263,
      "comment": "\n     * Perform the FCT algorithm (including inverse).\n     *\n     * @param f the real data array to be transformed\n     * @return the real transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 60)",
        "(line 225,col 9)-(line 225,col 29)",
        "(line 226,col 9)-(line 230,col 9)",
        "(line 231,col 9)-(line 235,col 9)",
        "(line 238,col 9)-(line 238,col 26)",
        "(line 239,col 9)-(line 239,col 35)",
        "(line 240,col 9)-(line 240,col 30)",
        "(line 241,col 9)-(line 241,col 33)",
        "(line 242,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 250,col 74)",
        "(line 251,col 9)-(line 251,col 47)",
        "(line 254,col 9)-(line 254,col 30)",
        "(line 255,col 9)-(line 255,col 18)",
        "(line 256,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 260,col 35)",
        "(line 262,col 9)-(line 262,col 17)"
      ]
    }
  ]
}