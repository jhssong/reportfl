{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/random/EmpiricalDistributionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EmpiricalDistributionImpl",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable",
        "org.apache.commons.math.random.EmpiricalDistribution"
      ],
      "begin_line": 61,
      "end_line": 476,
      "comment": "\n * Implements \u003ccode\u003eEmpiricalDistribution\u003c/code\u003e interface.  This implementation\n * uses what amounts to the\n * \u003ca href\u003d\"http://nedwww.ipac.caltech.edu/level5/March02/Silverman/Silver2_6.html\"\u003e\n * Variable Kernel Method\u003c/a\u003e with Gaussian smoothing:\u003cp\u003e\n * \u003cstrong\u003eDigesting the input file\u003c/strong\u003e\n * \u003col\u003e\u003cli\u003ePass the file once to compute min and max.\u003c/li\u003e\n * \u003cli\u003eDivide the range from min-max into \u003ccode\u003ebinCount\u003c/code\u003e \"bins.\"\u003c/li\u003e\n * \u003cli\u003ePass the data file again, computing bin counts and univariate\n *     statistics (mean, std dev.) for each of the bins \u003c/li\u003e\n * \u003cli\u003eDivide the interval (0,1) into subintervals associated with the bins,\n *     with the length of a bin\u0027s subinterval proportional to its count.\u003c/li\u003e\u003c/ol\u003e\n * \u003cstrong\u003eGenerating random values from the distribution\u003c/strong\u003e\u003col\u003e\n * \u003cli\u003eGenerate a uniformly distributed value in (0,1) \u003c/li\u003e\n * \u003cli\u003eSelect the subinterval to which the value belongs.\n * \u003cli\u003eGenerate a random Gaussian value with mean \u003d mean of the associated\n *     bin and std dev \u003d std dev of associated bin.\u003c/li\u003e\u003c/ol\u003e\u003c/p\u003e\u003cp\u003e\n *\u003cstrong\u003eUSAGE NOTES:\u003c/strong\u003e\u003cul\u003e\n *\u003cli\u003eThe \u003ccode\u003ebinCount\u003c/code\u003e is set by default to 1000.  A good rule of thumb\n *    is to set the bin count to approximately the length of the input file divided\n *    by 10. \u003c/li\u003e\n *\u003cli\u003eThe input file \u003ci\u003emust\u003c/i\u003e be a plain text file containing one valid numeric\n *    entry per line.\u003c/li\u003e\n * \u003c/ul\u003e\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "binStats"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " List of SummaryStatistics objects characterizing the bins "
    },
    {
      "type": "field",
      "varNames": [
        "sampleStats"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Sample statistics "
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Max loaded value "
    },
    {
      "type": "field",
      "varNames": [
        "min"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Min loaded value "
    },
    {
      "type": "field",
      "varNames": [
        "delta"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Grid size "
    },
    {
      "type": "field",
      "varNames": [
        "binCount"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " number of bins "
    },
    {
      "type": "field",
      "varNames": [
        "loaded"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " is the distribution loaded? "
    },
    {
      "type": "field",
      "varNames": [
        "upperBounds"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " upper bounds of subintervals in (0,1) \"belonging\" to the bins "
    },
    {
      "type": "field",
      "varNames": [
        "randomData"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " RandomData instance to use in repeated calls to getNext() "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.EmpiricalDistributionImpl()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Creates a new EmpiricalDistribution with the default bin count.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.EmpiricalDistributionImpl(int)",
      "begin_line": 105,
      "end_line": 108,
      "comment": "\n     * Creates a new EmpiricalDistribution  with the specified bin count.\n     *\n     * @param binCount number of bins\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 33)",
        "(line 107,col 9)-(line 107,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.load(double[])",
      "begin_line": 116,
      "end_line": 126,
      "comment": "\n     * Computes the empirical distribution from the provided\n     * array of numbers.\n     *\n     * @param in the input data array\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 50)",
        "(line 118,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 124,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.load(java.net.URL)",
      "begin_line": 134,
      "end_line": 154,
      "comment": "\n     * Computes the empirical distribution using data read from a URL.\n     * @param url  url of the input file\n     *\n     * @throws IOException if an IO error occurs\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 136,col 72)",
        "(line 137,col 9)-(line 153,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.load(java.io.File)",
      "begin_line": 162,
      "end_line": 177,
      "comment": "\n     * Computes the empirical distribution from the input file.\n     *\n     * @param file the input file\n     * @throws IOException if an IO error occurs\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 69)",
        "(line 164,col 9)-(line 176,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DataAdapter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 183,
      "end_line": 199,
      "comment": "\n     * Provides methods for computing \u003ccode\u003esampleStats\u003c/code\u003e and\n     * \u003ccode\u003ebeanStats\u003c/code\u003e abstracting the source of data.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.DataAdapter.computeBinStats()",
      "begin_line": 190,
      "end_line": 190,
      "comment": "\n         * Compute bin stats.\n         *\n         * @throws IOException  if an error occurs computing bin stats\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.DataAdapter.computeStats()",
      "begin_line": 197,
      "end_line": 197,
      "comment": "\n         * Compute sample statistics.\n         *\n         * @throws IOException if an error occurs computing sample stats\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "DataAdapterFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 206,
      "end_line": 228,
      "comment": "\n     * Factory of \u003ccode\u003eDataAdapter\u003c/code\u003e objects. For every supported source\n     * of data (array of doubles, file, etc.) an instance of the proper object\n     * is returned.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.DataAdapterFactory.getAdapter(java.lang.Object)",
      "begin_line": 213,
      "end_line": 227,
      "comment": "\n         * Creates a DataAdapter from a data object\n         *\n         * @param in object providing access to the data\n         * @return DataAdapter instance\n         ",
      "child_ranges": [
        "(line 214,col 13)-(line 226,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StreamDataAdapter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.random.EmpiricalDistributionImpl.DataAdapter"
      ],
      "begin_line": 232,
      "end_line": 275,
      "comment": "\n     * \u003ccode\u003eDataAdapter\u003c/code\u003e for data provided through some input stream\n     "
    },
    {
      "type": "field",
      "varNames": [
        "inputStream"
      ],
      "begin_line": 235,
      "end_line": 235,
      "comment": " Input stream providing access to the data "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.StreamDataAdapter.StreamDataAdapter(java.io.BufferedReader)",
      "begin_line": 242,
      "end_line": 245,
      "comment": "\n         * Create a StreamDataAdapter from a BufferedReader\n         *\n         * @param in BufferedReader input stream\n         ",
      "child_ranges": [
        "(line 243,col 13)-(line 243,col 20)",
        "(line 244,col 13)-(line 244,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.StreamDataAdapter.computeBinStats()",
      "begin_line": 248,
      "end_line": 260,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 250,col 13)-(line 250,col 30)",
        "(line 251,col 13)-(line 251,col 30)",
        "(line 252,col 13)-(line 256,col 13)",
        "(line 258,col 13)-(line 258,col 32)",
        "(line 259,col 13)-(line 259,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.StreamDataAdapter.computeStats()",
      "begin_line": 263,
      "end_line": 274,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 265,col 13)-(line 265,col 30)",
        "(line 266,col 13)-(line 266,col 29)",
        "(line 267,col 13)-(line 267,col 50)",
        "(line 268,col 13)-(line 271,col 13)",
        "(line 272,col 13)-(line 272,col 32)",
        "(line 273,col 13)-(line 273,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ArrayDataAdapter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.random.EmpiricalDistributionImpl.DataAdapter"
      ],
      "begin_line": 280,
      "end_line": 313,
      "comment": "\n     * \u003ccode\u003eDataAdapter\u003c/code\u003e for data provided as array of doubles.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "inputArray"
      ],
      "begin_line": 283,
      "end_line": 283,
      "comment": " Array of input  data values "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.ArrayDataAdapter.ArrayDataAdapter(double[])",
      "begin_line": 290,
      "end_line": 293,
      "comment": "\n         * Construct an ArrayDataAdapter from a double[] array\n         *\n         * @param in double[] array holding the data\n         ",
      "child_ranges": [
        "(line 291,col 13)-(line 291,col 20)",
        "(line 292,col 13)-(line 292,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.ArrayDataAdapter.computeStats()",
      "begin_line": 296,
      "end_line": 302,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 298,col 13)-(line 298,col 50)",
        "(line 299,col 13)-(line 301,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.ArrayDataAdapter.computeBinStats()",
      "begin_line": 305,
      "end_line": 312,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 307,col 13)-(line 311,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.fillBinStats(java.lang.Object)",
      "begin_line": 321,
      "end_line": 350,
      "comment": "\n     * Fills binStats array (second pass through data file).\n     *\n     * @param in object providing access to the data\n     * @throws IOException  if an IO error occurs\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 35)",
        "(line 324,col 9)-(line 324,col 35)",
        "(line 325,col 9)-(line 325,col 69)",
        "(line 328,col 9)-(line 330,col 9)",
        "(line 331,col 9)-(line 334,col 9)",
        "(line 337,col 9)-(line 337,col 63)",
        "(line 338,col 9)-(line 338,col 49)",
        "(line 339,col 9)-(line 339,col 29)",
        "(line 342,col 9)-(line 342,col 43)",
        "(line 343,col 9)-(line 344,col 72)",
        "(line 345,col 9)-(line 348,col 9)",
        "(line 349,col 9)-(line 349,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.findBin(double)",
      "begin_line": 358,
      "end_line": 362,
      "comment": "\n     * Returns the index of the bin to which the given value belongs\n     *\n     * @param value  the value whose bin we are trying to find\n     * @return the index of the bin containing the value\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 361,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.getNextValue()",
      "begin_line": 370,
      "end_line": 394,
      "comment": "\n     * Generates a random value from this distribution.\n     *\n     * @return the random value.\n     * @throws IllegalStateException if the distribution has not been loaded\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 374,col 9)",
        "(line 377,col 9)-(line 377,col 33)",
        "(line 380,col 9)-(line 392,col 9)",
        "(line 393,col 9)-(line 393,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.getSampleStats()",
      "begin_line": 404,
      "end_line": 406,
      "comment": "\n     * Returns a {@link StatisticalSummary} describing this distribution.\n     * \u003cstrong\u003ePreconditions:\u003c/strong\u003e\u003cul\u003e\n     * \u003cli\u003ethe distribution must be loaded before invoking this method\u003c/li\u003e\u003c/ul\u003e\n     *\n     * @return the sample statistics\n     * @throws IllegalStateException if the distribution has not been loaded\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.getBinCount()",
      "begin_line": 413,
      "end_line": 415,
      "comment": "\n     * Returns the number of bins.\n     *\n     * @return the number of bins.\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.getBinStats()",
      "begin_line": 424,
      "end_line": 426,
      "comment": "\n     * Returns a List of {@link SummaryStatistics} instances containing\n     * statistics describing the values in each of the bins.  The list is\n     * indexed on the bin number.\n     *\n     * @return List of bin statistics.\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.getUpperBounds()",
      "begin_line": 440,
      "end_line": 448,
      "comment": "\n     * \u003cp\u003eReturns a fresh copy of the array of upper bounds for the bins.\n     * Bins are: \u003cbr/\u003e\n     * [min,upperBounds[0]],(upperBounds[0],upperBounds[1]],...,\n     *  (upperBounds[binCount-2], upperBounds[binCount-1] \u003d max].\u003c/p\u003e\n     *\n     * \u003cp\u003eNote: In versions 1.0-2.0 of commons-math, this method\n     * incorrectly returned the array of probability generator upper\n     * bounds now returned by {@link #getGeneratorUpperBounds()}.\u003c/p\u003e\n     *\n     * @return array of bin upper bounds\n     ",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 55)",
        "(line 442,col 9)-(line 442,col 40)",
        "(line 443,col 9)-(line 445,col 9)",
        "(line 446,col 9)-(line 446,col 43)",
        "(line 447,col 9)-(line 447,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.getGeneratorUpperBounds()",
      "begin_line": 461,
      "end_line": 466,
      "comment": "\n     * \u003cp\u003eReturns a fresh copy of the array of upper bounds of the subintervals\n     * of [0,1] used in generating data from the empirical distribution.\n     * Subintervals correspond to bins with lengths proportional to bin counts.\u003c/p\u003e\n     *\n     * \u003cp\u003eIn versions 1.0-2.0 of commons-math, this array was (incorrectly) returned\n     * by {@link #getUpperBounds()}.\u003c/p\u003e\n     *\n     * @since 2.1\n     * @return array of upper bounds of subintervals used in data generation\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 37)",
        "(line 463,col 9)-(line 463,col 39)",
        "(line 464,col 9)-(line 464,col 54)",
        "(line 465,col 9)-(line 465,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.isLoaded()",
      "begin_line": 473,
      "end_line": 475,
      "comment": "\n     * Property indicating whether or not the distribution has been loaded.\n     *\n     * @return true if the distribution has been loaded\n     ",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 22)"
      ]
    }
  ]
}