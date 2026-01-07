{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/random/EmpiricalDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EmpiricalDistribution",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 50,
      "end_line": 133,
      "comment": "\n * Represents an \u003ca href\u003d\"http://random.mat.sbg.ac.at/~ste/dipl/node11.html\"\u003e\n * empirical probability distribution\u003c/a\u003e -- a probability distribution derived\n * from observed data without making any assumptions about the functional form\n * of the population distribution that the data come from.\u003cp\u003e\n * Implementations of this interface maintain data structures, called\n * \u003ci\u003edistribution digests\u003c/i\u003e, that describe empirical distributions and\n * support the following operations: \u003cul\u003e\n * \u003cli\u003eloading the distribution from a file of observed data values\u003c/li\u003e\n * \u003cli\u003edividing the input data into \"bin ranges\" and reporting bin frequency\n *     counts (data for histogram)\u003c/li\u003e\n * \u003cli\u003ereporting univariate statistics describing the full set of data values\n *     as well as the observations within each bin\u003c/li\u003e\n * \u003cli\u003egenerating random values from the distribution\u003c/li\u003e\n * \u003c/ul\u003e\n * Applications can use \u003ccode\u003eEmpiricalDistribution\u003c/code\u003e implementations to\n * build grouped frequency histograms representing the input data or to\n * generate random values \"like\" those in the input file -- i.e., the values\n * generated will follow the distribution of the values in the file.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistribution.load(double[])",
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * Computes the empirical distribution from the provided\n     * array of numbers.\n     *\n     * @param dataArray the data array\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistribution.load(java.io.File)",
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * Computes the empirical distribution from the input file.\n     *\n     * @param file the input file\n     * @throws IOException if an IO error occurs\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistribution.load(java.net.URL)",
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * Computes the empirical distribution using data read from a URL.\n     *\n     * @param url url of the input file\n     * @throws IOException if an IO error occurs\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistribution.getNextValue()",
      "begin_line": 84,
      "end_line": 84,
      "comment": "\n     * Generates a random value from this distribution.\n     * \u003cstrong\u003ePreconditions:\u003c/strong\u003e\u003cul\u003e\n     * \u003cli\u003ethe distribution must be loaded before invoking this method\u003c/li\u003e\u003c/ul\u003e\n     * @return the random value.\n     *\n     * @throws IllegalStateException if the distribution has not been loaded\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistribution.getSampleStats()",
      "begin_line": 98,
      "end_line": 98,
      "comment": "\n     * Returns a\n     * {@link org.apache.commons.math.stat.descriptive.StatisticalSummary}\n     * describing this distribution.\n     * \u003cstrong\u003ePreconditions:\u003c/strong\u003e\u003cul\u003e\n     * \u003cli\u003ethe distribution must be loaded before invoking this method\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @return the sample statistics\n     * @throws IllegalStateException if the distribution has not been loaded\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistribution.isLoaded()",
      "begin_line": 105,
      "end_line": 105,
      "comment": "\n     * Property indicating whether or not the distribution has been loaded.\n     *\n     * @return true if the distribution has been loaded\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistribution.getBinCount()",
      "begin_line": 112,
      "end_line": 112,
      "comment": "\n     * Returns the number of bins.\n     *\n     * @return the number of bins\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistribution.getBinStats()",
      "begin_line": 122,
      "end_line": 122,
      "comment": "\n     * Returns a list of\n     * {@link org.apache.commons.math.stat.descriptive.SummaryStatistics}\n     * containing statistics describing the values in each of the bins.  The\n     * List is indexed on the bin number.\n     *\n     * @return List of bin statistics\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistribution.getUpperBounds()",
      "begin_line": 131,
      "end_line": 131,
      "comment": "\n     * Returns the array of upper bounds for the bins.  Bins are: \u003cbr/\u003e\n     * [min,upperBounds[0]],(upperBounds[0],upperBounds[1]],...,\n     *  (upperBounds[binCount-2], upperBounds[binCount-1] \u003d max].\n     *\n     * @return array of bin upper bounds\n     ",
      "child_ranges": []
    }
  ]
}