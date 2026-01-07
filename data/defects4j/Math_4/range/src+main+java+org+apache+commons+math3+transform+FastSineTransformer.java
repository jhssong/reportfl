{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/transform/FastSineTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastSineTransformer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.transform.RealTransformer",
        "java.io.Serializable"
      ],
      "begin_line": 71,
      "end_line": 181,
      "comment": "\n * Implements the Fast Sine Transform for transformation of one-dimensional real\n * data sets. For reference, see James S. Walker, \u003cem\u003eFast Fourier\n * Transforms\u003c/em\u003e, chapter 3 (ISBN 0849371635).\n * \u003cp\u003e\n * There are several variants of the discrete sine transform. The present\n * implementation corresponds to DST-I, with various normalization conventions,\n * which are specified by the parameter {@link DstNormalization}.\n * \u003cstrong\u003eIt should be noted that regardless to the convention, the first\n * element of the dataset to be transformed must be zero.\u003c/strong\u003e\n * \u003cp\u003e\n * DST-I is equivalent to DFT of an \u003cem\u003eodd extension\u003c/em\u003e of the data series.\n * More precisely, if x\u003csub\u003e0\u003c/sub\u003e, \u0026hellip;, x\u003csub\u003eN-1\u003c/sub\u003e is the data set\n * to be sine transformed, the extended data set x\u003csub\u003e0\u003c/sub\u003e\u003csup\u003e\u0026#35;\u003c/sup\u003e,\n * \u0026hellip;, x\u003csub\u003e2N-1\u003c/sub\u003e\u003csup\u003e\u0026#35;\u003c/sup\u003e is defined as follows\n * \u003cul\u003e\n * \u003cli\u003ex\u003csub\u003e0\u003c/sub\u003e\u003csup\u003e\u0026#35;\u003c/sup\u003e \u003d x\u003csub\u003e0\u003c/sub\u003e \u003d 0,\u003c/li\u003e\n * \u003cli\u003ex\u003csub\u003ek\u003c/sub\u003e\u003csup\u003e\u0026#35;\u003c/sup\u003e \u003d x\u003csub\u003ek\u003c/sub\u003e if 1 \u0026le; k \u0026lt; N,\u003c/li\u003e\n * \u003cli\u003ex\u003csub\u003eN\u003c/sub\u003e\u003csup\u003e\u0026#35;\u003c/sup\u003e \u003d 0,\u003c/li\u003e\n * \u003cli\u003ex\u003csub\u003ek\u003c/sub\u003e\u003csup\u003e\u0026#35;\u003c/sup\u003e \u003d -x\u003csub\u003e2N-k\u003c/sub\u003e if N + 1 \u0026le; k \u0026lt;\n * 2N.\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cp\u003e\n * Then, the standard DST-I y\u003csub\u003e0\u003c/sub\u003e, \u0026hellip;, y\u003csub\u003eN-1\u003c/sub\u003e of the real\n * data set x\u003csub\u003e0\u003c/sub\u003e, \u0026hellip;, x\u003csub\u003eN-1\u003c/sub\u003e is equal to \u003cem\u003ehalf\u003c/em\u003e\n * of i (the pure imaginary number) times the N first elements of the DFT of the\n * extended data set x\u003csub\u003e0\u003c/sub\u003e\u003csup\u003e\u0026#35;\u003c/sup\u003e, \u0026hellip;,\n * x\u003csub\u003e2N-1\u003c/sub\u003e\u003csup\u003e\u0026#35;\u003c/sup\u003e \u003cbr /\u003e\n * y\u003csub\u003en\u003c/sub\u003e \u003d (i / 2) \u0026sum;\u003csub\u003ek\u003d0\u003c/sub\u003e\u003csup\u003e2N-1\u003c/sup\u003e\n * x\u003csub\u003ek\u003c/sub\u003e\u003csup\u003e\u0026#35;\u003c/sup\u003e exp[-2\u0026pi;i nk / (2N)]\n * \u0026nbsp;\u0026nbsp;\u0026nbsp;\u0026nbsp;k \u003d 0, \u0026hellip;, N-1.\n * \u003cp\u003e\n * The present implementation of the discrete sine transform as a fast sine\n * transform requires the length of the data to be a power of two. Besides,\n * it implicitly assumes that the sampled function is odd. In particular, the\n * first element of the data set must be 0, which is enforced in\n * {@link #transform(UnivariateFunction, double, double, int, TransformType)},\n * after sampling.\n *\n * @version $Id$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "normalization"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " The type of DST to be performed. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.transform.FastSineTransformer.FastSineTransformer(org.apache.commons.math3.transform.DstNormalization)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Creates a new instance of this class, with various normalization conventions.\n     *\n     * @param normalization the type of normalization to be applied to the transformed data\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastSineTransformer.transform(double[], org.apache.commons.math3.transform.TransformType)",
      "begin_line": 96,
      "end_line": 106,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The first element of the specified data set is required to be {@code 0}.\n     *\n     * @throws MathIllegalArgumentException if the length of the data array is\n     *   not a power of two, or the first element of the data array is not zero\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 40)",
        "(line 105,col 9)-(line 105,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastSineTransformer.transform(org.apache.commons.math3.analysis.UnivariateFunction, double, double, int, org.apache.commons.math3.transform.TransformType)",
      "begin_line": 119,
      "end_line": 126,
      "comment": "\n     * {@inheritDoc}\n     *\n     * This implementation enforces {@code f(x) \u003d 0.0} at {@code x \u003d 0.0}.\n     *\n     * @throws org.apache.commons.math3.exception.NonMonotonicSequenceException\n     *   if the lower bound is greater than, or equal to the upper bound\n     * @throws org.apache.commons.math3.exception.NotStrictlyPositiveException\n     *   if the number of sample points is negative\n     * @throws MathIllegalArgumentException if the number of sample points is not a power of two\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 67)",
        "(line 124,col 9)-(line 124,col 22)",
        "(line 125,col 9)-(line 125,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastSineTransformer.fst(double[])",
      "begin_line": 137,
      "end_line": 180,
      "comment": "\n     * Perform the FST algorithm (including inverse). The first element of the\n     * data set is required to be {@code 0}.\n     *\n     * @param f the real data array to be transformed\n     * @return the real transformed array\n     * @throws MathIllegalArgumentException if the length of the data array is\n     *   not a power of two, or the first element of the data array is not zero\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 58)",
        "(line 141,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 31)",
        "(line 152,col 9)-(line 155,col 9)",
        "(line 158,col 9)-(line 158,col 41)",
        "(line 159,col 9)-(line 159,col 19)",
        "(line 160,col 9)-(line 160,col 36)",
        "(line 161,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 43)",
        "(line 168,col 9)-(line 168,col 76)",
        "(line 169,col 9)-(line 169,col 70)",
        "(line 172,col 9)-(line 172,col 29)",
        "(line 173,col 9)-(line 173,col 46)",
        "(line 174,col 9)-(line 177,col 9)",
        "(line 179,col 9)-(line 179,col 27)"
      ]
    }
  ]
}