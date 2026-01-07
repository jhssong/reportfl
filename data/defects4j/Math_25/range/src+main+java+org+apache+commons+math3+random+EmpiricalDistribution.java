{
  "filepath": "/tmp/Math-25b/src/main/java/org/apache/commons/math3/random/EmpiricalDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EmpiricalDistribution",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 84,
      "end_line": 568,
      "comment": "\n * Represents an \u003ca href\u003d\"http://http://en.wikipedia.org/wiki/Empirical_distribution_function\"\u003e\n * empirical probability distribution\u003c/a\u003e -- a probability distribution derived\n * from observed data without making any assumptions about the functional form\n * of the population distribution that the data come from.\u003cp\u003e\n * An \u003ccode\u003eEmpiricalDistribution\u003c/code\u003e maintains data structures, called\n * \u003ci\u003edistribution digests\u003c/i\u003e, that describe empirical distributions and\n * support the following operations: \u003cul\u003e\n * \u003cli\u003eloading the distribution from a file of observed data values\u003c/li\u003e\n * \u003cli\u003edividing the input data into \"bin ranges\" and reporting bin frequency\n *     counts (data for histogram)\u003c/li\u003e\n * \u003cli\u003ereporting univariate statistics describing the full set of data values\n *     as well as the observations within each bin\u003c/li\u003e\n * \u003cli\u003egenerating random values from the distribution\u003c/li\u003e\n * \u003c/ul\u003e\n * Applications can use \u003ccode\u003eEmpiricalDistribution\u003c/code\u003e to build grouped\n * frequency histograms representing the input data or to generate random values\n * \"like\" those in the input file -- i.e., the values generated will follow the\n * distribution of the values in the file.\u003c/p\u003e\n * \u003cp\u003eThe implementation uses what amounts to the\n * \u003ca href\u003d\"http://nedwww.ipac.caltech.edu/level5/March02/Silverman/Silver2_6.html\"\u003e\n * Variable Kernel Method\u003c/a\u003e with Gaussian smoothing:\u003cp\u003e\n * \u003cstrong\u003eDigesting the input file\u003c/strong\u003e\n * \u003col\u003e\u003cli\u003ePass the file once to compute min and max.\u003c/li\u003e\n * \u003cli\u003eDivide the range from min-max into \u003ccode\u003ebinCount\u003c/code\u003e \"bins.\"\u003c/li\u003e\n * \u003cli\u003ePass the data file again, computing bin counts and univariate\n *     statistics (mean, std dev.) for each of the bins \u003c/li\u003e\n * \u003cli\u003eDivide the interval (0,1) into subintervals associated with the bins,\n *     with the length of a bin\u0027s subinterval proportional to its count.\u003c/li\u003e\u003c/ol\u003e\n * \u003cstrong\u003eGenerating random values from the distribution\u003c/strong\u003e\u003col\u003e\n * \u003cli\u003eGenerate a uniformly distributed value in (0,1) \u003c/li\u003e\n * \u003cli\u003eSelect the subinterval to which the value belongs.\n * \u003cli\u003eGenerate a random Gaussian value with mean \u003d mean of the associated\n *     bin and std dev \u003d std dev of associated bin.\u003c/li\u003e\u003c/ol\u003e\u003c/p\u003e\u003cp\u003e\n *\u003cstrong\u003eUSAGE NOTES:\u003c/strong\u003e\u003cul\u003e\n *\u003cli\u003eThe \u003ccode\u003ebinCount\u003c/code\u003e is set by default to 1000.  A good rule of thumb\n *    is to set the bin count to approximately the length of the input file divided\n *    by 10. \u003c/li\u003e\n *\u003cli\u003eThe input file \u003ci\u003emust\u003c/i\u003e be a plain text file containing one valid numeric\n *    entry per line.\u003c/li\u003e\n * \u003c/ul\u003e\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BIN_COUNT"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Default bin count "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "binStats"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " List of SummaryStatistics objects characterizing the bins "
    },
    {
      "type": "field",
      "varNames": [
        "sampleStats"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " Sample statistics "
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " Max loaded value "
    },
    {
      "type": "field",
      "varNames": [
        "min"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " Min loaded value "
    },
    {
      "type": "field",
      "varNames": [
        "delta"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " Grid size "
    },
    {
      "type": "field",
      "varNames": [
        "binCount"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " number of bins "
    },
    {
      "type": "field",
      "varNames": [
        "loaded"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " is the distribution loaded? "
    },
    {
      "type": "field",
      "varNames": [
        "upperBounds"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " upper bounds of subintervals in (0,1) \"belonging\" to the bins "
    },
    {
      "type": "field",
      "varNames": [
        "randomData"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " RandomDataImpl instance to use in repeated calls to getNext() "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.EmpiricalDistribution()",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * Creates a new EmpiricalDistribution with the default bin count.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.EmpiricalDistribution(int)",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n     * Creates a new EmpiricalDistribution with the specified bin count.\n     *\n     * @param binCount number of bins\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.EmpiricalDistribution(int, org.apache.commons.math3.random.RandomGenerator)",
      "begin_line": 143,
      "end_line": 147,
      "comment": "\n     * Creates a new EmpiricalDistribution with the specified bin count using the\n     * provided {@link RandomGenerator} as the source of random data.\n     *\n     * @param binCount number of bins\n     * @param generator random data generator (may be null, resulting in default JDK generator)\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 33)",
        "(line 145,col 9)-(line 145,col 51)",
        "(line 146,col 9)-(line 146,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.EmpiricalDistribution(org.apache.commons.math3.random.RandomGenerator)",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\n     * Creates a new EmpiricalDistribution with default bin count using the\n     * provided {@link RandomGenerator} as the source of random data.\n     *\n     * @param generator random data generator (may be null, resulting in default JDK generator)\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.EmpiricalDistribution(int, org.apache.commons.math3.random.RandomDataImpl)",
      "begin_line": 168,
      "end_line": 172,
      "comment": "\n     * Creates a new EmpiricalDistribution with the specified bin count using the\n     * provided {@link RandomDataImpl} instance as the source of random data.\n     *\n     * @param binCount number of bins\n     * @param randomData random data generator (may be null, resulting in default JDK generator)\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 33)",
        "(line 170,col 9)-(line 170,col 37)",
        "(line 171,col 9)-(line 171,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.EmpiricalDistribution(org.apache.commons.math3.random.RandomDataImpl)",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * Creates a new EmpiricalDistribution with default bin count using the\n     * provided {@link RandomDataImpl} as the source of random data.\n     *\n     * @param randomData random data generator (may be null, resulting in default JDK generator)\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.load(double[])",
      "begin_line": 192,
      "end_line": 202,
      "comment": "\n     * Computes the empirical distribution from the provided\n     * array of numbers.\n     *\n     * @param in the input data array\n     * @exception NullArgumentException if in is null\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 50)",
        "(line 194,col 9)-(line 199,col 9)",
        "(line 200,col 9)-(line 200,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.load(java.net.URL)",
      "begin_line": 211,
      "end_line": 231,
      "comment": "\n     * Computes the empirical distribution using data read from a URL.\n     * @param url  url of the input file\n     *\n     * @throws IOException if an IO error occurs\n     * @throws NullArgumentException if url is null\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 36)",
        "(line 213,col 9)-(line 214,col 72)",
        "(line 215,col 9)-(line 230,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.load(java.io.File)",
      "begin_line": 240,
      "end_line": 256,
      "comment": "\n     * Computes the empirical distribution from the input file.\n     *\n     * @param file the input file\n     * @throws IOException if an IO error occurs\n     * @throws NullArgumentException if file is null\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 37)",
        "(line 242,col 9)-(line 242,col 69)",
        "(line 243,col 9)-(line 255,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DataAdapter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 262,
      "end_line": 278,
      "comment": "\n     * Provides methods for computing \u003ccode\u003esampleStats\u003c/code\u003e and\n     * \u003ccode\u003ebeanStats\u003c/code\u003e abstracting the source of data.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.DataAdapter.computeBinStats()",
      "begin_line": 269,
      "end_line": 269,
      "comment": "\n         * Compute bin stats.\n         *\n         * @throws IOException  if an error occurs computing bin stats\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.DataAdapter.computeStats()",
      "begin_line": 276,
      "end_line": 276,
      "comment": "\n         * Compute sample statistics.\n         *\n         * @throws IOException if an error occurs computing sample stats\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "DataAdapterFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 285,
      "end_line": 306,
      "comment": "\n     * Factory of \u003ccode\u003eDataAdapter\u003c/code\u003e objects. For every supported source\n     * of data (array of doubles, file, etc.) an instance of the proper object\n     * is returned.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.DataAdapterFactory.getAdapter(java.lang.Object)",
      "begin_line": 292,
      "end_line": 305,
      "comment": "\n         * Creates a DataAdapter from a data object\n         *\n         * @param in object providing access to the data\n         * @return DataAdapter instance\n         ",
      "child_ranges": [
        "(line 293,col 13)-(line 304,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StreamDataAdapter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.random.EmpiricalDistribution.DataAdapter"
      ],
      "begin_line": 310,
      "end_line": 353,
      "comment": "\n     * \u003ccode\u003eDataAdapter\u003c/code\u003e for data provided through some input stream\n     "
    },
    {
      "type": "field",
      "varNames": [
        "inputStream"
      ],
      "begin_line": 313,
      "end_line": 313,
      "comment": " Input stream providing access to the data "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.StreamDataAdapter.StreamDataAdapter(java.io.BufferedReader)",
      "begin_line": 320,
      "end_line": 323,
      "comment": "\n         * Create a StreamDataAdapter from a BufferedReader\n         *\n         * @param in BufferedReader input stream\n         ",
      "child_ranges": [
        "(line 321,col 13)-(line 321,col 20)",
        "(line 322,col 13)-(line 322,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.StreamDataAdapter.computeBinStats()",
      "begin_line": 326,
      "end_line": 338,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 328,col 13)-(line 328,col 30)",
        "(line 329,col 13)-(line 329,col 30)",
        "(line 330,col 13)-(line 334,col 13)",
        "(line 336,col 13)-(line 336,col 32)",
        "(line 337,col 13)-(line 337,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.StreamDataAdapter.computeStats()",
      "begin_line": 341,
      "end_line": 352,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 343,col 13)-(line 343,col 30)",
        "(line 344,col 13)-(line 344,col 29)",
        "(line 345,col 13)-(line 345,col 50)",
        "(line 346,col 13)-(line 349,col 13)",
        "(line 350,col 13)-(line 350,col 32)",
        "(line 351,col 13)-(line 351,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ArrayDataAdapter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.random.EmpiricalDistribution.DataAdapter"
      ],
      "begin_line": 358,
      "end_line": 393,
      "comment": "\n     * \u003ccode\u003eDataAdapter\u003c/code\u003e for data provided as array of doubles.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "inputArray"
      ],
      "begin_line": 361,
      "end_line": 361,
      "comment": " Array of input  data values "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.ArrayDataAdapter.ArrayDataAdapter(double[])",
      "begin_line": 369,
      "end_line": 373,
      "comment": "\n         * Construct an ArrayDataAdapter from a double[] array\n         *\n         * @param in double[] array holding the data\n         * @throws NullArgumentException if in is null\n         ",
      "child_ranges": [
        "(line 370,col 13)-(line 370,col 20)",
        "(line 371,col 13)-(line 371,col 39)",
        "(line 372,col 13)-(line 372,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.ArrayDataAdapter.computeStats()",
      "begin_line": 376,
      "end_line": 382,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 378,col 13)-(line 378,col 50)",
        "(line 379,col 13)-(line 381,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.ArrayDataAdapter.computeBinStats()",
      "begin_line": 385,
      "end_line": 392,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 387,col 13)-(line 391,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.fillBinStats(java.lang.Object)",
      "begin_line": 401,
      "end_line": 430,
      "comment": "\n     * Fills binStats array (second pass through data file).\n     *\n     * @param in object providing access to the data\n     * @throws IOException  if an IO error occurs\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 35)",
        "(line 404,col 9)-(line 404,col 35)",
        "(line 405,col 9)-(line 405,col 69)",
        "(line 408,col 9)-(line 410,col 9)",
        "(line 411,col 9)-(line 414,col 9)",
        "(line 417,col 9)-(line 417,col 63)",
        "(line 418,col 9)-(line 418,col 49)",
        "(line 419,col 9)-(line 419,col 29)",
        "(line 422,col 9)-(line 422,col 43)",
        "(line 423,col 9)-(line 424,col 72)",
        "(line 425,col 9)-(line 428,col 9)",
        "(line 429,col 9)-(line 429,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.findBin(double)",
      "begin_line": 438,
      "end_line": 442,
      "comment": "\n     * Returns the index of the bin to which the given value belongs\n     *\n     * @param value  the value whose bin we are trying to find\n     * @return the index of the bin containing the value\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 441,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.getNextValue()",
      "begin_line": 451,
      "end_line": 475,
      "comment": "\n     * Generates a random value from this distribution.\n     * \u003cstrong\u003ePreconditions:\u003c/strong\u003e\u003cul\u003e\n     * \u003cli\u003ethe distribution must be loaded before invoking this method\u003c/li\u003e\u003c/ul\u003e\n     * @return the random value.\n     * @throws MathIllegalStateException if the distribution has not been loaded\n     ",
      "child_ranges": [
        "(line 453,col 9)-(line 455,col 9)",
        "(line 458,col 9)-(line 458,col 47)",
        "(line 461,col 9)-(line 473,col 9)",
        "(line 474,col 9)-(line 474,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.getSampleStats()",
      "begin_line": 485,
      "end_line": 487,
      "comment": "\n     * Returns a {@link StatisticalSummary} describing this distribution.\n     * \u003cstrong\u003ePreconditions:\u003c/strong\u003e\u003cul\u003e\n     * \u003cli\u003ethe distribution must be loaded before invoking this method\u003c/li\u003e\u003c/ul\u003e\n     *\n     * @return the sample statistics\n     * @throws IllegalStateException if the distribution has not been loaded\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.getBinCount()",
      "begin_line": 494,
      "end_line": 496,
      "comment": "\n     * Returns the number of bins.\n     *\n     * @return the number of bins.\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.getBinStats()",
      "begin_line": 505,
      "end_line": 507,
      "comment": "\n     * Returns a List of {@link SummaryStatistics} instances containing\n     * statistics describing the values in each of the bins.  The list is\n     * indexed on the bin number.\n     *\n     * @return List of bin statistics.\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.getUpperBounds()",
      "begin_line": 522,
      "end_line": 530,
      "comment": "\n     * \u003cp\u003eReturns a fresh copy of the array of upper bounds for the bins.\n     * Bins are: \u003cbr/\u003e\n     * [min,upperBounds[0]],(upperBounds[0],upperBounds[1]],...,\n     *  (upperBounds[binCount-2], upperBounds[binCount-1] \u003d max].\u003c/p\u003e\n     *\n     * \u003cp\u003eNote: In versions 1.0-2.0 of commons-math, this method\n     * incorrectly returned the array of probability generator upper\n     * bounds now returned by {@link #getGeneratorUpperBounds()}.\u003c/p\u003e\n     *\n     * @return array of bin upper bounds\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 523,col 9)-(line 523,col 55)",
        "(line 524,col 9)-(line 524,col 40)",
        "(line 525,col 9)-(line 527,col 9)",
        "(line 528,col 9)-(line 528,col 43)",
        "(line 529,col 9)-(line 529,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.getGeneratorUpperBounds()",
      "begin_line": 543,
      "end_line": 548,
      "comment": "\n     * \u003cp\u003eReturns a fresh copy of the array of upper bounds of the subintervals\n     * of [0,1] used in generating data from the empirical distribution.\n     * Subintervals correspond to bins with lengths proportional to bin counts.\u003c/p\u003e\n     *\n     * \u003cp\u003eIn versions 1.0-2.0 of commons-math, this array was (incorrectly) returned\n     * by {@link #getUpperBounds()}.\u003c/p\u003e\n     *\n     * @since 2.1\n     * @return array of upper bounds of subintervals used in data generation\n     ",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 37)",
        "(line 545,col 9)-(line 545,col 39)",
        "(line 546,col 9)-(line 546,col 54)",
        "(line 547,col 9)-(line 547,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.isLoaded()",
      "begin_line": 555,
      "end_line": 557,
      "comment": "\n     * Property indicating whether or not the distribution has been loaded.\n     *\n     * @return true if the distribution has been loaded\n     ",
      "child_ranges": [
        "(line 556,col 9)-(line 556,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistribution.reSeed(long)",
      "begin_line": 565,
      "end_line": 567,
      "comment": "\n     * Reseeds the random number generator used by {@link #getNextValue()}.\n     *\n     * @param seed random generator seed\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 566,col 9)-(line 566,col 32)"
      ]
    }
  ]
}