{
  "filepath": "/tmp/Math-47b/src/main/java/org/apache/commons/math/random/EmpiricalDistributionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EmpiricalDistributionImpl",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable",
        "org.apache.commons.math.random.EmpiricalDistribution"
      ],
      "begin_line": 65,
      "end_line": 549,
      "comment": "\n * Implements \u003ccode\u003eEmpiricalDistribution\u003c/code\u003e interface.  This implementation\n * uses what amounts to the\n * \u003ca href\u003d\"http://nedwww.ipac.caltech.edu/level5/March02/Silverman/Silver2_6.html\"\u003e\n * Variable Kernel Method\u003c/a\u003e with Gaussian smoothing:\u003cp\u003e\n * \u003cstrong\u003eDigesting the input file\u003c/strong\u003e\n * \u003col\u003e\u003cli\u003ePass the file once to compute min and max.\u003c/li\u003e\n * \u003cli\u003eDivide the range from min-max into \u003ccode\u003ebinCount\u003c/code\u003e \"bins.\"\u003c/li\u003e\n * \u003cli\u003ePass the data file again, computing bin counts and univariate\n *     statistics (mean, std dev.) for each of the bins \u003c/li\u003e\n * \u003cli\u003eDivide the interval (0,1) into subintervals associated with the bins,\n *     with the length of a bin\u0027s subinterval proportional to its count.\u003c/li\u003e\u003c/ol\u003e\n * \u003cstrong\u003eGenerating random values from the distribution\u003c/strong\u003e\u003col\u003e\n * \u003cli\u003eGenerate a uniformly distributed value in (0,1) \u003c/li\u003e\n * \u003cli\u003eSelect the subinterval to which the value belongs.\n * \u003cli\u003eGenerate a random Gaussian value with mean \u003d mean of the associated\n *     bin and std dev \u003d std dev of associated bin.\u003c/li\u003e\u003c/ol\u003e\u003c/p\u003e\u003cp\u003e\n *\u003cstrong\u003eUSAGE NOTES:\u003c/strong\u003e\u003cul\u003e\n *\u003cli\u003eThe \u003ccode\u003ebinCount\u003c/code\u003e is set by default to 1000.  A good rule of thumb\n *    is to set the bin count to approximately the length of the input file divided\n *    by 10. \u003c/li\u003e\n *\u003cli\u003eThe input file \u003ci\u003emust\u003c/i\u003e be a plain text file containing one valid numeric\n *    entry per line.\u003c/li\u003e\n * \u003c/ul\u003e\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BIN_COUNT"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Default bin count "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "binStats"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " List of SummaryStatistics objects characterizing the bins "
    },
    {
      "type": "field",
      "varNames": [
        "sampleStats"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Sample statistics "
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Max loaded value "
    },
    {
      "type": "field",
      "varNames": [
        "min"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Min loaded value "
    },
    {
      "type": "field",
      "varNames": [
        "delta"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Grid size "
    },
    {
      "type": "field",
      "varNames": [
        "binCount"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " number of bins "
    },
    {
      "type": "field",
      "varNames": [
        "loaded"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " is the distribution loaded? "
    },
    {
      "type": "field",
      "varNames": [
        "upperBounds"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " upper bounds of subintervals in (0,1) \"belonging\" to the bins "
    },
    {
      "type": "field",
      "varNames": [
        "randomData"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " RandomDataImpl instance to use in repeated calls to getNext() "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.EmpiricalDistributionImpl()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * Creates a new EmpiricalDistribution with the default bin count.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.EmpiricalDistributionImpl(int)",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * Creates a new EmpiricalDistribution with the specified bin count.\n     *\n     * @param binCount number of bins\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.EmpiricalDistributionImpl(int, org.apache.commons.math.random.RandomGenerator)",
      "begin_line": 124,
      "end_line": 128,
      "comment": "\n     * Creates a new EmpiricalDistribution with the specified bin count using the\n     * provided {@link RandomGenerator} as the source of random data.\n     *\n     * @param binCount number of bins\n     * @param generator random data generator (may be null, resulting in default JDK generator)\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 33)",
        "(line 126,col 9)-(line 126,col 51)",
        "(line 127,col 9)-(line 127,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.EmpiricalDistributionImpl(org.apache.commons.math.random.RandomGenerator)",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\n     * Creates a new EmpiricalDistribution with default bin count using the\n     * provided {@link RandomGenerator} as the source of random data.\n     *\n     * @param generator random data generator (may be null, resulting in default JDK generator)\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.EmpiricalDistributionImpl(int, org.apache.commons.math.random.RandomDataImpl)",
      "begin_line": 149,
      "end_line": 153,
      "comment": "\n     * Creates a new EmpiricalDistribution with the specified bin count using the\n     * provided {@link RandomDataImpl} instance as the source of random data.\n     *\n     * @param binCount number of bins\n     * @param randomData random data generator (may be null, resulting in default JDK generator)\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 33)",
        "(line 151,col 9)-(line 151,col 37)",
        "(line 152,col 9)-(line 152,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.EmpiricalDistributionImpl(org.apache.commons.math.random.RandomDataImpl)",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * Creates a new EmpiricalDistribution with default bin count using the\n     * provided {@link RandomDataImpl} as the source of random data.\n     *\n     * @param randomData random data generator (may be null, resulting in default JDK generator)\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.load(double[])",
      "begin_line": 173,
      "end_line": 183,
      "comment": "\n     * Computes the empirical distribution from the provided\n     * array of numbers.\n     *\n     * @param in the input data array\n     * @exception NullArgumentException if in is null\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 50)",
        "(line 175,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 181,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.load(java.net.URL)",
      "begin_line": 192,
      "end_line": 213,
      "comment": "\n     * Computes the empirical distribution using data read from a URL.\n     * @param url  url of the input file\n     *\n     * @throws IOException if an IO error occurs\n     * @throws NullArgumentException if url is null\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 36)",
        "(line 194,col 9)-(line 195,col 72)",
        "(line 196,col 9)-(line 212,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.load(java.io.File)",
      "begin_line": 222,
      "end_line": 238,
      "comment": "\n     * Computes the empirical distribution from the input file.\n     *\n     * @param file the input file\n     * @throws IOException if an IO error occurs\n     * @throws NullArgumentException if file is null\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 37)",
        "(line 224,col 9)-(line 224,col 69)",
        "(line 225,col 9)-(line 237,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DataAdapter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 244,
      "end_line": 260,
      "comment": "\n     * Provides methods for computing \u003ccode\u003esampleStats\u003c/code\u003e and\n     * \u003ccode\u003ebeanStats\u003c/code\u003e abstracting the source of data.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.DataAdapter.computeBinStats()",
      "begin_line": 251,
      "end_line": 251,
      "comment": "\n         * Compute bin stats.\n         *\n         * @throws IOException  if an error occurs computing bin stats\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.DataAdapter.computeStats()",
      "begin_line": 258,
      "end_line": 258,
      "comment": "\n         * Compute sample statistics.\n         *\n         * @throws IOException if an error occurs computing sample stats\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "DataAdapterFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 267,
      "end_line": 288,
      "comment": "\n     * Factory of \u003ccode\u003eDataAdapter\u003c/code\u003e objects. For every supported source\n     * of data (array of doubles, file, etc.) an instance of the proper object\n     * is returned.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.DataAdapterFactory.getAdapter(java.lang.Object)",
      "begin_line": 274,
      "end_line": 287,
      "comment": "\n         * Creates a DataAdapter from a data object\n         *\n         * @param in object providing access to the data\n         * @return DataAdapter instance\n         ",
      "child_ranges": [
        "(line 275,col 13)-(line 286,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StreamDataAdapter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.random.EmpiricalDistributionImpl.DataAdapter"
      ],
      "begin_line": 292,
      "end_line": 335,
      "comment": "\n     * \u003ccode\u003eDataAdapter\u003c/code\u003e for data provided through some input stream\n     "
    },
    {
      "type": "field",
      "varNames": [
        "inputStream"
      ],
      "begin_line": 295,
      "end_line": 295,
      "comment": " Input stream providing access to the data "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.StreamDataAdapter.StreamDataAdapter(java.io.BufferedReader)",
      "begin_line": 302,
      "end_line": 305,
      "comment": "\n         * Create a StreamDataAdapter from a BufferedReader\n         *\n         * @param in BufferedReader input stream\n         ",
      "child_ranges": [
        "(line 303,col 13)-(line 303,col 20)",
        "(line 304,col 13)-(line 304,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.StreamDataAdapter.computeBinStats()",
      "begin_line": 308,
      "end_line": 320,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 310,col 13)-(line 310,col 30)",
        "(line 311,col 13)-(line 311,col 30)",
        "(line 312,col 13)-(line 316,col 13)",
        "(line 318,col 13)-(line 318,col 32)",
        "(line 319,col 13)-(line 319,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.StreamDataAdapter.computeStats()",
      "begin_line": 323,
      "end_line": 334,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 325,col 13)-(line 325,col 30)",
        "(line 326,col 13)-(line 326,col 29)",
        "(line 327,col 13)-(line 327,col 50)",
        "(line 328,col 13)-(line 331,col 13)",
        "(line 332,col 13)-(line 332,col 32)",
        "(line 333,col 13)-(line 333,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ArrayDataAdapter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.random.EmpiricalDistributionImpl.DataAdapter"
      ],
      "begin_line": 340,
      "end_line": 375,
      "comment": "\n     * \u003ccode\u003eDataAdapter\u003c/code\u003e for data provided as array of doubles.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "inputArray"
      ],
      "begin_line": 343,
      "end_line": 343,
      "comment": " Array of input  data values "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.ArrayDataAdapter.ArrayDataAdapter(double[])",
      "begin_line": 351,
      "end_line": 355,
      "comment": "\n         * Construct an ArrayDataAdapter from a double[] array\n         *\n         * @param in double[] array holding the data\n         * @throws NullArgumentException if in is null\n         ",
      "child_ranges": [
        "(line 352,col 13)-(line 352,col 20)",
        "(line 353,col 13)-(line 353,col 39)",
        "(line 354,col 13)-(line 354,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.ArrayDataAdapter.computeStats()",
      "begin_line": 358,
      "end_line": 364,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 360,col 13)-(line 360,col 50)",
        "(line 361,col 13)-(line 363,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.ArrayDataAdapter.computeBinStats()",
      "begin_line": 367,
      "end_line": 374,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 369,col 13)-(line 373,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.fillBinStats(java.lang.Object)",
      "begin_line": 383,
      "end_line": 412,
      "comment": "\n     * Fills binStats array (second pass through data file).\n     *\n     * @param in object providing access to the data\n     * @throws IOException  if an IO error occurs\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 35)",
        "(line 386,col 9)-(line 386,col 35)",
        "(line 387,col 9)-(line 387,col 69)",
        "(line 390,col 9)-(line 392,col 9)",
        "(line 393,col 9)-(line 396,col 9)",
        "(line 399,col 9)-(line 399,col 63)",
        "(line 400,col 9)-(line 400,col 49)",
        "(line 401,col 9)-(line 401,col 29)",
        "(line 404,col 9)-(line 404,col 43)",
        "(line 405,col 9)-(line 406,col 72)",
        "(line 407,col 9)-(line 410,col 9)",
        "(line 411,col 9)-(line 411,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.findBin(double)",
      "begin_line": 420,
      "end_line": 424,
      "comment": "\n     * Returns the index of the bin to which the given value belongs\n     *\n     * @param value  the value whose bin we are trying to find\n     * @return the index of the bin containing the value\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 423,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.getNextValue()",
      "begin_line": 432,
      "end_line": 456,
      "comment": "\n     * Generates a random value from this distribution.\n     *\n     * @return the random value.\n     * @throws IllegalStateException if the distribution has not been loaded\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 436,col 9)",
        "(line 439,col 9)-(line 439,col 47)",
        "(line 442,col 9)-(line 454,col 9)",
        "(line 455,col 9)-(line 455,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.getSampleStats()",
      "begin_line": 466,
      "end_line": 468,
      "comment": "\n     * Returns a {@link StatisticalSummary} describing this distribution.\n     * \u003cstrong\u003ePreconditions:\u003c/strong\u003e\u003cul\u003e\n     * \u003cli\u003ethe distribution must be loaded before invoking this method\u003c/li\u003e\u003c/ul\u003e\n     *\n     * @return the sample statistics\n     * @throws IllegalStateException if the distribution has not been loaded\n     ",
      "child_ranges": [
        "(line 467,col 9)-(line 467,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.getBinCount()",
      "begin_line": 475,
      "end_line": 477,
      "comment": "\n     * Returns the number of bins.\n     *\n     * @return the number of bins.\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.getBinStats()",
      "begin_line": 486,
      "end_line": 488,
      "comment": "\n     * Returns a List of {@link SummaryStatistics} instances containing\n     * statistics describing the values in each of the bins.  The list is\n     * indexed on the bin number.\n     *\n     * @return List of bin statistics.\n     ",
      "child_ranges": [
        "(line 487,col 9)-(line 487,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.getUpperBounds()",
      "begin_line": 503,
      "end_line": 511,
      "comment": "\n     * \u003cp\u003eReturns a fresh copy of the array of upper bounds for the bins.\n     * Bins are: \u003cbr/\u003e\n     * [min,upperBounds[0]],(upperBounds[0],upperBounds[1]],...,\n     *  (upperBounds[binCount-2], upperBounds[binCount-1] \u003d max].\u003c/p\u003e\n     *\n     * \u003cp\u003eNote: In versions 1.0-2.0 of commons-math, this method\n     * incorrectly returned the array of probability generator upper\n     * bounds now returned by {@link #getGeneratorUpperBounds()}.\u003c/p\u003e\n     *\n     * @return array of bin upper bounds\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 55)",
        "(line 505,col 9)-(line 505,col 40)",
        "(line 506,col 9)-(line 508,col 9)",
        "(line 509,col 9)-(line 509,col 43)",
        "(line 510,col 9)-(line 510,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.getGeneratorUpperBounds()",
      "begin_line": 524,
      "end_line": 529,
      "comment": "\n     * \u003cp\u003eReturns a fresh copy of the array of upper bounds of the subintervals\n     * of [0,1] used in generating data from the empirical distribution.\n     * Subintervals correspond to bins with lengths proportional to bin counts.\u003c/p\u003e\n     *\n     * \u003cp\u003eIn versions 1.0-2.0 of commons-math, this array was (incorrectly) returned\n     * by {@link #getUpperBounds()}.\u003c/p\u003e\n     *\n     * @since 2.1\n     * @return array of upper bounds of subintervals used in data generation\n     ",
      "child_ranges": [
        "(line 525,col 9)-(line 525,col 37)",
        "(line 526,col 9)-(line 526,col 39)",
        "(line 527,col 9)-(line 527,col 54)",
        "(line 528,col 9)-(line 528,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.isLoaded()",
      "begin_line": 536,
      "end_line": 538,
      "comment": "\n     * Property indicating whether or not the distribution has been loaded.\n     *\n     * @return true if the distribution has been loaded\n     ",
      "child_ranges": [
        "(line 537,col 9)-(line 537,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.reSeed(long)",
      "begin_line": 546,
      "end_line": 548,
      "comment": "\n     * Reseeds the random number generator used by {@link #getNextValue()}.\n     *\n     * @param seed random generator seed\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 547,col 9)-(line 547,col 32)"
      ]
    }
  ]
}