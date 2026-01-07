{
  "filepath": "/tmp/Math-94b/src/java/org/apache/commons/math/random/EmpiricalDistributionImpl.java",
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
      "end_line": 495,
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
        "binCount"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " number of bins "
    },
    {
      "type": "field",
      "varNames": [
        "loaded"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " is the distribution loaded? "
    },
    {
      "type": "field",
      "varNames": [
        "upperBounds"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " upper bounds of subintervals in (0,1) \"belonging\" to the bins "
    },
    {
      "type": "field",
      "varNames": [
        "randomData"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " RandomData instance to use in repeated calls to getNext() "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.EmpiricalDistributionImpl()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Creates a new EmpiricalDistribution with the default bin count.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.EmpiricalDistributionImpl(int)",
      "begin_line": 96,
      "end_line": 99,
      "comment": "\n     * Creates a new EmpiricalDistribution  with the specified bin count.\n     * \n     * @param binCount number of bins\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 33)",
        "(line 98,col 9)-(line 98,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.load(double[])",
      "begin_line": 107,
      "end_line": 117,
      "comment": "\n     * Computes the empirical distribution from the provided\n     * array of numbers.\n     * \n     * @param in the input data array\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 50)",
        "(line 109,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 115,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.load(java.net.URL)",
      "begin_line": 125,
      "end_line": 157,
      "comment": "\n     * Computes the empirical distribution using data read from a URL.\n     * @param url  url of the input file\n     * \n     * @throws IOException if an IO error occurs\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 127,col 72)",
        "(line 128,col 9)-(line 156,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.load(java.io.File)",
      "begin_line": 165,
      "end_line": 192,
      "comment": "\n     * Computes the empirical distribution from the input file.\n     * \n     * @param file the input file\n     * @throws IOException if an IO error occurs\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 69)",
        "(line 167,col 9)-(line 191,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DataAdapter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 198,
      "end_line": 214,
      "comment": "\n     * Provides methods for computing \u003ccode\u003esampleStats\u003c/code\u003e and\n     * \u003ccode\u003ebeanStats\u003c/code\u003e abstracting the source of data.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.DataAdapter.computeBinStats(double, double)",
      "begin_line": 206,
      "end_line": 207,
      "comment": " \n         * Compute bin stats.\n         * \n         * @param min minimum value\n         * @param delta  grid size\n         * @throws Exception  if an error occurs computing bin stats\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.DataAdapter.computeStats()",
      "begin_line": 213,
      "end_line": 213,
      "comment": "\n         * Compute sample statistics.\n         * \n         * @throws Exception if an error occurs computing sample stats\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "DataAdapterFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 220,
      "end_line": 239,
      "comment": "\n     * Factory of \u003ccode\u003eDataAdapter\u003c/code\u003e objects. For every supported source\n     * of data (array of doubles, file, etc.) an instance of the proper object\n     * is returned.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.DataAdapterFactory.getAdapter(java.lang.Object)",
      "begin_line": 227,
      "end_line": 238,
      "comment": "\n         * Creates a DataAdapter from a data object\n         * \n         * @param in object providing access to the data\n         * @return DataAdapter instance\n         ",
      "child_ranges": [
        "(line 228,col 13)-(line 237,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StreamDataAdapter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.random.EmpiricalDistributionImpl.DataAdapter"
      ],
      "begin_line": 243,
      "end_line": 293,
      "comment": "\n     * \u003ccode\u003eDataAdapter\u003c/code\u003e for data provided through some input stream\n     "
    },
    {
      "type": "field",
      "varNames": [
        "inputStream"
      ],
      "begin_line": 246,
      "end_line": 246,
      "comment": " Input stream providng access to the data "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.StreamDataAdapter.StreamDataAdapter(java.io.BufferedReader)",
      "begin_line": 253,
      "end_line": 256,
      "comment": "\n         * Create a StreamDataAdapter from a BufferedReader\n         * \n         * @param in BufferedReader input stream\n         ",
      "child_ranges": [
        "(line 254,col 13)-(line 254,col 20)",
        "(line 255,col 13)-(line 255,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.StreamDataAdapter.computeBinStats(double, double)",
      "begin_line": 264,
      "end_line": 276,
      "comment": "\n         * Computes binStats\n         * \n         * @param min  minimum value\n         * @param delta  grid size\n         * @throws IOException if an IO error occurs\n         ",
      "child_ranges": [
        "(line 266,col 13)-(line 266,col 30)",
        "(line 267,col 13)-(line 267,col 30)",
        "(line 268,col 13)-(line 272,col 13)",
        "(line 274,col 13)-(line 274,col 32)",
        "(line 275,col 13)-(line 275,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.StreamDataAdapter.computeStats()",
      "begin_line": 282,
      "end_line": 292,
      "comment": "\n         * Computes sampleStats\n         * \n         * @throws IOException if an IOError occurs\n         ",
      "child_ranges": [
        "(line 283,col 13)-(line 283,col 30)",
        "(line 284,col 13)-(line 284,col 29)",
        "(line 285,col 13)-(line 285,col 50)",
        "(line 286,col 13)-(line 289,col 13)",
        "(line 290,col 13)-(line 290,col 32)",
        "(line 291,col 13)-(line 291,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ArrayDataAdapter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.random.EmpiricalDistributionImpl.DataAdapter"
      ],
      "begin_line": 298,
      "end_line": 338,
      "comment": "\n     * \u003ccode\u003eDataAdapter\u003c/code\u003e for data provided as array of doubles.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "inputArray"
      ],
      "begin_line": 301,
      "end_line": 301,
      "comment": " Array of input  data values "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.ArrayDataAdapter.ArrayDataAdapter(double[])",
      "begin_line": 308,
      "end_line": 311,
      "comment": "\n         * Construct an ArrayDataAdapter from a double[] array\n         * \n         * @param in double[] array holding the data\n         ",
      "child_ranges": [
        "(line 309,col 13)-(line 309,col 20)",
        "(line 310,col 13)-(line 310,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.ArrayDataAdapter.computeStats()",
      "begin_line": 317,
      "end_line": 322,
      "comment": "\n         * Computes sampleStats\n         * \n         * @throws IOException if an IO error occurs\n         ",
      "child_ranges": [
        "(line 318,col 13)-(line 318,col 50)",
        "(line 319,col 13)-(line 321,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.ArrayDataAdapter.computeBinStats(double, double)",
      "begin_line": 330,
      "end_line": 337,
      "comment": "\n         * Computes binStats\n         * \n         * @param min  minimum value\n         * @param delta  grid size\n         * @throws IOException  if an IO error occurs\n         ",
      "child_ranges": [
        "(line 332,col 13)-(line 336,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.fillBinStats(java.lang.Object)",
      "begin_line": 346,
      "end_line": 391,
      "comment": "\n     * Fills binStats array (second pass through data file).\n     * \n     * @param in object providing access to the data\n     * @throws IOException  if an IO error occurs\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 42)",
        "(line 349,col 9)-(line 349,col 42)",
        "(line 350,col 9)-(line 350,col 76)",
        "(line 351,col 9)-(line 351,col 55)",
        "(line 352,col 9)-(line 352,col 40)",
        "(line 353,col 9)-(line 355,col 9)",
        "(line 356,col 9)-(line 356,col 42)",
        "(line 359,col 9)-(line 361,col 9)",
        "(line 362,col 9)-(line 365,col 9)",
        "(line 368,col 9)-(line 368,col 63)",
        "(line 369,col 9)-(line 369,col 49)",
        "(line 370,col 9)-(line 380,col 9)",
        "(line 383,col 9)-(line 383,col 43)",
        "(line 384,col 9)-(line 385,col 72)",
        "(line 386,col 9)-(line 389,col 9)",
        "(line 390,col 9)-(line 390,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.findBin(double, double, double)",
      "begin_line": 401,
      "end_line": 405,
      "comment": "\n     * Returns the index of the bin to which the given value belongs\n     * \n     * @param min  the minimum value\n     * @param value  the value whose bin we are trying to find\n     * @param delta  the grid size\n     * @return the index of the bin containing the value\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 404,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.getNextValue()",
      "begin_line": 413,
      "end_line": 438,
      "comment": "\n     * Generates a random value from this distribution.\n     * \n     * @return the random value.\n     * @throws IllegalStateException if the distribution has not been loaded\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 418,col 9)",
        "(line 421,col 9)-(line 421,col 33)",
        "(line 424,col 9)-(line 436,col 9)",
        "(line 437,col 9)-(line 437,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.getSampleStats()",
      "begin_line": 448,
      "end_line": 450,
      "comment": "\n     * Returns a {@link StatisticalSummary} describing this distribution.\n     * \u003cstrong\u003ePreconditions:\u003c/strong\u003e\u003cul\u003e\n     * \u003cli\u003ethe distribution must be loaded before invoking this method\u003c/li\u003e\u003c/ul\u003e\n     * \n     * @return the sample statistics\n     * @throws IllegalStateException if the distribution has not been loaded\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.getBinCount()",
      "begin_line": 457,
      "end_line": 459,
      "comment": "\n     * Returns the number of bins.\n     * \n     * @return the number of bins.\n     ",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.getBinStats()",
      "begin_line": 468,
      "end_line": 470,
      "comment": "\n     * Returns a List of {@link SummaryStatistics} instances containing\n     * statistics describing the values in each of the bins.  The list is\n     * indexed on the bin number.\n     * \n     * @return List of bin statistics.\n     ",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.getUpperBounds()",
      "begin_line": 480,
      "end_line": 485,
      "comment": "\n     * Returns (a fresh copy of) the array of upper bounds for the bins.\n       Bins are: \u003cbr/\u003e\n     * [min,upperBounds[0]],(upperBounds[0],upperBounds[1]],...,\n     *  (upperBounds[binCount-1],max]\n     * \n     * @return array of bin upper bounds\n     ",
      "child_ranges": [
        "(line 481,col 9)-(line 481,col 37)",
        "(line 482,col 9)-(line 482,col 39)",
        "(line 483,col 9)-(line 483,col 54)",
        "(line 484,col 9)-(line 484,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.isLoaded()",
      "begin_line": 492,
      "end_line": 494,
      "comment": "\n     * Property indicating whether or not the distribution has been loaded.\n     * \n     * @return true if the distribution has been loaded\n     ",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 22)"
      ]
    }
  ]
}