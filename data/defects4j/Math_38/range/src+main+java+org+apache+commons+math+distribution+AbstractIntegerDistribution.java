{
  "filepath": "/tmp/Math-38b/src/main/java/org/apache/commons/math/distribution/AbstractIntegerDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractIntegerDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.IntegerDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 35,
      "end_line": 187,
      "comment": "\n * Base class for integer-valued discrete distributions.  Default\n * implementations are provided for some of the methods that do not vary\n * from distribution to distribution.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "randomData"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * RandomData instance used to generate samples from the distribution.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.AbstractIntegerDistribution()",
      "begin_line": 46,
      "end_line": 46,
      "comment": " Default constructor. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.cumulativeProbability(int, int)",
      "begin_line": 54,
      "end_line": 61,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The default implementation uses the identity\n     * \u003cp\u003e{@code P(x0 \u003c\u003d X \u003c\u003d x1) \u003d P(X \u003c\u003d x1) - P(X \u003c\u003d x0 - 1)}\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 59,col 9)",
        "(line 60,col 9)-(line 60,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.inverseCumulativeProbability(double)",
      "begin_line": 64,
      "end_line": 108,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 65,col 9)-(line 67,col 9)",
        "(line 71,col 9)-(line 71,col 40)",
        "(line 72,col 9)-(line 72,col 40)",
        "(line 73,col 9)-(line 73,col 18)",
        "(line 74,col 9)-(line 98,col 9)",
        "(line 101,col 9)-(line 101,col 46)",
        "(line 102,col 9)-(line 105,col 9)",
        "(line 107,col 9)-(line 107,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.getDomainLowerBound(double)",
      "begin_line": 119,
      "end_line": 119,
      "comment": "\n     * Access the domain value lower bound, based on {@code p}, used to\n     * bracket a CDF root. This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value ({@code 0 \u003c p \u003c 1})\n     * @return a domain value lower bound, i.e. a value {@code x} such that\n     * {@code P(X \u003c\u003d x) \u003c p}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.getDomainUpperBound(double)",
      "begin_line": 130,
      "end_line": 130,
      "comment": "\n     * Access the domain value upper bound, based on {@code p}, used to\n     * bracket a CDF root. This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value ({@code 0 \u003c p \u003c 1})\n     * @return a domain value upper bound, i.e. a value {@code x} such that\n     * {@code P(X \u003c\u003d x) \u003e\u003d p}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.reseedRandomGenerator(long)",
      "begin_line": 133,
      "end_line": 135,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.sample()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The default implementation uses the\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Inverse_transform_sampling\"\u003e\n     * inversion method\u003c/a\u003e.\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.sample(int)",
      "begin_line": 154,
      "end_line": 164,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The default implementation generates the sample by calling\n     * {@link #sample()} in a loop.\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 40)",
        "(line 160,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.checkedCumulativeProbability(int)",
      "begin_line": 177,
      "end_line": 186,
      "comment": "\n     * Computes the cumulative probability function and checks for {@code NaN}\n     * values returned. Throws {@code MathInternalError} if the value is\n     * {@code NaN}. Rethrows any exception encountered evaluating the cumulative\n     * probability function. Throws {@code MathInternalError} if the cumulative\n     * probability function returns {@code NaN}.\n     *\n     * @param argument input value\n     * @return the cumulative probability\n     * @throws MathInternalError if the cumulative probability is {@code NaN}\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 35)",
        "(line 180,col 9)-(line 180,col 49)",
        "(line 181,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 185,col 22)"
      ]
    }
  ]
}