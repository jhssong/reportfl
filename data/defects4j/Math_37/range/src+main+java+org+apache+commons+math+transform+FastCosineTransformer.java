{
  "filepath": "/tmp/Math-37b/src/main/java/org/apache/commons/math/transform/FastCosineTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastCosineTransformer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.transform.RealTransformer",
        "java.io.Serializable"
      ],
      "begin_line": 115,
      "end_line": 288,
      "comment": "\n * \u003cp\u003e\n * Implements the Fast Cosine Transform for transformation of one-dimensional\n * real data sets. For reference, see James S. Walker, \u003cem\u003eFast Fourier\n * Transforms\u003c/em\u003e, chapter 3 (ISBN 0849371635).\n * \u003c/p\u003e\n * \u003cp\u003e\n * There are several variants of the discrete cosine transform. The present\n * implementation corresponds to DCT-I, with various normalization conventions,\n * which are described below.\n * \u003c/p\u003e\n * \u003ch3\u003e\u003ca id\u003d\"standard\"\u003eStandard DCT-I\u003c/a\u003e\u003c/h3\u003e\n * \u003cp\u003e\n * The standard normalization convention is defined as follows\n * \u003cul\u003e\n * \u003cli\u003eforward transform:\n * y\u003csub\u003en\u003c/sub\u003e \u003d (1/2) [x\u003csub\u003e0\u003c/sub\u003e + (-1)\u003csup\u003en\u003c/sup\u003ex\u003csub\u003eN-1\u003c/sub\u003e]\n * + \u0026sum;\u003csub\u003ek\u003d1\u003c/sub\u003e\u003csup\u003eN-2\u003c/sup\u003e\n * x\u003csub\u003ek\u003c/sub\u003e cos[\u0026pi; nk / (N - 1)],\u003c/li\u003e\n * \u003cli\u003einverse transform:\n * x\u003csub\u003ek\u003c/sub\u003e \u003d [1 / (N - 1)] [y\u003csub\u003e0\u003c/sub\u003e\n * + (-1)\u003csup\u003ek\u003c/sup\u003ey\u003csub\u003eN-1\u003c/sub\u003e]\n * + [2 / (N - 1)] \u0026sum;\u003csub\u003en\u003d1\u003c/sub\u003e\u003csup\u003eN-2\u003c/sup\u003e\n * y\u003csub\u003en\u003c/sub\u003e cos[\u0026pi; nk / (N - 1)],\u003c/li\u003e\n * \u003c/ul\u003e\n * where N is the size of the data sample.\n * \u003c/p\u003e\n * \u003cp\u003e {@link RealTransformer}s following this convention are returned by the\n * factory method {@link #create()}.\n * \u003c/p\u003e\n * \u003ch3\u003e\u003ca id\u003d\"orthogonal\"\u003eOrthogonal DCT-I\u003c/a\u003e\u003c/h3\u003e\n * \u003cp\u003e\n * The orthogonal normalization convention is defined as follows\n * \u003cul\u003e\n * \u003cli\u003eforward transform:\n * y\u003csub\u003en\u003c/sub\u003e \u003d [2(N - 1)]\u003csup\u003e-1/2\u003c/sup\u003e [x\u003csub\u003e0\u003c/sub\u003e\n * + (-1)\u003csup\u003en\u003c/sup\u003ex\u003csub\u003eN-1\u003c/sub\u003e]\n * + [2 / (N - 1)]\u003csup\u003e1/2\u003c/sup\u003e \u0026sum;\u003csub\u003ek\u003d1\u003c/sub\u003e\u003csup\u003eN-2\u003c/sup\u003e\n * x\u003csub\u003ek\u003c/sub\u003e cos[\u0026pi; nk / (N - 1)],\u003c/li\u003e\n * \u003cli\u003einverse transform:\n * x\u003csub\u003ek\u003c/sub\u003e \u003d [2(N - 1)]\u003csup\u003e-1/2\u003c/sup\u003e [y\u003csub\u003e0\u003c/sub\u003e\n * + (-1)\u003csup\u003ek\u003c/sup\u003ey\u003csub\u003eN-1\u003c/sub\u003e]\n * + [2 / (N - 1)]\u003csup\u003e1/2\u003c/sup\u003e \u0026sum;\u003csub\u003en\u003d1\u003c/sub\u003e\u003csup\u003eN-2\u003c/sup\u003e\n * y\u003csub\u003en\u003c/sub\u003e cos[\u0026pi; nk / (N - 1)],\u003c/li\u003e\n * \u003c/ul\u003e\n * which makes the transform orthogonal. N is the size of the data sample.\n * \u003c/p\u003e\n * \u003cp\u003e {@link RealTransformer}s following this convention are returned by the\n * factory method {@link #createOrthogonal()}.\n * \u003c/p\u003e\n * \u003ch3\u003eLink with the DFT, and assumptions on the layout of the data set\u003c/h3\u003e\n * \u003cp\u003e\n * DCT-I is equivalent to DFT of an \u003cem\u003eeven extension\u003c/em\u003e of the data series.\n * More precisely, if x\u003csub\u003e0\u003c/sub\u003e, \u0026hellip;, x\u003csub\u003eN-1\u003c/sub\u003e is the data set\n * to be cosine transformed, the extended data set\n * x\u003csub\u003e0\u003c/sub\u003e\u003csup\u003e\u0026#35;\u003c/sup\u003e, \u0026hellip;, x\u003csub\u003e2N-3\u003c/sub\u003e\u003csup\u003e\u0026#35;\u003c/sup\u003e\n * is defined as follows\n * \u003cul\u003e\n * \u003cli\u003ex\u003csub\u003ek\u003c/sub\u003e\u003csup\u003e\u0026#35;\u003c/sup\u003e \u003d x\u003csub\u003ek\u003c/sub\u003e if 0 \u0026le; k \u0026lt; N,\u003c/li\u003e\n * \u003cli\u003ex\u003csub\u003ek\u003c/sub\u003e\u003csup\u003e\u0026#35;\u003c/sup\u003e \u003d x\u003csub\u003e2N-2-k\u003c/sub\u003e\n * if N \u0026le; k \u0026lt; 2N - 2.\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * \u003cp\u003e\n * Then, the standard DCT-I y\u003csub\u003e0\u003c/sub\u003e, \u0026hellip;, y\u003csub\u003eN-1\u003c/sub\u003e of the real\n * data set x\u003csub\u003e0\u003c/sub\u003e, \u0026hellip;, x\u003csub\u003eN-1\u003c/sub\u003e is equal to \u003cem\u003ehalf\u003c/em\u003e\n * of the N first elements of the DFT of the extended data set\n * x\u003csub\u003e0\u003c/sub\u003e\u003csup\u003e\u0026#35;\u003c/sup\u003e, \u0026hellip;, x\u003csub\u003e2N-3\u003c/sub\u003e\u003csup\u003e\u0026#35;\u003c/sup\u003e\n * \u003cbr/\u003e\n * y\u003csub\u003en\u003c/sub\u003e \u003d (1 / 2) \u0026sum;\u003csub\u003ek\u003d0\u003c/sub\u003e\u003csup\u003e2N-3\u003c/sup\u003e\n * x\u003csub\u003ek\u003c/sub\u003e\u003csup\u003e\u0026#35;\u003c/sup\u003e exp[-2\u0026pi;i nk / (2N - 2)]\n * \u0026nbsp;\u0026nbsp;\u0026nbsp;\u0026nbsp;k \u003d 0, \u0026hellip;, N-1.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The present implementation of the discrete cosine transform as a fast cosine\n * transform requires the length of the data set to be a power of two plus one\n * (N\u0026nbsp;\u003d\u0026nbsp;2\u003csup\u003en\u003c/sup\u003e\u0026nbsp;+\u0026nbsp;1). Besides, it implicitly assumes\n * that the sampled function is even.\n * \u003c/p\u003e\n * \u003cp\u003eAs of version 2.0 this no longer implements Serializable.\u003c/p\u003e\n *\n * @version $Id$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "orthogonal"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": "\n     * {@code true} if the orthogonal version of the DCT should be used.\n     *\n     * @see #create()\n     * @see #createOrthogonal()\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.FastCosineTransformer(boolean)",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * Creates a new instance of this class, with various normalization\n     * conventions.\n     *\n     * @param orthogonal {@code false} if the DCT is \u003cem\u003enot\u003c/em\u003e to be scaled,\n     * {@code true} if it is to be scaled so as to make the transform\n     * orthogonal.\n     * @see #create()\n     * @see #createOrthogonal()\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.create()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n     * \u003cp\u003e\n     * Returns a new instance of this class. The returned transformer uses the\n     * \u003ca href\u003d\"#standard\"\u003estandard normalizing conventions\u003c/a\u003e.\n     * \u003c/p\u003e\n     *\n     * @return a new DCT transformer, with standard normalizing conventions\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.createOrthogonal()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * \u003cp\u003e\n     * Returns a new instance of this class. The returned transformer uses the\n     * \u003ca href\u003d\"#orthogonal\"\u003eorthogonal normalizing conventions\u003c/a\u003e.\n     * \u003c/p\u003e\n     *\n     * @return a new DCT transformer, with orthogonal normalizing conventions\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.transform(double[])",
      "begin_line": 172,
      "end_line": 179,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws MathIllegalArgumentException if the length of the data array is\n     * not a power of two plus one\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.transform(org.apache.commons.math.analysis.UnivariateFunction, double, double, int)",
      "begin_line": 191,
      "end_line": 199,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws NonMonotonicSequenceException if the lower bound is greater\n     * than, or equal to the upper bound\n     * @throws NotStrictlyPositiveException if the number of sample points is\n     * negative\n     * @throws MathIllegalArgumentException if the number of sample points is\n     * not a power of two plus one\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 67)",
        "(line 198,col 9)-(line 198,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.inverseTransform(double[])",
      "begin_line": 207,
      "end_line": 213,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws MathIllegalArgumentException if the length of the data array is\n     * not a power of two plus one\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 47)",
        "(line 211,col 9)-(line 211,col 62)",
        "(line 212,col 9)-(line 212,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.inverseTransform(org.apache.commons.math.analysis.UnivariateFunction, double, double, int)",
      "begin_line": 225,
      "end_line": 233,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws NonMonotonicSequenceException if the lower bound is greater\n     * than, or equal to the upper bound\n     * @throws NotStrictlyPositiveException if the number of sample points is\n     * negative\n     * @throws MathIllegalArgumentException if the number of sample points is\n     * not a power of two plus one\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 67)",
        "(line 232,col 9)-(line 232,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.fct(double[])",
      "begin_line": 243,
      "end_line": 287,
      "comment": "\n     * Perform the FCT algorithm (including inverse).\n     *\n     * @param f the real data array to be transformed\n     * @return the real transformed array\n     * @throws MathIllegalArgumentException if the length of the data array is\n     * not a power of two plus one\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 58)",
        "(line 248,col 9)-(line 248,col 35)",
        "(line 249,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 258,col 9)",
        "(line 261,col 9)-(line 261,col 41)",
        "(line 262,col 9)-(line 262,col 35)",
        "(line 263,col 9)-(line 263,col 30)",
        "(line 265,col 9)-(line 265,col 40)",
        "(line 266,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 274,col 77)",
        "(line 275,col 9)-(line 275,col 47)",
        "(line 278,col 9)-(line 278,col 40)",
        "(line 279,col 9)-(line 279,col 28)",
        "(line 280,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 284,col 45)",
        "(line 286,col 9)-(line 286,col 27)"
      ]
    }
  ]
}