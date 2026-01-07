{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/random/EmpiricalDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EmpiricalDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractRealDistribution"
      ],
      "begin_line": 102,
      "end_line": 850,
      "comment": "\n * \u003cp\u003eRepresents an \u003ca href\u003d\"http://http://en.wikipedia.org/wiki/Empirical_distribution_function\"\u003e\n * empirical probability distribution\u003c/a\u003e -- a probability distribution derived\n * from observed data without making any assumptions about the functional form\n * of the population distribution that the data come from.\u003c/p\u003e\n *\n * \u003cp\u003eAn \u003ccode\u003eEmpiricalDistribution\u003c/code\u003e maintains data structures, called\n * \u003ci\u003edistribution digests\u003c/i\u003e, that describe empirical distributions and\n * support the following operations: \u003cul\u003e\n * \u003cli\u003eloading the distribution from a file of observed data values\u003c/li\u003e\n * \u003cli\u003edividing the input data into \"bin ranges\" and reporting bin frequency\n *     counts (data for histogram)\u003c/li\u003e\n * \u003cli\u003ereporting univariate statistics describing the full set of data values\n *     as well as the observations within each bin\u003c/li\u003e\n * \u003cli\u003egenerating random values from the distribution\u003c/li\u003e\n * \u003c/ul\u003e\n * Applications can use \u003ccode\u003eEmpiricalDistribution\u003c/code\u003e to build grouped\n * frequency histograms representing the input data or to generate random values\n * \"like\" those in the input file -- i.e., the values generated will follow the\n * distribution of the values in the file.\u003c/p\u003e\n *\n * \u003cp\u003eThe implementation uses what amounts to the\n * \u003ca href\u003d\"http://nedwww.ipac.caltech.edu/level5/March02/Silverman/Silver2_6.html\"\u003e\n * Variable Kernel Method\u003c/a\u003e with Gaussian smoothing:\u003cp\u003e\n * \u003cstrong\u003eDigesting the input file\u003c/strong\u003e\n * \u003col\u003e\u003cli\u003ePass the file once to compute min and max.\u003c/li\u003e\n * \u003cli\u003eDivide the range from min-max into \u003ccode\u003ebinCount\u003c/code\u003e \"bins.\"\u003c/li\u003e\n * \u003cli\u003ePass the data file again, computing bin counts and univariate\n *     statistics (mean, std dev.) for each of the bins \u003c/li\u003e\n * \u003cli\u003eDivide the interval (0,1) into subintervals associated with the bins,\n *     with the length of a bin\u0027s subinterval proportional to its count.\u003c/li\u003e\u003c/ol\u003e\n * \u003cstrong\u003eGenerating random values from the distribution\u003c/strong\u003e\u003col\u003e\n * \u003cli\u003eGenerate a uniformly distributed value in (0,1) \u003c/li\u003e\n * \u003cli\u003eSelect the subinterval to which the value belongs.\n * \u003cli\u003eGenerate a random Gaussian value with mean \u003d mean of the associated\n *     bin and std dev \u003d std dev of associated bin.\u003c/li\u003e\u003c/ol\u003e\u003c/p\u003e\n *\n * \u003cp\u003eEmpiricalDistribution implements the {@link RealDistribution} interface\n * as follows.  Given x within the range of values in the dataset, let B\n * be the bin containing x and let K be the within-bin kernel for B.  Let P(B-)\n * be the sum of the probabilities of the bins below B and let K(B) be the\n * mass of B under K (i.e., the integral of the kernel density over B).  Then\n * set P(X \u003c x) \u003d P(B-) + P(B) * K(x) / K(B) where K(x) is the kernel distribution\n * evaluated at x. This results in a cdf that matches the grouped frequency\n * distribution at the bin endpoints and interpolates within bins using\n * within-bin kernels.\u003c/p\u003e\n *\n *\u003cstrong\u003eUSAGE NOTES:\u003c/strong\u003e\u003cul\u003e\n *\u003cli\u003eThe \u003ccode\u003ebinCount\u003c/code\u003e is set by default to 1000.  A good rule of thumb\n *    is to set the bin count to approximately the length of the input file divided\n *    by 10. \u003c/li\u003e\n *\u003cli\u003eThe input file \u003ci\u003emust\u003c/i\u003e be a plain text file containing one valid numeric\n *    entry per line.\u003c/li\u003e\n * \u003c/ul\u003e\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BIN_COUNT"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " Default bin count "
    },
    {
      "type": "field",
      "varNames": [
        "FILE_CHARSET"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " Character set for file input "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "randomData"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " RandomDataGenerator instance to use in repeated calls to getNext() "
    },
    {
      "type": "field",
      "varNames": [
        "binStats"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " List of SummaryStatistics objects characterizing the bins "
    },
    {
      "type": "field",
      "varNames": [
        "sampleStats"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": " Sample statistics "
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": " Max loaded value "
    },
    {
      "type": "field",
      "varNames": [
        "min"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " Min loaded value "
    },
    {
      "type": "field",
      "varNames": [
        "delta"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": " Grid size "
    },
    {
      "type": "field",
      "varNames": [
        "binCount"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": " number of bins "
    },
    {
      "type": "field",
      "varNames": [
        "loaded"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": " is the distribution loaded? "
    },
    {
      "type": "field",
      "varNames": [
        "upperBounds"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": " upper bounds of subintervals in (0,1) \"belonging\" to the bins "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.EmpiricalDistribution()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\n     * Creates a new EmpiricalDistribution with the default bin count.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.EmpiricalDistribution(int)",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * Creates a new EmpiricalDistribution with the specified bin count.\n     *\n     * @param binCount number of bins\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.EmpiricalDistribution(int, org.apache.commons.math3.random.RandomGenerator)",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\n     * Creates a new EmpiricalDistribution with the specified bin count using the\n     * provided {@link RandomGenerator} as the source of random data.\n     *\n     * @param binCount number of bins\n     * @param generator random data generator (may be null, resulting in default JDK generator)\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.EmpiricalDistribution(org.apache.commons.math3.random.RandomGenerator)",
      "begin_line": 175,
      "end_line": 177,
      "comment": "\n     * Creates a new EmpiricalDistribution with default bin count using the\n     * provided {@link RandomGenerator} as the source of random data.\n     *\n     * @param generator random data generator (may be null, resulting in default JDK generator)\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.EmpiricalDistribution(int, org.apache.commons.math3.random.RandomDataImpl)",
      "begin_line": 188,
      "end_line": 191,
      "comment": "\n     * Creates a new EmpiricalDistribution with the specified bin count using the\n     * provided {@link RandomDataImpl} instance as the source of random data.\n     *\n     * @param binCount number of bins\n     * @param randomData random data generator (may be null, resulting in default JDK generator)\n     * @since 3.0\n     * @deprecated As of 3.1. Please use {@link #EmpiricalDistribution(int,RandomGenerator)} instead.\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.EmpiricalDistribution(org.apache.commons.math3.random.RandomDataImpl)",
      "begin_line": 201,
      "end_line": 204,
      "comment": "\n     * Creates a new EmpiricalDistribution with default bin count using the\n     * provided {@link RandomDataImpl} as the source of random data.\n     *\n     * @param randomData random data generator (may be null, resulting in default JDK generator)\n     * @since 3.0\n     * @deprecated As of 3.1. Please use {@link #EmpiricalDistribution(RandomGenerator)} instead.\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.EmpiricalDistribution(int, org.apache.commons.math3.random.RandomDataGenerator)",
      "begin_line": 213,
      "end_line": 219,
      "comment": "\n     * Private constructor to allow lazy initialisation of the RNG contained\n     * in the {@link #randomData} instance variable.\n     *\n     * @param binCount number of bins\n     * @param randomData Random data generator.\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 20)",
        "(line 216,col 9)-(line 216,col 33)",
        "(line 217,col 9)-(line 217,col 37)",
        "(line 218,col 9)-(line 218,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.load(double[])",
      "begin_line": 228,
      "end_line": 240,
      "comment": "\n     * Computes the empirical distribution from the provided\n     * array of numbers.\n     *\n     * @param in the input data array\n     * @exception NullArgumentException if in is null\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 50)",
        "(line 230,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 238,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.load(java.net.URL)",
      "begin_line": 254,
      "end_line": 276,
      "comment": "\n     * Computes the empirical distribution using data read from a URL.\n     *\n     * \u003cp\u003eThe input file \u003ci\u003emust\u003c/i\u003e be an ASCII text file containing one\n     * valid numeric entry per line.\u003c/p\u003e\n     *\n     * @param url url of the input file\n     *\n     * @throws IOException if an IO error occurs\n     * @throws NullArgumentException if url is null\n     * @throws ZeroException if URL contains no data\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 36)",
        "(line 256,col 9)-(line 256,col 56)",
        "(line 257,col 9)-(line 258,col 81)",
        "(line 259,col 9)-(line 275,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.load(java.io.File)",
      "begin_line": 288,
      "end_line": 308,
      "comment": "\n     * Computes the empirical distribution from the input file.\n     *\n     * \u003cp\u003eThe input file \u003ci\u003emust\u003c/i\u003e be an ASCII text file containing one\n     * valid numeric entry per line.\u003c/p\u003e\n     *\n     * @param file the input file\n     * @throws IOException if an IO error occurs\n     * @throws NullArgumentException if file is null\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 37)",
        "(line 290,col 9)-(line 290,col 56)",
        "(line 291,col 9)-(line 291,col 51)",
        "(line 292,col 9)-(line 292,col 83)",
        "(line 293,col 9)-(line 307,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DataAdapter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 314,
      "end_line": 330,
      "comment": "\n     * Provides methods for computing \u003ccode\u003esampleStats\u003c/code\u003e and\n     * \u003ccode\u003ebeanStats\u003c/code\u003e abstracting the source of data.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.DataAdapter.computeBinStats()",
      "begin_line": 321,
      "end_line": 321,
      "comment": "\n         * Compute bin stats.\n         *\n         * @throws IOException  if an error occurs computing bin stats\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.DataAdapter.computeStats()",
      "begin_line": 328,
      "end_line": 328,
      "comment": "\n         * Compute sample statistics.\n         *\n         * @throws IOException if an error occurs computing sample stats\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "StreamDataAdapter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.random.EmpiricalDistribution.DataAdapter"
      ],
      "begin_line": 335,
      "end_line": 378,
      "comment": "\n     * \u003ccode\u003eDataAdapter\u003c/code\u003e for data provided through some input stream\n     "
    },
    {
      "type": "field",
      "varNames": [
        "inputStream"
      ],
      "begin_line": 338,
      "end_line": 338,
      "comment": " Input stream providing access to the data "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.StreamDataAdapter.StreamDataAdapter(java.io.BufferedReader)",
      "begin_line": 345,
      "end_line": 348,
      "comment": "\n         * Create a StreamDataAdapter from a BufferedReader\n         *\n         * @param in BufferedReader input stream\n         ",
      "child_ranges": [
        "(line 346,col 13)-(line 346,col 20)",
        "(line 347,col 13)-(line 347,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.StreamDataAdapter.computeBinStats()",
      "begin_line": 351,
      "end_line": 363,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 353,col 13)-(line 353,col 30)",
        "(line 354,col 13)-(line 354,col 30)",
        "(line 355,col 13)-(line 359,col 13)",
        "(line 361,col 13)-(line 361,col 32)",
        "(line 362,col 13)-(line 362,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.StreamDataAdapter.computeStats()",
      "begin_line": 366,
      "end_line": 377,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 368,col 13)-(line 368,col 30)",
        "(line 369,col 13)-(line 369,col 29)",
        "(line 370,col 13)-(line 370,col 50)",
        "(line 371,col 13)-(line 374,col 13)",
        "(line 375,col 13)-(line 375,col 32)",
        "(line 376,col 13)-(line 376,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ArrayDataAdapter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.random.EmpiricalDistribution.DataAdapter"
      ],
      "begin_line": 383,
      "end_line": 418,
      "comment": "\n     * \u003ccode\u003eDataAdapter\u003c/code\u003e for data provided as array of doubles.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "inputArray"
      ],
      "begin_line": 386,
      "end_line": 386,
      "comment": " Array of input  data values "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.ArrayDataAdapter.ArrayDataAdapter(double[])",
      "begin_line": 394,
      "end_line": 398,
      "comment": "\n         * Construct an ArrayDataAdapter from a double[] array\n         *\n         * @param in double[] array holding the data\n         * @throws NullArgumentException if in is null\n         ",
      "child_ranges": [
        "(line 395,col 13)-(line 395,col 20)",
        "(line 396,col 13)-(line 396,col 39)",
        "(line 397,col 13)-(line 397,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.ArrayDataAdapter.computeStats()",
      "begin_line": 401,
      "end_line": 407,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 403,col 13)-(line 403,col 50)",
        "(line 404,col 13)-(line 406,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.ArrayDataAdapter.computeBinStats()",
      "begin_line": 410,
      "end_line": 417,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 412,col 13)-(line 416,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.fillBinStats(org.apache.commons.math3.random.EmpiricalDistribution.DataAdapter)",
      "begin_line": 426,
      "end_line": 454,
      "comment": "\n     * Fills binStats array (second pass through data file).\n     *\n     * @param da object providing access to the data\n     * @throws IOException  if an IO error occurs\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 35)",
        "(line 430,col 9)-(line 430,col 35)",
        "(line 431,col 9)-(line 431,col 69)",
        "(line 434,col 9)-(line 436,col 9)",
        "(line 437,col 9)-(line 440,col 9)",
        "(line 443,col 9)-(line 443,col 29)",
        "(line 446,col 9)-(line 446,col 43)",
        "(line 447,col 9)-(line 448,col 72)",
        "(line 449,col 9)-(line 452,col 9)",
        "(line 453,col 9)-(line 453,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.findBin(double)",
      "begin_line": 462,
      "end_line": 466,
      "comment": "\n     * Returns the index of the bin to which the given value belongs\n     *\n     * @param value  the value whose bin we are trying to find\n     * @return the index of the bin containing the value\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 465,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.getNextValue()",
      "begin_line": 475,
      "end_line": 498,
      "comment": "\n     * Generates a random value from this distribution.\n     * \u003cstrong\u003ePreconditions:\u003c/strong\u003e\u003cul\u003e\n     * \u003cli\u003ethe distribution must be loaded before invoking this method\u003c/li\u003e\u003c/ul\u003e\n     * @return the random value.\n     * @throws MathIllegalStateException if the distribution has not been loaded\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 479,col 9)",
        "(line 482,col 9)-(line 482,col 53)",
        "(line 485,col 9)-(line 496,col 9)",
        "(line 497,col 9)-(line 497,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.getSampleStats()",
      "begin_line": 508,
      "end_line": 510,
      "comment": "\n     * Returns a {@link StatisticalSummary} describing this distribution.\n     * \u003cstrong\u003ePreconditions:\u003c/strong\u003e\u003cul\u003e\n     * \u003cli\u003ethe distribution must be loaded before invoking this method\u003c/li\u003e\u003c/ul\u003e\n     *\n     * @return the sample statistics\n     * @throws IllegalStateException if the distribution has not been loaded\n     ",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.getBinCount()",
      "begin_line": 517,
      "end_line": 519,
      "comment": "\n     * Returns the number of bins.\n     *\n     * @return the number of bins.\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.getBinStats()",
      "begin_line": 528,
      "end_line": 530,
      "comment": "\n     * Returns a List of {@link SummaryStatistics} instances containing\n     * statistics describing the values in each of the bins.  The list is\n     * indexed on the bin number.\n     *\n     * @return List of bin statistics.\n     ",
      "child_ranges": [
        "(line 529,col 9)-(line 529,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.getUpperBounds()",
      "begin_line": 545,
      "end_line": 552,
      "comment": "\n     * \u003cp\u003eReturns a fresh copy of the array of upper bounds for the bins.\n     * Bins are: \u003cbr/\u003e\n     * [min,upperBounds[0]],(upperBounds[0],upperBounds[1]],...,\n     *  (upperBounds[binCount-2], upperBounds[binCount-1] \u003d max].\u003c/p\u003e\n     *\n     * \u003cp\u003eNote: In versions 1.0-2.0 of commons-math, this method\n     * incorrectly returned the array of probability generator upper\n     * bounds now returned by {@link #getGeneratorUpperBounds()}.\u003c/p\u003e\n     *\n     * @return array of bin upper bounds\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 546,col 9)-(line 546,col 55)",
        "(line 547,col 9)-(line 549,col 9)",
        "(line 550,col 9)-(line 550,col 43)",
        "(line 551,col 9)-(line 551,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.getGeneratorUpperBounds()",
      "begin_line": 565,
      "end_line": 570,
      "comment": "\n     * \u003cp\u003eReturns a fresh copy of the array of upper bounds of the subintervals\n     * of [0,1] used in generating data from the empirical distribution.\n     * Subintervals correspond to bins with lengths proportional to bin counts.\u003c/p\u003e\n     *\n     * \u003cp\u003eIn versions 1.0-2.0 of commons-math, this array was (incorrectly) returned\n     * by {@link #getUpperBounds()}.\u003c/p\u003e\n     *\n     * @since 2.1\n     * @return array of upper bounds of subintervals used in data generation\n     ",
      "child_ranges": [
        "(line 566,col 9)-(line 566,col 37)",
        "(line 567,col 9)-(line 567,col 39)",
        "(line 568,col 9)-(line 568,col 54)",
        "(line 569,col 9)-(line 569,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.isLoaded()",
      "begin_line": 577,
      "end_line": 579,
      "comment": "\n     * Property indicating whether or not the distribution has been loaded.\n     *\n     * @return true if the distribution has been loaded\n     ",
      "child_ranges": [
        "(line 578,col 9)-(line 578,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.reSeed(long)",
      "begin_line": 587,
      "end_line": 589,
      "comment": "\n     * Reseeds the random number generator used by {@link #getNextValue()}.\n     *\n     * @param seed random generator seed\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 588,col 9)-(line 588,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.probability(double)",
      "begin_line": 597,
      "end_line": 599,
      "comment": "\n     * {@inheritDoc}\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 598,col 9)-(line 598,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.density(double)",
      "begin_line": 615,
      "end_line": 622,
      "comment": "\n     * {@inheritDoc}\n     *\n     * \u003cp\u003eReturns the kernel density normalized so that its integral over each bin\n     * equals the bin mass.\u003c/p\u003e\n     *\n     * \u003cp\u003eAlgorithm description: \u003col\u003e\n     * \u003cli\u003eFind the bin B that x belongs to.\u003c/li\u003e\n     * \u003cli\u003eCompute K(B) \u003d the mass of B with respect to the within-bin kernel (i.e., the\n     * integral of the kernel density over B).\u003c/li\u003e\n     * \u003cli\u003eReturn k(x) * P(B) / K(B), where k is the within-bin kernel density\n     * and P(B) is the mass of B.\u003c/li\u003e\u003c/ol\u003e\u003c/p\u003e\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 616,col 9)-(line 618,col 9)",
        "(line 619,col 9)-(line 619,col 40)",
        "(line 620,col 9)-(line 620,col 74)",
        "(line 621,col 9)-(line 621,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.cumulativeProbability(double)",
      "begin_line": 637,
      "end_line": 653,
      "comment": "\n     * {@inheritDoc}\n     *\n     * \u003cp\u003eAlgorithm description:\u003col\u003e\n     * \u003cli\u003eFind the bin B that x belongs to.\u003c/li\u003e\n     * \u003cli\u003eCompute P(B) \u003d the mass of B and P(B-) \u003d the combined mass of the bins below B.\u003c/li\u003e\n     * \u003cli\u003eCompute K(B) \u003d the probability mass of B with respect to the within-bin kernel\n     * and K(B-) \u003d the kernel distribution evaluated at the lower endpoint of B\u003c/li\u003e\n     * \u003cli\u003eReturn P(B-) + P(B) * [K(x) - K(B-)] / K(B) where\n     * K(x) is the within-bin kernel distribution function evaluated at x.\u003c/li\u003e\u003c/ol\u003e\u003c/p\u003e\n     *\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 638,col 9)-(line 642,col 9)",
        "(line 643,col 9)-(line 643,col 40)",
        "(line 644,col 9)-(line 644,col 49)",
        "(line 645,col 9)-(line 645,col 39)",
        "(line 646,col 9)-(line 646,col 52)",
        "(line 647,col 9)-(line 647,col 39)",
        "(line 648,col 9)-(line 648,col 75)",
        "(line 649,col 9)-(line 649,col 45)",
        "(line 650,col 9)-(line 651,col 90)",
        "(line 652,col 9)-(line 652,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.inverseCumulativeProbability(double)",
      "begin_line": 675,
      "end_line": 705,
      "comment": "\n     * {@inheritDoc}\n     *\n     * \u003cp\u003eAlgorithm description:\u003col\u003e\n     * \u003cli\u003eFind the smallest i such that the sum of the masses of the bins\n     *  through i is at least p.\u003c/li\u003e\n     * \u003cli\u003e\n     *   Let K be the within-bin kernel distribution for bin i.\u003c/br\u003e\n     *   Let K(B) be the mass of B under K. \u003cbr/\u003e\n     *   Let K(B-) be K evaluated at the lower endpoint of B (the combined\n     *   mass of the bins below B under K).\u003cbr/\u003e\n     *   Let P(B) be the probability of bin i.\u003cbr/\u003e\n     *   Let P(B-) be the sum of the bin masses below bin i. \u003cbr/\u003e\n     *   Let pCrit \u003d p - P(B-)\u003cbr/\u003e\n     * \u003cli\u003eReturn the inverse of K evaluated at \u003cbr/\u003e\n     *    K(B-) + pCrit * K(B) / P(B) \u003c/li\u003e\n     *  \u003c/ol\u003e\u003c/p\u003e\n     *\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 676,col 9)-(line 678,col 9)",
        "(line 680,col 9)-(line 682,col 9)",
        "(line 684,col 9)-(line 686,col 9)",
        "(line 688,col 9)-(line 688,col 18)",
        "(line 689,col 9)-(line 691,col 9)",
        "(line 693,col 9)-(line 693,col 67)",
        "(line 694,col 9)-(line 694,col 32)",
        "(line 695,col 9)-(line 695,col 52)",
        "(line 696,col 9)-(line 696,col 61)",
        "(line 697,col 9)-(line 697,col 67)",
        "(line 698,col 9)-(line 698,col 32)",
        "(line 699,col 9)-(line 699,col 42)",
        "(line 700,col 9)-(line 700,col 41)",
        "(line 701,col 9)-(line 703,col 9)",
        "(line 704,col 9)-(line 704,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.getNumericalMean()",
      "begin_line": 711,
      "end_line": 713,
      "comment": "\n     * {@inheritDoc}\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 712,col 8)-(line 712,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.getNumericalVariance()",
      "begin_line": 719,
      "end_line": 721,
      "comment": "\n     * {@inheritDoc}\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 720,col 9)-(line 720,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.getSupportLowerBound()",
      "begin_line": 727,
      "end_line": 729,
      "comment": "\n     * {@inheritDoc}\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 728,col 8)-(line 728,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.getSupportUpperBound()",
      "begin_line": 735,
      "end_line": 737,
      "comment": "\n     * {@inheritDoc}\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 736,col 9)-(line 736,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 743,
      "end_line": 745,
      "comment": "\n     * {@inheritDoc}\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 744,col 9)-(line 744,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 751,
      "end_line": 753,
      "comment": "\n     * {@inheritDoc}\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 752,col 9)-(line 752,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.isSupportConnected()",
      "begin_line": 759,
      "end_line": 761,
      "comment": "\n     * {@inheritDoc}\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 760,col 9)-(line 760,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.sample()",
      "begin_line": 767,
      "end_line": 770,
      "comment": "\n     * {@inheritDoc}\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 769,col 9)-(line 769,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.reseedRandomGenerator(long)",
      "begin_line": 776,
      "end_line": 779,
      "comment": "\n     * {@inheritDoc}\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 778,col 9)-(line 778,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.pB(int)",
      "begin_line": 787,
      "end_line": 790,
      "comment": "\n     * The probability of bin i.\n     *\n     * @param i the index of the bin\n     * @return the probability that selection begins in bin i\n     ",
      "child_ranges": [
        "(line 788,col 9)-(line 789,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.pBminus(int)",
      "begin_line": 798,
      "end_line": 800,
      "comment": "\n     * The combined probability of the bins up to but not including bin i.\n     *\n     * @param i the index of the bin\n     * @return the probability that selection begins in a bin below bin i.\n     ",
      "child_ranges": [
        "(line 799,col 9)-(line 799,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.kB(int)",
      "begin_line": 809,
      "end_line": 815,
      "comment": "\n     * Mass of bin i under the within-bin kernel of the bin.\n     *\n     * @param i index of the bin\n     * @return the difference in the within-bin kernel cdf between the\n     * upper and lower endpoints of bin i\n     ",
      "child_ranges": [
        "(line 811,col 9)-(line 811,col 52)",
        "(line 812,col 9)-(line 812,col 67)",
        "(line 813,col 9)-(line 814,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.k(double)",
      "begin_line": 823,
      "end_line": 826,
      "comment": "\n     * The within-bin kernel of the bin that x belongs to.\n     *\n     * @param x the value to locate within a bin\n     * @return the within-bin kernel of the bin containing x\n     ",
      "child_ranges": [
        "(line 824,col 9)-(line 824,col 40)",
        "(line 825,col 9)-(line 825,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.cumBinP(int)",
      "begin_line": 834,
      "end_line": 836,
      "comment": "\n     * The combined probability of the bins up to and including binIndex.\n     *\n     * @param binIndex maximum bin index\n     * @return sum of the probabilities of bins through binIndex\n     ",
      "child_ranges": [
        "(line 835,col 9)-(line 835,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.getKernel(org.apache.commons.math3.stat.descriptive.SummaryStatistics)",
      "begin_line": 844,
      "end_line": 849,
      "comment": "\n     * The within-bin smoothing kernel.\n     *\n     * @param bStats summary statistics for the bin\n     * @return within-bin kernel parameterized by bStats\n     ",
      "child_ranges": [
        "(line 846,col 9)-(line 848,col 70)"
      ]
    }
  ]
}