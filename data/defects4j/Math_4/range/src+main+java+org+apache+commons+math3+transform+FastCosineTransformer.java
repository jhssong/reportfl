{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/transform/FastCosineTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastCosineTransformer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.transform.RealTransformer",
        "java.io.Serializable"
      ],
      "begin_line": 66,
      "end_line": 182,
      "comment": "\n * Implements the Fast Cosine Transform for transformation of one-dimensional\n * real data sets. For reference, see James S. Walker, \u003cem\u003eFast Fourier\n * Transforms\u003c/em\u003e, chapter 3 (ISBN 0849371635).\n * \u003cp\u003e\n * There are several variants of the discrete cosine transform. The present\n * implementation corresponds to DCT-I, with various normalization conventions,\n * which are specified by the parameter {@link DctNormalization}.\n * \u003cp\u003e\n * DCT-I is equivalent to DFT of an \u003cem\u003eeven extension\u003c/em\u003e of the data series.\n * More precisely, if x\u003csub\u003e0\u003c/sub\u003e, \u0026hellip;, x\u003csub\u003eN-1\u003c/sub\u003e is the data set\n * to be cosine transformed, the extended data set\n * x\u003csub\u003e0\u003c/sub\u003e\u003csup\u003e\u0026#35;\u003c/sup\u003e, \u0026hellip;, x\u003csub\u003e2N-3\u003c/sub\u003e\u003csup\u003e\u0026#35;\u003c/sup\u003e\n * is defined as follows\n * \u003cul\u003e\n * \u003cli\u003ex\u003csub\u003ek\u003c/sub\u003e\u003csup\u003e\u0026#35;\u003c/sup\u003e \u003d x\u003csub\u003ek\u003c/sub\u003e if 0 \u0026le; k \u0026lt; N,\u003c/li\u003e\n * \u003cli\u003ex\u003csub\u003ek\u003c/sub\u003e\u003csup\u003e\u0026#35;\u003c/sup\u003e \u003d x\u003csub\u003e2N-2-k\u003c/sub\u003e\n * if N \u0026le; k \u0026lt; 2N - 2.\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cp\u003e\n * Then, the standard DCT-I y\u003csub\u003e0\u003c/sub\u003e, \u0026hellip;, y\u003csub\u003eN-1\u003c/sub\u003e of the real\n * data set x\u003csub\u003e0\u003c/sub\u003e, \u0026hellip;, x\u003csub\u003eN-1\u003c/sub\u003e is equal to \u003cem\u003ehalf\u003c/em\u003e\n * of the N first elements of the DFT of the extended data set\n * x\u003csub\u003e0\u003c/sub\u003e\u003csup\u003e\u0026#35;\u003c/sup\u003e, \u0026hellip;, x\u003csub\u003e2N-3\u003c/sub\u003e\u003csup\u003e\u0026#35;\u003c/sup\u003e\n * \u003cbr/\u003e\n * y\u003csub\u003en\u003c/sub\u003e \u003d (1 / 2) \u0026sum;\u003csub\u003ek\u003d0\u003c/sub\u003e\u003csup\u003e2N-3\u003c/sup\u003e\n * x\u003csub\u003ek\u003c/sub\u003e\u003csup\u003e\u0026#35;\u003c/sup\u003e exp[-2\u0026pi;i nk / (2N - 2)]\n * \u0026nbsp;\u0026nbsp;\u0026nbsp;\u0026nbsp;k \u003d 0, \u0026hellip;, N-1.\n * \u003cp\u003e\n * The present implementation of the discrete cosine transform as a fast cosine\n * transform requires the length of the data set to be a power of two plus one\n * (N\u0026nbsp;\u003d\u0026nbsp;2\u003csup\u003en\u003c/sup\u003e\u0026nbsp;+\u0026nbsp;1). Besides, it implicitly assumes\n * that the sampled function is even.\n *\n * @version $Id$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "normalization"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " The type of DCT to be performed. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.transform.FastCosineTransformer.FastCosineTransformer(org.apache.commons.math3.transform.DctNormalization)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Creates a new instance of this class, with various normalization\n     * conventions.\n     *\n     * @param normalization the type of normalization to be applied to the\n     * transformed data\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastCosineTransformer.transform(double[], org.apache.commons.math3.transform.TransformType)",
      "begin_line": 91,
      "end_line": 108,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws MathIllegalArgumentException if the length of the data array is\n     * not a power of two plus one\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 100,col 47)",
        "(line 101,col 9)-(line 101,col 24)",
        "(line 102,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastCosineTransformer.transform(org.apache.commons.math3.analysis.UnivariateFunction, double, double, int, org.apache.commons.math3.transform.TransformType)",
      "begin_line": 120,
      "end_line": 126,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws org.apache.commons.math3.exception.NonMonotonicSequenceException\n     * if the lower bound is greater than, or equal to the upper bound\n     * @throws org.apache.commons.math3.exception.NotStrictlyPositiveException\n     * if the number of sample points is negative\n     * @throws MathIllegalArgumentException if the number of sample points is\n     * not a power of two plus one\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 67)",
        "(line 125,col 9)-(line 125,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastCosineTransformer.fct(double[])",
      "begin_line": 136,
      "end_line": 181,
      "comment": "\n     * Perform the FCT algorithm (including inverse).\n     *\n     * @param f the real data array to be transformed\n     * @return the real transformed array\n     * @throws MathIllegalArgumentException if the length of the data array is\n     * not a power of two plus one\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 58)",
        "(line 141,col 9)-(line 141,col 35)",
        "(line 142,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 151,col 9)",
        "(line 154,col 9)-(line 154,col 41)",
        "(line 155,col 9)-(line 155,col 35)",
        "(line 156,col 9)-(line 156,col 30)",
        "(line 158,col 9)-(line 158,col 40)",
        "(line 159,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 43)",
        "(line 168,col 9)-(line 168,col 76)",
        "(line 169,col 9)-(line 169,col 70)",
        "(line 172,col 9)-(line 172,col 40)",
        "(line 173,col 9)-(line 173,col 28)",
        "(line 174,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 45)",
        "(line 180,col 9)-(line 180,col 27)"
      ]
    }
  ]
}