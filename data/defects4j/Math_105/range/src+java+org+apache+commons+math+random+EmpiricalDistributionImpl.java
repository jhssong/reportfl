{
  "filepath": "/tmp/Math-105b/src/java/org/apache/commons/math/random/EmpiricalDistributionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EmpiricalDistributionImpl",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable",
        "org.apache.commons.math.random.EmpiricalDistribution"
      ],
      "begin_line": 59,
      "end_line": 478,
      "comment": "\n * Implements \u003ccode\u003eEmpiricalDistribution\u003c/code\u003e interface.  This implementation\n * uses what amounts to the\n * \u003ca href\u003d\"http://nedwww.ipac.caltech.edu/level5/March02/Silverman/Silver2_6.html\"\u003e\n * Variable Kernel Method\u003c/a\u003e with Gaussian smoothing:\u003cp\u003e\n * \u003cstrong\u003eDigesting the input file\u003c/strong\u003e\n * \u003col\u003e\u003cli\u003ePass the file once to compute min and max.\u003c/li\u003e\n * \u003cli\u003eDivide the range from min-max into \u003ccode\u003ebinCount\u003c/code\u003e \"bins.\"\u003c/li\u003e\n * \u003cli\u003ePass the data file again, computing bin counts and univariate\n *     statistics (mean, std dev.) for each of the bins \u003c/li\u003e\n * \u003cli\u003eDivide the interval (0,1) into subintervals associated with the bins,\n *     with the length of a bin\u0027s subinterval proportional to its count.\u003c/li\u003e\u003c/ol\u003e\n * \u003cstrong\u003eGenerating random values from the distribution\u003c/strong\u003e\u003col\u003e\n * \u003cli\u003eGenerate a uniformly distributed value in (0,1) \u003c/li\u003e\n * \u003cli\u003eSelect the subinterval to which the value belongs.\n * \u003cli\u003eGenerate a random Gaussian value with mean \u003d mean of the associated\n *     bin and std dev \u003d std dev of associated bin.\u003c/li\u003e\u003c/ol\u003e\u003c/p\u003e\u003cp\u003e\n *\u003cstrong\u003eUSAGE NOTES:\u003c/strong\u003e\u003cul\u003e\n *\u003cli\u003eThe \u003ccode\u003ebinCount\u003c/code\u003e is set by default to 1000.  A good rule of thumb\n *    is to set the bin count to approximately the length of the input file divided\n *    by 10. \u003c/li\u003e\n *\u003cli\u003eThe input file \u003ci\u003emust\u003c/i\u003e be a plain text file containing one valid numeric\n *    entry per line.\u003c/li\u003e\n * \u003c/ul\u003e\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "binStats"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " List of SummaryStatistics objects characterizing the bins "
    },
    {
      "type": "field",
      "varNames": [
        "sampleStats"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Sample statistics "
    },
    {
      "type": "field",
      "varNames": [
        "binCount"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " number of bins "
    },
    {
      "type": "field",
      "varNames": [
        "loaded"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " is the distribution loaded? "
    },
    {
      "type": "field",
      "varNames": [
        "upperBounds"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " upper bounds of subintervals in (0,1) \"belonging\" to the bins "
    },
    {
      "type": "field",
      "varNames": [
        "randomData"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " RandomData instance to use in repeated calls to getNext() "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.EmpiricalDistributionImpl()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Creates a new EmpiricalDistribution with the default bin count.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.EmpiricalDistributionImpl(int)",
      "begin_line": 94,
      "end_line": 97,
      "comment": "\n     * Creates a new EmpiricalDistribution  with the specified bin count.\n     * \n     * @param binCount number of bins\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 33)",
        "(line 96,col 9)-(line 96,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.load(double[])",
      "begin_line": 105,
      "end_line": 115,
      "comment": "\n     * Computes the empirical distribution from the provided\n     * array of numbers.\n     * \n     * @param in the input data array\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 50)",
        "(line 107,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 113,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.load(java.net.URL)",
      "begin_line": 123,
      "end_line": 145,
      "comment": "\n     * Computes the empirical distribution using data read from a URL.\n     * @param url  url of the input file\n     * \n     * @throws IOException if an IO error occurs\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 125,col 72)",
        "(line 126,col 9)-(line 144,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.load(java.io.File)",
      "begin_line": 153,
      "end_line": 174,
      "comment": "\n     * Computes the empirical distribution from the input file.\n     * \n     * @param file the input file\n     * @throws IOException if an IO error occurs\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 69)",
        "(line 155,col 9)-(line 173,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DataAdapter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 180,
      "end_line": 196,
      "comment": "\n     * Provides methods for computing \u003ccode\u003esampleStats\u003c/code\u003e and\n     * \u003ccode\u003ebeanStats\u003c/code\u003e abstracting the source of data.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.DataAdapter.computeBinStats(double, double)",
      "begin_line": 188,
      "end_line": 189,
      "comment": " \n         * Compute bin stats.\n         * \n         * @param min minimum value\n         * @param delta  grid size\n         * @throws Exception  if an error occurs computing bin stats\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.DataAdapter.computeStats()",
      "begin_line": 195,
      "end_line": 195,
      "comment": "\n         * Compute sample statistics.\n         * \n         * @throws Exception if an error occurs computing sample stats\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "DataAdapterFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 202,
      "end_line": 221,
      "comment": "\n     * Factory of \u003ccode\u003eDataAdapter\u003c/code\u003e objects. For every supported source\n     * of data (array of doubles, file, etc.) an instance of the proper object\n     * is returned.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.DataAdapterFactory.getAdapter(java.lang.Object)",
      "begin_line": 209,
      "end_line": 220,
      "comment": "\n         * Creates a DataAdapter from a data object\n         * \n         * @param in object providing access to the data\n         * @return DataAdapter instance\n         ",
      "child_ranges": [
        "(line 210,col 13)-(line 219,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StreamDataAdapter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.random.EmpiricalDistributionImpl.DataAdapter"
      ],
      "begin_line": 225,
      "end_line": 276,
      "comment": "\n     * \u003ccode\u003eDataAdapter\u003c/code\u003e for data provided through some input stream\n     "
    },
    {
      "type": "field",
      "varNames": [
        "inputStream"
      ],
      "begin_line": 228,
      "end_line": 228,
      "comment": " Input stream providng access to the data "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.StreamDataAdapter.StreamDataAdapter(java.io.BufferedReader)",
      "begin_line": 235,
      "end_line": 238,
      "comment": "\n         * Create a StreamDataAdapter from a BufferedReader\n         * \n         * @param in BufferedReader input stream\n         ",
      "child_ranges": [
        "(line 236,col 13)-(line 236,col 20)",
        "(line 237,col 13)-(line 237,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.StreamDataAdapter.computeBinStats(double, double)",
      "begin_line": 246,
      "end_line": 259,
      "comment": "\n         * Computes binStats\n         * \n         * @param min  minimum value\n         * @param delta  grid size\n         * @throws IOException if an IO error occurs\n         ",
      "child_ranges": [
        "(line 248,col 13)-(line 248,col 30)",
        "(line 249,col 13)-(line 249,col 30)",
        "(line 250,col 13)-(line 255,col 13)",
        "(line 257,col 13)-(line 257,col 32)",
        "(line 258,col 13)-(line 258,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.StreamDataAdapter.computeStats()",
      "begin_line": 265,
      "end_line": 275,
      "comment": "\n         * Computes sampleStats\n         * \n         * @throws IOException if an IOError occurs\n         ",
      "child_ranges": [
        "(line 266,col 13)-(line 266,col 30)",
        "(line 267,col 13)-(line 267,col 29)",
        "(line 268,col 13)-(line 268,col 58)",
        "(line 269,col 13)-(line 272,col 13)",
        "(line 273,col 13)-(line 273,col 32)",
        "(line 274,col 13)-(line 274,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ArrayDataAdapter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.random.EmpiricalDistributionImpl.DataAdapter"
      ],
      "begin_line": 281,
      "end_line": 322,
      "comment": "\n     * \u003ccode\u003eDataAdapter\u003c/code\u003e for data provided as array of doubles.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "inputArray"
      ],
      "begin_line": 284,
      "end_line": 284,
      "comment": " Array of input  data values "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.ArrayDataAdapter.ArrayDataAdapter(double[])",
      "begin_line": 291,
      "end_line": 294,
      "comment": "\n         * Construct an ArrayDataAdapter from a double[] array\n         * \n         * @param in double[] array holding the data\n         ",
      "child_ranges": [
        "(line 292,col 13)-(line 292,col 20)",
        "(line 293,col 13)-(line 293,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.ArrayDataAdapter.computeStats()",
      "begin_line": 300,
      "end_line": 305,
      "comment": "\n         * Computes sampleStats\n         * \n         * @throws IOException if an IO error occurs\n         ",
      "child_ranges": [
        "(line 301,col 13)-(line 301,col 58)",
        "(line 302,col 13)-(line 304,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.ArrayDataAdapter.computeBinStats(double, double)",
      "begin_line": 313,
      "end_line": 321,
      "comment": "\n         * Computes binStats\n         * \n         * @param min  minimum value\n         * @param delta  grid size\n         * @throws IOException  if an IO error occurs\n         ",
      "child_ranges": [
        "(line 315,col 13)-(line 320,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.fillBinStats(java.lang.Object)",
      "begin_line": 330,
      "end_line": 375,
      "comment": "\n     * Fills binStats array (second pass through data file).\n     * \n     * @param in object providing access to the data\n     * @throws IOException  if an IO error occurs\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 42)",
        "(line 333,col 9)-(line 333,col 42)",
        "(line 334,col 9)-(line 334,col 72)",
        "(line 335,col 9)-(line 335,col 55)",
        "(line 336,col 9)-(line 336,col 40)",
        "(line 337,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 340,col 42)",
        "(line 343,col 9)-(line 345,col 9)",
        "(line 346,col 9)-(line 349,col 9)",
        "(line 352,col 9)-(line 352,col 63)",
        "(line 353,col 9)-(line 353,col 49)",
        "(line 354,col 9)-(line 362,col 9)",
        "(line 365,col 9)-(line 365,col 43)",
        "(line 366,col 9)-(line 368,col 35)",
        "(line 369,col 9)-(line 373,col 9)",
        "(line 374,col 9)-(line 374,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.findBin(double, double, double)",
      "begin_line": 385,
      "end_line": 389,
      "comment": "\n     * Returns the index of the bin to which the given value belongs\n     * \n     * @param min  the minimum value\n     * @param value  the value whose bin we are trying to find\n     * @param delta  the grid size\n     * @return the index of the bin containing the value\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 388,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.getNextValue()",
      "begin_line": 397,
      "end_line": 421,
      "comment": "\n     * Generates a random value from this distribution.\n     * \n     * @return the random value.\n     * @throws IllegalStateException if the distribution has not been loaded\n     ",
      "child_ranges": [
        "(line 399,col 9)-(line 401,col 9)",
        "(line 404,col 9)-(line 404,col 33)",
        "(line 407,col 9)-(line 419,col 9)",
        "(line 420,col 9)-(line 420,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.getSampleStats()",
      "begin_line": 431,
      "end_line": 433,
      "comment": "\n     * Returns a {@link StatisticalSummary} describing this distribution.\n     * \u003cstrong\u003ePreconditions:\u003c/strong\u003e\u003cul\u003e\n     * \u003cli\u003ethe distribution must be loaded before invoking this method\u003c/li\u003e\u003c/ul\u003e\n     * \n     * @return the sample statistics\n     * @throws IllegalStateException if the distribution has not been loaded\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.getBinCount()",
      "begin_line": 440,
      "end_line": 442,
      "comment": "\n     * Returns the number of bins.\n     * \n     * @return the number of bins.\n     ",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.getBinStats()",
      "begin_line": 451,
      "end_line": 453,
      "comment": "\n     * Returns an ArrayList of {@link SummaryStatistics} instances containing\n     * statistics describing the values in each of the bins.  The ArrayList is\n     * indexed on the bin number.\n     * \n     * @return List of bin statistics.\n     ",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.getUpperBounds()",
      "begin_line": 463,
      "end_line": 468,
      "comment": "\n     * Returns (a fresh copy of) the array of upper bounds for the bins.\n       Bins are: \u003cbr/\u003e\n     * [min,upperBounds[0]],(upperBounds[0],upperBounds[1]],...,\n     *  (upperBounds[binCount-1],max]\n     * \n     * @return array of bin upper bounds\n     ",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 37)",
        "(line 465,col 9)-(line 465,col 39)",
        "(line 466,col 9)-(line 466,col 54)",
        "(line 467,col 9)-(line 467,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionImpl.isLoaded()",
      "begin_line": 475,
      "end_line": 477,
      "comment": "\n     * Property indicating whether or not the distribution has been loaded.\n     * \n     * @return true if the distribution has been loaded\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 22)"
      ]
    }
  ]
}