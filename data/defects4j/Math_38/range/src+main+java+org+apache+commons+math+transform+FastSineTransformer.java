{
  "filepath": "/tmp/Math-38b/src/main/java/org/apache/commons/math/transform/FastSineTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastSineTransformer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.transform.RealTransformer"
      ],
      "begin_line": 109,
      "end_line": 268,
      "comment": "\n * \u003cp\u003e\n * Implements the Fast Sine Transform for transformation of one-dimensional real\n * data sets. For reference, see James S. Walker, \u003cem\u003eFast Fourier\n * Transforms\u003c/em\u003e, chapter 3 (ISBN 0849371635).\n * \u003c/p\u003e\n * \u003cp\u003e\n * There are several variants of the discrete sine transform. The present\n * implementation corresponds to DST-I, with various normalization conventions,\n * which are described below. \u003cstrong\u003eIt should be noted that regardless to the\n * convention, the first element of the dataset to be transformed must be\n * zero.\u003c/strong\u003e\n * \u003c/p\u003e\n * \u003ch3\u003e\u003ca id\u003d\"standard\"\u003eStandard DST-I\u003c/a\u003e\u003c/h3\u003e\n * \u003cp\u003e\n * The standard normalization convention is defined as follows\n * \u003cul\u003e\n * \u003cli\u003eforward transform: y\u003csub\u003en\u003c/sub\u003e \u003d \u0026sum;\u003csub\u003ek\u003d0\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e\n * x\u003csub\u003ek\u003c/sub\u003e sin(\u0026pi; nk / N),\u003c/li\u003e\n * \u003cli\u003einverse transform: x\u003csub\u003ek\u003c/sub\u003e \u003d (2 / N)\n * \u0026sum;\u003csub\u003en\u003d0\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e y\u003csub\u003en\u003c/sub\u003e sin(\u0026pi; nk / N),\u003c/li\u003e\n * \u003c/ul\u003e\n * where N is the size of the data sample, and x\u003csub\u003e0\u003c/sub\u003e \u003d 0.\n * \u003c/p\u003e\n * \u003cp\u003e\n * {@link RealTransformer}s following this convention are returned by the\n * factory method {@link #create()}.\n * \u003c/p\u003e\n * \u003ch3\u003e\u003ca id\u003d\"orthogonal\"\u003eOrthogonal DST-I\u003c/a\u003e\u003c/h3\u003e\n * \u003cp\u003e\n * The orthogonal normalization convention is defined as follows\n * \u003cul\u003e\n * \u003cli\u003eForward transform: y\u003csub\u003en\u003c/sub\u003e \u003d \u0026radic;(2 / N)\n * \u0026sum;\u003csub\u003ek\u003d0\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e x\u003csub\u003ek\u003c/sub\u003e sin(\u0026pi; nk / N),\u003c/li\u003e\n * \u003cli\u003eInverse transform: x\u003csub\u003ek\u003c/sub\u003e \u003d \u0026radic;(2 / N)\n * \u0026sum;\u003csub\u003en\u003d0\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e y\u003csub\u003en\u003c/sub\u003e sin(\u0026pi; nk / N),\u003c/li\u003e\n * \u003c/ul\u003e\n * which makes the transform orthogonal. N is the size of the data sample, and\n * x\u003csub\u003e0\u003c/sub\u003e \u003d 0.\n * \u003c/p\u003e\n * \u003cp\u003e\n * {@link RealTransformer}s following this convention are returned by the\n * factory method {@link #createOrthogonal()}.\n * \u003c/p\u003e\n * \u003ch3\u003eLink with the DFT, and assumptions on the layout of the data set\u003c/h3\u003e\n * \u003cp\u003e\n * DST-I is equivalent to DFT of an \u003cem\u003eodd extension\u003c/em\u003e of the data series.\n * More precisely, if x\u003csub\u003e0\u003c/sub\u003e, \u0026hellip;, x\u003csub\u003eN-1\u003c/sub\u003e is the data set\n * to be sine transformed, the extended data set x\u003csub\u003e0\u003c/sub\u003e\u003csup\u003e\u0026#35;\u003c/sup\u003e,\n * \u0026hellip;, x\u003csub\u003e2N-1\u003c/sub\u003e\u003csup\u003e\u0026#35;\u003c/sup\u003e is defined as follows\n * \u003cul\u003e\n * \u003cli\u003ex\u003csub\u003e0\u003c/sub\u003e\u003csup\u003e\u0026#35;\u003c/sup\u003e \u003d x\u003csub\u003e0\u003c/sub\u003e \u003d 0,\u003c/li\u003e\n * \u003cli\u003ex\u003csub\u003ek\u003c/sub\u003e\u003csup\u003e\u0026#35;\u003c/sup\u003e \u003d x\u003csub\u003ek\u003c/sub\u003e if 1 \u0026le; k \u0026lt; N,\u003c/li\u003e\n * \u003cli\u003ex\u003csub\u003eN\u003c/sub\u003e\u003csup\u003e\u0026#35;\u003c/sup\u003e \u003d 0,\u003c/li\u003e\n * \u003cli\u003ex\u003csub\u003ek\u003c/sub\u003e\u003csup\u003e\u0026#35;\u003c/sup\u003e \u003d -x\u003csub\u003e2N-k\u003c/sub\u003e if N + 1 \u0026le; k \u0026lt;\n * 2N.\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * \u003cp\u003e\n * Then, the standard DST-I y\u003csub\u003e0\u003c/sub\u003e, \u0026hellip;, y\u003csub\u003eN-1\u003c/sub\u003e of the real\n * data set x\u003csub\u003e0\u003c/sub\u003e, \u0026hellip;, x\u003csub\u003eN-1\u003c/sub\u003e is equal to \u003cem\u003ehalf\u003c/em\u003e\n * of i (the pure imaginary number) times the N first elements of the DFT of the\n * extended data set x\u003csub\u003e0\u003c/sub\u003e\u003csup\u003e\u0026#35;\u003c/sup\u003e, \u0026hellip;,\n * x\u003csub\u003e2N-1\u003c/sub\u003e\u003csup\u003e\u0026#35;\u003c/sup\u003e \u003cbr /\u003e\n * y\u003csub\u003en\u003c/sub\u003e \u003d (i / 2) \u0026sum;\u003csub\u003ek\u003d0\u003c/sub\u003e\u003csup\u003e2N-1\u003c/sup\u003e\n * x\u003csub\u003ek\u003c/sub\u003e\u003csup\u003e\u0026#35;\u003c/sup\u003e exp[-2\u0026pi;i nk / (2N)]\n * \u0026nbsp;\u0026nbsp;\u0026nbsp;\u0026nbsp;k \u003d 0, \u0026hellip;, N-1.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The present implementation of the discrete sine transform as a fast sine\n * transform requires the length of the data to be a power of two. Besides,\n * it implicitly assumes that the sampled function is odd. In particular, the\n * first element of the data set must be 0, which is enforced in\n * {@link #transform(UnivariateFunction, double, double, int)} and\n * {@link #inverseTransform(UnivariateFunction, double, double, int)}, after\n * sampling.\n * \u003c/p\u003e\n * \u003cp\u003e\n * As of version 2.0 this no longer implements Serializable.\n * \u003c/p\u003e\n *\n * @version $Id: FastSineTransformer.java 1213157 2011-12-12 07:19:23Z celestin$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "orthogonal"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": "\n     * {@code true} if the orthogonal version of the DCT should be used.\n     *\n     * @see #create()\n     * @see #createOrthogonal()\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.FastSineTransformer(boolean)",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n     * Creates a new instance of this class, with various normalization\n     * conventions.\n     *\n     * @param orthogonal {@code false} if the DST is \u003cem\u003enot\u003c/em\u003e to be scaled,\n     * {@code true} if it is to be scaled so as to make the transform\n     * orthogonal.\n     * @see #create()\n     * @see #createOrthogonal()\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.create()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * \u003cp\u003e\n     * Returns a new instance of this class. The returned transformer uses the\n     * \u003ca href\u003d\"#standard\"\u003estandard normalizing conventions\u003c/a\u003e.\n     * \u003c/p\u003e\n     *\n     * @return a new DST transformer, with standard normalizing conventions\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.createOrthogonal()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * \u003cp\u003e\n     * Returns a new instance of this class. The returned transformer uses the\n     * \u003ca href\u003d\"#orthogonal\"\u003eorthogonal normalizing conventions\u003c/a\u003e.\n     * \u003c/p\u003e\n     *\n     * @return a new DST transformer, with orthogonal normalizing conventions\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.transform(double[])",
      "begin_line": 161,
      "end_line": 167,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The first element of the specified data set is required to be {@code 0}.\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 166,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.transform(org.apache.commons.math.analysis.UnivariateFunction, double, double, int)",
      "begin_line": 174,
      "end_line": 184,
      "comment": "\n     * {@inheritDoc}\n     *\n     * This implementation enforces {@code f(x) \u003d 0.0} at {@code x \u003d 0.0}.\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 76)",
        "(line 178,col 9)-(line 178,col 22)",
        "(line 179,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.inverseTransform(double[])",
      "begin_line": 191,
      "end_line": 199,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The first element of the specified data set is required to be {@code 0}.\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 197,col 40)",
        "(line 198,col 9)-(line 198,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.inverseTransform(org.apache.commons.math.analysis.UnivariateFunction, double, double, int)",
      "begin_line": 206,
      "end_line": 219,
      "comment": "\n     * {@inheritDoc}\n     *\n     * This implementation enforces {@code f(x) \u003d 0.0} at {@code x \u003d 0.0}.\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 212,col 9)",
        "(line 214,col 9)-(line 214,col 76)",
        "(line 215,col 9)-(line 215,col 22)",
        "(line 216,col 9)-(line 216,col 33)",
        "(line 218,col 9)-(line 218,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.fst(double[])",
      "begin_line": 229,
      "end_line": 267,
      "comment": "\n     * Perform the FST algorithm (including inverse). The first element of the\n     * data set is required to be {@code 0}.\n     *\n     * @param f the real data array to be transformed\n     * @return the real transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 58)",
        "(line 233,col 9)-(line 233,col 48)",
        "(line 234,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 239,col 31)",
        "(line 240,col 9)-(line 243,col 9)",
        "(line 246,col 9)-(line 246,col 41)",
        "(line 247,col 9)-(line 247,col 19)",
        "(line 248,col 9)-(line 248,col 36)",
        "(line 249,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 255,col 77)",
        "(line 256,col 9)-(line 256,col 47)",
        "(line 259,col 9)-(line 259,col 29)",
        "(line 260,col 9)-(line 260,col 46)",
        "(line 261,col 9)-(line 264,col 9)",
        "(line 266,col 9)-(line 266,col 27)"
      ]
    }
  ]
}