{
  "filepath": "/tmp/Math-15b/src/main/java/org/apache/commons/math3/random/EmpiricalDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EmpiricalDistribution",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 85,
      "end_line": 560,
      "comment": "\n * Represents an \u003ca href\u003d\"http://http://en.wikipedia.org/wiki/Empirical_distribution_function\"\u003e\n * empirical probability distribution\u003c/a\u003e -- a probability distribution derived\n * from observed data without making any assumptions about the functional form\n * of the population distribution that the data come from.\u003cp\u003e\n * An \u003ccode\u003eEmpiricalDistribution\u003c/code\u003e maintains data structures, called\n * \u003ci\u003edistribution digests\u003c/i\u003e, that describe empirical distributions and\n * support the following operations: \u003cul\u003e\n * \u003cli\u003eloading the distribution from a file of observed data values\u003c/li\u003e\n * \u003cli\u003edividing the input data into \"bin ranges\" and reporting bin frequency\n *     counts (data for histogram)\u003c/li\u003e\n * \u003cli\u003ereporting univariate statistics describing the full set of data values\n *     as well as the observations within each bin\u003c/li\u003e\n * \u003cli\u003egenerating random values from the distribution\u003c/li\u003e\n * \u003c/ul\u003e\n * Applications can use \u003ccode\u003eEmpiricalDistribution\u003c/code\u003e to build grouped\n * frequency histograms representing the input data or to generate random values\n * \"like\" those in the input file -- i.e., the values generated will follow the\n * distribution of the values in the file.\u003c/p\u003e\n * \u003cp\u003eThe implementation uses what amounts to the\n * \u003ca href\u003d\"http://nedwww.ipac.caltech.edu/level5/March02/Silverman/Silver2_6.html\"\u003e\n * Variable Kernel Method\u003c/a\u003e with Gaussian smoothing:\u003cp\u003e\n * \u003cstrong\u003eDigesting the input file\u003c/strong\u003e\n * \u003col\u003e\u003cli\u003ePass the file once to compute min and max.\u003c/li\u003e\n * \u003cli\u003eDivide the range from min-max into \u003ccode\u003ebinCount\u003c/code\u003e \"bins.\"\u003c/li\u003e\n * \u003cli\u003ePass the data file again, computing bin counts and univariate\n *     statistics (mean, std dev.) for each of the bins \u003c/li\u003e\n * \u003cli\u003eDivide the interval (0,1) into subintervals associated with the bins,\n *     with the length of a bin\u0027s subinterval proportional to its count.\u003c/li\u003e\u003c/ol\u003e\n * \u003cstrong\u003eGenerating random values from the distribution\u003c/strong\u003e\u003col\u003e\n * \u003cli\u003eGenerate a uniformly distributed value in (0,1) \u003c/li\u003e\n * \u003cli\u003eSelect the subinterval to which the value belongs.\n * \u003cli\u003eGenerate a random Gaussian value with mean \u003d mean of the associated\n *     bin and std dev \u003d std dev of associated bin.\u003c/li\u003e\u003c/ol\u003e\u003c/p\u003e\u003cp\u003e\n *\u003cstrong\u003eUSAGE NOTES:\u003c/strong\u003e\u003cul\u003e\n *\u003cli\u003eThe \u003ccode\u003ebinCount\u003c/code\u003e is set by default to 1000.  A good rule of thumb\n *    is to set the bin count to approximately the length of the input file divided\n *    by 10. \u003c/li\u003e\n *\u003cli\u003eThe input file \u003ci\u003emust\u003c/i\u003e be a plain text file containing one valid numeric\n *    entry per line.\u003c/li\u003e\n * \u003c/ul\u003e\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BIN_COUNT"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Default bin count "
    },
    {
      "type": "field",
      "varNames": [
        "FILE_CHARSET"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " Character set for file input "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "binStats"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " List of SummaryStatistics objects characterizing the bins "
    },
    {
      "type": "field",
      "varNames": [
        "sampleStats"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " Sample statistics "
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " Max loaded value "
    },
    {
      "type": "field",
      "varNames": [
        "min"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " Min loaded value "
    },
    {
      "type": "field",
      "varNames": [
        "delta"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " Grid size "
    },
    {
      "type": "field",
      "varNames": [
        "binCount"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " number of bins "
    },
    {
      "type": "field",
      "varNames": [
        "loaded"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " is the distribution loaded? "
    },
    {
      "type": "field",
      "varNames": [
        "upperBounds"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " upper bounds of subintervals in (0,1) \"belonging\" to the bins "
    },
    {
      "type": "field",
      "varNames": [
        "randomData"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " RandomDataImpl instance to use in repeated calls to getNext() "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.EmpiricalDistribution()",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\n     * Creates a new EmpiricalDistribution with the default bin count.\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.EmpiricalDistribution(int)",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * Creates a new EmpiricalDistribution with the specified bin count.\n     *\n     * @param binCount number of bins\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.EmpiricalDistribution(int, org.apache.commons.math3.random.RandomGenerator)",
      "begin_line": 147,
      "end_line": 151,
      "comment": "\n     * Creates a new EmpiricalDistribution with the specified bin count using the\n     * provided {@link RandomGenerator} as the source of random data.\n     *\n     * @param binCount number of bins\n     * @param generator random data generator (may be null, resulting in default JDK generator)\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 33)",
        "(line 149,col 9)-(line 149,col 51)",
        "(line 150,col 9)-(line 150,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.EmpiricalDistribution(org.apache.commons.math3.random.RandomGenerator)",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     * Creates a new EmpiricalDistribution with default bin count using the\n     * provided {@link RandomGenerator} as the source of random data.\n     *\n     * @param generator random data generator (may be null, resulting in default JDK generator)\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.EmpiricalDistribution(int, org.apache.commons.math3.random.RandomDataImpl)",
      "begin_line": 172,
      "end_line": 176,
      "comment": "\n     * Creates a new EmpiricalDistribution with the specified bin count using the\n     * provided {@link RandomDataImpl} instance as the source of random data.\n     *\n     * @param binCount number of bins\n     * @param randomData random data generator (may be null, resulting in default JDK generator)\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 33)",
        "(line 174,col 9)-(line 174,col 37)",
        "(line 175,col 9)-(line 175,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.EmpiricalDistribution(org.apache.commons.math3.random.RandomDataImpl)",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\n     * Creates a new EmpiricalDistribution with default bin count using the\n     * provided {@link RandomDataImpl} as the source of random data.\n     *\n     * @param randomData random data generator (may be null, resulting in default JDK generator)\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.load(double[])",
      "begin_line": 197,
      "end_line": 208,
      "comment": "\n     * Computes the empirical distribution from the provided\n     * array of numbers.\n     *\n     * @param in the input data array\n     * @exception NullArgumentException if in is null\n     * @throws MathIllegalStateException if an IOException occurs\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 50)",
        "(line 199,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 206,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.load(java.net.URL)",
      "begin_line": 222,
      "end_line": 244,
      "comment": "\n     * Computes the empirical distribution using data read from a URL.\n\n     * \u003cp\u003eThe input file \u003ci\u003emust\u003c/i\u003e be an ASCII text file containing one\n     * valid numeric entry per line.\u003c/p\u003e\n     *\n     * @param url  url of the input file\n     *\n     * @throws IOException if an IO error occurs\n     * @throws NullArgumentException if url is null\n     * @throws ZeroException if URL contains no data\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 36)",
        "(line 224,col 9)-(line 224,col 56)",
        "(line 225,col 9)-(line 226,col 81)",
        "(line 227,col 9)-(line 243,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.load(java.io.File)",
      "begin_line": 256,
      "end_line": 276,
      "comment": "\n     * Computes the empirical distribution from the input file.\n     *\n     * \u003cp\u003eThe input file \u003ci\u003emust\u003c/i\u003e be an ASCII text file containing one\n     * valid numeric entry per line.\u003c/p\u003e\n     *\n     * @param file the input file\n     * @throws IOException if an IO error occurs\n     * @throws NullArgumentException if file is null\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 37)",
        "(line 258,col 9)-(line 258,col 56)",
        "(line 259,col 9)-(line 259,col 51)",
        "(line 260,col 9)-(line 260,col 83)",
        "(line 261,col 9)-(line 275,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DataAdapter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 282,
      "end_line": 298,
      "comment": "\n     * Provides methods for computing \u003ccode\u003esampleStats\u003c/code\u003e and\n     * \u003ccode\u003ebeanStats\u003c/code\u003e abstracting the source of data.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.DataAdapter.computeBinStats()",
      "begin_line": 289,
      "end_line": 289,
      "comment": "\n         * Compute bin stats.\n         *\n         * @throws IOException  if an error occurs computing bin stats\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.DataAdapter.computeStats()",
      "begin_line": 296,
      "end_line": 296,
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
      "begin_line": 303,
      "end_line": 346,
      "comment": "\n     * \u003ccode\u003eDataAdapter\u003c/code\u003e for data provided through some input stream\n     "
    },
    {
      "type": "field",
      "varNames": [
        "inputStream"
      ],
      "begin_line": 306,
      "end_line": 306,
      "comment": " Input stream providing access to the data "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.StreamDataAdapter.StreamDataAdapter(java.io.BufferedReader)",
      "begin_line": 313,
      "end_line": 316,
      "comment": "\n         * Create a StreamDataAdapter from a BufferedReader\n         *\n         * @param in BufferedReader input stream\n         ",
      "child_ranges": [
        "(line 314,col 13)-(line 314,col 20)",
        "(line 315,col 13)-(line 315,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.StreamDataAdapter.computeBinStats()",
      "begin_line": 319,
      "end_line": 331,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 321,col 13)-(line 321,col 30)",
        "(line 322,col 13)-(line 322,col 30)",
        "(line 323,col 13)-(line 327,col 13)",
        "(line 329,col 13)-(line 329,col 32)",
        "(line 330,col 13)-(line 330,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.StreamDataAdapter.computeStats()",
      "begin_line": 334,
      "end_line": 345,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 336,col 13)-(line 336,col 30)",
        "(line 337,col 13)-(line 337,col 29)",
        "(line 338,col 13)-(line 338,col 50)",
        "(line 339,col 13)-(line 342,col 13)",
        "(line 343,col 13)-(line 343,col 32)",
        "(line 344,col 13)-(line 344,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ArrayDataAdapter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.random.EmpiricalDistribution.DataAdapter"
      ],
      "begin_line": 351,
      "end_line": 386,
      "comment": "\n     * \u003ccode\u003eDataAdapter\u003c/code\u003e for data provided as array of doubles.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "inputArray"
      ],
      "begin_line": 354,
      "end_line": 354,
      "comment": " Array of input  data values "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.ArrayDataAdapter.ArrayDataAdapter(double[])",
      "begin_line": 362,
      "end_line": 366,
      "comment": "\n         * Construct an ArrayDataAdapter from a double[] array\n         *\n         * @param in double[] array holding the data\n         * @throws NullArgumentException if in is null\n         ",
      "child_ranges": [
        "(line 363,col 13)-(line 363,col 20)",
        "(line 364,col 13)-(line 364,col 39)",
        "(line 365,col 13)-(line 365,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.ArrayDataAdapter.computeStats()",
      "begin_line": 369,
      "end_line": 375,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 371,col 13)-(line 371,col 50)",
        "(line 372,col 13)-(line 374,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.ArrayDataAdapter.computeBinStats()",
      "begin_line": 378,
      "end_line": 385,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 380,col 13)-(line 384,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.fillBinStats(org.apache.commons.math3.random.EmpiricalDistribution.DataAdapter)",
      "begin_line": 394,
      "end_line": 422,
      "comment": "\n     * Fills binStats array (second pass through data file).\n     *\n     * @param da object providing access to the data\n     * @throws IOException  if an IO error occurs\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 35)",
        "(line 398,col 9)-(line 398,col 35)",
        "(line 399,col 9)-(line 399,col 69)",
        "(line 402,col 9)-(line 404,col 9)",
        "(line 405,col 9)-(line 408,col 9)",
        "(line 411,col 9)-(line 411,col 29)",
        "(line 414,col 9)-(line 414,col 43)",
        "(line 415,col 9)-(line 416,col 72)",
        "(line 417,col 9)-(line 420,col 9)",
        "(line 421,col 9)-(line 421,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.findBin(double)",
      "begin_line": 430,
      "end_line": 434,
      "comment": "\n     * Returns the index of the bin to which the given value belongs\n     *\n     * @param value  the value whose bin we are trying to find\n     * @return the index of the bin containing the value\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 433,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.getNextValue()",
      "begin_line": 443,
      "end_line": 467,
      "comment": "\n     * Generates a random value from this distribution.\n     * \u003cstrong\u003ePreconditions:\u003c/strong\u003e\u003cul\u003e\n     * \u003cli\u003ethe distribution must be loaded before invoking this method\u003c/li\u003e\u003c/ul\u003e\n     * @return the random value.\n     * @throws MathIllegalStateException if the distribution has not been loaded\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 447,col 9)",
        "(line 450,col 9)-(line 450,col 53)",
        "(line 453,col 9)-(line 465,col 9)",
        "(line 466,col 9)-(line 466,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.getSampleStats()",
      "begin_line": 477,
      "end_line": 479,
      "comment": "\n     * Returns a {@link StatisticalSummary} describing this distribution.\n     * \u003cstrong\u003ePreconditions:\u003c/strong\u003e\u003cul\u003e\n     * \u003cli\u003ethe distribution must be loaded before invoking this method\u003c/li\u003e\u003c/ul\u003e\n     *\n     * @return the sample statistics\n     * @throws IllegalStateException if the distribution has not been loaded\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.getBinCount()",
      "begin_line": 486,
      "end_line": 488,
      "comment": "\n     * Returns the number of bins.\n     *\n     * @return the number of bins.\n     ",
      "child_ranges": [
        "(line 487,col 9)-(line 487,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.getBinStats()",
      "begin_line": 497,
      "end_line": 499,
      "comment": "\n     * Returns a List of {@link SummaryStatistics} instances containing\n     * statistics describing the values in each of the bins.  The list is\n     * indexed on the bin number.\n     *\n     * @return List of bin statistics.\n     ",
      "child_ranges": [
        "(line 498,col 9)-(line 498,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.getUpperBounds()",
      "begin_line": 514,
      "end_line": 522,
      "comment": "\n     * \u003cp\u003eReturns a fresh copy of the array of upper bounds for the bins.\n     * Bins are: \u003cbr/\u003e\n     * [min,upperBounds[0]],(upperBounds[0],upperBounds[1]],...,\n     *  (upperBounds[binCount-2], upperBounds[binCount-1] \u003d max].\u003c/p\u003e\n     *\n     * \u003cp\u003eNote: In versions 1.0-2.0 of commons-math, this method\n     * incorrectly returned the array of probability generator upper\n     * bounds now returned by {@link #getGeneratorUpperBounds()}.\u003c/p\u003e\n     *\n     * @return array of bin upper bounds\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 515,col 9)-(line 515,col 55)",
        "(line 516,col 9)-(line 516,col 40)",
        "(line 517,col 9)-(line 519,col 9)",
        "(line 520,col 9)-(line 520,col 43)",
        "(line 521,col 9)-(line 521,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.getGeneratorUpperBounds()",
      "begin_line": 535,
      "end_line": 540,
      "comment": "\n     * \u003cp\u003eReturns a fresh copy of the array of upper bounds of the subintervals\n     * of [0,1] used in generating data from the empirical distribution.\n     * Subintervals correspond to bins with lengths proportional to bin counts.\u003c/p\u003e\n     *\n     * \u003cp\u003eIn versions 1.0-2.0 of commons-math, this array was (incorrectly) returned\n     * by {@link #getUpperBounds()}.\u003c/p\u003e\n     *\n     * @since 2.1\n     * @return array of upper bounds of subintervals used in data generation\n     ",
      "child_ranges": [
        "(line 536,col 9)-(line 536,col 37)",
        "(line 537,col 9)-(line 537,col 39)",
        "(line 538,col 9)-(line 538,col 54)",
        "(line 539,col 9)-(line 539,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.isLoaded()",
      "begin_line": 547,
      "end_line": 549,
      "comment": "\n     * Property indicating whether or not the distribution has been loaded.\n     *\n     * @return true if the distribution has been loaded\n     ",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.reSeed(long)",
      "begin_line": 557,
      "end_line": 559,
      "comment": "\n     * Reseeds the random number generator used by {@link #getNextValue()}.\n     *\n     * @param seed random generator seed\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 558,col 9)-(line 558,col 32)"
      ]
    }
  ]
}